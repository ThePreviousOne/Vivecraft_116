package jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class TrackedDevicePose_t extends Structure {
	public HmdMatrix34_t mDeviceToAbsoluteTracking;
	public HmdVector3_t vVelocity;
	public HmdVector3_t vAngularVelocity;
	/** @see ETrackingResult */
	public int eTrackingResult;
	public byte bPoseIsValid;
	public byte bDeviceIsConnected;
	public TrackedDevicePose_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("mDeviceToAbsoluteTracking", "vVelocity", "vAngularVelocity", "eTrackingResult", "bPoseIsValid", "bDeviceIsConnected");
	}
	public TrackedDevicePose_t(HmdMatrix34_t mDeviceToAbsoluteTracking, HmdVector3_t vVelocity, HmdVector3_t vAngularVelocity, int eTrackingResult, byte bPoseIsValid, byte bDeviceIsConnected) {
		super();
		this.mDeviceToAbsoluteTracking = mDeviceToAbsoluteTracking;
		this.vVelocity = vVelocity;
		this.vAngularVelocity = vAngularVelocity;
		this.eTrackingResult = eTrackingResult;
		this.bPoseIsValid = bPoseIsValid;
		this.bDeviceIsConnected = bDeviceIsConnected;
	}
	public TrackedDevicePose_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends TrackedDevicePose_t implements Structure.ByReference {
		
	};
	public static class ByValue extends TrackedDevicePose_t implements Structure.ByValue {
		
	};
}
