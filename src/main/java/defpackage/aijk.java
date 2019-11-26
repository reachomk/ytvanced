package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aijk */
public final class aijk extends xas {
    public final aijg c;
    public final apxu d;
    public final xci e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final aijl i;
    public final amqp j;
    public final aijb k;
    public volatile boolean l;

    aijk(Executor executor, amuw amuw, xau xau, aijg aijg, apxu apxu, awbv awbv, aijb aijb, xci xci, amqp amqp) {
        int max;
        super(executor, amuw, xau);
        this.c = (aijg) amqw.a((Object) aijg);
        this.d = (apxu) amqw.a((Object) apxu);
        this.e = (xci) amqw.a((Object) xci);
        boolean a = aijn.a(awbv);
        boolean z = true;
        if (!(awbv.e || a)) {
            z = false;
        }
        this.g = z;
        this.h = a;
        amqw.a((Object) awbv);
        if (aijn.a(awbv)) {
            max = Math.max(Math.abs(awbv.c), Math.abs(awbv.d));
        } else {
            max = -1;
        }
        this.f = max;
        this.k = aijb;
        this.j = amqp;
        this.i = new aijl(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final Runnable d() {
        return new aijj(this);
    }

    public final void a() {
        this.b = true;
        amxo amxo = (amxo) this.a.iterator();
        while (amxo.hasNext()) {
            xaq xaq = (xaq) amxo.next();
            xaq.b = true;
            xaq.c();
        }
        aijb aijb = this.k;
        if (aijb != null) {
            aipw aipw = aijb.d;
            if (aipw != null) {
                aipw.a();
                aijb.d = null;
                aijb.c.d(new aijs());
            }
        }
        if (!this.l) {
            this.e.d(new aijr());
        }
        this.e.b(this);
    }
}
