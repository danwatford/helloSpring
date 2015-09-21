package com.foomoo.example.spring.helloSpring;

import java.io.OutputStream;
import java.io.PrintStream;

public class ChatterBox {
	private OutputStream outputStream;
	public void setOutputStream(OutputStream outputStream) {this.outputStream = outputStream;}
	public void saySomething(String something) {new PrintStream(outputStream).println(something);}
	public void saySaySomething(String something) {new PrintStream(outputStream).println(something + something);}
}
