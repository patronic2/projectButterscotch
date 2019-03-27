package dao.dtt.controllers;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import DDTProject.DTTNewRequestCard;
import DDTProject.DTTProcessingCard;
import DDTProject.DTTdaoServices;
import DDTProject.TrainingSchedule;

import bl.SecurityCheck;
import dao.dtt.trainingManagementStatus.ManagmentStatusDAO;


@Controller
public class dttController {
	
//	@RequestMapping(value="/")
//	public String login_view()
//	{
//		System.out.println("login_view");
//		return "TRM_DTT_Homepage";
//	}
	
	@RequestMapping(value="/")
	public String showall_view(ModelMap map)
	{
		List<DTTProcessingCard> cards;
		List<DTTNewRequestCard> newReqCards;
		List<TrainingSchedule> schedules;

		
		cards = new DTTdaoServices().getRequestsProcessing();
		newReqCards = new DTTdaoServices().getNewRequests();
		schedules = new DTTdaoServices().getTrainingSchedule();
		System.out.println(schedules);
		map.addAttribute("TRM_DTT_Homepage", cards);
		map.addAttribute("TRM_DTT_Homepage1", newReqCards);
		map.addAttribute("TRM_DTT_Homepage_Schedules", schedules);

//		List<String> names = new ArrayList<String>();
//		names.add("Name1");
//		names.add("Name2");
//		names.add("Name3");
//		names.add("Name4");
//
//		map.addAttribute("TRM_DTT_Homepage", names);
		return "TRM_DTT_Homepage";
	}
	
	@RequestMapping(value="/login")
	public String login_service(HttpServletRequest request, ModelMap model)
	{
		boolean result = SecurityCheck.isUserValid(request.getParameter("un"), request.getParameter("pw"));
		
		if(result)
		{
			model.addAttribute("result", result);
			return "TRM_DTT_Homepage";
		}
		else
			model.addAttribute("result", false);
			return "login";
	}
	
	@RequestMapping(value="toProcess/{requestId}")
	public String changeStat(@PathVariable("requestId") int requestId)
	{
		System.out.println("got called");
		String stat = "203";
		ManagmentStatusDAO update = new ManagmentStatusDAO();
		System.out.println("got Management Status");
		update.updateManagmentStatus(requestId, stat);
		System.out.println("updated status");
		return "redirect:/";
	}

}
