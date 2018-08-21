package com.telusko.demo.controller;

import java.util.List;

import javax.sound.midi.Soundbank;

import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam String tech)
	{	
		ModelAndView mView = new ModelAndView("showAlien.jsp");
		
		List<Alien> alienList = repo.findByTech(tech);
		System.out.println(alienList);
		
		alienList = repo.findByAidLessThan(103);
		System.out.println(alienList);
		
		alienList = repo.findByTechSorted("Java");
		System.out.println(alienList);
		
		throw new NotYetImplementedException();
	}
	
	@RequestMapping("/updateAlien")
	public String updateAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	
	@RequestMapping("/deleteAlien")
	public String deleteAlien(@RequestParam int aid)
	{
		repo.deleteById(aid);
		return "home.jsp";
	}
	
	
}
