package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: ypw */
public final class ypw extends yig {
    public final yxr f;
    public final boolean g;
    public String h;
    public bbnc i;
    public bbnc j;
    private final String k;

    public ypw(Context context, Handler handler, ywk ywk, ysc ysc, String str, yqc yqc, boolean z) {
        super(context, handler, ywk.i, ywk);
        this.k = xvd.a(str);
        this.f = (yxr) amqw.a(yqc.a(new ypv(this, ysc, str)));
        this.g = z;
    }

    public final void bl_() {
        super.bl_();
        f();
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.k, new ypy(this));
    }

    public final void f() {
        bbnc bbnc = this.i;
        if (!(bbnc == null || bbnc.c())) {
            this.i.bK_();
            this.i = null;
        }
        bbnc = this.j;
        if (bbnc != null && !bbnc.c()) {
            this.j.bK_();
            this.j = null;
        }
    }
}
