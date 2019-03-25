package pdao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductMapper implements RowMapper<Product> 
{
	@Override
	public Product mapRow(ResultSet result, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setPid(result.getInt("pid"));
		product.setPname(result.getString("pname"));
		product.setPprice(result.getInt("pprice"));
		product.setPcompany(result.getString("pcompany"));
		return product;
	}
}
