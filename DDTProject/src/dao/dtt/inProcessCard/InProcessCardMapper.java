package dao.dtt.inProcessCard;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dao.ddt.developTeamTrainingRequest.DDTTraining;
import dao.employee.Employee;
import dao.trainingManagementStatus.ManagmentStatus;
import dao.trainingRequest.TrainingRequest;
import dao.trainingSchedule.TrainingSchedule;

public class InProcessCardMapper implements RowMapper<InProcessCard>
{

	@Override
	public InProcessCard mapRow(ResultSet result, int arg1) throws SQLException {
		InProcessCard ipc = new InProcessCard();
		
		DDTTraining dtr = new DDTTraining();
		dtr.setDtt_training_id(result.getInt("dtt_training_id"));
		ipc.setTraining(dtr);
		
		TrainingRequest tr = new TrainingRequest();
		tr.setTraining_request_id(result.getInt("training_request_id"));
		tr.setRequest_training_type(result.getString("request_training_type"));
		tr.setRequest_training_module(result.getString("request_training_module"));
		ipc.setRequest(tr);
		
		TrainingSchedule ts = new TrainingSchedule();
		ts.setTraining_start_date(result.getTimestamp("training_start_date"));
		ts.setTraining_end_date(result.getTimestamp("training_end_date"));
		ipc.setSchedule(ts);

		ManagmentStatus s  = new ManagmentStatus();
		s.setStatus(result.getInt("status"));
		ipc.setStatus(s);
		
		Employee e = new Employee();
		e.setFirst_name(result.getString("first_name"));
		e.setLast_name(result.getString("last_name"));
		ipc.setEmployee(e);
		
		
		
		return ipc;
	}

}