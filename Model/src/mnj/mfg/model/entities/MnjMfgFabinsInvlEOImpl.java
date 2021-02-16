package mnj.mfg.model.entities;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Feb 27 20:15:17 BDT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class MnjMfgFabinsInvlEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        LineId {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getLineId();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setLineId((Number)value);
            }
        }
        ,
        HeaderId {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getHeaderId();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        Color {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getColor();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        TotalRolls {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getTotalRolls();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setTotalRolls((Number)value);
            }
        }
        ,
        TotalYards {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getTotalYards();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setTotalYards((Number)value);
            }
        }
        ,
        FinishClor {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getFinishClor();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setFinishClor((String)value);
            }
        }
        ,
        FabConst {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getFabConst();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setFabConst((String)value);
            }
        }
        ,
        FabComp {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getFabComp();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setFabComp((String)value);
            }
        }
        ,
        FabOunce {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getFabOunce();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setFabOunce((String)value);
            }
        }
        ,
        StyleSeason {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getStyleSeason();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setStyleSeason((String)value);
            }
        }
        ,
        ArticleNo {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getArticleNo();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setArticleNo((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setCreatedBy((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setLastUpdatedBy((Number)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setLastUpdateDate((Date)value);
            }
        }
        ,
        MnjMfgFabricInsTestH {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getMnjMfgFabricInsTestH();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setMnjMfgFabricInsTestH((MnjMfgFabricInsTestHImpl)value);
            }
        }
        ,
        MnjMfgFabinsInvlDEO {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getMnjMfgFabinsInvlDEO();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        MnjMfgFabinsInvlD2EO {
            public Object get(MnjMfgFabinsInvlEOImpl obj) {
                return obj.getMnjMfgFabinsInvlD2EO();
            }

            public void put(MnjMfgFabinsInvlEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(MnjMfgFabinsInvlEOImpl object);

        public abstract void put(MnjMfgFabinsInvlEOImpl object, Object value);

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

    public static final int LINEID = AttributesEnum.LineId.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int TOTALROLLS = AttributesEnum.TotalRolls.index();
    public static final int TOTALYARDS = AttributesEnum.TotalYards.index();
    public static final int FINISHCLOR = AttributesEnum.FinishClor.index();
    public static final int FABCONST = AttributesEnum.FabConst.index();
    public static final int FABCOMP = AttributesEnum.FabComp.index();
    public static final int FABOUNCE = AttributesEnum.FabOunce.index();
    public static final int STYLESEASON = AttributesEnum.StyleSeason.index();
    public static final int ARTICLENO = AttributesEnum.ArticleNo.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int MNJMFGFABRICINSTESTH = AttributesEnum.MnjMfgFabricInsTestH.index();
    public static final int MNJMFGFABINSINVLDEO = AttributesEnum.MnjMfgFabinsInvlDEO.index();
    public static final int MNJMFGFABINSINVLD2EO = AttributesEnum.MnjMfgFabinsInvlD2EO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public MnjMfgFabinsInvlEOImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("mnj.mfg.model.entities.MnjMfgFabinsInvlEO");
        }
        return mDefinitionObject;
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
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number)getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for Color, using the alias name Color.
     * @return the Color
     */
    public String getColor() {
        return (String)getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for Color.
     * @param value value to set the Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for TotalRolls, using the alias name TotalRolls.
     * @return the TotalRolls
     */
    public Number getTotalRolls() {
        return (Number)getAttributeInternal(TOTALROLLS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalRolls.
     * @param value value to set the TotalRolls
     */
    public void setTotalRolls(Number value) {
        setAttributeInternal(TOTALROLLS, value);
    }

    /**
     * Gets the attribute value for TotalYards, using the alias name TotalYards.
     * @return the TotalYards
     */
    public Number getTotalYards() {
        return (Number)getAttributeInternal(TOTALYARDS);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotalYards.
     * @param value value to set the TotalYards
     */
    public void setTotalYards(Number value) {
        setAttributeInternal(TOTALYARDS, value);
    }

    /**
     * Gets the attribute value for FinishClor, using the alias name FinishClor.
     * @return the FinishClor
     */
    public String getFinishClor() {
        return (String)getAttributeInternal(FINISHCLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for FinishClor.
     * @param value value to set the FinishClor
     */
    public void setFinishClor(String value) {
        setAttributeInternal(FINISHCLOR, value);
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
     * Gets the attribute value for FabComp, using the alias name FabComp.
     * @return the FabComp
     */
    public String getFabComp() {
        return (String)getAttributeInternal(FABCOMP);
    }

    /**
     * Sets <code>value</code> as the attribute value for FabComp.
     * @param value value to set the FabComp
     */
    public void setFabComp(String value) {
        setAttributeInternal(FABCOMP, value);
    }

    /**
     * Gets the attribute value for FabOunce, using the alias name FabOunce.
     * @return the FabOunce
     */
    public String getFabOunce() {
        return (String)getAttributeInternal(FABOUNCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FabOunce.
     * @param value value to set the FabOunce
     */
    public void setFabOunce(String value) {
        setAttributeInternal(FABOUNCE, value);
    }

    /**
     * Gets the attribute value for StyleSeason, using the alias name StyleSeason.
     * @return the StyleSeason
     */
    public String getStyleSeason() {
        return (String)getAttributeInternal(STYLESEASON);
    }

    /**
     * Sets <code>value</code> as the attribute value for StyleSeason.
     * @param value value to set the StyleSeason
     */
    public void setStyleSeason(String value) {
        setAttributeInternal(STYLESEASON, value);
    }

    /**
     * Gets the attribute value for ArticleNo, using the alias name ArticleNo.
     * @return the ArticleNo
     */
    public String getArticleNo() {
        return (String)getAttributeInternal(ARTICLENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ArticleNo.
     * @param value value to set the ArticleNo
     */
    public void setArticleNo(String value) {
        setAttributeInternal(ARTICLENO, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public Number getCreatedBy() {
        return (Number)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public Number getLastUpdatedBy() {
        return (Number)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Number value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Date value) {
        setAttributeInternal(LASTUPDATEDATE, value);
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
     * @return the associated entity MnjMfgFabricInsTestHImpl.
     */
    public MnjMfgFabricInsTestHImpl getMnjMfgFabricInsTestH() {
        return (MnjMfgFabricInsTestHImpl)getAttributeInternal(MNJMFGFABRICINSTESTH);
    }

    /**
     * Sets <code>value</code> as the associated entity MnjMfgFabricInsTestHImpl.
     */
    public void setMnjMfgFabricInsTestH(MnjMfgFabricInsTestHImpl value) {
        setAttributeInternal(MNJMFGFABRICINSTESTH, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnjMfgFabinsInvlDEO() {
        return (RowIterator)getAttributeInternal(MNJMFGFABINSINVLDEO);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getMnjMfgFabinsInvlD2EO() {
        return (RowIterator)getAttributeInternal(MNJMFGFABINSINVLD2EO);
    }

    /**
     * @param lineId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number lineId) {
        return new Key(new Object[]{lineId});
    }
    
    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
            super.create(attributeList);
            oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("MNJ_MFG_FABINS_INVL_S",getDBTransaction());
            oracle.jbo.domain.Number sVal = s.getSequenceNumber();
            setLineId(sVal);
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
