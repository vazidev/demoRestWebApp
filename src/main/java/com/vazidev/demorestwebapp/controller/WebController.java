package com.vazidev.demorestwebapp.controller;


import com.vazidev.demorestwebapp.domain.User;
import com.vazidev.demorestwebapp.repository.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class WebController {

    @Autowired
    AppRepository appRepo;


   /** //@RequestMapping("/")
    public String index(){
        return "index.html";
    }**/


    /** will be deprecated, only necessary for the Crud Repository**/
    @RequestMapping("/user/{param}")
    public String  user(User param){
        ModelAndView mv = new ModelAndView();
        appRepo.save(param);
        return "index.html";
    }

    @RequestMapping("/getuser")
    public ModelAndView getUsers(@RequestParam String users) {
        ModelAndView mv = new ModelAndView("index.html");
        User user = appRepo.findById(users).orElse(new User() );
         return mv;
    }

    /*************************************************************************************************/

    /** Retrieve user data by {param} **/
    @RequestMapping("/getuser/{param}")
    @ResponseBody
    public Optional<User> getUser(@PathVariable("param") String user) {
       return appRepo.findByName(user);
    }

    /** get a list of all users **/
    @GetMapping("/getusers")
    public ArrayList<User> getUsers() {
        return (ArrayList<User>) appRepo.findAll();
    }

/** create a new user account **/
    @PostMapping ("/newuser")
    public User newUser(@RequestBody   User user){
        return appRepo.save(user);
        //return user
    }

    /** Delete  a single user **/
    @PostMapping("/deleteUser")
    public String deleteUser(@PathVariable String user){
        User nullUser = appRepo.getById(user);
        appRepo.delete(nullUser);
        return ("User: " + user +" Deleted");
    }



}
