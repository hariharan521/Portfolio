package in.hariharan.Portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class IndexController {

	@GetMapping("/")
	public String showIndexpage() {
		return "index";
	}
}
