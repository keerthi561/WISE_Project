package com.rest.RestAPI;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.dto.CollegeManagement;
import com.rest.dto.Management;
import com.rest.dto.Student;
import com.rest.dto.Trainer;
import com.ts.dao.CollegeManagementDAO;
import com.ts.dao.ManagementDAO;
import com.ts.dao.StudentDAO;
import com.ts.dao.TrainerDAO;


@Path("myresource")
public class MyResource {
    @Path("hi")
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hi() {
        return "Hi Service!";
    }
    
    @Path("hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello Service!";
    }
    
//    /*@Path("getEmployee")
//    @GET
//    @Produces(MediaType.APPLICATION_XML)
//    public Employee getEmployee() {
//        Employee employee = new Employee(100,"PASHA",9999.99);
//    	return employee;
//    }*/
//    
//    @Path("getEmployeeJ")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public Employee getEmployeeJ() {
//        //Employee employee = new Employee(100,"PASHA",9999.99);
//    	return null;
//    }
//    
//    @Path("getEmployees")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Employee> getEmployees() {
//       /* Employee employee1 = new Employee();
//        employee1.setEmpId(100);
//        employee1.setEmpName("PASHA");
//        employee1.setSalary(9999.99);
//       
//        Department dept = new Department();
//        dept.setDeptId(10);
//        dept.setDeptName("ACCOUNTS");
//        dept.setLocation("HYDERABAD");
//        employee1.setDepartment(dept);
//        
//        Employee employee2 = new Employee();
//        employee2.setEmpId(101);
//        employee2.setEmpName("VENKAT");
//        employee2.setSalary(8888.88);
//        employee2.setDepartment(dept);
//       
//        Employee employee3 = new Employee();
//        employee3.setEmpId(102);
//        employee3.setEmpName("HARSHA");
//        employee3.setSalary(5555.55);
//       
//        Department dept2 = new Department();
//        dept2.setDeptId(20);
//        dept2.setDeptName("COMPUTERS");
//        dept2.setLocation("GACHIBOWLI");
//        employee3.setDepartment(dept2);
//        
//        Employee employee4 = new Employee();
//        employee4.setEmpId(104);
//        employee4.setEmpName("GOPI");
//        employee4.setSalary(3333.33);
//        employee4.setDepartment(dept2);
//       	
//       	empList.add(employee1);
//        empList.add(employee2);
//        empList.add(employee3);
//        empList.add(employee4);
//        */
//    	
//    	EmployeeDAO employeeDAO = new EmployeeDAO();
//    	List <Employee> empList = employeeDAO.getAllEmployees();
//        
//        return empList;
//    }
//    
//    @Path("getDepartments")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Department> getDepartments() {
//        
//        Department dept1 = new Department();
//        dept1.setDeptId(1);
//        dept1.setDeptName("ACCOUNTS");
//        dept1.setLocation("HYDERABAD");
//
//        Department dept2 = new Department();
//        dept2.setDeptId(2);
//        dept2.setDeptName("COMPUTERS");
//        dept2.setLocation("GACHIBOWLI");
//        
//    	Employee employee1 = new Employee();
//        employee1.setEmpId(100);
//        employee1.setEmpName("PASHA");
//        employee1.setSalary(9999.99);
//        employee1.setDepartment(dept1);
//        
//        Employee employee2 = new Employee();
//        employee2.setEmpId(101);
//        employee2.setEmpName("VENKAT");
//        employee2.setSalary(8888.88); 
//        employee2.setDepartment(dept1);
//        
//        Employee employee3 = new Employee();
//        employee3.setEmpId(102);
//        employee3.setEmpName("HARSHA");
//        employee3.setSalary(8989.89);
//        employee3.setDepartment(dept2);
//        
//        Employee employee4 = new Employee();
//        employee4.setEmpId(103);
//        employee4.setEmpName("GOPI");
//        employee4.setSalary(7777.77);
//        employee4.setDepartment(dept2);
//        
//        
//        dept1.getEmpList().add(employee1);
//        dept1.getEmpList().add(employee2);
//        dept2.getEmpList().add(employee3);
//        dept2.getEmpList().add(employee4);
//  
//        List <Department> deptList = new ArrayList<Department>();
//        deptList.add(dept1);
//        deptList.add(dept2);
//        
//        
//    	//List <Employee> empList = JdbcDAO.getEmployees();
//        System.out.println(deptList.get(0).getEmpList().size());
//         return deptList;
//    }
    
    
//    @Path("register")
//    @POST
//    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//    public void register(@FormParam("empId") int empId,@FormParam("empName") String empName,@FormParam("salary") float salary) {
//    	System.out.println(empId+" "+empName+" "+salary);
//    	
//    }
    
    @Path("registerStudent")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void registerStudent(List<Student> student) {
    	System.out.println("Inside REST..." + student);
    	StudentDAO studentDAO = new StudentDAO();
    	studentDAO.register(student); //send to database code 
    	//System.out.println(student.getStudentId()+" " + student.getStudentName() + " " + student.getStudentUserId());
    }
    @Path("registerTrainer")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void registerTrainer(List<Trainer> trainer) {
    	System.out.println("Inside REST..." + trainer);
    	TrainerDAO trainerDAO = new TrainerDAO();
    	trainerDAO.register(trainer); //send to database code 
    	//System.out.println(student.getStudentId()+" " + student.getStudentName() + " " + student.getStudentUserId());
    }
    
    @Path("registerManagement")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void registerManagement(List<Management> management) {
    	System.out.println("Inside REST..." + management);
//    	StudentDAO studentDAO = new StudentDAO();
    	ManagementDAO managementDAO = new ManagementDAO();
    	managementDAO.register(management); //send to database code 
    	//System.out.println(student.getStudentId()+" " + student.getStudentName() + " " + student.getStudentUserId());
    }
    
    @Path("getStudents")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public void getStudents() {
    	List<Student> student = new ArrayList<Student>();
    	StudentDAO studentDAO = new StudentDAO();
    	student = studentDAO.getAllStudents();
    	System.out.println(student);
    }
    
    @Path("getStudentById/{studId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudentById(@PathParam("studId") String studId) {
    	Student student = new Student();
    	StudentDAO studentDAO = new StudentDAO();
    	student = studentDAO.getStudent(studId);
		return student;
    }
    @Path("getTrainerById/{trainerId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Trainer getTrainerById(@PathParam("trainerId") String trainerId) {
    	Trainer trainer = new Trainer();
    	TrainerDAO trainerDAO = new TrainerDAO();
    	trainer = trainerDAO.getTrainer(trainerId);
		return trainer;
    }
    
    
    @Path("getManagement")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public void getManagement() {
    	List<Management> management = new ArrayList<Management>();
    	ManagementDAO managementDAO = new ManagementDAO();
    	management = managementDAO.getAllManagement();
    	System.out.println(management);
    }
    
    @Path("getManagementById/{managementId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Management getManagementById(@PathParam("managementId") String managementId) {
    	Management management = new Management();
    	ManagementDAO managementDAO = new ManagementDAO();
    	management = managementDAO.getManagement(managementId);
		return management;
    }
    
    @Path("getCollegeManagement")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public void getCollegeManagement() {
    	List<CollegeManagement> collegeManagement = new ArrayList<CollegeManagement>();
    	CollegeManagementDAO collegeManagementDAO = new CollegeManagementDAO();
    	collegeManagement = collegeManagementDAO.getAllCollegeManagement();
    	System.out.println(collegeManagement);
    }
    
    @Path("getCollegeManagementById/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CollegeManagement getCollegeManagementById(@PathParam("id") String id) {
    	CollegeManagement collegeManagement = new CollegeManagement();
    	CollegeManagementDAO collegeManagementDAO = new CollegeManagementDAO();
    	collegeManagement = collegeManagementDAO.getCollegeManagement(id);
		return collegeManagement;
    }
    
//	@POST
//	@Path("/uploadImage")
//	@Consumes({MediaType.MULTIPART_FORM_DATA})
//	public void uploadImage(@FormDataParam("Image") InputStream fileInputStream, @FormDataParam("Image") FormDataContentDisposition 
//    formDataContentDisposition, @FormDataParam("ImageCaption") String caption) throws IOException {
//		int read = 0;
//	    byte[] bytes = new byte[1024];
//	 System.out.println("METHOD CALLED...."+caption);
//	    FileOutputStream out = new FileOutputStream(new File("C:/Users/tsuser/RESTAPI_9pm/RestAPI/src/main/webapp/image/", formDataContentDisposition.getFileName()));
//	    while ((read = fileInputStream.read(bytes)) != -1) {
//	    	out.write(bytes, 0, read);
//	    }
//	    out.flush();
//	    out.close();
//	    /*
//	    Student student = new Student();
//		student.setId(id);
//		student.setName(name);
//		student.setFile(formDataContentDisposition.getFileName());
//		
//		students.add(student); 
//		*/
//		//return Response.ok("Data Submitted Successfully.").build();	    
//	}
}