package exam05;

class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Person) {
			Person tmp = (Person) obj;
			return (name.equals(tmp.name)) && (age == tmp.age);
		}
		
		return false;
	}

}
