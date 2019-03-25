package DDTProject;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DDTrainingMapper implements RowMapper<DDTraining> 
{
	public DDTraining mapRow(ResultSet result, int arg1) throws SQLException {
		DDTraining ddtrng = new DDTraining();
		ddtrng.setDtt_training_id(result.getInt(1));
		ddtrng.setTraining_request_id(result.getInt(2));
		ddtrng.setTrainer_request_id(result.getInt(3));
		ddtrng.setSchedule_id(result.getInt(4));
		ddtrng.setExecutive_id(result.getInt(5));
		ddtrng.setTrainer_approval_mail(result.getString(6));
		ddtrng.setTrainer_manager_approval_mail(result.getString(7));
		ddtrng.setDescription_of_status(result.getString(8));
		return ddtrng;
	}

}
