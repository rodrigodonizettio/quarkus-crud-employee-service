package br.com.padtec.nms.backend.course.endpoint;

import br.com.padtec.nms.backend.course.model.Department;
import br.com.padtec.nms.backend.course.model.Employee;
import br.com.padtec.nms.backend.course.service.EmployeeService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;
import java.util.Map;

/***
 * https://quarkus.io/guides/rest-json-guide
 */

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeEndpoint {

  @Inject
  protected EmployeeService employeeService;

  @GET
  public Map<Long, Employee> getAll() {
    return employeeService.getAll();
  }

  @GET
  @Path("/byregistration/{registration}")
  public Employee getByRegistration(@PathParam("registration") Long registration) {
    return employeeService.getByRegistration(registration);
  }

  @GET
  @Path("/byname/{name}")
  public Map<Long, Employee> getByName(@PathParam("name") String name) {
    return employeeService.getByName(name);
  }

  @POST
  public Employee add(Employee employee) {
    return employeeService.add(employee);
  }

  @PATCH
  public Employee update(Employee employee) {
    return employeeService.update(employee);
  }

  @DELETE
  @Path("/{registration}")
  public Map<Long, Employee> delete(@PathParam("registration") Long registration) {
    return employeeService.delete(registration);
  }
}