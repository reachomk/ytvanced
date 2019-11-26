package defpackage;

import android.net.Uri;

/* renamed from: alrk */
abstract class alrk extends alqd implements alri, alsy {
    public volatile boolean b;
    private final long k;
    private final /* synthetic */ alrc l;

    alrk(alrc alrc, Uri uri, afsw afsw) {
        this.l = alrc;
        super(uri, alrc.g, afsw);
        this.k = alrc.k.b();
    }

    public final void a(Object obj) {
        if (this.b) {
            this.l.a(1, new bqn("Client timed out"));
            return;
        }
        this.l.a(0, null);
        this.h_.a(obj);
    }

    public void b(bqn bqn) {
        this.l.a(1, bqn);
        super.b(bqn);
    }

    public final void bH_() {
        this.b = true;
    }

    public final int o() {
        return (int) ((this.l.k.b() - this.k) % 2147483647L);
    }

    public final int p() {
        try {
            byte[] a = a();
            if (a != null) {
                return a.length;
            }
        } catch (bpx unused) {
            xtl.d("AuthFailureError when attempting to get response body length.");
        }
        return 0;
    }

    public final int q() {
        return this.f.b();
    }
}
