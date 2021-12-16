package com.example.exes.test;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.exes.mybatis.domain.Movie;
import com.example.exes.mybatis.domain.TestService;
@Controller
@RequestMapping("profile")
public class ProfileController {
	@Autowired
	TestService testService;
	
    @RequestMapping(path = "movie", method = RequestMethod.POST)
    public String age( Model model) {
    	List<Movie> movieList = testService.findAll();
    	model.addAttribute("movieList", movieList);
        return "test";
    }
    @RequestMapping(path = "blog", method = RequestMethod.POST)
    public String hello( Model model) {
    	
    	List<Movie> movieList = testService.findAll();
    	model.addAttribute("movieList", movieList);
        return "blog";
    }
}


