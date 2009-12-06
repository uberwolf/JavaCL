package com.nativelibs4java.opencl.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class cl_ulong8 extends com.ochafik.lang.jnaerator.runtime.Union<cl_ulong8, cl_ulong8.ByValue, cl_ulong8.ByReference> {
	/// C type : cl_ulong[8]
	public long[] u64 = new long[(8)];
	public cl_ulong8() {
		super();
	}
	/// @param u64 C type : cl_ulong[8]
	public cl_ulong8(long u64[]) {
		super();
		if (u64.length != this.u64.length) 
			throw new java.lang.IllegalArgumentException("Wrong array size !");
		this.u64 = u64;
		setType(long[].class);
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected cl_ulong8 newInstance() { return new cl_ulong8(); }
	public static cl_ulong8[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Union.newArray(cl_ulong8.class, arrayLength);
	}
	public static class ByReference extends cl_ulong8 implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends cl_ulong8 implements com.sun.jna.Structure.ByValue {}
}