package devOps1.example.Controller;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;

//import devOps1.example.Service.LoginService;
//import devOps1.example.VO.Login;

@Controller
@PropertySource("classpath:application.properties")
public class SpringController {
	
//	@Autowired
//	private  LoginService loginservice;
	
	@RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
	@GetMapping("hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
	@GetMapping("greeting")
	public @ResponseBody String greetPerson() {
		return "Hey Its great to see you how are you doing";
	}
//	
//	@RequestMapping(value="/login" , method = RequestMethod.GET)
//	public ModelAndView showLoginPage(){
//        return new ModelAndView("login");
//    }
//	@PostMapping("login1")
//	public ResponseEntity<Login> addPerson(Login person) {
//		loginservice.addPerson(person);
//		return new ResponseEntity<Login>(person, HttpStatus.OK);
//	}
//	@GetMapping("getPerson")
//	public ResponseEntity<Login> getPersonById(@RequestParam("id") String id) {
//		Login person = loginservice.getPersonById(Integer.parseInt(id));
//		return new ResponseEntity<Login>(person, HttpStatus.OK);
//	}
//	@GetMapping("getAllPerson")
//	public ResponseEntity<List<Login>> getAllPersons() {
//		List<Login> list = loginservice.getAllPersons();
//		return new ResponseEntity<List<Login>>(list, HttpStatus.OK);
//	}
}