package Chapter3.q3.withoutUI;

public class Main {
 public static void main(String[] args) {
	 OperationsImp db=new OperationsImp();
//	 db.insertData("Harshika", 1, "233333");
//	 db.updateData(1, "Riddhi");
	 db.displayData();
	 db.searchData(1);
	 db.deleteData(1);
}
}
