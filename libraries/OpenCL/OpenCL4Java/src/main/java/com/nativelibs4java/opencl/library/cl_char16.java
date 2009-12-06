package com.nativelibs4java.opencl.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cl_char16 extends com.ochafik.lang.jnaerator.runtime.Union<cl_char16, cl_char16.ByValue, cl_char16.ByReference> {
	/// C type : cl_char[16]
	public byte[] i8 = new byte[(16)];
	public cl_char16() {
		super();
	}
	/// @param i8 C type : cl_char[16]
	public cl_char16(byte i8[]) {
		super();
		if (i8.length != this.i8.length) 
			throw new java.lang.IllegalArgumentException("Wrong array size !");
		this.i8 = i8;
		setType(byte[].class);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected cl_char16 newInstance() { return new cl_char16(); }
	public static cl_char16[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Union.newArray(cl_char16.class, arrayLength);
	}
	public static class ByReference extends cl_char16 implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends cl_char16 implements com.sun.jna.Structure.ByValue {}
}