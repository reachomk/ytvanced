package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: aits */
public final class aits {
    public final Context a;
    public final aitq b;
    public final long c;
    public final boolean d;
    public View e;
    public int f;
    public xqc g;
    public aitt h;
    private final boolean i;
    private final long j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final StringBuilder o = new StringBuilder(140);
    private int p;
    private final xqf q;
    private Handler r;
    private final Runnable s = new aitv(this);
    private final OnGlobalLayoutListener t;

    public final void a() {
        if (!c()) {
            d(1);
            this.e = (View) amqw.a(((aitw) this.b).a(this.a));
            a(0, "createView", new Object[0]);
            if (this.d) {
                g();
            }
            this.g = new xnz(this.e, (byte) 0);
            this.g.a(this.j);
            this.g.b(this.c);
            this.g.a(false, false);
            xqf xqf = this.q;
            if (xqf != null) {
                this.g.a(xqf);
            }
            aitt aitt = this.h;
            if (aitt != null) {
                aitt.a(this.b, this.e);
            }
        }
    }

    public final void a(int i, String str, Object... objArr) {
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        int measuredWidth;
        int height;
        boolean c = c();
        boolean z = c && abe.H(this.e);
        if (c) {
            if (this.n) {
                measuredWidth = this.e.getMeasuredWidth();
            } else {
                measuredWidth = this.e.getWidth();
            }
            height = !this.n ? this.e.getHeight() : this.e.getMeasuredHeight();
        } else {
            measuredWidth = 0;
            height = 0;
        }
        a(0, " `- isViewMeasured", "attached:", Boolean.valueOf(z), " w:", Integer.valueOf(measuredWidth), " h:", Integer.valueOf(height));
        return c && z && measuredWidth != 0 && height != 0;
    }

    public final boolean c() {
        return b(1);
    }

    public final boolean d() {
        xqc xqc = this.g;
        return xqc != null && xqc.b();
    }

    public final void e() {
        if (!b(32)) {
            boolean z = true;
            Object obj = null;
            if (b(4)) {
                if (b(8)) {
                }
                z = false;
                a(z);
                return;
            }
            boolean z2;
            if (!((aitw) this.b).c() && d()) {
                obj = 1;
            }
            if (b(2)) {
                if (obj == null) {
                    z2 = this.m;
                    a(z2);
                }
            } else if (obj == null) {
                return;
            }
            z2 = this.k;
            a(z2);
        }
    }

    public final void a(int i) {
        a(1, "notifyData", "mask:", Integer.toBinaryString(i));
        d(2);
        this.f = i | this.f;
        e();
    }

    private final void a(boolean z) {
        a(1, "dispatchNotify", "post:", Boolean.valueOf(z));
        if (z) {
            if (c()) {
                abe.a(this.e, this.s);
            } else {
                if (this.r == null) {
                    this.r = new Handler(Looper.getMainLooper());
                }
                this.r.post(this.s);
            }
            d(32);
            return;
        }
        this.s.run();
    }

    public final void f() {
        if (b(4)) {
            a(0, "clearedVis", new Object[0]);
            e(28);
        }
    }

    public final void g() {
        if (!b(64)) {
            this.e.getViewTreeObserver().addOnGlobalLayoutListener(this.t);
            d(64);
        }
    }

    public final boolean b(int i) {
        return (this.p & i) == i;
    }

    public final boolean c(int i) {
        return (this.f & i) == i;
    }

    public final void d(int i) {
        this.p = i | this.p;
    }

    public final void e(int i) {
        this.p = (i ^ -1) & this.p;
    }

    public final String toString() {
        int i = 0;
        this.o.setLength(0);
        StringBuilder stringBuilder = this.o;
        stringBuilder.append("Lazy@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        stringBuilder.append(" view:");
        stringBuilder.append(this.e);
        stringBuilder.append(" status: ");
        if (this.g != null) {
            i = 1;
        }
        char c = '.';
        this.o.append(!b(64) ? '.' : 'L');
        this.o.append(!b(32) ? '.' : 'P');
        this.o.append(!b(16) ? '.' : 'A');
        this.o.append(!b(8) ? '.' : 'V');
        this.o.append(!b(4) ? '.' : 'R');
        this.o.append(!b(2) ? '.' : 'D');
        this.o.append(!b(1) ? '.' : 'C');
        if (this.f != 0) {
            this.o.append(" user: ");
            int i2 = this.f > 255 ? 31 : 7;
            while (i2 >= 0) {
                this.o.append(!c(1 << i2) ? '.' : 'x');
                if ((i2 & 3) == 0 && i2 > 0) {
                    this.o.append(' ');
                }
                i2--;
            }
        }
        this.o.append(" {");
        stringBuilder = this.o;
        aitq aitq = this.b;
        char c2 = (aitq == null || !((aitw) aitq).c()) ? '.' : 10003;
        stringBuilder.append(c2);
        stringBuilder = this.o;
        c2 = (i == 0 || !this.g.b()) ? '.' : 'v';
        stringBuilder.append(c2);
        stringBuilder = this.o;
        if (i != 0 && this.g.c()) {
            c = 'h';
        }
        stringBuilder.append(c);
        this.o.append('}');
        return this.o.toString();
    }

    /* synthetic */ aits(Context context, aitq aitq, xqf xqf, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aitq) amqw.a((Object) aitq);
        this.q = xqf;
        this.i = false;
        this.c = (long) i;
        this.j = (long) i2;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.d = z4;
        this.n = z5;
        this.t = new aitu(this);
    }
}
