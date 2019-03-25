package pdao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sun.scenario.effect.impl.prism.PrDrawable;

import jt.MyTemplate;

public class ProductDAOServices {

	JdbcTemplate template;
	
	public ProductDAOServices()
	{
		MyTemplate obj = new MyTemplate();
		template = obj.getTemplate();
	}
	public void insertProduct(String pname,int pprice,String pcompany)
	{
		template.update("insert into productdata values(pidseq.nextval,?,?,?)",
				new Object[]{pname,pprice,pcompany});
	}
	public void deleteProduct(int pid)
	{
		template.update("delete from productdata where pid=?",
				new Object[]{pid});
	}
	public void updateProduct(int pid,int pprice,String pcompany)
	{
		template.update("update productdata set pprice=?,pcompany=? where pid=?",
				new Object[]{pprice,pcompany,pid});
	}
	public List<Product> getAllProducts()
	{
		return template.query("select * from productdata",new ProductMapper());
	}
	public Product getProduct(int pid)
	{
		List<Product> product = template.query("select * from Productdata where pid=?", 
				new Object[]{pid},new ProductMapper());
		return product.get(0);
	}
	public static void main(String s[])
	{
		System.out.print(new ProductDAOServices().getProduct(7002).getPname());
	}
}