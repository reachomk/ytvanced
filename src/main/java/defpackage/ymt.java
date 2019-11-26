package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: ymt */
public abstract class ymt extends yig implements yxv {
    public final yrc f;
    public final yxs g;
    private final String h;
    private final yio i;

    ymt(String str, Context context, Handler handler, ywk ywk, yil yil, yqc yqc, yio yio, yrc yrc) {
        super(context, handler, ywk.i, ywk, yil);
        this.h = xvd.a(str);
        this.f = (yrc) amqw.a((Object) yrc);
        this.g = (yxs) amqw.a(yqc.a(this, yrc));
        this.i = (yio) amqw.a((Object) yio);
    }

    public abstract amul a(yie yie);

    /* Access modifiers changed, original: 0000 */
    public void a(int i) {
    }

    public final void bk_() {
        this.g.a(true);
        this.g.b(null);
        super.bk_();
        this.f.bk_();
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.h, new ymw(this), new ymv(this));
    }

    public final void bl_() {
        super.bl_();
        this.f.bl_();
    }

    public final void f() {
        this.g.b(null);
        this.g.a(true);
        d();
    }

    /* Access modifiers changed, original: protected */
    public void b(yie yie) {
        this.g.a(false);
        this.i.a(a(yie), new ymy(this), this.c);
    }
}
