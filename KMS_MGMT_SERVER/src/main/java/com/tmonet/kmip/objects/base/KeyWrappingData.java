/**
 * KeyWrappingData.java
 * -----------------------------------------------------------------
 *     __ __ __  ___________ 
 *    / //_//  |/  /  _/ __ \	  .--.
 *   / ,<  / /|_/ // // /_/ /	 /.-. '----------.
 *  / /| |/ /  / // // ____/ 	 \'-' .--"--""-"-'
 * /_/ |_/_/  /_/___/_/      	  '--'
 * 
 * -----------------------------------------------------------------
 * Description:
 * The Key Wrapping Data is a structure that contains information 
 * for a cryptographic key wrapping mechanism used to wrap the Key 
 * Value.
 * 
 * This structure contains fields for: 
 * - A Wrapping Method, which indicates the method used to wrap the 
 * 	 Key Value. 
 * - Encryption Key Information, which contains the Unique 
 * 	 Identifier value of the encryption key and associated 
 * 	 cryptographic parameters. 
 * - MAC/Signature Key Information, which contains the Unique 
 * 	 Identifier value of the MAC/signature key and associated 
 * 	 cryptographic parameters.
 * - A MAC/Signature, which contains a MAC or signature of the Key 
 * 	 Value.
 * - An IV/Counter/Nonce, if REQUIRED by the wrapping method.
 *
 * @author     Stefanie Meile <stefaniemeile@gmail.com>
 * @author     Michael Guster <michael.guster@gmail.com>
 * @org.       NTB - University of Applied Sciences Buchs, (CH)
 * @copyright  Copyright ï¿½ 2013, Stefanie Meile, Michael Guster
 * @license    Simplified BSD License (see LICENSE.TXT)
 * @version    1.0, 2013/08/09
 * @since      Class available since Release 1.0
 *
 * 
 */

package com.tmonet.kmip.objects.base;

import com.tmonet.kmip.kmipenum.EnumTag;
import com.tmonet.kmip.kmipenum.EnumWrappingMethod;
import com.tmonet.kmip.objects.EncryptionKeyInformation;
import com.tmonet.kmip.objects.MACorSignatureKeyInformation;
import com.tmonet.kmip.types.KMIPByteString;

public class KeyWrappingData extends BaseObject {

	private KMIPByteString IVCounterNonce;
	private KMIPByteString macSignature;
	private MACorSignatureKeyInformation macSignatureKeyInformation;
	private EncryptionKeyInformation encryptionKeyInformation;
	private EnumWrappingMethod wrappingMethod;
	
	public KeyWrappingData(){
		super(new EnumTag(EnumTag.KeyWrappingData));
	}
		
	// Getters & Setters
	public KMIPByteString getIVCounterNonce() {
		return IVCounterNonce;
	}

	public void setIVCounterNonce(KMIPByteString iVCounterNonce) {
		IVCounterNonce = iVCounterNonce;
	}

	public KMIPByteString getMacSignature() {
		return macSignature;
	}

	public void setMacSignature(KMIPByteString macSignature) {
		this.macSignature = macSignature;
	}

	public MACorSignatureKeyInformation getMacSignatureKeyInformation() {
		return macSignatureKeyInformation;
	}

	public void setMacSignatureKeyInformation(MACorSignatureKeyInformation macSignatureKeyInformation) {
		this.macSignatureKeyInformation = macSignatureKeyInformation;
	}

	public EncryptionKeyInformation getEncryptionKeyInformation() {
		return encryptionKeyInformation;
	}

	public void setEncryptionKeyInformation(EncryptionKeyInformation encryptionKeyInformation) {
		this.encryptionKeyInformation = encryptionKeyInformation;
	}

	public EnumWrappingMethod getWrappingMethod() {
		return wrappingMethod;
	}

	public void setWrappingMethod(EnumWrappingMethod wrappingMethod) {
		this.wrappingMethod = wrappingMethod;
	}
	
	
	
	public boolean hasEncryptionKeyInformation(){
		return this.encryptionKeyInformation != null;
	}
	
	
	public boolean hasMACSignatureKeyInformation(){
		return this.macSignatureKeyInformation != null;
	}
	
	
	public boolean hasMACSignature(){
		return this.macSignature != null;
	}
	
	
	public boolean hasIVCounterNonce(){
		return this.IVCounterNonce != null;
	}
	
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Key Wrapping Data");
		sb.append("\nWrapping Method"+ this.wrappingMethod.getValueString());
		
		
		if(hasEncryptionKeyInformation()){
			sb.append("\n"+ this.encryptionKeyInformation.toString());
		}
		
		if(hasMACSignatureKeyInformation()){
			sb.append("\n"+ this.macSignatureKeyInformation.toString());
		}

		if(hasMACSignature()){
			sb.append("\nMAC/Signature"+ this.macSignature.getValueString());
		}
		
		if(hasIVCounterNonce()){
			sb.append("\nIV/Counter/Nonce"+ this.IVCounterNonce.getValueString());
		}

		return sb.toString();
	}
	
}
