package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;

/* renamed from: yr */
public final class yr {
    public final Object a = new Object();
    public HandlerThread b;
    public Handler c;
    public final int d;
    private int e;
    private final Callback f = new yq(this);
    private final int g;
    private final String h;

    public yr(String str) {
        this.h = str;
        this.g = 10;
        this.d = 10000;
        this.e = 0;
    }

    public final void a(Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new HandlerThread(this.h, this.g);
                this.b.start();
                this.c = new Handler(this.b.getLooper(), this.f);
                this.e++;
            }
            this.c.removeMessages(0);
            Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }
}
