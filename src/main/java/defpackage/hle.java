package defpackage;

import android.content.Context;

/* renamed from: hle */
public final class hle implements agvv {
    private final Context a;
    private final agwc b;
    private final xci c;
    private final hpr d;
    private final hsy e;

    public hle(Context context, agwc agwc, xci xci, hpr hpr, hsy hsy) {
        this.a = context;
        this.b = agwc;
        this.c = xci;
        this.d = hpr;
        this.e = hsy;
    }

    public final agvw a(String str) {
        return new hlc(this.a, this.b.b(), this.c, this.d, this.e, str);
    }
}
