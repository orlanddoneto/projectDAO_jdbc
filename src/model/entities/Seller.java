package model.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Seller implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private double baseSalary;
	private Date birthDate;
	
	private Department department;
	
	public Seller() {}
	
	public Seller(Integer id, String name, String email, Date birthDate, double baseSalary,  Department depart) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.baseSalary = baseSalary;
		this.birthDate = birthDate;
		this.department = depart;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the baseSalary
	 */
	public Double getBaseSalary() {
		return baseSalary;
	}

	/**
	 * @param baseSalary the baseSalary to set
	 */
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", baseSalary=" + baseSalary
				+ ", birthDate=" + birthDate + "]";
	}
	
	
	
	
}
