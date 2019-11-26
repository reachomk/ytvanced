package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;

/* renamed from: adqx */
public abstract class adqx implements adty {
    public static final String a = xtl.b("MDX.BaseSessionRecoverer");
    public final bbb b;
    public final xhv c;
    public final xci d;
    public final Handler e;
    public final adrc f;
    public final boolean g;
    public adtl h;
    public boolean i;
    private final baz j;
    private final adgw k;
    private int l;
    private adtx m;
    private final bbe n = new adra(this);
    private final Callback o = new adqz(this);
    private int p = 1;
    private final int q;

    public final void a(adtl adtl, adtx adtx) {
        xak.a();
        amqw.a((Object) adtl);
        amqw.a((Object) adtx);
        this.m = adtx;
        b(1);
        this.b.a(this.j, this.n);
        this.h = adtl;
        this.k.a((Object) this);
        this.e.sendEmptyMessage(1);
    }

    public abstract void a(bbs bbs);

    public abstract void b();

    public final void a() {
        xak.a();
        if (this.l == 1) {
            b(3);
        }
    }

    public final boolean a(adqe adqe) {
        xak.a();
        amqw.a((Object) adqe);
        adtl adtl = this.h;
        if (adtl != null && this.l == 1 && ((adtq) adqe).P() == this.q) {
            return adqe.h().b().equals(adtl.e());
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bbs bbs) {
        boolean z = true;
        if (this.l != 1) {
            z = false;
        }
        amqw.b(z);
        b(4);
        bbb.a(bbs);
    }

    private final void b(int i) {
        xak.a();
        adtx adtx = (adtx) amqw.a(this.m);
        this.l = i;
        if (i != 1) {
            if (i == 2) {
                adtx.a();
            } else if (i != 3) {
                adtx.b();
            }
            b();
            this.d.b(this.f);
            this.i = false;
            this.m = null;
            this.b.a(this.n);
            this.e.removeCallbacksAndMessages(null);
            this.h = null;
            this.k.c(this);
        }
    }

    public adqx(bbb bbb, baz baz, adgw adgw, xhv xhv, xci xci, int i, boolean z) {
        xak.a();
        this.b = bbb;
        this.j = baz;
        this.k = adgw;
        this.c = xhv;
        this.d = xci;
        this.q = i;
        this.g = z;
        this.e = new Handler(Looper.getMainLooper(), this.o);
        this.f = new adrc(this);
    }

    public final int c() {
        return this.p;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        boolean z = true;
        if (this.l != 1) {
            z = false;
        }
        amqw.b(z);
        this.p = i;
        b(2);
    }
}
