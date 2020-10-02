package lecture08.ajax;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;

public class GsonTest {

	@Test
	public void testObjectToJson() {

		Person person = new Person();
		person.setUsername("zhangsan");
		person.setPassword("123456");
		person.setAddress("beijing");
		person.setAge(30);

		person.getList().add("hello");
		person.getList().add("world");
		person.getList().add("hello world");

		Gson gson = new Gson();
		String result = gson.toJson(person);
		System.out.println(result);
	}

	class Person {

		private String username;

		private String password;

		private int age;

		private String address;

		private List<String> list = new ArrayList<String>();

		public List<String> getList() {
			return list;
		}

		public void setList(List<String> list) {
			this.list = list;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	}
}
