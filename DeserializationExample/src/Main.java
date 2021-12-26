import java.io.*;

public class Main {
/*
		 Deserialization = 	The reverse process of converting a byte stream into an object.
				    (Think of this as if you're loading a saved file)

					Steps to Deserialize
				---------------------------------------------------------------
				1. Your class should implement Serializable interface
				2. add import java.io.Serializable;
				3. FileInputStream fileIn = new FileInputStream(file path);
				4. ObjectInputStream in = new ObjectInputStream(fileIn);
			    5. objectNam = (Class) in.readObject();
				6. in.close(); fileIn.close();
				---------------------------------------------------------------
*/
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		User user = null;
		
		FileInputStream fis = new FileInputStream("C:\\Users\\38975\\Desktop\\Coding2\\SerializationExample\\UserInfo.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		user = (User) ois.readObject();
		ois.close();
		fis.close();
		
		System.out.println("The users name: "+ user.name);
		System.out.println("The users password: "+ user.password);
		user.sayHello();
		
	}

}
