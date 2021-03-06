package mnj.mfg.model.lovviews;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Oct 16 11:32:53 BDT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class FabOuncePopUpVORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        RollNo {
            public Object get(FabOuncePopUpVORowImpl obj) {
                return obj.getRollNo();
            }

            public void put(FabOuncePopUpVORowImpl obj, Object value) {
                obj.setRollNo((String)value);
            }
        }
        ,
        SuppRollNo {
            public Object get(FabOuncePopUpVORowImpl obj) {
                return obj.getSuppRollNo();
            }

            public void put(FabOuncePopUpVORowImpl obj, Object value) {
                obj.setSuppRollNo((String)value);
            }
        }
        ,
        CutWidth {
            public Object get(FabOuncePopUpVORowImpl obj) {
                return obj.getCutWidth();
            }

            public void put(FabOuncePopUpVORowImpl obj, Object value) {
                obj.setCutWidth((Number)value);
            }
        }
        ,
        AlocYard {
            public Object get(FabOuncePopUpVORowImpl obj) {
                return obj.getAlocYard();
            }

            public void put(FabOuncePopUpVORowImpl obj, Object value) {
                obj.setAlocYard((Number)value);
            }
        }
        ,
        AlocInch {
            public Object get(FabOuncePopUpVORowImpl obj) {
                return obj.getAlocInch();
            }

            public void put(FabOuncePopUpVORowImpl obj, Object value) {
                obj.setAlocInch((Number)value);
            }
        }
        ,
        Color {
            public Object get(FabOuncePopUpVORowImpl obj) {
                return obj.getColor();
            }

            public void put(FabOuncePopUpVORowImpl obj, Object value) {
                obj.setColor((String)value);
            }
        }
        ,
        Style {
            public Object get(FabOuncePopUpVORowImpl obj) {
                return obj.getStyle();
            }

            public void put(FabOuncePopUpVORowImpl obj, Object value) {
                obj.setStyle((String)value);
            }
        }
        ,
        HeaderId {
            public Object get(FabOuncePopUpVORowImpl obj) {
                return obj.getHeaderId();
            }

            public void put(FabOuncePopUpVORowImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        ProdLId {
            public Object get(FabOuncePopUpVORowImpl obj) {
                return obj.getProdLId();
            }

            public void put(FabOuncePopUpVORowImpl obj, Object value) {
                obj.setProdLId((Number)value);
            }
        }
        ,
        Selection {
            public Object get(FabOuncePopUpVORowImpl obj) {
                return obj.getSelection();
            }

            public void put(FabOuncePopUpVORowImpl obj, Object value) {
                obj.setSelection((String)value);
            }
        }
        ,
        SelpRol {
            public Object get(FabOuncePopUpVORowImpl obj) {
                return obj.getSelpRol();
            }

            public void put(FabOuncePopUpVORowImpl obj, Object value) {
                obj.setSelpRol((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(FabOuncePopUpVORowImpl object);

        public abstract void put(FabOuncePopUpVORowImpl object, Object value);

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


    public static final int ROLLNO = AttributesEnum.RollNo.index();
    public static final int SUPPROLLNO = AttributesEnum.SuppRollNo.index();
    public static final int CUTWIDTH = AttributesEnum.CutWidth.index();
    public static final int ALOCYARD = AttributesEnum.AlocYard.index();
    public static final int ALOCINCH = AttributesEnum.AlocInch.index();
    public static final int COLOR = AttributesEnum.Color.index();
    public static final int STYLE = AttributesEnum.Style.index();
    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int PRODLID = AttributesEnum.ProdLId.index();
    public static final int SELECTION = AttributesEnum.Selection.index();
    public static final int SELPROL = AttributesEnum.SelpRol.index();

    /**
     * This is the default constructor (do not remove).
     */
    public FabOuncePopUpVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute RollNo.
     * @return the RollNo
     */
    public String getRollNo() {
        return (String) getAttributeInternal(ROLLNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute RollNo.
     * @param value value to set the  RollNo
     */
    public void setRollNo(String value) {
        setAttributeInternal(ROLLNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SuppRollNo.
     * @return the SuppRollNo
     */
    public String getSuppRollNo() {
        return (String) getAttributeInternal(SUPPROLLNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SuppRollNo.
     * @param value value to set the  SuppRollNo
     */
    public void setSuppRollNo(String value) {
        setAttributeInternal(SUPPROLLNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute CutWidth.
     * @return the CutWidth
     */
    public Number getCutWidth() {
        return (Number) getAttributeInternal(CUTWIDTH);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute CutWidth.
     * @param value value to set the  CutWidth
     */
    public void setCutWidth(Number value) {
        setAttributeInternal(CUTWIDTH, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AlocYard.
     * @return the AlocYard
     */
    public Number getAlocYard() {
        return (Number) getAttributeInternal(ALOCYARD);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AlocYard.
     * @param value value to set the  AlocYard
     */
    public void setAlocYard(Number value) {
        setAttributeInternal(ALOCYARD, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AlocInch.
     * @return the AlocInch
     */
    public Number getAlocInch() {
        return (Number) getAttributeInternal(ALOCINCH);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute AlocInch.
     * @param value value to set the  AlocInch
     */
    public void setAlocInch(Number value) {
        setAttributeInternal(ALOCINCH, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Color.
     * @return the Color
     */
    public String getColor() {
        return (String) getAttributeInternal(COLOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Color.
     * @param value value to set the  Color
     */
    public void setColor(String value) {
        setAttributeInternal(COLOR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Style.
     * @return the Style
     */
    public String getStyle() {
        return (String) getAttributeInternal(STYLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Style.
     * @param value value to set the  Style
     */
    public void setStyle(String value) {
        setAttributeInternal(STYLE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number) getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute HeaderId.
     * @param value value to set the  HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }


    /**
     * Gets the attribute value for the calculated attribute ProdLId.
     * @return the ProdLId
     */
    public Number getProdLId() {
        return (Number) getAttributeInternal(PRODLID);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute ProdLId.
     * @param value value to set the  ProdLId
     */
    public void setProdLId(Number value) {
        setAttributeInternal(PRODLID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Selection.
     * @return the Selection
     */
    public String getSelection() {
        return (String) getAttributeInternal(SELECTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Selection.
     * @param value value to set the  Selection
     */
    public void setSelection(String value) {
        setAttributeInternal(SELECTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SelpRol.
     * @return the SelpRol
     */
    public String getSelpRol() {
        return (String) getAttributeInternal(SELPROL);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute SelpRol.
     * @param value value to set the  SelpRol
     */
    public void setSelpRol(String value) {
        setAttributeInternal(SELPROL, value);
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
}
