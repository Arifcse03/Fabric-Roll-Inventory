package mnj.mfg.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jan 20 19:03:01 BDT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgFabinsInvlD2EOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    @Override
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_FABINS_INVL_D2_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setDetidId2(sVal);
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DetidId2 {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getDetidId2();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setDetidId2((Number)value);
            }
        }
        ,
        DetailId {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getDetailId();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setDetailId((Number)value);
            }
        }
        ,
        RollNo {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getRollNo();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setRollNo((String)value);
            }
        }
        ,
        RollLength {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getRollLength();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setRollLength((Number)value);
            }
        }
        ,
        RollWidth {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getRollWidth();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setRollWidth((Number)value);
            }
        }
        ,
        AwLength {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getAwLength();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setAwLength((Number)value);
            }
        }
        ,
        ShrinkLength {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getShrinkLength();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setShrinkLength((Number)value);
            }
        }
        ,
        ShrinkPrcLength {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getShrinkPrcLength();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setShrinkPrcLength((Number)value);
            }
        }
        ,
        AwWidth {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getAwWidth();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setAwWidth((Number)value);
            }
        }
        ,
        ShrinkWidth {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getShrinkWidth();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setShrinkWidth((Number)value);
            }
        }
        ,
        ShrinkPrcWidth {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getShrinkPrcWidth();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setShrinkPrcWidth((Number)value);
            }
        }
        ,
        Remarks {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getRemarks();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        LineType {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getLineType();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setLineType((String)value);
            }
        }
        ,
        Shade {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getShade();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setShade((String)value);
            }
        }
        ,
        LineId {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getLineId();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        RollSrNo {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getRollSrNo();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setRollSrNo((String)value);
            }
        }
        ,
        Uom {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getUom();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setUom((String)value);
            }
        }
        ,
        RollLength2 {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getRollLength2();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setRollLength2((String)value);
            }
        }
        ,
        RolLength3 {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getRolLength3();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setRolLength3((Number)value);
            }
        }
        ,
        RolLength4 {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getRolLength4();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setRolLength4((Number)value);
            }
        }
        ,
        SupplierSerialNo {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getSupplierSerialNo();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setSupplierSerialNo((String)value);
            }
        }
        ,
        TransferSelection {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getTransferSelection();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setTransferSelection((String)value);
            }
        }
        ,
        MnjMfgFabinsInvlEO {
            public Object get(MnjMfgFabinsInvlD2EOImpl obj) {
                return obj.getMnjMfgFabinsInvlEO();
            }

            public void put(MnjMfgFabinsInvlD2EOImpl obj, Object value) {
                obj.setMnjMfgFabinsInvlEO((MnjMfgFabinsInvlEOImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgFabinsInvlD2EOImpl object);

        public abstract void put(MnjMfgFabinsInvlD2EOImpl object,
                                 Object value);

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


    public static final int DETIDID2 = AttributesEnum.DetidId2.index();
    public static final int DETAILID = AttributesEnum.DetailId.index();
    public static final int ROLLNO = AttributesEnum.RollNo.index();
    public static final int ROLLLENGTH = AttributesEnum.RollLength.index();
    public static final int ROLLWIDTH = AttributesEnum.RollWidth.index();
    public static final int AWLENGTH = AttributesEnum.AwLength.index();
    public static final int SHRINKLENGTH = AttributesEnum.ShrinkLength.index();
    public static final int SHRINKPRCLENGTH = AttributesEnum.ShrinkPrcLength.index();
    public static final int AWWIDTH = AttributesEnum.AwWidth.index();
    public static final int SHRINKWIDTH = AttributesEnum.ShrinkWidth.index();
    public static final int SHRINKPRCWIDTH = AttributesEnum.ShrinkPrcWidth.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int LINETYPE = AttributesEnum.LineType.index();
    public static final int SHADE = AttributesEnum.Shade.index();
    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int ROLLSRNO = AttributesEnum.RollSrNo.index();
    public static final int UOM = AttributesEnum.Uom.index();
    public static final int ROLLLENGTH2 = AttributesEnum.RollLength2.index();
    public static final int ROLLENGTH3 = AttributesEnum.RolLength3.index();
    public static final int ROLLENGTH4 = AttributesEnum.RolLength4.index();
    public static final int SUPPLIERSERIALNO = AttributesEnum.SupplierSerialNo.index();
    public static final int TRANSFERSELECTION = AttributesEnum.TransferSelection.index();
    public static final int MNJMFGFABINSINVLEO = AttributesEnum.MnjMfgFabinsInvlEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgFabinsInvlD2EOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.entities.MnjMfgFabinsInvlD2EO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for DetidId2, using the alias name DetidId2.
     * @return the DetidId2
     */
    public Number getDetidId2() {
        return (Number)getAttributeInternal(DETIDID2);
    }

    /**
     * Sets <code>value</code> as the attribute value for DetidId2.
     * @param value value to set the DetidId2
     */
    public void setDetidId2(Number value) {
        setAttributeInternal(DETIDID2, value);
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
     * Gets the attribute value for RollNo, using the alias name RollNo.
     * @return the RollNo
     */
    public String getRollNo() {
        return (String)getAttributeInternal(ROLLNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RollNo.
     * @param value value to set the RollNo
     */
    public void setRollNo(String value) {
        setAttributeInternal(ROLLNO, value);
    }

    /**
     * Gets the attribute value for RollLength, using the alias name RollLength.
     * @return the RollLength
     */
    public Number getRollLength() {
        return (Number)getAttributeInternal(ROLLLENGTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for RollLength.
     * @param value value to set the RollLength
     */
    public void setRollLength(Number value) {
        setAttributeInternal(ROLLLENGTH, value);
    }

    /**
     * Gets the attribute value for RollWidth, using the alias name RollWidth.
     * @return the RollWidth
     */
    public Number getRollWidth() {
        return (Number)getAttributeInternal(ROLLWIDTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for RollWidth.
     * @param value value to set the RollWidth
     */
    public void setRollWidth(Number value) {
        setAttributeInternal(ROLLWIDTH, value);
    }

    /**
     * Gets the attribute value for AwLength, using the alias name AwLength.
     * @return the AwLength
     */
    public Number getAwLength() {
        return (Number)getAttributeInternal(AWLENGTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for AwLength.
     * @param value value to set the AwLength
     */
    public void setAwLength(Number value) {
        setAttributeInternal(AWLENGTH, value);
    }

    /**
     * Gets the attribute value for ShrinkLength, using the alias name ShrinkLength.
     * @return the ShrinkLength
     */
    public Number getShrinkLength() {
        return (Number)getAttributeInternal(SHRINKLENGTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShrinkLength.
     * @param value value to set the ShrinkLength
     */
    public void setShrinkLength(Number value) {
        setAttributeInternal(SHRINKLENGTH, value);
    }

    /**
     * Gets the attribute value for ShrinkPrcLength, using the alias name ShrinkPrcLength.
     * @return the ShrinkPrcLength
     */
    public Number getShrinkPrcLength() {
        return (Number)getAttributeInternal(SHRINKPRCLENGTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShrinkPrcLength.
     * @param value value to set the ShrinkPrcLength
     */
    public void setShrinkPrcLength(Number value) {
        setAttributeInternal(SHRINKPRCLENGTH, value);
    }

    /**
     * Gets the attribute value for AwWidth, using the alias name AwWidth.
     * @return the AwWidth
     */
    public Number getAwWidth() {
        return (Number)getAttributeInternal(AWWIDTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for AwWidth.
     * @param value value to set the AwWidth
     */
    public void setAwWidth(Number value) {
        setAttributeInternal(AWWIDTH, value);
    }

    /**
     * Gets the attribute value for ShrinkWidth, using the alias name ShrinkWidth.
     * @return the ShrinkWidth
     */
    public Number getShrinkWidth() {
        return (Number)getAttributeInternal(SHRINKWIDTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShrinkWidth.
     * @param value value to set the ShrinkWidth
     */
    public void setShrinkWidth(Number value) {
        setAttributeInternal(SHRINKWIDTH, value);
    }

    /**
     * Gets the attribute value for ShrinkPrcWidth, using the alias name ShrinkPrcWidth.
     * @return the ShrinkPrcWidth
     */
    public Number getShrinkPrcWidth() {
        return (Number)getAttributeInternal(SHRINKPRCWIDTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShrinkPrcWidth.
     * @param value value to set the ShrinkPrcWidth
     */
    public void setShrinkPrcWidth(Number value) {
        setAttributeInternal(SHRINKPRCWIDTH, value);
    }

    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the Remarks
     */
    public String getRemarks() {
        return (String)getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for LineType, using the alias name LineType.
     * @return the LineType
     */
    public String getLineType() {
        return (String)getAttributeInternal(LINETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineType.
     * @param value value to set the LineType
     */
    public void setLineType(String value) {
        setAttributeInternal(LINETYPE, value);
    }

    /**
     * Gets the attribute value for Shade, using the alias name Shade.
     * @return the Shade
     */
    public String getShade() {
        return (String)getAttributeInternal(SHADE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Shade.
     * @param value value to set the Shade
     */
    public void setShade(String value) {
        setAttributeInternal(SHADE, value);
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
     * Gets the attribute value for RollSrNo, using the alias name RollSrNo.
     * @return the RollSrNo
     */
    public String getRollSrNo() {
        return (String)getAttributeInternal(ROLLSRNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RollSrNo.
     * @param value value to set the RollSrNo
     */
    public void setRollSrNo(String value) {
        setAttributeInternal(ROLLSRNO, value);
    }

    /**
     * Gets the attribute value for Uom, using the alias name Uom.
     * @return the Uom
     */
    public String getUom() {
        return (String)getAttributeInternal(UOM);
    }

    /**
     * Sets <code>value</code> as the attribute value for Uom.
     * @param value value to set the Uom
     */
    public void setUom(String value) {
        setAttributeInternal(UOM, value);
    }

    /**
     * Gets the attribute value for RollLength2, using the alias name RollLength2.
     * @return the RollLength2
     */
    public String getRollLength2() {
        return (String)getAttributeInternal(ROLLLENGTH2);
    }

    /**
     * Sets <code>value</code> as the attribute value for RollLength2.
     * @param value value to set the RollLength2
     */
    public void setRollLength2(String value) {
        setAttributeInternal(ROLLLENGTH2, value);
    }

    /**
     * Gets the attribute value for RolLength3, using the alias name RolLength3.
     * @return the RolLength3
     */
    public Number getRolLength3() {
        return (Number)getAttributeInternal(ROLLENGTH3);
    }

    /**
     * Sets <code>value</code> as the attribute value for RolLength3.
     * @param value value to set the RolLength3
     */
    public void setRolLength3(Number value) {
        setAttributeInternal(ROLLENGTH3, value);
    }

    /**
     * Gets the attribute value for RolLength4, using the alias name RolLength4.
     * @return the RolLength4
     */
    public Number getRolLength4() {
        return (Number)getAttributeInternal(ROLLENGTH4);
    }

    /**
     * Sets <code>value</code> as the attribute value for RolLength4.
     * @param value value to set the RolLength4
     */
    public void setRolLength4(Number value) {
        setAttributeInternal(ROLLENGTH4, value);
    }

    /**
     * Gets the attribute value for SupplierSerialNo, using the alias name SupplierSerialNo.
     * @return the SupplierSerialNo
     */
    public String getSupplierSerialNo() {
        return (String)getAttributeInternal(SUPPLIERSERIALNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierSerialNo.
     * @param value value to set the SupplierSerialNo
     */
    public void setSupplierSerialNo(String value) {
        setAttributeInternal(SUPPLIERSERIALNO, value);
    }

    /**
     * Gets the attribute value for TransferSelection, using the alias name TransferSelection.
     * @return the TransferSelection
     */
    public String getTransferSelection() {
        return (String)getAttributeInternal(TRANSFERSELECTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for TransferSelection.
     * @param value value to set the TransferSelection
     */
    public void setTransferSelection(String value) {
        setAttributeInternal(TRANSFERSELECTION, value);
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
     * @param detidId2 key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number detidId2) {
        return new Key(new Object[]{detidId2});
    }


}