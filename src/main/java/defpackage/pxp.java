package defpackage;

import android.os.Bundle;

/* renamed from: pxp */
final class pxp implements pwh {
    private final /* synthetic */ pxm a;

    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            pxm pxm = this.a;
            Bundle bundle2 = pxm.c;
            if (bundle2 == null) {
                pxm.c = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            this.a.d = psa.a;
            this.a.f();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(psa psa) {
        this.a.g.lock();
        try {
            pxm pxm = this.a;
            pxm.d = psa;
            pxm.f();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            pxm pxm = this.a;
            if (!pxm.f) {
                psa psa = pxm.e;
                if (psa != null) {
                    if (psa.b()) {
                        pxm = this.a;
                        pxm.f = true;
                        pxm.b.a(i);
                        this.a.g.unlock();
                        return;
                    }
                }
            }
            pxm = this.a;
            pxm.f = false;
            pxm.a(i, false);
        } finally {
            this.a.g.unlock();
        }
    }

    /* synthetic */ pxp(pxm pxm) {
        this.a = pxm;
    }
}
