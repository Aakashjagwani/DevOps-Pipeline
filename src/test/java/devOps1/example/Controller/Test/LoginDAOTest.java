package devOps1.example.Controller.Test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import devOps1.example.DAO.ILoginDAO;
import devOps1.example.VO.Login;

@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration
@SpringBootTest
public class LoginDAOTest {
 
    @Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private ILoginDAO loginDAO;
 
    @Test
    public void whenFindByID_thenReturnperson() {
        
    	Login aakash = new Login();
        aakash.setEmail("Aakashjagwani09@gmail.com");
        aakash.setName("Aakash Jagwani");
        aakash.setPass("aakash");
        entityManager.persist(aakash);
        entityManager.flush();
        
        Login found = loginDAO.getPersonById(aakash.getId());
     
        assertThat(found.getName())
        .isEqualTo(aakash.getName()); 
    } 
}