package com.nativelibs4java.opencl.library;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
import org.bridj.ann.Union;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Union 
@Library("OpenCL") 
public class cl_ushort8 extends StructObject {
	public cl_ushort8() {
		super();
	}
	/// C type : cl_ushort[8]
	@Array({8}) 
	@Field(0) 
	public Pointer<Short > s() {
		return this.io.getPointerField(this, 0);
	}
	public cl_ushort8(Pointer pointer) {
		super(pointer);
	}
}
