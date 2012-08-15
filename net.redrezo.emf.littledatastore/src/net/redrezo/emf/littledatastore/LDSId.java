package net.redrezo.emf.littledatastore;

import java.util.UUID;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;

public class LDSId {
	public enum Type {
		OBJECT,
		VALUE,
		LIST_VALUE;
	}
	final public UUID objectId;
	final public EStructuralFeature feature;
	final public int index;
	final public Type type;
	
	/**
	 * Object
	 * @param objectId
	 */
	public LDSId(UUID objectId) {
		this.objectId = objectId;
		this.feature = null;
		this.index = EStore.NO_INDEX;
		this.type = Type.OBJECT;
	}
	
	/**
	 * Value
	 * @param objectId
	 * @param feature
	 */
	public LDSId(UUID objectId, EStructuralFeature feature) {
		this.objectId = objectId;
		this.feature = feature;
		this.index = EStore.NO_INDEX;
		this.type = Type.VALUE;
	}
	
	/**
	 * List Value
	 * @param objectId
	 * @param feature
	 * @param index
	 */
	public LDSId(UUID objectId, EStructuralFeature feature, int index) {
		this.objectId = objectId;
		this.feature = feature;
		this.index = index;
		this.type = Type.LIST_VALUE;
	}
	
	public static LDSId createObjectId() {
		return new LDSId(UUID.randomUUID());
	}
	
	public static LDSId getObjectId(InternalEObject object) {
		return ((LDSObject)object).getLDSId();
	}
	
	public static LDSId getObjectValueId(InternalEObject object, EStructuralFeature feature) {
		return new LDSId(getObjectId(object).objectId, feature);
	}
	
	public static LDSId getObjectListValueId(InternalEObject object, EStructuralFeature feature, int index) {
		return new LDSId(getObjectId(object).objectId, feature, index);
	}
	
	@Override
	public String toString() {
		switch (type) {
		case OBJECT: return objectId.toString();
		case VALUE: return objectId.toString() + "_" + feature.getName();
		case LIST_VALUE: return objectId.toString() + "_" + feature.getName() + "_ " + index;
		}
		return super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((feature == null) ? 0 : feature.hashCode());
		result = prime * result + index;
		result = prime * result
				+ ((objectId == null) ? 0 : objectId.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LDSId other = (LDSId) obj;
		if (feature == null) {
			if (other.feature != null)
				return false;
		} else if (!feature.equals(other.feature))
			return false;
		if (index != other.index)
			return false;
		if (objectId == null) {
			if (other.objectId != null)
				return false;
		} else if (!objectId.equals(other.objectId))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
}
