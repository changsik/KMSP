/**
 * QueryOperation.java
 * -----------------------------------------------------------------
 *     __ __ __  ___________ 
 *    / //_//  |/  /  _/ __ \	  .--.
 *   / ,<  / /|_/ // // /_/ /	 /.-. '----------.
 *  / /| |/ /  / // // ____/ 	 \'-' .--"--""-"-'
 * /_/ |_/_/  /_/___/_/      	  '--'
 * 
 * -----------------------------------------------------------------
 * Description:
 * The Operation fields in the response contain Operation enumerated 
 * values, which SHALL list all the operations that the server 
 * supports. If the request contains a Query Operations value in the 
 * Query Function field, then these fields SHALL be returned in the 
 * response as Query Operations.
 * 
 * The message payload is determined by the specific operation being 
 * requested or to which is being replied. There are additional 
 * parameters depending on the operation, which are placed in the 
 * package com.tmonet.kmip.operationparameters. These parameters are 
 * not defined as Attributes according to the KMIP 1.0 specification,
 * but they are handled like these. That's why they all extend the
 * superclass Attribute. 
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

package com.tmonet.kmip.operationparameters;

import com.tmonet.kmip.attributes.KMIPAttributeValue;
import com.tmonet.kmip.kmipenum.EnumOperation;
import com.tmonet.kmip.kmipenum.EnumTag;
import com.tmonet.kmip.kmipenum.EnumType;
import com.tmonet.kmip.objects.base.Attribute;
import com.tmonet.kmip.types.KMIPTextString;
import com.tmonet.kmip.types.KMIPType;

public class QueryOperation extends Attribute {

	public QueryOperation(){
		super(new KMIPTextString("Query Operation"), new EnumTag(EnumTag.Operation), new EnumType(EnumType.Enumeration));
		this.values = new KMIPAttributeValue[1];
		this.values[0] = new KMIPAttributeValue(new EnumType(EnumType.Enumeration), new EnumTag(EnumTag.Operation), new EnumOperation());
		this.values[0].setName(this.getAttributeName());
	}
	
	public QueryOperation(KMIPType value){
		this();
		this.values[0].setValue(value);
	}
	
}
