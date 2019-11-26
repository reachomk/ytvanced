package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: yt */
final class yt implements Runnable {
    public final /* synthetic */ yu a;
    private final /* synthetic */ Callable b;
    private final /* synthetic */ Handler c;

    yt(Callable callable, Handler handler, yu yuVar) {
        this.b = callable;
        this.c = handler;
        this.a = yuVar;
    }

    public final void run() {
        Object call;
        try {
            call = this.b.call();
        } catch (Exception unused) {
            call = null;
        }
        this.c.post(new ys(this, call));
    }
}
