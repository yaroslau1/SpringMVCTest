package com.controller;


import com.dao.IAccount;
import com.dao.IUser;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping(value = "/index")
    public  String getPage(Model model){
        return "index";
    }

    @RequestMapping(value = "/test")
    public  String getTestPage(Model model){
        return "test";
    }

    @RequestMapping (value = "/richest",method=RequestMethod.GET)
    public String richestUser(Model model) {
        List<Integer> sum= new ArrayList<>();
        List<Integer> id= new ArrayList<>();
        //id = accountDao.findById();
        //sum = accountDao.findBySum();
        User user = userDao.findById(1);
        model.addAttribute("id", user.getNameUser());
        model.addAttribute("sum", 7985/*sum.get(0)*/);
        //System.out.println(accountEntityList.get(0).getIdUser());
        return "index";
    }

}
