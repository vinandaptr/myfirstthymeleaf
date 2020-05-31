package com.vinan.myfirstthymeleaf.controller.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class BaseMvcController {
	   //    dashboard
	   @GetMapping("dashboard")
	   public String dashboard() {
	       return "dashboard/tugas3";
	   }

	   //    dashboard
	   @GetMapping("biodata")
	   public String biodata() {
	       return "biodata/index";
	   }
}
