package devOps1.example.Service;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import devOps1.example.DAO.ILoginDAO;
//import devOps1.example.VO.Login;

@Service
public class LoginService implements ILoginService {

//	@Autowired
//	private ILoginDAO LoginDAO;
//	
//	public Login getPersonById(int parseInt) {
//		Login obj = LoginDAO.getPersonById(parseInt);
//		return obj;
//	}
//	public List<Login> getAllPersons() {
//		return LoginDAO.getAllPersons();
//	}
//	public void addPerson(Login person) {
//	        LoginDAO.addPerson(person);;
//    }
	public String greeting() {
        return "Hello aakash";
    }
}
