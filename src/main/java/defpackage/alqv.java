package defpackage;

import android.net.Uri.Builder;
import java.util.concurrent.ScheduledFuture;

/* renamed from: alqv */
final class alqv implements Runnable {
    public final String a;
    public final String b;
    public int c = -1;
    public int d = 0;
    public boolean e;
    public boolean f;
    public ScheduledFuture g;
    public final /* synthetic */ alqt h;

    public final void run() {
        synchronized (this.h) {
            if (this.h.f != 1) {
                String.format("Delaying Spacecast probe for %s. Attempt #%s", new Object[]{this.a, Integer.valueOf(this.c)});
                this.e = true;
                return;
            }
            this.c++;
            String.format("Probing Spacecast %s hint: %s. Attempt #%s", new Object[]{this.b, this.a, Integer.valueOf(r0)});
            alqb alqb = (alqb) this.h.b.get();
            alqb.a(alqb.b, new Builder().scheme("https").encodedAuthority(this.a).build(), new alqu(this), alqb.a.a);
        }
    }

    /* synthetic */ alqv(alqt alqt, String str, String str2) {
        this.h = alqt;
        this.a = str;
        this.b = str2;
    }
}
