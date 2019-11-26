package defpackage;

import android.content.Intent;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;

/* renamed from: dxk */
final class dxk implements exv, wxe {
    private final apxu a;
    private final aaas b;
    private final exu c;
    private boolean d;

    dxk(apxu apxu, aaas aaas, exu exu) {
        this.a = apxu;
        this.b = aaas;
        this.c = exu;
    }

    public final void b() {
    }

    public final boolean a(int i, int i2, Intent intent) {
        if (i != 907) {
            return false;
        }
        if (i2 == 0) {
            exu exu = this.c;
            if (exu.a) {
                c();
            } else {
                exu.a((exv) this);
                this.d = true;
            }
        }
        return true;
    }

    public final void a() {
        if (this.d) {
            c();
            this.c.b((exv) this);
        }
    }

    private final void c() {
        aaas aaas = this.b;
        apxu apxu = this.a;
        anxr access$000 = anxl.checkIsLite(AppStoreEndpointOuterClass.appStoreEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aaas.a(((aowy) b).g, null);
    }
}
