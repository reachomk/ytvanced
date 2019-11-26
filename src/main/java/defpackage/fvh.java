package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: fvh */
final class fvh implements Runnable {
    private final anvu a;
    private final /* synthetic */ fvf b;

    public final void run() {
        if (this.b.i == null) {
            xtl.b(fvf.a, "PlaybackDescriptor is null.");
            return;
        }
        long toMillis = TimeUnit.SECONDS.toMillis(3);
        long a = this.b.g.a();
        fvf fvf = this.b;
        fvf fvf2;
        if (a - fvf.j.a >= toMillis) {
            xtl.b(fvf.a, "Timed out waiting for devices.");
            fvf2 = this.b;
            fvf2.f.a(fvf2.i, false, this.a);
            return;
        }
        int isEmpty;
        List a2 = fvf.d.a(fvf.c);
        if (adld.a(this.b.i)) {
            isEmpty = a2.isEmpty() ^ 1;
        } else {
            aurg aurg;
            aure aure = this.b.i.b;
            if (aure == null) {
                aure = aure.c;
            }
            if (aure.a == 1) {
                aurg = (aurg) aure.b;
            } else {
                aurg = aurg.e;
            }
            fvf fvf3 = this.b;
            isEmpty = adld.a(aurg, fvf3.e, fvf3.d, fvf3.c).a();
        }
        if (isEmpty != 0) {
            fvf2 = this.b;
            fvf2.f.a(fvf2.i, true, this.a);
            return;
        }
        this.b.h.postDelayed(this, 300);
    }

    /* synthetic */ fvh(fvf fvf, anvu anvu) {
        this.b = fvf;
        this.a = (anvu) amqw.a((Object) anvu);
    }
}
