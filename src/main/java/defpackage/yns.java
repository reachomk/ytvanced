package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: yns */
public final class yns extends yig {
    public final ywx f;
    public final yio g;
    public bbnc h;
    public ykd i;
    private final String j;

    public yns(Context context, Handler handler, ywk ywk, yio yio, String str, yps yps) {
        super(context, handler, ywk.i, ywk);
        this.g = yio;
        this.j = xvd.a(str);
        this.f = yps.e();
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.j, new ynr(this));
    }

    public final void bl_() {
        super.bl_();
        f();
    }

    public final void f() {
        bbnc bbnc = this.h;
        if (bbnc != null && !bbnc.c()) {
            this.h.bK_();
            this.h = null;
        }
    }
}
