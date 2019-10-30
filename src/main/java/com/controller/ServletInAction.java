package com.controller;


import com.config.MyConfig;
import com.dao.IAccount;
import com.dao.IUser;
import com.dao.UserRealizationDAO;
import com.entity.AccountEntity;
import com.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ServletInAction {

    @Autowired
    private IAccount accountDao;

    @Autowired
    private IUser userDao;

    //ApplicationContext applicationContext= new AnnotationConfigApplicationContext(MyConfig.class) ;



//    @Autowired
//    public ServletInAction(IAccount accountDao, IUser userDao) {
//        this.accountDao = accountDao;
//        this.userDao = userDao;
//
//    }

    @RequestMapping(value = "/")
    public  String getPage(Model model){
        return "index";
    }

    @RequestMapping (value = "/richest",method=RequestMethod.GET)
    public String richestUser(Model model) {
        List<Integer> sum= new ArrayList<>();
        List<Integer> id= new ArrayList<>();
        id = accountDao.findById();
        sum = accountDao.findBySum();
        UserEntity userEntity = userDao.findById(id.get(0));
        model.addAttribute("id",userEntity.getNameUser());
        model.addAttribute("sum",sum.get(0));
        //System.out.println(accountEntityList.get(0).getIdUser());


        return "index";
    }

}
