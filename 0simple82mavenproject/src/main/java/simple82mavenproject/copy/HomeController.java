package simple82mavenproject.copy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String requestSlash() {
		System.out.println("welcome page is executed");

		return "Welcome";
		
	}
	@GetMapping("/home")
	public String requestHome() {
		return "Hello Home";
	}
	
	@GetMapping("/about")
	public String requestAbout() {
		return "Hello About ";
	}
	
	
	
}
