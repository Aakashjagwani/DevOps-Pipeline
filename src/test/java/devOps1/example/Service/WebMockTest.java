package devOps1.example.Service;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.beans.factory.annotation.Autowired;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import devOps1.example.MainAppTest;
import devOps1.example.Controller.SpringController;
import devOps1.example.Service.LoginService;

@RunWith(SpringRunner.class)
@WebMvcTest(SpringController.class)
@ContextConfiguration(classes = MainAppTest.class)
@AutoConfigureMockMvc
public class WebMockTest {

//    @Autowired
//    private MockMvc mockMvc;

    @MockBean
    private LoginService service;

    @Test
    public void greetingShouldReturnMessageFromService() throws Exception {
        when(service.greeting()).thenReturn("Hello World");
//        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk());
       }
}