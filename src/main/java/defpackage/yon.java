package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: yon */
public final class yon extends yig {
    public final int f = 5;
    public final yxg g;
    public final yio h;
    public final String i;
    public int j;
    public ylf k;
    private final String l;

    public yon(String str, String str2, Context context, Handler handler, String str3, ywk ywk, yxg yxg, yty yty) {
        Object yio = new yio(ywk.i);
        super(context, handler, ywk.i, ywk);
        this.l = xvd.a(str2);
        this.g = (yxg) amqw.a((Object) yxg);
        yxg.a = new yoq(yty, str, str2);
        this.i = xvd.a(str3);
        this.h = (yio) amqw.a(yio);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.l, null, new yop(this), null);
    }
}
