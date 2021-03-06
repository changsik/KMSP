/**
 * PrivateKeyTemplateAttribute.java
 * -----------------------------------------------------------------
 *     __ __ __  ___________ 
 *    / //_//  |/  /  _/ __ \	  .--.
 *   / ,<  / /|_/ // // /_/ /	 /.-. '----------.
 *  / /| |/ /  / // // ____/ 	 \'-' .--"--""-"-'
 * /_/ |_/_/  /_/___/_/      	  '--'
 * 
 * -----------------------------------------------------------------
 * Description:
 * This class is a Subclass of Template Attribute Structures. These 
 * structures are used in various operations to provide the desired 
 * attribute values and/or template names in the request and to 
 * return the actual attribute values in the response.
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

package com.tmonet.kmip.objects.base;

import com.tmonet.kmip.objects.base.TemplateAttributeStructure;

import com.tmonet.kmip.kmipenum.EnumTag;

public class PrivateKeyTemplateAttribute extends TemplateAttributeStructure {

	
	public PrivateKeyTemplateAttribute() {
		super(new EnumTag(EnumTag.PrivateKeyTemplateAttribute));
	}
	
	
}
