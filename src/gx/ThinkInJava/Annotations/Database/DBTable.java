package gx.ThinkInJava.Annotations.Database;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//表示DBTable这个注解只能用于类、接口或enum声明
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
	public String name() default "";//该注解通过name这个元素为处理器创建数据库表提供表的名字
}
