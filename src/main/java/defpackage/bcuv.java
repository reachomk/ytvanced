package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: bcuv */
final class bcuv extends bcue {
    private final Handler a;
    private volatile boolean b;

    bcuv(Handler handler) {
        this.a = handler;
        bcur.a.a();
    }

    public final void b() {
        this.b = true;
        this.a.removeCallbacksAndMessages(this);
    }

    public final boolean c() {
        return this.b;
    }

    public final bcuo a(bcvl bcvl, long j, TimeUnit timeUnit) {
        if (this.b) {
            return bdfz.a;
        }
        bcuu bcuu = new bcuu(bcvl, this.a);
        Message obtain = Message.obtain(this.a, bcuu);
        obtain.obj = this;
        this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
        if (!this.b) {
            return bcuu;
        }
        this.a.removeCallbacks(bcuu);
        return bdfz.a;
    }

    public final bcuo a(bcvl bcvl) {
        return a(bcvl, 0, TimeUnit.MILLISECONDS);
    }
}
