package defpackage;

import android.os.Bundle;

/* renamed from: bco */
final class bco extends bap implements bcj {
    public String e;
    public String f;
    private final String g;
    private boolean h;
    private int i = -1;
    private int j;
    private bci k;
    private int l = -1;
    private final /* synthetic */ bcf m;

    bco(bcf bcf, String str) {
        this.m = bcf;
        this.g = str;
    }

    public final int d() {
        return this.l;
    }

    public final void a(bci bci) {
        bcn bcn = new bcn(this);
        this.k = bci;
        String str = this.g;
        int i = bci.d;
        bci.d = i + 1;
        int i2 = bci.c;
        bci.c = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", str);
        bci.a(11, i2, i, null, bundle);
        bci.g.put(i2, bcn);
        this.l = i;
        if (this.h) {
            bci.b(i);
            int i3 = this.i;
            if (i3 >= 0) {
                bci.b(this.l, i3);
                this.i = -1;
            }
            i3 = this.j;
            if (i3 != 0) {
                bci.c(this.l, i3);
                this.j = 0;
            }
        }
    }

    public final void e() {
        bci bci = this.k;
        if (bci != null) {
            bci.a(this.l);
            this.k = null;
            this.l = 0;
        }
    }

    public final void a() {
        this.m.a((bcj) this);
    }

    public final void b() {
        this.h = true;
        bci bci = this.k;
        if (bci != null) {
            bci.b(this.l);
        }
    }

    public final void c() {
        a(0);
    }

    public final void a(int i) {
        this.h = false;
        bci bci = this.k;
        if (bci != null) {
            bci.a(this.l, i);
        }
    }

    public final void b(int i) {
        bci bci = this.k;
        if (bci != null) {
            bci.b(this.l, i);
            return;
        }
        this.i = i;
        this.j = 0;
    }

    public final void c(int i) {
        bci bci = this.k;
        if (bci != null) {
            bci.c(this.l, i);
        } else {
            this.j += i;
        }
    }
}
