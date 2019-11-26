package defpackage;

import android.view.View;

/* renamed from: anr */
final class anr {
    public aol a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    anr() {
        a();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.b = -1;
        this.c = aocf.UNSET_ENUM_VALUE;
        this.d = false;
        this.e = false;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        int c;
        if (this.d) {
            c = this.a.c();
        } else {
            c = this.a.b();
        }
        this.c = c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnchorInfo{mPosition=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mCoordinate=");
        stringBuilder.append(this.c);
        stringBuilder.append(", mLayoutFromEnd=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mValid=");
        stringBuilder.append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void a(View view, int i) {
        int a = this.a.a();
        if (a >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        int i2;
        int b;
        if (this.d) {
            i = (this.a.c() - a) - this.a.b(view);
            this.c = this.a.c() - i;
            if (i > 0) {
                a = this.a.e(view);
                i2 = this.c;
                b = this.a.b();
                i2 = (i2 - a) - (b + Math.min(this.a.a(view) - b, 0));
                if (i2 < 0) {
                    this.c += Math.min(i, -i2);
                }
            }
        } else {
            i = this.a.a(view);
            i2 = i - this.a.b();
            this.c = i;
            if (i2 > 0) {
                b = this.a.e(view);
                int c = this.a.c();
                int c2 = (this.a.c() - Math.min(0, (c - a) - this.a.b(view))) - (i + b);
                if (c2 < 0) {
                    this.c -= Math.min(i2, -c2);
                }
            }
        }
    }

    public final void b(View view, int i) {
        if (this.d) {
            this.c = this.a.b(view) + this.a.a();
        } else {
            this.c = this.a.a(view);
        }
        this.b = i;
    }
}
