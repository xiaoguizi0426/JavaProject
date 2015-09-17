package gx.ThinkInJava.Annotations.Database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
	int value() default 0;
	String name() default "";
	Constraints constraints() default @Constraints;
}
//constraints()Ԫ��������Ƕ��ע��Ĺ��ܣ���column���͵����ݿ�Լ����ϢǶ�����С�
//ע��constraints()Ԫ�ص�Ĭ��ֵ��@Constraints����ʾconstraints()Ԫ�ص�Ĭ��
//ֵ��Ϊ@Constraintsע���Ĭ��ֵ�����Ҫ��Ƕ���@Constraintsע���е�unique()Ԫ��
//Ϊtrue����@Constraints(unique=true)�������