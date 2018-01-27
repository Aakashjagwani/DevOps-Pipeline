package devOps1.example.Controller.Test;

import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import devOps1.example.Controller.SpringController;
import devOps1.example.Service.LoginService;
import devOps1.example.VO.Login;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest(value = SpringController.class, secure = false)
@AutoConfigureMockMvc
public class SpringControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private LoginService loginService;
	
	@Test
	public void givenEmployees_whenGetEmployees_thenReturnJsonArray()
	  throws Exception {
	     
	    Login alex = new Login();
	    alex.setName("alex");
	    
	    List<Login> allpersons = Arrays.asList(alex);
	 
	    given(loginService.getAllPersons()).willReturn(allpersons);
	 
	    mvc.perform(get("/hello")
	      .contentType(MediaType.APPLICATION_JSON))
	      .andExpect(status().isOk())
	      .andExpect(jsonPath("$[5].name").value("alex"))
	      .andExpect(jsonPath("$[5].email").value("alex@gmail.com"))
	      .andExpect(jsonPath("$[5].pass").value("alexnet"));
	    	      
	}
}