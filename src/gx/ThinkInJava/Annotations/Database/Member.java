package gx.ThinkInJava.Annotations.Database;

@DBTable(name = "MEMBER")
public class Member {
	@SQLString(30) String firstName;
	@SQLString(50) String lastName;
	@SQLInteger Integer age;
	@SQLString(value = 30, constraints = @Constraints(primaryKey = true)) String handle;
	static int memberCount;
	public String getHandle(){return handle;}
	public String getFirstName(){return firstName;}
	public String getLastName(){return lastName;}
	public String toString(){return handle;}
	public Integer getAge(){return age;}
}
//这里使用了快捷方式。如果程序员的注解中定义了名为value的元素，并且在应用该注解的时候，
//如果该元素是唯一需要赋值的一个元素，那么此时无需使用名-值对的这种语法，只需在括号内给
//出value元素所需的值即可。
