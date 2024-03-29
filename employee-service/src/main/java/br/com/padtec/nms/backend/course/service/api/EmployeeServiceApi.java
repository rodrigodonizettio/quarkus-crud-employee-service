package br.com.padtec.nms.backend.course.service.api;

import br.com.padtec.nms.backend.course.model.Department;
import br.com.padtec.nms.backend.course.model.Employee;

import java.util.Map;

public interface EmployeeServiceApi {

  Map<Long, Employee> getAll();

  Employee getByRegistration(Long registration);

  Map<Long, Employee> getByName(String name);

  Employee add(Employee employee);

  Employee update(Employee employee);

  Map<Long, Employee> delete(Long registration);
}