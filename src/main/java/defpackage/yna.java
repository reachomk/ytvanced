package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: yna */
public final class yna extends yts {
    public final yww d_;
    public final aaas g;
    private final ywk i;
    private bbnc j;

    yna(Context context, ywk ywk, yil yil, ymx ymx, Handler handler, aaas aaas, yww yww, yyt yyt, yxg yxg, yxl yxl, String str, String str2, String str3, yty yty, amro amro) {
        super(context, handler, ywk, yil, yww, yyt, yxg, yxl, str, str2, str3, yty, ymx, amro, ymz.a);
        this.d_ = (yww) amqw.a((Object) yww);
        this.i = ywk;
        this.g = aaas;
    }

    public final void bl_() {
        super.bl_();
        yna.a(this.j);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.h, new ync(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ykc ykc) {
        if (ykc.b()) {
            yna.a(this.j);
            this.j = this.e.a(ykc.getChannelKey(), new yne(this), false, this.i);
            super.a((ylf) ykc);
        }
    }

    private static void a(bbnc bbnc) {
        if (bbnc != null && !bbnc.c()) {
            bbnc.bK_();
        }
    }
}
