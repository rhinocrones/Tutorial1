package conectors;

import java.sql.*;

public class MyDataBase {

	public static void addTableProduct() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		statement
				.execute("create table if not exists Product(id int primary key auto_increment, cat_id int, brand_id int, size_id int, name varchar(255), price double(5,2))");
		statement.close();
		connection.close();
	}

	public static void addTableCat() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		statement
				.execute("create table if not exists Category(id int primary key auto_increment, category varchar(255))");
		statement.close();
		connection.close();
	}

	public static void addTableBrand() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		statement
				.execute("create table if not exists Brand(id int primary key auto_increment, brand varchar(255))");
		statement.close();
		connection.close();
	}

	public static void addTableSize() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		statement
				.execute("create table if not exists Size(id int primary key auto_increment, size int)");
		statement.close();
		connection.close();
	}

	public static void addTableUsr() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		statement
				.execute("create table if not exists Usr(id int primary key auto_increment, first_name varchar(255), last_name varchar(255), password varchar(255), mail varchar(255), role_id int)");
		statement.close();
		connection.close();
	}

	public static void addTableRole() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		statement
				.execute("create table if not exists Role(id int primary key auto_increment, role varchar(255))");
		statement.close();
		connection.close();
	}

	public static void addTableOrderProduct() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		statement
				.execute("create table if not exists Order_product(id int primary key auto_increment, usr_id int, product_id int)");
		statement.close();
		connection.close();
	}

	public static void addFkForCategory() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		try {
			statement
					.execute("alter table Product add constraint fk_category_product foreign key (cat_id) references Category(id)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		statement.close();
		connection.close();
	}

	public static void addFkForBrand() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		try {
			statement
					.execute("alter table Product add constraint fk_brand_product foreign key (brand_id) references Brand(id)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		statement.close();
		connection.close();
	}

	public static void addFkForSize() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		try {
			statement
					.execute("alter table Product add constraint fk_size_product foreign key (size_id) references Size(id)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		statement.close();
		connection.close();
	}

	public static void addFkForRole() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		try {
			statement
					.execute("alter table Usr add constraint fk_role_usr foreign key (role_id) references Role(id)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		statement.close();
		connection.close();
	}

	public static void addFkForUsr() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		try {
			statement
					.execute("alter table Order_product add constraint fk_usr_order_order_product foreign key (usr_id) references Usr(id)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		statement.close();
		connection.close();
	}

	public static void addFkForProduct() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		try {
			statement
					.execute("alter table Order_product add constraint fk_product_order_product foreign key (product_id) references Product(id)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		statement.close();
		connection.close();
	}

	public static void insertProductIntoDB(String cat, String brand, int size,
			String name, double price) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");

		Statement stCat = connection.createStatement();
		stCat.execute("insert into Category (category) values ('" + cat + "')");
		stCat.close();

		Statement stBrand = connection.createStatement();
		stBrand.execute("insert into Brand (brand) values ('" + brand + "')");
		stBrand.close();

		Statement stSize = connection.createStatement();
		stSize.execute("insert into Size (size) values (" + size + ")");
		stSize.close();

		int catID = setCat(cat);
		int brandID = setBrand(brand);
		int sizeID = setSize(size);
		addProduct(name, price, catID, brandID, sizeID);
		connection.close();
	}

	public static void insertUserIntoDB(String firstname, String lastname,
			String password, String mail, String role) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");

		Statement stCat = connection.createStatement();
		stCat.execute("insert into Role (role) values ('" + role + "')");
		stCat.close();

		int roleID = setRole(role);

		addUser(firstname, lastname, password, mail, roleID);
		connection.close();
	}

	public static void makeOrder(String yourName, String productName)
			throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");

		int usrID = setUsr(yourName);
		int productID = setProduct(productName);

		addOrderProduct(usrID, productID);
		connection.close();
	}

	public static int setCat(String cat) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statementCategory = connection.createStatement();
		ResultSet setCategory = statementCategory
				.executeQuery("select id from Category where category = '"
						+ cat + "'");
		while (setCategory.next()) {
			int catID = setCategory.getInt("id");
			return catID;
		}
		setCategory.close();
		statementCategory.close();
		connection.close();
		return 0;
	}

	public static int setBrand(String brand) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statementBrand = connection.createStatement();
		ResultSet setBrand = statementBrand
				.executeQuery("select id from Brand where brand = '" + brand
						+ "'");
		while (setBrand.next()) {
			int brandID = setBrand.getInt("id");
			return brandID;
		}
		setBrand.close();
		statementBrand.close();
		connection.close();
		return 0;
	}

	public static int setSize(int size) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statementSize = connection.createStatement();
		ResultSet setSize = statementSize
				.executeQuery("select id from Size where size = " + size);
		while (setSize.next()) {
			int sizeID = setSize.getInt("id");
			return sizeID;
		}
		setSize.close();
		statementSize.close();
		connection.close();
		return 0;
	}

	public static int setRole(String role) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statementRole = connection.createStatement();
		ResultSet setRole = statementRole
				.executeQuery("select id from Role where role = '" + role + "'");
		while (setRole.next()) {
			int roleID = setRole.getInt("id");
			return roleID;
		}
		setRole.close();
		statementRole.close();
		connection.close();
		return 0;
	}

	public static int setUsr(String yourName) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statementSize = connection.createStatement();
		ResultSet setUser = statementSize
				.executeQuery("select id from Usr where first_name = '"
						+ yourName + "'");
		while (setUser.next()) {
			int userID = setUser.getInt("id");
			return userID;
		}
		setUser.close();
		statementSize.close();
		connection.close();
		return 0;
	}

	public static int setProduct(String productName) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statementProduct = connection.createStatement();
		ResultSet setProduct = statementProduct
				.executeQuery("select id from Product where name = '"
						+ productName + "'");
		while (setProduct.next()) {
			int productID = setProduct.getInt("id");
			return productID;
		}
		setProduct.close();
		statementProduct.close();
		connection.close();
		return 0;
	}

	public static void addProduct(String name, double price, int catID,
			int brandID, int sizeID) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		statement
				.execute("insert into Product (cat_id, brand_id, size_id, name, price) values ("
						+ catID
						+ ", "
						+ brandID
						+ ", "
						+ sizeID
						+ ", "
						+ "'"
						+ name + "', " + price + ")");
		statement.close();
		connection.close();
	}

	public static void addUser(String firstname, String lastname,
			String password, String mail, int roleID) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		statement
				.execute("insert into Usr (first_name, last_name, password, mail, role_id) values ("
						+ "'"
						+ firstname
						+ "', "
						+ "'"
						+ lastname
						+ "', "
						+ "'"
						+ password
						+ "', "
						+ "'"
						+ mail
						+ "', "
						+ roleID
						+ ")");
		statement.close();
		connection.close();
	}

	public static void addOrderProduct(int usrID, int productID)
			throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		statement
				.execute("insert into Order_product (usr_id, product_id) values ("
						+ usrID + ", " + productID + ")");
		statement.close();
		connection.close();
	}

	public static void readOrder() throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		ResultSet set = statement.executeQuery("select * from Order_product");
		while (set.next()) {
			int id = set.getInt("id");
			System.out.print(id);
			System.out.print(" ");
			int userID = set.getInt("usr_id");
			getUser(userID);
			int productId = set.getInt("product_id");
			getProduct(productId);
			System.out.println();
		}
		statement.close();
		set.close();
		connection.close();
	}

	public static void getUser(int userID) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement
				.executeQuery("select * from Usr where id = " + userID);
		while (resultSet.next()) {
			String name = resultSet.getString("first_name");
			System.out.print(name);
			System.out.print(" ");
		}
		resultSet.close();
		statement.close();
		connection.close();
	}

	public static void getProduct(int productId) throws SQLException {
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/shape_database?useSSL=false",
				"root", "root");
		Statement statement = connection.createStatement();
		ResultSet resultSet2 = statement
				.executeQuery("select * from Product where id = " + productId);
		while (resultSet2.next()) {
			String product = resultSet2.getString("name");
			System.out.print(product);
			System.out.print(" ");
		}
		resultSet2.close();
		statement.close();
		connection.close();
	}
}
