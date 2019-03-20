package DDTProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class QueryFunctions {
	ApplicationContext context;
	public JdbcTemplate temp;
	public QueryFunctions()
	{
		context = new ClassPathXmlApplicationContext("spring-config.xml");
		temp = (JdbcTemplate)context.getBean("jtemp");
	}
	//---------------------------Employee---------------
	public void updateEmployeeValue(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update Employee set ?=? where ?=?", new Object[]{varToUpdate,value,idNum,idNum});
	}
	public void insertEmployee(int employee_id, String last_name, String first_name, String user_name, String password,
			 String phone_number, String email, String street, String city, String state, String country,
			 String job_title, String vertical, String project, int pid)
	{
		temp.update("insert into Employee values(?,?,?,?)",new Object[]{employee_id,last_name,first_name,user_name,
				password, phone_number, email, street, city, state, country, job_title, vertical, project, pid});
	}
	public void deleteEmployee(int employee_id)
	{
		temp.update("delete from Employee where employee_id=?",new Object[]{employee_id});
	}
	//-------------------------Spoc_Master---------------
	public void updateSpocMasterValue(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update Spoc_Master set ?=? where ?=?", new Object[]{varToUpdate,value,idNum,idNum});
	}
	public void insertSpocMaster(int spoc_master_id, int spoc_emp_id, String spoc_vertical)
	{
		temp.update("insert into Spoc_Master values(?,?,?,?)",new Object[]{spoc_master_id,spoc_emp_id,spoc_vertical});
	}
	public void deleteSpocMaster(int spoc_master_id)
	{
		temp.update("delete from Spoc_Master where spoc_master_id=?",new Object[]{spoc_master_id});
	}
	//-------------------------TRAINING_REQUEST--------------
	public void updateTrainingRequest(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update TRAINING_REQUEST set ?=? where ?=?", new Object[]{varToUpdate,value,idNum,idNum});
	}
	public void insertTrainingRequest(int spoc_master_id, int spoc_emp_id, String spoc_vertical)
	{
		temp.update("insert into TRAINING_REQUEST values(?,?,?,?)",new Object[]{spoc_master_id,spoc_emp_id,spoc_vertical});
	}
	public void deleteTrainingRequest(int training_request_id)
	{
		temp.update("delete from TRAINING_REQUEST where training_request_id=?",new Object[]{training_request_id});
	}
}














