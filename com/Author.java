package com;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Target;

@Target({ METHOD, CONSTRUCTOR })
public @interface Author {
	String name();
	String purpose();
}
