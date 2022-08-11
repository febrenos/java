//Struct(alternate values in arr/vector)
public class User{
	private String name;
	private int age;
	
  public String getName()
    {
        return this.name;
    }

    public void setName(String n){
        return this.name = n;
    }
      public String getAge(){
        return this.age;
    }

    public void setAge(String a){
        return this.age = a;
    }
    
    public void filter(String f){
      if(f.toLowerCase() == "name"){
        for(int i=0; i<user.length; i++){
			    System.out.println("Name: " + user[i].name);
		    }
      }
      if(f.toLowerCase() == "age"){
        for(int i=0; i<user.length; i++){
			    System.out.println("Age: " + user[i].age);
		    }
      }
      else{
        System .out.println("Error syntaxe");
      }
    }
  
	public User(String n, int a){
		this.name= n;
		this.age = a;
	}
	
	public string toString(){
		return "Name:" + name + " age:" + age;
		String value;
		value = getName() + " " + getAge();
	}
}

// Other class
public class LstUsers{
	public static void main(String[] args){
		//create vector
		User[] user = new User[3];
		user[0] = new User("Felipe", 20);
		user[1] = new User("maria", 17);
		user[2] = new User("julia", 19);
		
		for(int i=0; i<user.length; i++){
			System.out.println("Age: " + user[i].toString());
		}
	}
}
