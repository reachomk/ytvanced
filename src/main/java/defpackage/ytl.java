package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: ytl */
public final class ytl extends yts {
    public final aaas g;
    private final zap i;

    ytl(Context context, ywk ywk, yil yil, ymx ymx, aaas aaas, Handler handler, zap zap, yyt yyt, yxg yxg, yxl yxl, String str, String str2, String str3, yty yty, amro amro) {
        super(context, handler, ywk, yil, zap, yyt, yxg, yxl, str, str2, str3, yty, ymx, amro, yto.a);
        this.g = aaas;
        this.i = (zap) amqw.a((Object) zap);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.h, new ytn(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(yld yld) {
        if (yld.b()) {
            this.i.a(yld.getText());
            this.i.a(new ytq(this));
            super.a((ylf) yld);
        }
    }
}
