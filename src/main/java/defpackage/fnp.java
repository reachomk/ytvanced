package defpackage;

import android.graphics.Bitmap;
import android.text.Spanned;

/* renamed from: fnp */
public final class fnp {
    public final long a;
    public final boolean b;
    public CharSequence c;
    public awnx d = awnx.PRIVATE;
    public auvn e;
    public aygk f;
    public Bitmap g;
    public String h;
    public double i;
    public double j;
    public double k;
    public boolean l;
    public boolean m;
    public int n;
    public double o;
    public Spanned p;
    public Spanned q;
    public Spanned r;
    public Spanned s;
    public apxu t;
    public apxu u;
    public boolean v;
    public boolean w;
    public boolean x;

    public fnp(CharSequence charSequence, awnx awnx, boolean z, String str, auvn auvn, long j) {
        amqw.a((Object) auvn);
        this.c = charSequence;
        this.d = awnx;
        this.b = z;
        this.h = str;
        this.e = auvn;
        this.k = Double.POSITIVE_INFINITY;
        this.a = j;
        this.o = -1.0d;
        this.i = -1.0d;
        this.j = -1.0d;
    }

    public final void a(amec amec) {
        this.n = 0;
        int a = amee.a(amec.b);
        if (a == 0) {
            a = 1;
        }
        a--;
        int a2;
        if (a == 0) {
            a = ayuc.a(amec.c);
            if (a != 0 && a == 8) {
                this.n = 1;
                return;
            }
            a2 = ayuc.a(amec.c);
            if (a2 != 0 && a2 == 9) {
                this.n = 2;
            }
        } else if (a == 1) {
            this.j = 1.0d;
            this.k = 0.0d;
        } else if (a == 3) {
            a2 = ayuc.a(amec.c);
            if (a2 == 0 || a2 != 22) {
                this.l = true;
            }
        }
    }

    public final void a(boolean z, boolean z2) {
        this.v = z;
        this.w = z2;
    }

    public final void a() {
        this.x = true;
    }

    public final void a(int i) {
        if (i == 4) {
            this.m = true;
        }
    }
}
