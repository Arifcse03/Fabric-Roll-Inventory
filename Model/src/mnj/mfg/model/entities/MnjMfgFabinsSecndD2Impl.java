package mnj.mfg.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 03 22:53:43 BDT 2015
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgFabinsSecndD2Impl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        DetailId2 {
            public Object get(MnjMfgFabinsSecndD2Impl obj) {
                return obj.getDetailId2();
            }

            public void put(MnjMfgFabinsSecndD2Impl obj, Object value) {
                obj.setDetailId2((Number)value);
            }
        }
        ,
        DetailId {
            public Object get(MnjMfgFabinsSecndD2Impl obj) {
                return obj.getDetailId();
            }

            public void put(MnjMfgFabinsSecndD2Impl obj, Object value) {
                obj.setDetailId((Number)value);
            }
        }
        ,
        DefectCode {
            public Object get(MnjMfgFabinsSecndD2Impl obj) {
                return obj.getDefectCode();
            }

            public void put(MnjMfgFabinsSecndD2Impl obj, Object value) {
                obj.setDefectCode((String)value);
            }
        }
        ,
        Point1 {
            public Object get(MnjMfgFabinsSecndD2Impl obj) {
                return obj.getPoint1();
            }

            public void put(MnjMfgFabinsSecndD2Impl obj, Object value) {
                obj.setPoint1((String)value);
            }
        }
        ,
        Point2 {
            public Object get(MnjMfgFabinsSecndD2Impl obj) {
                return obj.getPoint2();
            }

            public void put(MnjMfgFabinsSecndD2Impl obj, Object value) {
                obj.setPoint2((String)value);
            }
        }
        ,
        Point3 {
            public Object get(MnjMfgFabinsSecndD2Impl obj) {
                return obj.getPoint3();
            }

            public void put(MnjMfgFabinsSecndD2Impl obj, Object value) {
                obj.setPoint3((String)value);
            }
        }
        ,
        Point4 {
            public Object get(MnjMfgFabinsSecndD2Impl obj) {
                return obj.getPoint4();
            }

            public void put(MnjMfgFabinsSecndD2Impl obj, Object value) {
                obj.setPoint4((String)value);
            }
        }
        ,
        TotalPoint {
            public Object get(MnjMfgFabinsSecndD2Impl obj) {
                return obj.getTotalPoint();
            }

            public void put(MnjMfgFabinsSecndD2Impl obj, Object value) {
                obj.setTotalPoint((Number)value);
            }
        }
        ,
        DefectName {
            public Object get(MnjMfgFabinsSecndD2Impl obj) {
                return obj.getDefectName();
            }

            public void put(MnjMfgFabinsSecndD2Impl obj, Object value) {
                obj.setDefectName((String)value);
            }
        }
        ,
        MnjMfgFabinsSecndD {
            public Object get(MnjMfgFabinsSecndD2Impl obj) {
                return obj.getMnjMfgFabinsSecndD();
            }

            public void put(MnjMfgFabinsSecndD2Impl obj, Object value) {
                obj.setMnjMfgFabinsSecndD((MnjMfgFabinsSecndDImpl)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgFabinsSecndD2Impl object);

        public abstract void put(MnjMfgFabinsSecndD2Impl object, Object value);

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

    public static final int DETAILID2 = AttributesEnum.DetailId2.index();
    public static final int DETAILID = AttributesEnum.DetailId.index();
    public static final int DEFECTCODE = AttributesEnum.DefectCode.index();
    public static final int POINT1 = AttributesEnum.Point1.index();
    public static final int POINT2 = AttributesEnum.Point2.index();
    public static final int POINT3 = AttributesEnum.Point3.index();
    public static final int POINT4 = AttributesEnum.Point4.index();
    public static final int TOTALPOINT = AttributesEnum.TotalPoint.index();
    public static final int DEFECTNAME = AttributesEnum.DefectName.index();
    public static final int MNJMFGFABINSSECNDD = AttributesEnum.MnjMfgFabinsSecndD.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgFabinsSecndD2Impl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.entities.MnjMfgFabinsSecndD2");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for DetailId2, using the alias name DetailId2.
     * @return the DetailId2
     */
    public Number getDetailId2() {
        return (Number)getAttributeInternal(DETAILID2);
    }

    /**
     * Sets <code>value</code> as the attribute value for DetailId2.
     * @param value value to set the DetailId2
     */
    public void setDetailId2(Number value) {
        setAttributeInternal(DETAILID2, value);
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
     * Gets the attribute value for DefectCode, using the alias name DefectCode.
     * @return the DefectCode
     */
    public String getDefectCode() {
        return (String)getAttributeInternal(DEFECTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DefectCode.
     * @param value value to set the DefectCode
     */
    public void setDefectCode(String value) {
        setAttributeInternal(DEFECTCODE, value);
    }

    /**
     * Gets the attribute value for Point1, using the alias name Point1.
     * @return the Point1
     */
    public String getPoint1() {
        return (String)getAttributeInternal(POINT1);
    }

    /**
     * Sets <code>value</code> as the attribute value for Point1.
     * @param value value to set the Point1
     */
    public void setPoint1(String value) {
        setAttributeInternal(POINT1, value);
    }

    /**
     * Gets the attribute value for Point2, using the alias name Point2.
     * @return the Point2
     */
    public String getPoint2() {
        return (String)getAttributeInternal(POINT2);
    }

    /**
     * Sets <code>value</code> as the attribute value for Point2.
     * @param value value to set the Point2
     */
    public void setPoint2(String value) {
        setAttributeInternal(POINT2, value);
    }

    /**
     * Gets the attribute value for Point3, using the alias name Point3.
     * @return the Point3
     */
    public String getPoint3() {
        return (String)getAttributeInternal(POINT3);
    }

    /**
     * Sets <code>value</code> as the attribute value for Point3.
     * @param value value to set the Point3
     */
    public void setPoint3(String value) {
        setAttributeInternal(POINT3, value);
    }

    /**
     * Gets the attribute value for Point4, using the alias name Point4.
     * @return the Point4
     */
    public String getPoint4() {
        return (String)getAttributeInternal(POINT4);
    }

    /**
     * Sets <code>value</code> as the attribute value for Point4.
     * @param value value to set the Point4
     */
    public void setPoint4(String value) {
        setAttributeInternal(POINT4, value);
    }

    /**
     * Gets the attribute value for TotalPoint, using the alias name TotalPoint.
     * @return the TotalPoint
     */
    public Number getTotalPoint() {
        return (Number)getAttributeInternal(TOTALPOINT);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalPoint.
     * @param value value to set the TotalPoint
     */
    public void setTotalPoint(Number value) {
        setAttributeInternal(TOTALPOINT, value);
    }

    /**
     * Gets the attribute value for DefectName, using the alias name DefectName.
     * @return the DefectName
     */
    public String getDefectName() {
        return (String)getAttributeInternal(DEFECTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for DefectName.
     * @param value value to set the DefectName
     */
    public void setDefectName(String value) {
        setAttributeInternal(DEFECTNAME, value);
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
     * @return the associated entity MnjMfgFabinsSecndDImpl.
     */
    public MnjMfgFabinsSecndDImpl getMnjMfgFabinsSecndD() {
        return (MnjMfgFabinsSecndDImpl)getAttributeInternal(MNJMFGFABINSSECNDD);
    }

    /**
     * Sets <code>value</code> as the associated entity MnjMfgFabinsSecndDImpl.
     */
    public void setMnjMfgFabinsSecndD(MnjMfgFabinsSecndDImpl value) {
        setAttributeInternal(MNJMFGFABINSSECNDD, value);
    }


    /**
     * @param detailId2 key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number detailId2) {
        return new Key(new Object[]{detailId2});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        
        oracle.jbo.server.SequenceImpl s =
            new oracle.jbo.server.SequenceImpl("MNJ_MFG_FABINS_SECND_D2_S",
                                               getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setDetailId2(sVal);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

     /**
      * Add locking logic here.
      */
     //    public void lock() {
     //        super.lock();
     //    }
      public void lock() {
         try {
             super.lock();
         } catch (oracle.jbo.RowInconsistentException e) {
             if (e.getErrorCode().equals("25014")) {
                 super.lock();
             } else
                 throw e;
         }
     }
     
    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}
