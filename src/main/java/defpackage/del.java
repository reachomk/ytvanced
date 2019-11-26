package defpackage;

import android.os.Bundle;

/* renamed from: del */
public final class del implements der {
    public final String a;
    public final String b;
    public final dew c;
    public final dfc d;
    public final int e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final Bundle i;

    public final int[] g() {
        return this.g;
    }

    public final Bundle h() {
        return this.i;
    }

    public final dfc i() {
        return this.d;
    }

    public final boolean j() {
        return this.h;
    }

    public final String c() {
        return this.b;
    }

    public final dew d() {
        return this.c;
    }

    public final int e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public final String b() {
        return this.a;
    }

    /* synthetic */ del(dek dek) {
        this.a = dek.a;
        Bundle bundle = dek.b;
        this.i = bundle != null ? new Bundle(bundle) : null;
        this.b = dek.c;
        this.c = dek.d;
        this.d = dek.g;
        this.e = dek.e;
        this.f = dek.i;
        int[] iArr = dek.f;
        if (iArr == null) {
            iArr = new int[0];
        }
        this.g = iArr;
        this.h = dek.h;
    }
}
