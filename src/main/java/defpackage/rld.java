package defpackage;

import android.content.Context;

/* renamed from: rld */
public final class rld extends rlk {
    private final /* synthetic */ Context a;
    private final /* synthetic */ rkz b;
    private final /* synthetic */ String c;
    private final /* synthetic */ qji d;
    private final /* synthetic */ rle e;

    public rld(rle rle, Context context, rkz rkz, String str, qji qji) {
        this.e = rle;
        this.a = context;
        this.b = rkz;
        this.c = str;
        this.d = qji;
    }

    public final /* synthetic */ Object a() {
        rle.a(this.a, "banner");
        return new rnm();
    }

    public final /* synthetic */ Object b() {
        return this.e.a.a(this.a, this.b, this.c, this.d, 1);
    }

    public final /* synthetic */ Object a(rmm rmm) {
        return rmm.a(qct.a(this.a), this.b, this.c, this.d);
    }
}
