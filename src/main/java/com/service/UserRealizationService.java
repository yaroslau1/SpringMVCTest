package com.service;

import com.dao.IUser;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class UserRealizationService implements UserDetailsService {

    @Autowired
    //@Qualifier("userRealizationDAO")
    private IUser iUser;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = iUser.findByName(name).get(0);
        //org.springframework.security.core.userdetails.User.UserBuilder userBuilder = null;
        if(user != null){
           /* userBuilder = org.springframework.security.core.userdetails.User.withUsername(name);
            userBuilder.password(user.getPassword());
            userBuilder.roles(user.getRole());*/
        } else {
            throw new UsernameNotFoundException("User " + name + " not found");
        }
        return new PdfUserDetails(user)/*userBuilder.build()*/;
    }
}
