package defpackage;

import java.util.concurrent.ExecutionException;

/* renamed from: aijh */
final class aijh implements Runnable {
    private final aiqq a;
    private final airf b;
    private final aiji c;
    private final /* synthetic */ aijg d;

    aijh(aijg aijg, aiqq aiqq, airf airf, aiji aiji) {
        this.d = aijg;
        this.a = aiqq;
        this.b = airf;
        this.c = aiji;
    }

    public final void run() {
        xak.b();
        airv airv = this.d.b;
        aiqq aiqq = this.a;
        airf airf = this.b;
        awau awau = (awau) awav.d.createBuilder();
        if (airf.a() > 0) {
            int a = airf.a();
            awau.copyOnWrite();
            awav awav = (awav) awau.instance;
            awav.a |= 1;
            awav.b = a;
        }
        if (airf.b() != 1) {
            int b = airf.b();
            awau.copyOnWrite();
            awav awav2 = (awav) awau.instance;
            if (b != 0) {
                awav2.a |= 2;
                awav2.c = b - 1;
            } else {
                throw new NullPointerException();
            }
        }
        awav awav3 = (awav) ((anxl) awau.build());
        abfj a2 = airv.a(aiqq.b(), aiqq.k(), aiqq.i(), aiqq.c(), aiqq.d(), -1, null);
        a2.J = awav3;
        a2.i = true;
        a2.z = aiqq.n();
        a2.A = aiqq.o();
        anjv a3 = airv.a(aiqq.b(), null, a2, null, false, null);
        this.c.a(2);
        try {
            aakj aakj = (aakj) a3.get();
            this.c.a(3);
            this.c.a(aakj);
        } catch (InterruptedException | ExecutionException unused) {
            this.c.a(4);
        }
    }
}
