package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: ozm */
final class ozm implements oyn {
    private final Handler a;

    public ozm(Handler handler) {
        this.a = handler;
    }

    public final Looper a() {
        return this.a.getLooper();
    }

    public final Message a(int i, Object obj) {
        return this.a.obtainMessage(i, obj);
    }

    public final Message a(int i, int i2) {
        return this.a.obtainMessage(i, i2, 0);
    }

    public final Message a(Object obj) {
        return this.a.obtainMessage(0, 1, 1, obj);
    }

    public final boolean a(int i) {
        return this.a.sendEmptyMessage(i);
    }

    public final boolean a(long j) {
        return this.a.sendEmptyMessageAtTime(2, j);
    }

    public final void b() {
        this.a.removeMessages(2);
    }
}
