package gx.ThinkInJava.Annotations.Database;

public @interface Uniqueness {
	Constraints constraints()
		default @Constraints(unique=true);
}
