package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: ynk */
public final class ynk extends yig {
    public final String f;
    public final yps g;
    public final ypl h;
    public final yqv i;
    public final yty j;
    public final afyb k;
    public final ynv l;
    public final ysa m;
    public final ynw n;
    public final yqh o;
    public ypq p;
    public ypf q;
    private final String r;

    ynk(Context context, Handler handler, ywk ywk, yil yil, ypl ypl, yqv yqv, ypp ypp, afyb afyb, ynw ynw, yqh yqh, String str, String str2, yps yps, yty yty, ynv ynv, ysa ysa) {
        ywk ywk2 = ywk;
        super(context, handler, ywk2.i, ywk2, yil);
        this.r = xvd.a(str);
        this.f = xvd.a(str2);
        this.g = (yps) amqw.a((Object) yps);
        this.h = (ypl) amqw.a((Object) ypl);
        this.i = (yqv) amqw.a((Object) yqv);
        this.j = (yty) amqw.a((Object) yty);
        this.k = (afyb) amqw.a((Object) afyb);
        amqw.a((Object) ypp);
        this.l = ynv;
        this.m = (ysa) amqw.a((Object) ysa);
        this.n = ynw;
        this.o = yqh;
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.r, new ynj(this));
    }

    public final void bl_() {
        super.bl_();
        ypq ypq = this.p;
        if (ypq != null) {
            this.k.b(ypq);
            this.p = null;
        }
    }
}
