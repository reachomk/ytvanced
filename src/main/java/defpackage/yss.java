package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: yss */
public final class yss extends yts {
    public final ywk f_;
    public final zak g;
    public final aaas i;
    public final acvx j;
    public bbnc k;
    private bbnc t;

    yss(Context context, ywk ywk, yil yil, ymx ymx, aaas aaas, acvx acvx, Handler handler, zak zak, yyt yyt, yxg yxg, yxl yxl, String str, String str2, String str3, yty yty, amro amro) {
        super(context, handler, ywk, yil, zak, yyt, yxg, yxl, str, str2, str3, yty, ymx, amro, ysr.a);
        this.g = (zak) amqw.a((Object) zak);
        this.f_ = ywk;
        this.i = aaas;
        this.j = acvx;
    }

    public final void bl_() {
        super.bl_();
        yss.a(this.k);
        yss.a(this.t);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.h, new ysu(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(ykz ykz) {
        if (ykz.b()) {
            yss.a(this.t);
            this.t = this.e.a(ykz.getPlaylistKey(), new ysw(this), false, this.f_);
            super.a((ylf) ykz);
        }
    }

    public static void a(bbnc bbnc) {
        if (bbnc != null && !bbnc.c()) {
            bbnc.bK_();
        }
    }
}
