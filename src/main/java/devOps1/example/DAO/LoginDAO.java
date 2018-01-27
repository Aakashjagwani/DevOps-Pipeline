package devOps1.example.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import devOps1.example.VO.Login;

@Transactional
@Repository
public class LoginDAO implements ILoginDAO {

	@PersistenceContext	
	private EntityManager entityManager;	
		
	public Login getPersonById(int personId) {
		return entityManager.find(Login.class, personId);
	}
	public void addPerson(Login Person) {
		entityManager.persist(Person);
	}
	@SuppressWarnings("unchecked")
	public  List<Login> getAllPersons() {
		String hql = "FROM Login as person ORDER BY person.id desc";
		return (List<Login>) entityManager.createQuery(hql).getResultList();
	}
}
