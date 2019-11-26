package defpackage;

import android.os.Looper;

/* renamed from: pue */
public final class pue {
    public volatile Object a;
    public final puh b;
    private final puj c;

    public pue(Looper looper, Object obj, String str) {
        this.c = new puj(this, looper);
        this.a = pzr.a(obj, (Object) "Listener must not be null");
        this.b = new puh(obj, pzr.a(str));
    }

    public final void a(pug pug) {
        pzr.a((Object) pug, (Object) "Notifier must not be null");
        this.c.sendMessage(this.c.obtainMessage(1, pug));
    }

    public final void a() {
        this.a = null;
    }
}
