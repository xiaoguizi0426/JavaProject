package gx.ThinkInJava.Annotations.Database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {
	boolean primaryKey() default false;
	boolean allowNull() default true;
	boolean unique() default false;
}
//��ע����ȡ�����ݿ���Ԫ���ݣ���ʾ�������ݿ������ṩ��Լ������������Ĭ��ֵ��
