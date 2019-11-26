package defpackage;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: iwy */
final class iwy implements akoq, iww {
    private final /* synthetic */ iwx a;

    iwy(iwx iwx) {
        this.a = iwx;
    }

    public final void a(akor akor, aknh aknh, int i) {
        iwx iwx = this.a;
        if (i == 0) {
            Object c = aknh.c(0);
            if (c instanceof ajwc) {
                ajwc ajwc = (ajwc) c;
                if (ajwc.hasExtension(ajwb.a) && ((Boolean) ajwc.getExtension(ajwb.a)).booleanValue()) {
                    akor.a("refinement_selection_listener", iwx.b);
                    akor.a("refinement_selection_controller", iwx.a);
                }
            }
        }
    }

    public final void a(axdr axdr) {
        iww iww;
        iwz iwz = this.a.a;
        axdo axdo = iwz.b;
        arml arml = null;
        if (axdo != null) {
            arml arml2;
            Map map = iwz.a;
            if ((axdo.a & 2) != 0) {
                arml2 = axdo.c;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            iww = (iww) map.get(ajqy.a(arml2).toString());
            axdr axdr2 = (axdr) ((anxo) iwz.b.toBuilder());
            axdr2.a(axdm.b, Boolean.valueOf(false));
            if (iww != null) {
                iww.a(axdr2);
            }
            iwz.b = (axdo) ((anxl) axdr2.build());
        }
        if (axdr != null) {
            Map map2 = iwz.a;
            axdo axdo2 = (axdo) axdr.instance;
            if ((axdo2.a & 2) != 0) {
                arml = axdo2.c;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            iww = (iww) map2.get(ajqy.a(arml).toString());
            axdr.a(axdm.b, Boolean.valueOf(true));
            if (iww != null) {
                iww.a(axdr);
            }
        }
        iwz.b = (axdo) ((anxl) axdr.build());
        WeakReference weakReference = this.a.c;
        if (weakReference != null) {
            iww iww2 = (iww) weakReference.get();
            if (iww2 != null) {
                iww2.a(axdr);
            }
        }
    }
}
