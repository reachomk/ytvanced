package defpackage;

import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;

/* renamed from: ewn */
public final class ewn implements akyw {
    private final xci a;
    private final acvx b;

    public ewn(xci xci, acvx acvx) {
        this.a = xci;
        this.b = acvx;
    }

    public final void a(aphf aphf) {
        if (aphf != null) {
            if (aphf.a()) {
                this.a.d(new ecs());
                acvx acvx = this.b;
                apxu apxu = ((aphg) aphf.instance).l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                acvx.a(3, new acvs(apxu.b), null);
            }
            if (this.b != null) {
                apxu b = aphf.b();
                anxr access$000 = anxl.checkIsLite(YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint);
                b.a(access$000);
                if (b.h.a(access$000.d)) {
                    this.b.a(3, new acvs(aphf.b().b), null);
                }
            }
        }
    }
}
