package DDTProject;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ExecutiveWorkflowMapper implements RowMapper<ExecutiveWorkflow>
{

	@Override
	public ExecutiveWorkflow mapRow(ResultSet result, int arg1)
			throws SQLException {
		ExecutiveWorkflow ew = new ExecutiveWorkflow();
		ew.setExecutive_workflow_status_id(result.getInt(1));
		ew.setTraining_request_id(result.getInt(2));
		ew.setExecutive_id(result.getInt(3));
		ew.setSent_invitations(result.getInt(4));
		ew.setCompleted_skillport_enrollment(result.getInt(5));
		ew.setAssessments_recorded(result.getInt(6));
		ew.setVendor_training_clearance(result.getInt(7));
		ew.setCompleted_feedback(result.getInt(8));
		ew.setTraining_completed(result.getInt(9));
		return ew;
	}

}
