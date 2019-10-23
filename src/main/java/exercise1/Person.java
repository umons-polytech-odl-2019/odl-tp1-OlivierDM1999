package exercise1;

class Person {
	private String name;
	private int age;

	public Person (String nom,int age)
	{
		this.name=nom;
		this.age=age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String nom) {
		this.name = nom;
	}

	public int getAge()
	{
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void afficher()
	{
		System.out.println("Nom : "+this.name+", Age : "+this.age);
	}



}
