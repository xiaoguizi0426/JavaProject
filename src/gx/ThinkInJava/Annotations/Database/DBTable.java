package gx.ThinkInJava.Annotations.Database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//��ʾDBTable���ע��ֻ�������ࡢ�ӿڻ�enum����
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
	public String name() default "";//��ע��ͨ��name���Ԫ��Ϊ�������������ݿ���ṩ�������
}
