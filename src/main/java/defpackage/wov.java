package defpackage;

import android.content.Intent;

/* renamed from: wov */
final class wov implements wxe {
    private final byte[] a;
    private final /* synthetic */ wos b;

    wov(wos wos, byte[] bArr) {
        this.b = wos;
        this.a = bArr;
    }

    public final boolean a(int i, int i2, Intent intent) {
        if (i == 1900) {
            if (i2 == -1) {
                for (wou a : this.b.h) {
                    a.a();
                    this.b.a(this.a, 3);
                }
                this.b.h.clear();
            } else if (i2 == 0) {
                for (wou a2 : this.b.h) {
                    a2.b();
                    this.b.a(this.a, 4);
                }
                this.b.h.clear();
            } else if (i2 == this.b.g.b()) {
                for (wou a22 : this.b.h) {
                    a22.c();
                    this.b.a(this.a, 5);
                }
                this.b.h.clear();
            }
        }
        return false;
    }
}
