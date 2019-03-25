package controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pdao.Product;
import pdao.ProductDAOServices;
import bl.SecurityCheck;

@Controller
public class MyController {

	@RequestMapping(value="/")
	public String login_view()
	{
		return "firstpage";
	}
	
	@RequestMapping(value="mp")
	public String mp()
	{
		return "firstpage";
	}
	
	
	
	@RequestMapping(value="updateproduct/{pid}")
	public String updateproduct(@PathVariable("pid") int pid,ModelMap map)
	{
		Product product = new ProductDAOServices().getProduct(pid);
		map.addAttribute("command",product);
		return "updateForm";
	}
	
	@RequestMapping(value="updatewithNewData")
	public String updatewithNewData(@ModelAttribute("product") Product product)
	{
		new ProductDAOServices().updateProduct(product.getPid(),product.getPprice(),product.getPcompany());
		return "redirect:/showall";
	}
	
	
	
	
	
	
	
	@RequestMapping(value="deleteproduct/{pid}")
	public String deleteproduct(@PathVariable("pid") int pid)
	{
		System.out.println("------inside delete service...");
		new ProductDAOServices().deleteProduct(pid);
		return "redirect:/showall";
	}
	@RequestMapping(value="insertproduct")
	public String insertproduct(ModelMap map)
	{
		Product product = new Product();
		map.addAttribute("command",product);
		return "newproduct";
	}
	@RequestMapping(value="registerNewProduct")
	public String registerNewProduct(@ModelAttribute("product") Product product)
	{
		new ProductDAOServices().insertProduct(product.getPname(),product.getPprice(),product.getPcompany());	
		return "redirect:/showall";
	}
	
	/*
	 * @RequestMapping(value="registerNewProduct")
	 
	public String registerNewProduct(HttpServletRequest request)
	{
		String pname = request.getParameter("pname");
		int pprice = Integer.parseInt(request.getParameter("pprice"));
		String pcompany = request.getParameter("pcompany");
		
		new ProductDAOServices().insertProduct(pname, pprice, pcompany);
		
		return "redirect:/showall";
	}
	*/
	
	
	@RequestMapping(value="showall")
	public String showall_view(ModelMap map)
	{
		List<Product> products;
		products = new ProductDAOServices().getAllProducts();
		
		map.addAttribute("allproduct",products);
		
		return "allproduct";
	}
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/login")
	public String login_service(HttpServletRequest request,ModelMap model)
	{
		bl.SecurityCheck ob = new SecurityCheck();
		boolean result = ob.isUserValid(request.getParameter("un"),request.getParameter("up"));
		if(result)
		{
			String uid = request.getParameter("un");
			String message = "Best  bank of world...mahesh bank";
			
			model.addAttribute("userid",uid);
			model.addAttribute("newmessage",message);
			
			return "welcome";
		}
		else
			return "error";
	}
}