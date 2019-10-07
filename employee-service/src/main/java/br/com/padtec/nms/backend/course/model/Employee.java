package br.com.padtec.nms.backend.course.model;

import org.graalvm.nativeimage.c.struct.UniqueLocationIdentity;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
  private Long id;
  @NotBlank
  private Long registration;
  @NotBlank
  private String name;
  @NotBlank
  private Department department;
  @NotBlank
  @Email
  private String email;
  @NotBlank
  private String skype;
  @NotBlank
  private boolean isAdmin;

  public Employee() { }

  public Employee(Long id, Long registration, String name, Department department, String email, String skype, boolean isAdmin) {
    this.id = id;
    this.registration = registration;
    this.name = name;
    this.department = department;
    this.email = email;
    this.skype = skype;
    this.isAdmin = isAdmin;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getRegistration() {
    return registration;
  }

  public void setRegistration(Long registration) {
    this.registration = registration;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSkype() {
    return skype;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  public boolean isAdmin() {
    return isAdmin;
  }

  public void setAdmin(boolean admin) {
    isAdmin = admin;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Employee)) {
      return false;
    }

    Employee other = (Employee) obj;

    return Objects.equals(other.name, this.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name);
  }
}
