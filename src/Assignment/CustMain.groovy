package Assignment
import java.util.Scanner
class CustMain {
	static void main(args) {
		Scanner sc = new Scanner(System.in)
		Operations o = new Operations();
		println("Welcome to customer Management system !!!!")
		boolean i = true
		while(i) {
		println("Enter 1 to Enter Data.")
		println("Enter 2 to Update Data.")
		println("Enter 3 to Delete Data.")
		println("Enter 4 to Read Data.")
		println("Enter 5 to Exit.")
		int n = sc.nextInt()
		if(n == 1) {
			println("Enter ID: ")
			int id = sc.nextInt()
			println("Enter Name: ")
			sc.nextLine()
			String Name = sc.nextLine()

			println("Enter Address: ")
			String Address = sc.nextLine()
			o.createRecord(id, Name, Address)
		}
		else if(n == 2) {
			println("Enter ID: ")
			int id = sc.nextInt()
			println("Enter Name: ")
			String Name = sc.next()
			println("Enter Address: ")
			String Address = sc.next()
			o.updateRecord(id, Name, Address)
		}
		else if(n == 3) {
			println("Enter ID: ")
			int id = sc.nextInt()
			o.deleteRecord(id)
		}
		else if(n == 4) {
			o.readRecord()
		}
		else if(n == 5)
			i = false
		else
			println("Wrong Choice....")
		}
		println("Thank You for Visiting....")
	}
}
