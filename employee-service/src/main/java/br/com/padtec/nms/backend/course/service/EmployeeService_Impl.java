package br.com.padtec.nms.backend.course.service;

import br.com.padtec.nms.backend.course.model.Department;
import br.com.padtec.nms.backend.course.model.Employee;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@ApplicationScoped
public class EmployeeService_Impl implements EmployeeService {

  public static Department department = new Department(1L, 27L, "NMS");
  public static Employee employee1 = new Employee(1L, 1312L, "Rodrigo1", department, "a@b.com", "skype1", false);
  public static Employee employee2 = new Employee(2L, 1313L, "Rodrigo2", department, "b@c.com", "skype2", true);
  public static Map<Long, Employee> employees = new HashMap<>();

  static {
    employees.put(employee1.getRegistration(), employee1);
    employees.put(employee2.getRegistration(), employee2);
  }

  @Override
  public Map<Long, Employee> getAll() {
    return employees;
  }

  @Override
  public Employee getByRegistration(Long registration) {
    return employees.get(registration);
  }

  @Override
  public Map<Long, Employee> getByName(String name) {
    Map<Long, Employee> result = employees.entrySet().stream()
        .filter(x -> x.getValue().getName().equals(name))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    return result;
  }

  @Override
  public Employee add(Employee employee) {
    employees.put(employee.getRegistration(), employee);
    return employee;
  }

  @Override
  public Employee update(Employee employee) {
    if (employees.containsKey(employee.getRegistration())) {
      employees.put(employee.getRegistration(), employee);
    }
    return employee;
  }

  @Override
  public Map<Long, Employee> delete(Long registration) {
    employees.remove(registration);
    return employees;
  }
}