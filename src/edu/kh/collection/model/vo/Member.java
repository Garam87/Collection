package edu.kh.collection.model.vo;

import java.util.Objects;

public class Member {

	private String Id;
	private String Pw;
	private int age;
	
	public Member() {}
	
	public Member(String id, String pw, int age) {
		Id = id;
		Pw = pw;
		this.age = age;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getPw() {
		return Pw;
	}

	public void setPw(String pw) {
		Pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	// Object.equals() 오버라이딩
	// - 현재 객체와 매개변수로 전달받은 객체의 필드가 같은지 비교하는 형태로 오버라이딩
	
	@Override
	public boolean equals(Object obj) {
		Member other = (Member)obj; // 다운캐스팅
		
		return	this.Id.equals(other.Id) 
				&& this.Pw.equals(other.Pw) 
				&& this.age == other.age;
	}
	
	// Object.hashCode() 오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(Id, Pw, age);
	}

	@Override
	public String toString() {
		return "Member [Id = " + Id + ", Pw = " + Pw + ", age = " + age + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
