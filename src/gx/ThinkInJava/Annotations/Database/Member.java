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
//����ʹ���˿�ݷ�ʽ���������Ա��ע���ж�������Ϊvalue��Ԫ�أ�������Ӧ�ø�ע���ʱ��
//�����Ԫ����Ψһ��Ҫ��ֵ��һ��Ԫ�أ���ô��ʱ����ʹ����-ֵ�Ե������﷨��ֻ���������ڸ�
//��valueԪ�������ֵ���ɡ�
