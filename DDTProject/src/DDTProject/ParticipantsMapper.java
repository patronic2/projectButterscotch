package DDTProject;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ParticipantsMapper implements RowMapper<Participants> 
{

	public Participants mapRow(ResultSet result, int arg1) throws SQLException {
		Participants part = new Participants();
		part.setTraining_participant_id(result.getInt(1));
		part.setParticipant_employee_id(result.getInt(2));
		part.setTraining_session_attended(result.getInt(3));
		return part;
	}

}
