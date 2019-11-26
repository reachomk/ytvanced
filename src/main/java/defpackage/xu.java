package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: xu */
public final class xu {
    public final List a = new ArrayList();
    public long b;
    public int c;
    public CharSequence d;
    public Bundle e;
    private int f;
    private long g;
    private long h;
    private float i;
    private long j;
    private long k = -1;

    public xu(xs xsVar) {
        this.f = xsVar.a;
        this.g = xsVar.b;
        this.i = xsVar.d;
        this.j = xsVar.h;
        this.h = xsVar.c;
        this.b = xsVar.e;
        this.c = xsVar.f;
        this.d = xsVar.g;
        List list = xsVar.i;
        if (list != null) {
            this.a.addAll(list);
        }
        this.k = xsVar.j;
        this.e = xsVar.k;
    }

    public final xu a(int i, long j) {
        a(i, j, 1.0f, SystemClock.elapsedRealtime());
        return this;
    }

    public final xu a(int i, long j, float f, long j2) {
        this.f = i;
        this.g = j;
        this.j = j2;
        this.i = f;
        return this;
    }

    public final xs a() {
        return new xs(this.f, this.g, this.h, this.i, this.b, this.c, this.d, this.j, this.a, this.k, this.e);
    }
}
