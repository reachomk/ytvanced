package defpackage;

import java.io.Serializable;

/* renamed from: amrn */
public final class amrn {
    public static amro a(amro amro) {
        if ((amro instanceof amrp) || (amro instanceof amrq)) {
            return amro;
        }
        amro amrq;
        if (amro instanceof Serializable) {
            amrq = new amrq(amro);
        } else {
            amrq = new amrp(amro);
        }
        return amrq;
    }
}
