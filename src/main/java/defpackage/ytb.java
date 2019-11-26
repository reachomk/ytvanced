package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;

/* renamed from: ytb */
public final class ytb extends yig {
    public final ytc f;
    public final yvb g;
    public final String h;
    public final zal i;
    public final ValueAnimator j;
    public ysz k;

    ytb(Context context, ywk ywk, yvb yvb, ytc ytc, Handler handler, String str, zal zal, ynz ynz) {
        Object ytg = new ytg(zal, ynz);
        super(context, handler, ywk.i, ywk);
        this.g = yvb;
        this.f = ytc;
        this.h = xvd.a(str);
        this.i = (zal) amqw.a((Object) zal);
        this.j = (ValueAnimator) amqw.a(ytg);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.h, null, new yte(this), null);
    }
}
