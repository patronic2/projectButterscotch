package DDTProject;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DDTrainerMapper implements RowMapper<DDTrainer>
{
	public DDTrainer mapRow(ResultSet result, int arg1) throws SQLException {
		DDTrainer ddtrnr = new DDTrainer();
		ddtrnr.setDtt_trainer_request_id(result.getInt(1));
		ddtrnr.setRequest_sent_date(result.getTimestamp(2));
		ddtrnr.setTrainer_id(result.getInt(3));
		ddtrnr.setSchedule_id(result.getInt(4));
		ddtrnr.setTopic(result.getString(5));
		ddtrnr.setComments(result.getString(6));
		ddtrnr.setResponse(result.getString(7));
		ddtrnr.setActive_status(result.getInt(8));
		return ddtrnr;
	}
}
