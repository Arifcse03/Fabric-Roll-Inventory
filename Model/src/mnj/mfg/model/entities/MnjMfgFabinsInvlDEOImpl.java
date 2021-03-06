package mnj.mfg.model.entities;

import java.math.BigDecimal;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 20 18:59:20 BDT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgFabinsInvlDEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    @Override
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_FABINS_INVL_D_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setDetailId(sVal);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        return  getPocId()!= null ? false : super.isAttributeUpdateable(i);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DetailId {
            public Object get(MnjMfgFabinsInvlDEOImpl obj) {
                return obj.getDetailId();
            }

            public void put(MnjMfgFabinsInvlDEOImpl obj, Object value) {
                obj.setDetailId((Number)value);
            }
        }
        ,
        LineId {
            public Object get(MnjMfgFabinsInvlDEOImpl obj) {
                return obj.getLineId();
            }

            public void put(MnjMfgFabinsInvlDEOImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        BuyerId {
            public Object get(MnjMfgFabinsInvlDEOImpl obj) {
                return obj.getBuyerId();
            }

            public void put(MnjMfgFabinsInvlDEOImpl obj, Object value) {
                obj.setBuyerId((Number)value);
            }
        }
        ,
        FabConst {
            public Object get(MnjMfgFabinsInvlDEOImpl obj) {
                return obj.getFabConst();
            }

            public void put(MnjMfgFabinsInvlDEOImpl obj, Object value) {
                obj.setFabConst((String)value);
            }
        }
        ,
        FabCons {
            public Object get(MnjMfgFabinsInvlDEOImpl obj) {
                return obj.getFabCons();
            }

            public void put(MnjMfgFabinsInvlDEOImpl obj, Object value) {
                obj.setFabCons((String)value);
            }
        }
        ,
        FinishColor {
            public Object get(MnjMfgFabinsInvlDEOImpl obj) {
                return obj.getFinishColor();
            }

            public void put(MnjMfgFabinsInvlDEOImpl obj, Object value) {
                obj.setFinishColor((String)value);
            }
        }
        ,
        PocId {
            public Object get(MnjMfgFabinsInvlDEOImpl obj) {
                return obj.getPocId();
            }

            public void put(MnjMfgFabinsInvlDEOImpl obj, Object value) {
                obj.setPocId((BigDecimal)value);
            }
        }
        ,
        MnjMfgFabinsInvlEO {
            public Object get(MnjMfgFabinsInvlDEOImpl obj) {
                return obj.getMnjMfgFabinsInvlEO();
            }

            public void put(MnjMfgFabinsInvlDEOImpl obj, Object value) {
                obj.setMnjMfgFabinsInvlEO((MnjMfgFabinsInvlEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgFabinsInvlDEOImpl object);

        public abstract void put(MnjMfgFabinsInvlDEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int DETAILID = AttributesEnum.DetailId.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int BUYERID = AttributesEnum.BuyerId.index();
    public static final int FABCONST = AttributesEnum.FabConst.index();
    public static final int FABCONS = AttributesEnum.FabCons.index();
    public static final int FINISHCOLOR = AttributesEnum.FinishColor.index();
    public static final int POCID = AttributesEnum.PocId.index();
    public static final int MNJMFGFABINSINVLEO = AttributesEnum.MnjMfgFabinsInvlEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgFabinsInvlDEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.entities.MnjMfgFabinsInvlDEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for DetailId, using the alias name DetailId.
     * @return the DetailId
     */
    public Number getDetailId() {
        return (Number)getAttributeInternal(DETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DetailId.
     * @param value value to set the DetailId
     */
    public void setDetailId(Number value) {
        setAttributeInternal(DETAILID, value);
    }

    /**
     * Gets the attribute value for LineId, using the alias name LineId.
     * @return the LineId
     */
    public Number getLineId() {
        return (Number)getAttributeInternal(LINEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineId.
     * @param value value to set the LineId
     */
    public void setLineId(Number value) {
        setAttributeInternal(LINEID, value);
    }

    /**
     * Gets the attribute value for BuyerId, using the alias name BuyerId.
     * @return the BuyerId
     */
    public Number getBuyerId() {
        return (Number)getAttributeInternal(BUYERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BuyerId.
     * @param value value to set the BuyerId
     */
    public void setBuyerId(Number value) {
        setAttributeInternal(BUYERID, value);
    }


    /**
     * Gets the attribute value for FabConst, using the alias name FabConst.
     * @return the FabConst
     */
    public String getFabConst() {
        return (String)getAttributeInternal(FABCONST);
    }

    /**
     * Sets <code>value</code> as the attribute value for FabConst.
     * @param value value to set the FabConst
     */
    public void setFabConst(String value) {
        setAttributeInternal(FABCONST, value);
    }

    /**
     * Gets the attribute value for FabCons, using the alias name FabCons.
     * @return the FabCons
     */
    public String getFabCons() {
        return (String)getAttributeInternal(FABCONS);
    }

    /**
     * Sets <code>value</code> as the attribute value for FabCons.
     * @param value value to set the FabCons
     */
    public void setFabCons(String value) {
        setAttributeInternal(FABCONS, value);
    }

    /**
     * Gets the attribute value for FinishColor, using the alias name FinishColor.
     * @return the FinishColor
     */
    public String getFinishColor() {
        return (String)getAttributeInternal(FINISHCOLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for FinishColor.
     * @param value value to set the FinishColor
     */
    public void setFinishColor(String value) {
        setAttributeInternal(FINISHCOLOR, value);
    }

    /**
     * Gets the attribute value for PocId, using the alias name PocId.
     * @return the PocId
     */
    public BigDecimal getPocId() {
        return (BigDecimal)getAttributeInternal(POCID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PocId.
     * @param value value to set the PocId
     */
    public void setPocId(BigDecimal value) {
        setAttributeInternal(POCID, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity MnjMfgFabinsInvlEOImpl.
     */
    public MnjMfgFabinsInvlEOImpl getMnjMfgFabinsInvlEO() {
        return (MnjMfgFabinsInvlEOImpl)getAttributeInternal(MNJMFGFABINSINVLEO);
    }

    /**
     * Sets <code>value</code> as the associated entity MnjMfgFabinsInvlEOImpl.
     */
    public void setMnjMfgFabinsInvlEO(MnjMfgFabinsInvlEOImpl value) {
        setAttributeInternal(MNJMFGFABINSINVLEO, value);
    }

    /**
     * @param detailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number detailId) {
        return new Key(new Object[]{detailId});
    }


}
