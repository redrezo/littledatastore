package net.redrezo.emf.littledatastore;

import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;

public class LDSObject extends EStoreEObjectImpl {

	private LDSId ldsId;
	
	public void setLDSId(LDSId id) {
		this.ldsId = id;
	}
	
	public LDSId getLDSId() {
		return this.ldsId;
	}

	@Override
	protected boolean eIsCaching() {
		return false;
	}
}
