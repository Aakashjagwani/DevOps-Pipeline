package devOps1.example.Service;

import java.util.List;

import devOps1.example.VO.Login;

public interface ILoginService {

	Login getPersonById(int parseInt);

	void addPerson(Login person);

	List<Login> getAllPersons();	
}
