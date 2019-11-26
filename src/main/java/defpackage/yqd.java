package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: yqd */
public final class yqd extends yig {
    public final yxu f;
    public final ywk g;
    public bbnc h;
    public ykd i;
    public ykv j;
    private final String k;

    public yqd(Context context, Handler handler, ywk ywk, String str, yps yps) {
        super(context, handler, ywk.i, ywk);
        this.k = xvd.a(str);
        this.f = yps.a(new yqg(this));
        this.g = ywk;
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.k, new yqf(this));
    }

    public final void bl_() {
        super.bl_();
        bbnc bbnc = this.h;
        if (!(bbnc == null || bbnc.c())) {
            this.h.bK_();
            this.h = null;
        }
        this.i = null;
        this.j = null;
    }
}
