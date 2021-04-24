package Assignment

import groovy.sql.Sql;

class Operations implements OperationsInterface {
	
	def sql = Sql.newInstance('jdbc:mysql://localhost:3306/test', 'root', 'root', 'com.mysql.jdbc.Driver')
	def void createRecord(int id1, String name1, String Address1) {
		def sqlstr = "INSERT INTO CUSTOMERS1(id, name, address) VALUES" + "(${id1}, '${name1}', '${Address1}')" 
		try {
			sql.execute(sqlstr);
			//sql.commit()
			println("Successfully committed")
		}catch(Exception ex) {
			println(ex)
		}
									
		//sql.execute(sqlstr);
	}
	def void updateRecord(int id1, String name1, String Address1) {
		def sqlstr = "UPDATE CUSTOMERS1 SET name ="+" '${name1}', address = '${Address1}' WHERE ID = ${id1}"
		try {
			sql.execute(sqlstr);
			//sql.commit()
			println("Details Updated !!!")
		}catch(Exception ex) {
			println(ex)
		}
	}
	def void deleteRecord(int id1) {
		def sqlstr = "DELETE FROM CUSTOMERS1 WHERE ID = "+"${id1}"
		try {
			sql.execute(sqlstr)
			println("Customer Removed !!!")
		}catch(Exception e) {
			println(e)
		}
	}
	def void readRecord() {
		sql.eachRow("SELECT * FROM CUSTOMERS1") {
			tp -> 
			println([tp.ID,tp.NAME,tp.ADDRESS])
		 }
	}
}
