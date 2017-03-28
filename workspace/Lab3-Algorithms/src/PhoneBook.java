import java.util.*;

public class PhoneBook {

	public static void main(String[] args) {
		
		//Create hashtable to store phonebook
		Hashtable<String,Object> phonebook = new Hashtable<String,Object>();
		
		//create contact objects to store in phonebook
		phonebook.put("Danayal", "07765432101");
		phonebook.put("Harambe", "07890123454");
		phonebook.put("Bawsaq", "07512345345");
		
		Enumeration names = phonebook.keys();
		
		//iterate over all elements in phonebook
		String name;
		
		while(names.hasMoreElements())
		{
			name = (String) names.nextElement();
			System.out.println(name + ": " + phonebook.get(name));
		}
		
		String phone = (String) phonebook.get("Harambe");
		
//		names = phonebook.keys();
//		while(names.hasMoreElements())
//		{
//			name = (String) names.nextElement();
//			System.out.println(name + ": " + phonebook.get(name));
	//	}
	}

}
