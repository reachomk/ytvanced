package defpackage;

import android.content.Context;

/* renamed from: lrp */
public final class lrp implements luf {
    private final ltb a;
    private final lty b;

    public lrp(ltb ltb, lty lty) {
        this.a = ltb;
        this.b = lty;
    }

    public final lui a(int i) {
        Context context;
        bcaa bcaa;
        bcaa bcaa2;
        bcaa bcaa3;
        lty lty = this.b;
        ltb ltb = this.a;
        if (i == 2) {
            context = ltb.b;
        } else {
            context = ltb.a;
        }
        if (i == 2) {
            bcaa = ltb.d;
        } else {
            bcaa = ltb.c;
        }
        if (i == 2) {
            bcaa2 = ltb.h;
        } else {
            bcaa2 = ltb.g;
        }
        if (i != 2) {
            bcaa3 = ltb.e;
        } else {
            bcaa3 = ltb.f;
        }
        return lty.a(context, bcaa, bcaa2, bcaa3);
    }
}
