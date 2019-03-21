package DDTProject;

import java.net.URL;
import java.sql.Timestamp;

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
	public void insertEmployee(int employee_id, String last_name, String first_name, 
			String user_name, String password, String phone_number, String email, String street,
			String city, String state, String country, String job_title, String vertical, 
			String project, int pid)
	{
		temp.update("insert into Employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",new Object[]
				{employee_id,last_name,first_name,user_name, password, phone_number, email,
				street, city, state, country, job_title, vertical, project, pid});
	}
	public void deleteEmployee(int employee_id)
	{
		temp.update("delete from Employee where employee_id=?",new Object[]{employee_id});
	}
	//-------------------------Spoc_Master---------------
	public void updateSpocMasterValue(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update Spoc_Master set ?=? where ?=?", new Object[]
				{varToUpdate,value,idNum,idNum});
	}
	public void insertSpocMaster(int spoc_master_id, int spoc_emp_id, String spoc_vertical)
	{
		temp.update("insert into Spoc_Master values(?,?,?)",new Object[]{spoc_master_id,
				spoc_emp_id,spoc_vertical});
	}
	public void deleteSpocMaster(int spoc_master_id)
	{
		temp.update("delete from Spoc_Master where spoc_master_id=?",new Object[]{spoc_master_id});
	}
	//-------------------------Training_Request--------------
	public void updateTrainingRequest(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update TRAINING_REQUEST set ?=? where ?=?", new Object[]
				{varToUpdate,value,idNum,idNum});
	}
	public void insertTrainingRequest(int spoc_master_id, int spoc_emp_id, String spoc_vertical)
	{
		temp.update("insert into TRAINING_REQUEST values(?,?,?)",new Object[]{spoc_master_id,
				spoc_emp_id,spoc_vertical});
	}
	public void deleteTrainingRequest(int training_request_id)
	{
		temp.update("delete from TRAINING_REQUEST where training_request_id=?",new Object[]{
				training_request_id});
	}
	//------------------------Training_Schedule----------------
	public void updateTrainingSchedule(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update Training_Schedule set ?=? where ?=?", new Object[]
				{varToUpdate,value,idNum,idNum});
	}
	public void insertTrainingSchedule(int training_schedule_id, String training_city, 
			String training_state, String training_country,	int training_zipcode, 
			String training_time_zone, String training_location, String training_room_number,
			Timestamp training_start_date, Timestamp training_end_date, String training_break_down, 
			URL training_url, String training_phone)
	{
		temp.update("insert into Training_Schedule values(?,?,?,?,?,?,?,?,?,?,?,?,?)",
				new Object[]{training_schedule_id, training_city, training_state, 
				training_country, training_zipcode, training_time_zone, training_location,
				training_room_number, training_start_date, training_end_date, training_break_down, 
				training_url, training_phone});
	}
	public void deleteTrainingSchedule(int training_schedule_id)
	{
		temp.update("delete from Training_Schedule where training_schedule_id=?",
				new Object[]{training_schedule_id});
	}
	//---------------------Executive_Workflow_Status-----------
	public void updateExecutiveWorkflow(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update Executive_Workflow_Status set ?=? where ?=?",
				new Object[]{varToUpdate,value,idNum,idNum});
	}
	public void insertExecutiveWorkflow(int executive_workflow_status_id,int training_request_id,
			int executive_id,int sent_invitations,int completed_skillport_enrollment,
			int assessments_recorded,int vendor_training_clearance,int completed_feedback,
			int training_completed)
	{
		temp.update("insert into Executive_Workflow_Status values(?,?,?,?,?,?,?,?,?)",new Object[]
				{executive_workflow_status_id,training_request_id,executive_id,
				sent_invitations,completed_skillport_enrollment,assessments_recorded,
				vendor_training_clearance,completed_feedback,training_completed});
	}
	public void deleteExecutiveWorkflow(int executive_workflow_status_id)
	{
		temp.update("delete from Executive_Workflow_Status where executive_workflow_status_id=?",
				new Object[]{executive_workflow_status_id});
	}
	//--------------------------Training_Participants-----------
	public void updateParticipants(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update Training_Participants set ?=? where ?=?",
				new Object[]{varToUpdate,value,idNum,idNum});
	}
	public void insertParticipants(int training_participant_id,int participant_employee_id,
			int training_session_attended)
	{
		temp.update("insert into Training_Participants values(?,?,?)",new Object[]
				{training_participant_id,participant_employee_id,training_session_attended});
	}
	public void deleteParticipants(int training_participant_id)
	{
		temp.update("delete from Training_Participants where training_participant_id=?",
				new Object[]{training_participant_id});
	}
	//-----------------------Develop_Team_Training_Request-----------
	public void updateDTTraining(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update Develop_Team_Training_Request set ?=? where ?=?",
				new Object[]{varToUpdate,value,idNum,idNum});
	}
	public void insertDTTraining(int Dtt_training_id,int training_request_id,int trainer_request_id,
			int schedule_id,int executive_id,String trainer_approval_mail,
			String trainer_manager_approval_mail,String description_of_status)
	{
		temp.update("insert into Develop_Team_Training_Request values(?,?,?,?,?,?,?,?)",new Object[]
				{Dtt_training_id,training_request_id,trainer_request_id,schedule_id,executive_id,
				trainer_approval_mail,trainer_manager_approval_mail,description_of_status});
	}
	public void deleteDTTraining(int Dtt_training_id)
	{
		temp.update("delete from Develop_Team_Training_Request where Dtt_training_id=?",
				new Object[]{Dtt_training_id});
	}
	//-----------------------Develop_Team_Trainier_Request-----------
	public void updateDTTrainer(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update Develop_Team_Trainier_Request set ?=? where ?=?",
				new Object[]{varToUpdate,value,idNum,idNum});
	}
	public void insertDTTrainer(int dtt_trainer_request_id,Timestamp request_sent_date,int trainer_id,
			int schedule_id,String topic,String comments,String response,int active_status)
	{
		temp.update("insert into Develop_Team_Trainier_Request values(?,?,?,?,?,?,?,?)",new Object[]
				{dtt_trainer_request_id,request_sent_date,trainer_id,schedule_id,topic,
				comments,response,active_status});
	}
	public void deleteDTTrainer(int dtt_trainer_request_id)
	{
		temp.update("delete from Develop_Team_Trainier_Request where dtt_trainer_request_id=?",
				new Object[]{dtt_trainer_request_id});
	}
	//------------------------Training_Request_Log----------------------
	public void updateRequestLog(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update Training_Request_Log set ?=? where ?=?",
				new Object[]{varToUpdate,value,idNum,idNum});
	}
	public void insertRequestLog(int request_log_id,int training_request_id,int status_changed_to,
			Timestamp status_change_time,String description)
	{
		temp.update("insert into Training_Request_Log values(?,?,?,?,?)",new Object[]
				{request_log_id,training_request_id,status_changed_to,
					status_change_time,description});
	}
	public void deleteRequestLog(int request_log_id)
	{
		temp.update("delete from Training_Request_Log where request_log_id=?",
				new Object[]{request_log_id});
	}

	//------------------------Training_Management_Status----------------------
	public void updateManagementStatus(Object varToUpdate, Object value, Object idNum)
	{
		temp.update("update Training_Management_Status set ?=? where ?=?",
				new Object[]{varToUpdate,value,idNum,idNum});
	}
	public void insertManagementStatus(int training_management_status_id,int training_request_id,
			String status)
	{
		temp.update("insert into Training_Management_Status values(?,?,?,?,?)",new Object[]
				{training_management_status_id,training_request_id,status});
	}
	public void deleteManagementStatus(int training_management_status_id)
	{
		temp.update("delete from Training_Management_Status where training_management_status_id=?",
				new Object[]{training_management_status_id});
	}
}













