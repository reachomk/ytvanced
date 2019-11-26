package defpackage;

import android.os.Handler;

/* renamed from: wch */
final /* synthetic */ class wch implements ahnf {
    private final wci a;
    private final Handler b;

    wch(wci wci, Handler handler) {
        this.a = wci;
        this.b = handler;
    }

    public final boolean a() {
        wci wci = this.a;
        Handler handler = this.b;
        if (wci.b != null) {
            handler.post(new wck(wci));
        }
        return true;
    }
}
