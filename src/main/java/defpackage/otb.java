package defpackage;

import android.text.Layout.Alignment;

/* renamed from: otb */
final class otb {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public float k;
    public String l;
    public Alignment m;

    public final int a() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        int i2 = 0;
        i = i == 1 ? 1 : 0;
        if (this.i == 1) {
            i2 = 2;
        }
        return i | i2;
    }

    public final otb a(boolean z) {
        oxz.b(true);
        this.f = z;
        return this;
    }

    public final otb b(boolean z) {
        oxz.b(true);
        this.g = z;
        return this;
    }

    public final otb a(int i) {
        oxz.b(true);
        this.b = i;
        this.c = true;
        return this;
    }

    public final otb b(int i) {
        this.d = i;
        this.e = true;
        return this;
    }

    public final otb a(otb otb) {
        if (otb != null) {
            if (!this.c && otb.c) {
                a(otb.b);
            }
            if (this.h == -1) {
                this.h = otb.h;
            }
            if (this.i == -1) {
                this.i = otb.i;
            }
            if (this.a == null) {
                this.a = otb.a;
            }
            if (this.f == -1) {
                this.f = otb.f;
            }
            if (this.g == -1) {
                this.g = otb.g;
            }
            if (this.m == null) {
                this.m = otb.m;
            }
            if (this.j == -1) {
                this.j = otb.j;
                this.k = otb.k;
            }
            if (!this.e && otb.e) {
                b(otb.d);
            }
        }
        return this;
    }
}
