package defpackage;

/* renamed from: aijj */
final class aijj implements Runnable {
    public final /* synthetic */ aijk a;

    aijj(aijk aijk) {
        this.a = aijk;
    }

    public final void run() {
        xak.b();
        aijk aijk = this.a;
        aijk.e.a((Object) this, ahkn.class, aijk.i);
        aiji aiji = aijg.a;
        if (this.a.k != null) {
            aiji = new aijm(this);
        }
        aijk aijk2 = this.a;
        aijg aijg = aijk2.c;
        aiqs a = aiqq.a();
        a.a = aijk2.d;
        a.e = aijk2.g;
        a.d = aijk2.h;
        aiqq b = a.b();
        aijk aijk3 = this.a;
        aire c = airf.c();
        if (aijk3.f > 0) {
            c.b(7).a(aijk3.f);
        } else if (aijk3.a.isEmpty()) {
            c.b(8);
        }
        aijg.a(b, c.a(), aiji);
    }
}
