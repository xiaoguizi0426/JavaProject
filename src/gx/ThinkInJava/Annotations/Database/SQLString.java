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
//constraints()元素利用了嵌套注解的功能，将column类型的数据库约束信息嵌入其中。
//注意constraints()元素的默认值是@Constraints。表示constraints()元素的默认
//值都为@Constraints注解的默认值。如果要令嵌入的@Constraints注解中的unique()元素
//为true，则@Constraints(unique=true)如此设置