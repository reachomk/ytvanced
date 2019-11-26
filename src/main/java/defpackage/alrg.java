package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;

/* renamed from: alrg */
final class alrg implements Runnable {
    public final int a;
    public final /* synthetic */ alrh b;

    public alrg(alrh alrh, int i) {
        this.b = alrh;
        this.a = i;
    }

    public final void run() {
        this.b.c();
        if (!this.b.b) {
            Uri build = new Builder().scheme("https").encodedAuthority(this.b.c.h.b).build();
            alqb alqb = this.b.c.i;
            alqb.a(alqb.b, build, new alrj(this), this.b.c.b.g);
        }
    }
}
