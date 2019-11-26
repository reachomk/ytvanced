package defpackage;

import android.os.Bundle;

/* renamed from: dek */
public final class dek implements der {
    public String a;
    public Bundle b;
    public String c;
    public dew d = dfe.a;
    public int e = 1;
    public int[] f;
    public dfc g = dfc.a;
    public boolean h = false;
    public boolean i = false;
    private final dfg j;

    dek(dfg dfg) {
        this.j = dfg;
    }

    public dek(dfg dfg, der der) {
        this.j = dfg;
        dep dep = (dep) der;
        this.c = dep.a;
        this.a = dep.b;
        this.d = dep.c;
        this.i = dep.d;
        this.e = dep.e;
        this.f = dep.f;
        this.b = dep.g;
        this.g = dep.h;
    }

    public final dek a(int i) {
        int[] iArr = this.f;
        int i2 = 1;
        if (iArr != null) {
            i2 = 1 + iArr.length;
        }
        int[] iArr2 = new int[i2];
        if (iArr != null) {
            int length = iArr.length;
            if (length != 0) {
                System.arraycopy(iArr, 0, iArr2, 0, length);
            }
        }
        iArr2[iArr2.length - 1] = i;
        this.f = iArr2;
        return this;
    }

    public final del a() {
        dfg.a(this.j.a((der) this));
        return new del(this);
    }

    public final String b() {
        return this.a;
    }

    public final dek a(Class cls) {
        this.a = cls != null ? cls.getName() : null;
        return this;
    }

    public final String c() {
        return this.c;
    }

    public final dew d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final boolean f() {
        return this.i;
    }

    public final int[] g() {
        int[] iArr = this.f;
        return iArr == null ? new int[0] : iArr;
    }

    public final Bundle h() {
        return this.b;
    }

    public final dfc i() {
        return this.g;
    }

    public final boolean j() {
        return this.h;
    }
}
