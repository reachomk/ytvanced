package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: ysi */
public final class ysi extends yts {
    public final aaas f;
    public final allb g;
    public yky i;
    private final zag j;

    ysi(Context context, Handler handler, aaas aaas, allb allb, ywk ywk, yil yil, ymx ymx, zag zag, yyt yyt, String str, String str2, String str3, yty yty, amro amro) {
        super(context, handler, ywk, yil, zag, yyt, null, null, str, str2, str3, yty, ymx, amro, ysh.a);
        this.g = (allb) amqw.a((Object) allb);
        this.f = (aaas) amqw.a((Object) aaas);
        this.j = (zag) amqw.a((Object) zag);
        zag.a(new ysk(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.h, new ysj(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(yky yky) {
        if (yky.b()) {
            this.i = yky;
            this.j.a(yky.getText());
            super.a((ylf) yky);
        }
    }
}
