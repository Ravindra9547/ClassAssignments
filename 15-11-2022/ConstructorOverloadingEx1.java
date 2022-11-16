//constructor reusing/chaining

package oopsconcept;
class User
{
	int userId;
	String userName,password,firstName,lastName,address;
	long phno;

public User(int userId,String firstName,String lastName)
{
	this.userId=userId;
	this.firstName=firstName;
	this.lastName=lastName;
}
public User(int userId,String firstName,String lastName,String address,long phno)
{
	this(userId,firstName,lastName);
	this.address=address;
	this.phno=phno;
}
public User(int userId,String firstName,String lastName,String address,long phno,
		   String userName,String password)
{
	this(userId,firstName,lastName,address,phno);
	this.userName=userName;
	this.password=password;
}

public int getUserId()
{
    return userId;
}

public String getUserName() 
{
	return userName;
}
public String getPassword() 
{
	return password;
}
public String getFirstName() 
{
	return firstName;
}
public String getLastName() 
{
	return lastName;
}
public String getAddress() 
{
	return address;
}
public long getPhno() 
{
	return phno;
}
}
public class ConstructorOverloadingEx1 {
public static void main(String []args)
{
	User user1=new User(1,"Ravindra","Kumar","Delhi",
			701142898,"Ravindra","Ravi1234");
	
	System.out.println("Id: "+user1.getUserId());
	System.out.println("First Name: "+user1.getFirstName());
	System.out.println("Last Name: "+user1.getLastName());
	System.out.println("Address: "+user1.getAddress());
	System.out.println("Contact: "+user1.getPhno());
	System.out.println("UserName: "+user1.getUserName());
	System.out.println("Password: "+user1.getPassword());
	
	System.out.println("============================");
	User user2=new User(2,"Shiva","Devil","up",404949494l);
	System.out.println("Id: "+user2.getUserId()+"\nFirst Name:"+user2.getFirstName()+
	"\nLast Name:"+user2.getLastName()+"\nAddress:"+user2.getAddress()+"\nContact:"+user2.getPhno());
	
}
}
