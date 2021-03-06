/**
 * OperationPolicyName.java
 * -----------------------------------------------------------------
 *     __ __ __  ___________ 
 *    / //_//  |/  /  _/ __ \	  .--.
 *   / ,<  / /|_/ // // /_/ /	 /.-. '----------.
 *  / /| |/ /  / // // ____/ 	 \'-' .--"--""-"-'
 * /_/ |_/_/  /_/___/_/      	  '--'
 * 
 * -----------------------------------------------------------------
 * Description:
 * An operation policy controls what entities MAY perform which key 
 * management operations on the object. The content of the Operation 
 * Policy Name attribute is the name of a policy object known to the 
 * key management system and, therefore, is server dependent.
 *
 * @author     Stefanie Meile <stefaniemeile@gmail.com>
 * @author     Michael Guster <michael.guster@gmail.com>
 * @org.       NTB - University of Applied Sciences Buchs, (CH)
 * @copyright  Copyright © 2013, Stefanie Meile, Michael Guster
 * @license    Simplified BSD License (see LICENSE.TXT)
 * @version    1.0, 2013/08/09
 * @since      Class available since Release 1.0
 *
 * 
 */

package com.tmonet.kmip.attributes;

import com.tmonet.kmip.kmipenum.EnumTag;
import com.tmonet.kmip.kmipenum.EnumType;
import com.tmonet.kmip.objects.base.Attribute;
import com.tmonet.kmip.types.KMIPTextString;

public class OperationPolicyName extends Attribute {
	
	public OperationPolicyName(){
		super(new KMIPTextString("Operation Policy Name"), new EnumTag(EnumTag.OperationPolicyName), new EnumType(EnumType.TextString));
		this.values = new KMIPAttributeValue[1];
		
		this.values[0] = new KMIPAttributeValue(new EnumType(EnumType.TextString), new EnumTag(EnumTag.OperationPolicyName), new KMIPTextString());
		this.values[0].setName(this.getAttributeName());
	}
}
