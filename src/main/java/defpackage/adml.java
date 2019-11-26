package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: adml */
public final class adml implements ajan {
    public final /* synthetic */ admk a;

    adml(admk admk) {
        this.a = admk;
    }

    public final long e() {
        return 1;
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkf ahkf) {
        aafv aafv = ahkf.c;
        if (aafv != null) {
            this.a.h = aafv.b;
        } else {
            this.a.h = null;
        }
        apxu apxu = ahkf.d;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                admk admk = this.a;
                apxu apxu2 = ahkf.d;
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu2.a(access$000);
                Object b = apxu2.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                admk.c = (azje) b;
                this.a.b = null;
            }
        }
        this.a.c = null;
        this.a.b = null;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.t().a(new admo(this)), ajam.n().a(new admn(this))};
    }
}
