package mnj.mfg.model.views;

import java.math.BigDecimal;

import mnj.mfg.model.entities.MnjMfgFabinsInvlDEOImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 03 13:33:42 BDT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InvPageDetailsVORowImpl extends ViewRowImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public InvPageDetailsVORowImpl() {
    }

    /**
     * Gets MnjMfgFabinsInvlDEO entity object.
     * @return the MnjMfgFabinsInvlDEO
     */
    public MnjMfgFabinsInvlDEOImpl getMnjMfgFabinsInvlDEO() {
        return (MnjMfgFabinsInvlDEOImpl)getEntity(0);
    }
}
