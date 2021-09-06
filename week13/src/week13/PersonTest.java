package week13;
class Person {
	String name;
	String address;
	String phone;
	
	public Person(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "�̸� : " + name + "\n�ּ� : " + address + "\n��ȭ��ȣ" + phone;
	}
}

class Customer extends Person {
	int customerNumber;
	int mileage;
	
	public Customer(String name, String address, String phone) {
		super(name, address, phone);
	}
	public Customer(String name, String address, int customerNumber, int mileage) {
		super(name, address);
		this.customerNumber = customerNumber;
		this.mileage = mileage;
	}
	public Customer(String name) {
		setName(name);
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	public String toString() {
		return super.toString() + "\n������ȣ : " + customerNumber + "\n���ϸ��� : " + mileage;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Customer c1 = new Customer("ȫ�浿", "�ƻ�� ȣ�����б�", "041 540 5114");
		Customer c2 = new Customer("�̼���", "õ�Ƚ� ȣ�����б�", 1234, 540);
		System.out.println("��ü 1 : \n" + c1);
		System.out.println("\n��ü 2 : \n" + c2);
		Customer c3 = new Customer("�念��");
		System.out.println("\n��ü 3 : \n" + c3.name);
	}
}