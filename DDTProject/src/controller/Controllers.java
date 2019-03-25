package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.jni.Mmap;
import org.apache.tomcat.jni.Proc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllers {

	@RequestMapping(value="/")
	public String login_veiw()
	{
		return "TRM_DTT_Homepage";
	}
	
	
}
