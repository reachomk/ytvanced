package defpackage;

import android.os.Bundle;

/* renamed from: bcq */
final class bcq extends bay implements bcj {
    private final String a;
    private final String b;
    private boolean c;
    private int d = -1;
    private int e;
    private bci f;
    private int g;
    private final /* synthetic */ bcf h;

    bcq(bcf bcf, String str, String str2) {
        this.h = bcf;
        this.a = str;
        this.b = str2;
    }

    public final int d() {
        return this.g;
    }

    public final void a(bci bci) {
        this.f = bci;
        String str = this.a;
        String str2 = this.b;
        int i = bci.d;
        bci.d = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", str);
        bundle.putString("routeGroupId", str2);
        int i2 = bci.c;
        bci.c = i2 + 1;
        bci.a(3, i2, i, null, bundle);
        this.g = i;
        if (this.c) {
            bci.b(i);
            int i3 = this.d;
            if (i3 >= 0) {
                bci.b(this.g, i3);
                this.d = -1;
            }
            i3 = this.e;
            if (i3 != 0) {
                bci.c(this.g, i3);
                this.e = 0;
            }
        }
    }

    public final void e() {
        bci bci = this.f;
        if (bci != null) {
            bci.a(this.g);
            this.f = null;
            this.g = 0;
        }
    }

    public final void a() {
        this.h.a((bcj) this);
    }

    public final void b() {
        this.c = true;
        bci bci = this.f;
        if (bci != null) {
            bci.b(this.g);
        }
    }

    public final void c() {
        a(0);
    }

    public final void a(int i) {
        this.c = false;
        bci bci = this.f;
        if (bci != null) {
            bci.a(this.g, i);
        }
    }

    public final void b(int i) {
        bci bci = this.f;
        if (bci != null) {
            bci.b(this.g, i);
            return;
        }
        this.d = i;
        this.e = 0;
    }

    public final void c(int i) {
        bci bci = this.f;
        if (bci != null) {
            bci.c(this.g, i);
        } else {
            this.e += i;
        }
    }
}
