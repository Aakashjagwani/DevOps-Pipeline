//package devOps1.example.VO;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="Login")
//public class Login {
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="person_id")
//	private int id;
//	
//	@Column(name="person_name")
//	private String name;
//	
//	@Column(name="person_email")
//	private String email;
//
//	@Column(name="person_pass")
//	private String pass;
//
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPass() {
//		return pass;
//	}
//	public void setPass(String pass2) {
//		this.pass = pass2;
//	}
//}