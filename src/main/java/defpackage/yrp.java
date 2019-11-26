package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: yrp */
public final class yrp extends yig {
    public final String f;
    public final yyt g;
    public final yru h;
    public final ymx i;
    public final ywk j;
    public ykv k;

    public yrp(Context context, Handler handler, ywk ywk, String str, yyt yyt, yru yru, ymx ymx) {
        super(context, handler, ywk.i, ywk);
        this.f = xvd.a(str);
        this.g = (yyt) amqw.a((Object) yyt);
        this.h = (yru) amqw.a((Object) yru);
        this.i = (ymx) amqw.a((Object) ymx);
        yyt.a(new yrr(this));
        this.j = (ywk) amqw.a((Object) ywk);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.f, null, new yrs(this), null);
    }
}
