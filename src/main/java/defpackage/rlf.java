package defpackage;

import android.content.Context;

/* renamed from: rlf */
public final class rlf extends rlk {
    private final /* synthetic */ Context a;
    private final /* synthetic */ rkz b;
    private final /* synthetic */ String c;
    private final /* synthetic */ rle d;

    public rlf(rle rle, Context context, rkz rkz, String str) {
        this.d = rle;
        this.a = context;
        this.b = rkz;
        this.c = str;
    }

    public final /* synthetic */ Object a() {
        rle.a(this.a, "search");
        return new rnm();
    }

    public final /* synthetic */ Object b() {
        return this.d.a.a(this.a, this.b, this.c, null, 3);
    }

    public final /* synthetic */ Object a(rmm rmm) {
        return rmm.a(qct.a(this.a), this.b, this.c);
    }
}
