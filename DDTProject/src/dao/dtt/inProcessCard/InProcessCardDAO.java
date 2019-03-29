package dao.dtt.inProcessCard;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InProcessCardDAO 
{

	ApplicationContext context;
	public JdbcTemplate temp;
	public InProcessCardDAO()
	{
		context = new ClassPathXmlApplicationContext("spring-config.xml");
		temp = (JdbcTemplate)context.getBean("jtemp");
	}
	public List<InProcessCard> getInProcessCardList()
	{
		List<InProcessCard> InProcessCardList =  temp.query("select tr.training_request_id, tr.request_training_type,tr.request_training_module,pm.first_name,pm.last_name, ct.first_name,ct.last_name,dttr.request_sent_date,dttr.response,dttr.active_status, ts.*,s.status,dtr.dtt_training_id from DEVELOP_TEAM_TRAINING_REQUEST dtr join TRAINING_REQUEST tr on dtr.training_request_id = tr.training_request_id join TRAINING_SCHEDULE ts on dtr.schedule_id = ts.training_schedule_id join TRAINING_MANAGEMENT_STATUS s on tr.training_request_id = s.training_request_id join EMPLOYEE pm on pm.employee_id = tr.requester_id join DEVELOP_TEAM_TRAINER_REQUEST dttr on dtr.trainer_request_id = dttr.dtt_trainer_request_id join EMPLOYEE ct on ct.employee_id = dttr.trainer_id",
						new Object[]{},new InProcessCardMapper());
		return InProcessCardList;
	}
	public static void main(String s[])
	{
		InProcessCardDAO sld = new InProcessCardDAO();
		List<InProcessCard> sls = sld.getInProcessCardList();
		for(InProcessCard a : sls)
		System.out.println(a);
		
	}
	
}

