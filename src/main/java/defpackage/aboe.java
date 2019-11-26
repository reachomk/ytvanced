package defpackage;

import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;

/* renamed from: aboe */
public final class aboe {
    public final xhf a;
    public final aboo b;
    public final Semaphore c = new Semaphore(4, true);
    private final xsc d;

    public aboe(xhf xhf, aboo aboo, xsc xsc) {
        this.a = (xhf) amqw.a((Object) xhf);
        this.b = aboo;
        this.d = xsc;
    }

    public final abnp a(abod abod) {
        amqw.a((Object) abod);
        if (!abod.b()) {
            if (!TextUtils.isEmpty(null)) {
                return new abmy().c();
            }
            Semaphore semaphore = this.c;
            if (semaphore != null) {
                try {
                    semaphore.acquire();
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bqr a = bqr.a();
            abod.o = new aboh(this, a);
            abod.p = new abog(this, a);
            abop c = abod.c();
            xsc xsc = this.d;
            int i = 0;
            int b = xsc != null ? (int) xsc.b() : 0;
            this.a.b(c);
            try {
                abnq abnq = (abnq) a.get();
                if (abnq == null) {
                    return null;
                }
                xsc xsc2 = this.d;
                if (xsc2 != null) {
                    i = (int) xsc2.b();
                }
                abnp c2 = abnq.c();
                if (c2 != null) {
                    c2.c = i - b;
                }
                if (this.b != null) {
                    if (abod.d.isEmpty()) {
                        this.b.a(abnq);
                    }
                }
                return c2;
            } catch (InterruptedException unused2) {
                if (this.c == null) {
                    c.h();
                }
            } catch (ExecutionException e) {
                String valueOf = String.valueOf(e.getMessage());
                String str = "Suggest task threw an exception: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                Semaphore semaphore2 = this.c;
                if (semaphore2 != null) {
                    semaphore2.release();
                }
            }
        }
        return null;
    }
}
