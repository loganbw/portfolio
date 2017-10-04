package com.logan.portfolio.controllers;

import com.logan.portfolio.dao.ProjectDao;
import com.logan.portfolio.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PortfolioController {
    @Autowired
    private ProjectDao projectDao;
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("projects ", new Project());
        model.addAttribute("myProjects", projectDao.findAll());
        return "index";
    }


    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping("/aboutMe")
    public String aboutMe(){
        return "aboutMe";
    }

    @RequestMapping("/contactInfo")
    public String info(){
        return "contactInfo";
    }
}
