package defpackage;

import android.os.Bundle;

/* renamed from: pxo */
final class pxo implements pwh {
    private final /* synthetic */ pxm a;

    public final void a(Bundle bundle) {
        this.a.g.lock();
        try {
            this.a.e = psa.a;
            this.a.f();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(psa psa) {
        this.a.g.lock();
        try {
            pxm pxm = this.a;
            pxm.e = psa;
            pxm.f();
        } finally {
            this.a.g.unlock();
        }
    }

    public final void a(int i, boolean z) {
        this.a.g.lock();
        try {
            pxm pxm = this.a;
            if (pxm.f) {
                pxm.f = false;
                pxm.a(i, false);
                this.a.g.unlock();
                return;
            }
            pxm.f = true;
            pxm.a.a(i);
        } finally {
            this.a.g.unlock();
        }
    }

    /* synthetic */ pxo(pxm pxm) {
        this.a = pxm;
    }
}
