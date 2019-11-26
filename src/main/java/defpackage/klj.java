package defpackage;

import java.util.Map;

/* renamed from: klj */
final /* synthetic */ class klj implements Runnable {
    private final klh a;
    private final akat b;
    private final acvx c;
    private final akxv d;

    klj(klh klh, akat akat, acvx acvx, akxv akxv) {
        this.a = klh;
        this.b = akat;
        this.c = acvx;
        this.d = akxv;
    }

    public final void run() {
        klh klh = this.a;
        akat akat = this.b;
        acvx acvx = this.c;
        akxv akxv = this.d;
        klh.h.setVisibility(8);
        Map map = null;
        klh.i.a(null, acvx);
        akaw akaw = akat.d;
        if (akaw != null) {
            axwa axwa = akaw.a;
            if (axwa != null) {
                klh.h.setVisibility(0);
                axwd axwd = (axwd) ((anxo) axwa.toBuilder());
                evj.b(klh.a.getContext(), axwd, ajqy.a(akat.b));
                axwa = (axwa) ((anxl) axwd.build());
                akat.d.a = axwa;
                if (akxv != null) {
                    map = amur.a("sectionListController", akxv);
                }
                klh.i.a(axwa, acvx, map);
            }
        }
    }
}
