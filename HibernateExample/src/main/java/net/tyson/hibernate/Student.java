package net.tyson.hibernate;

import javax.persistence.*;


@Entity
@Table(name = "student")
public class Student {
	private long id;
	private String student_name;
	private String student_gender;
	

	public Student() {
		
	}
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getStudent_name() {
		return student_name;
	}
	
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	public String getStudent_gender() {
		return student_gender;
	}
	
	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}
}



