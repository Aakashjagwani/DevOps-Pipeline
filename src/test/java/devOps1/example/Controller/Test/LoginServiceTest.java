package devOps1.example.Controller.Test;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import devOps1.example.MainApp;
import devOps1.example.DAO.LoginDAO;
import devOps1.example.Service.LoginService;
import devOps1.example.VO.Login;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes=MainApp.class)
public class LoginServiceTest {
 
    @TestConfiguration
    static class LoginServiceTestContextConfiguration {
        @Bean
        @Primary
        public devOps1.example.Service.ILoginService LoginService() {
            return new devOps1.example.Service.LoginService();
        }
    }
 
    @Autowired
    private LoginService loginService;
 
    @MockBean
    private LoginDAO loginDAO;

    @Before
    public void setUp() {
        Login alex = new Login();
        alex.setName("alex");
        
        Mockito.when(loginDAO.getPersonById(alex.getId()))
          .thenReturn(alex);
    }
    
    @Test
    public void whenValidName_thenPersonShouldBeFound() {
        int id = 5;
        Login found = loginService.getPersonById(id);
      
         assertThat(found.getId())
          .isEqualTo(id);
     }
}