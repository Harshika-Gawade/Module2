package Chapter4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
	String name;
	int id;
	String Depart;
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", Depart=" + Depart + "]";
	}
	public Emp(String name, int id, String depart) {
		
		this.name = name;
		this.id = id;
		Depart = depart;
	}
}
public class Serialization {
	public static void main(String[] args) {
		Emp emp=new Emp("Harshika", 1, "Sales");
//		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("demo.txt"))) {
//			out.writeObject(emp);
//			System.out.println("Object written");
//		} catch (Exception e) {
//			System.out.println("Object not written");
//		}
		try(ObjectInputStream in =new ObjectInputStream(new FileInputStream("demo.txt"))) {
			Emp obj=(Emp) in.readObject();
			System.out.println(obj);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
   
}
