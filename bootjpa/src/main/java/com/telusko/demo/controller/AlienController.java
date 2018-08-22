package com.telusko.demo.controller;

import java.util.List;
import java.util.Optional;

import javax.sound.midi.Soundbank;

import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@RequestMapping(path="/aliens", produces= {"application/xml"})
	@ResponseBody
	public List<Alien> getAliens()
	{	
		return repo.findAll();
	}
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAliens(@PathVariable("aid") int aid)
	{	
		return repo.findById(aid);
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
