package com.igate.tmg.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.igate.tmg.bean.Dummay1;
import com.igate.tmg.bean.LoginDetails;
import com.igate.tmg.bean.Trainee;
import com.igate.tmg.bean.dummay;
import com.igate.tmg.dao.TraineeDao;
import com.igate.tmg.test.*;

@Controller
@RequestMapping(value = "dispatcher")
public class TraineeController {

	Test te;
	@Autowired
	TraineeDao dao;

	@RequestMapping(value = "hello")
	public String gologin(
			@ModelAttribute("loginDetails") LoginDetails loginDetails) {
		// System.out.println(loginDetails.getPassWord());
		return "login";

	}

	@RequestMapping(value = "testCases")
	public String goTest() {
		// System.out.println(loginDetails.getPassWord());
		return "test";

	}
	@RequestMapping(value="execute")
	public ModelAndView doExecution(@RequestParam("testname")String nameTest,@RequestParam("application") String application)
	{
		ModelAndView me=new ModelAndView("test");
		me.addObject("result",1);
		HashMap<String, Test>hm=new HashMap<String,Test>();
		hm.put("NewTestOrbit",new NewTestOrbit());
		
			String testSelect=nameTest+application;
			System.out.println(nameTest+" "+testSelect);
			te=hm.get(testSelect);
			System.out.println(te);
			String resultFormTEst=te.execute();
			me.addObject("Result",resultFormTEst);
			List<String>ls=dao.getTets(application);
			me.addObject("ls",ls);
			me.addObject("application",application);
			me.addObject("result23",1);
		return me;
	}
	
	@RequestMapping(value = "testCases1")
	public ModelAndView GetTestcases(
			@RequestParam("application") String application,Model model) {
		//System.out.println(loginbean.toString());
		//int log = dao.doLogin(loginbean);
		System.out.println(application);
		List<String>ls=dao.getTets(application);
		model.addAttribute(ls);
		int log=ls.size();
		//ModelAndView m2=new ModelAndView("display");
		ModelAndView m2=new ModelAndView("test");
		m2.addObject("application",application);
		m2.addObject("ls", ls);
		m2.addObject("result",1);
		if (log > 0)
			return m2;
		else
			return m2;
	}

	
	@RequestMapping(value = "check")
	public void goCheck(
			@RequestParam("ide") String ide) {
		// System.out.println(loginDetails.getPassWord());
		HashMap<String,dummay>hm=new HashMap<String,dummay>();
		hm.put("Dummay1", new Dummay1());
		System.out.println(ide);
		dummay d=hm.get(ide);
		System.out.println(d);
		//return "login";

	}
	
	@RequestMapping(value = "home")
	public String doLogin(
			@ModelAttribute("loginDetails") LoginDetails loginbean, Model model) {
		System.out.println(loginbean.toString());
		int log = dao.doLogin(loginbean);

		if (log == 1)
			return "home";
		else
			return "login";
	}

	@RequestMapping(value = "goAddTrainee")
	public String goAddTrainee(Model model) {
		model.addAttribute("traineeDetails", new Trainee());
		return "addTrainee";
	}

	@RequestMapping(value = "doAddTrainee")
	public String doAddTrainee(
			@ModelAttribute("traineeDetails") Trainee trainee, Model model) {
		int add = dao.doAddTrainee(trainee);
		if (add == 1) {
			model.addAttribute("message", "Trainee Added Succesfully");
			return "home";
		} else {
			model.addAttribute("message", "Trainee Not Added Succesfully");
			return "addTrainee";
		}
	}

	@RequestMapping(value = "goDeleteTrainee")
	public String goDeleteTrainee(Model model) {
		model.addAttribute("traineeDeleteDetails", new Trainee());
		return "deleteTrainee";
	}

	@RequestMapping(value = "doDeleteTrainee")
	public String doDeleteTrainee(
			@ModelAttribute("traineeDeleteDetails") Trainee trainee, Model model) {
		int add = dao.doDeleteTrainee(trainee.getTraineeId());
		if (add == 1) {
			model.addAttribute("message", "Trainee Deleted Succesfully");
			return "home";
		} else {
			model.addAttribute("message", "Trainee Not Deleted Succesfully");
			return "deleteTrainee";
		}
		
	}

	@RequestMapping(value = "goModifyTrainee")
	public String goModifyTrainee(Model model) {
		model.addAttribute("traineeModifyDetails", new Trainee());
		return "modifyTrainee";
	}

	@RequestMapping(value = "goUpdateTrainee")
	public String goUpdateTrainee(
			@ModelAttribute("traineeModifyDetails") Trainee trainee, Model model) {
		Trainee t = dao.doselectTrainee(trainee.getTraineeId());
		model.addAttribute("updatedTrainee", t);
		model.addAttribute("count",1);
		model.addAttribute("finalTrainee", new Trainee());
		return "modifyTrainee";
	}

	@RequestMapping(value = "doUpdateTrainee")
	public String doUpdateTrainee(@RequestParam("id") String idc,
			@RequestParam("nameChange") String name,
			@RequestParam("locationChange") String location,
			@RequestParam("domainChange") String domain,
			@ModelAttribute("finalTrainee") Trainee tr, Model model) {

		Trainee t = new Trainee(Integer.parseInt(idc), name, location, domain);
		int upd = dao.doUpdateTrainee(t);
		System.out.println("after update " + t.toString());
		if (upd == 1)
			return "home";
		else
			return "updateTrainee";
	}

	@RequestMapping(value = "getTrainee")
	public String getTrainee() {
		return "trainee";
	}

	@RequestMapping(value = "getAllTrainees")
	public ModelAndView getTraineeAll() {
		ModelAndView m1 = new ModelAndView("displayAll");
		List<Trainee> tl = new ArrayList<Trainee>();
		tl = dao.getAllDetails();

		m1.addObject("results", tl);
		return m1;
	}

	@RequestMapping(value = "goretreiveTrainee")
	public String doRetreive(@RequestParam("id") int id,Model m3) {
		Trainee t = new Trainee();
		t = dao.doselectTrainee(id);
		System.out.println(t.getTraineeLocation());
		//ModelAndView m = new ModelAndView("displayTrainee");
		m3.addAttribute("result", t);
		m3.addAttribute("count1",1);
		return "trainee";

	}

	@RequestMapping(value = "homeA")
	public String home() {
		return "home";
	}
}
