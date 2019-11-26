package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: bbmx */
final class bbmx extends bbmp {
    private final Handler a;
    private volatile boolean b;

    bbmx(Handler handler) {
        this.a = handler;
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        } else if (this.b) {
            return bboc.INSTANCE;
        } else {
            bbna bbna = new bbna(this.a, bbzf.a(runnable));
            Message obtain = Message.obtain(this.a, bbna);
            obtain.obj = this;
            this.a.sendMessageDelayed(obtain, Math.max(0, timeUnit.toMillis(j)));
            if (!this.b) {
                return bbna;
            }
            this.a.removeCallbacks(bbna);
            return bboc.INSTANCE;
        }
    }

    public final void bK_() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }

    public final boolean c() {
        return this.b;
    }
}
