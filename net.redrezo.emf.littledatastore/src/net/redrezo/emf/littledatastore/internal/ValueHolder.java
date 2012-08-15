package net.redrezo.emf.littledatastore.internal;

import net.redrezo.emf.littledatastore.LDSId;

import org.eclipse.emf.ecore.InternalEObject;

public class ValueHolder {
	
	public enum ValueType {
		REFERENCE,
		ATTRIBUTE;
	}
	
	
	public final Object value;
	public final ValueType type;
	
	public ValueHolder(Object value, ValueType type) {
		this.value = value;
		this.type = type;
	}
	
	public static ValueHolder createAttributeHolder(Object object) {
		return new ValueHolder(object, ValueType.ATTRIBUTE);
	}
	
	public static ValueHolder createReferenceHolder(Object object) {
		return new ValueHolder(LDSId.getObjectId((InternalEObject) object), ValueType.REFERENCE);
	}
	
	@Override
	public String toString() {
		switch (type) {
		case ATTRIBUTE: return "ValueHolder("+value+")";
		case REFERENCE: return "ValueHolder(ref="+value+")";
		}
		return super.toString();
	}
	
}
