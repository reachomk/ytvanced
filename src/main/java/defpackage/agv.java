package defpackage;

import android.util.SparseIntArray;

/* renamed from: agv */
public final class agv {
    public final Class a;
    public final int b;
    public final agw c;
    public final agz d;
    public final ahq e;
    public final ahr f;
    public final aho g;
    public boolean h;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public final SparseIntArray l = new SparseIntArray();
    private final int[] m = new int[2];
    private final int[] n = new int[2];
    private final int[] o = new int[2];
    private int p = 0;
    private final ahr q = new agu(this);
    private final aho r = new agx(this);

    public agv(Class cls, agw agw, agz agz) {
        this.a = cls;
        this.b = 20;
        this.c = agw;
        this.d = agz;
        this.e = new ahq();
        ahj ahj = new ahj();
        this.f = new ahi(this.q);
        this.g = new ahk(this.r);
        b();
    }

    public final boolean a() {
        return this.k != this.j;
    }

    public final void b() {
        this.l.clear();
        aho aho = this.g;
        int i = this.k + 1;
        this.k = i;
        aho.a(i);
    }

    public final void c() {
        this.d.a(this.m);
        int[] iArr = this.m;
        int i = iArr[0];
        int i2 = iArr[1];
        if (i <= i2 && i >= 0 && i2 < this.i) {
            int i3;
            if (this.h) {
                int[] iArr2 = this.n;
                if (i <= iArr2[1]) {
                    i3 = iArr2[0];
                    if (i3 <= i2) {
                        if (i < i3) {
                            this.p = 1;
                        } else if (i > i3) {
                            this.p = 2;
                        }
                    }
                }
                this.p = 0;
            } else {
                this.p = 0;
            }
            int[] iArr3 = this.n;
            iArr3[0] = i;
            iArr3[1] = iArr[1];
            int[] iArr4 = this.o;
            i2 = this.p;
            i3 = iArr[1];
            int i4 = iArr[0];
            i3 = (i3 - i4) + 1;
            int i5 = i3 / 2;
            iArr4[0] = i4 - (i2 == 1 ? i3 : i5);
            i4 = iArr[1];
            if (i2 != 2) {
                i3 = i5;
            }
            iArr4[1] = i4 + i3;
            iArr4[0] = Math.min(iArr[0], Math.max(iArr4[0], 0));
            iArr = this.o;
            iArr[1] = Math.max(this.m[1], Math.min(iArr[1], this.i - 1));
            aho aho = this.g;
            iArr = this.m;
            i3 = iArr[0];
            int i6 = iArr[1];
            iArr = this.o;
            aho.a(i3, i6, iArr[0], iArr[1], this.p);
        }
    }
}
