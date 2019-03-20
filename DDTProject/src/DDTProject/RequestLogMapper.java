package DDTProject;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RequestLogMapper implements RowMapper<RequestLog> 
{

	public RequestLog mapRow(ResultSet result, int arg1) throws SQLException {
		RequestLog rl = new RequestLog();
		rl.setRequest_log_id(result.getInt(1));
		rl.setTraining_request_id(result.getInt(2));
		rl.setStatus_changed_to(result.getInt(3));
		rl.setStatus_change_time(result.getTimestamp(4));
		rl.setDescription(result.getString(5));
		return rl;
	}

}
