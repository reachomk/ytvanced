package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: paf */
final class paf implements Callback, FrameCallback {
    public static final paf b = new paf();
    public volatile long a = -9223372036854775807L;
    public final Handler c;
    private final HandlerThread d = new HandlerThread("ChoreographerOwner:Handler");
    private Choreographer e;
    private int f;

    private paf() {
        this.d.start();
        this.c = ozp.a(this.d.getLooper(), (Callback) this);
        this.c.sendEmptyMessage(0);
    }

    public final void doFrame(long j) {
        this.a = j;
        this.e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            i = this.f + 1;
            this.f = i;
            if (i == 1) {
                this.e.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            i = this.f - 1;
            this.f = i;
            if (i == 0) {
                this.e.removeFrameCallback(this);
                this.a = -9223372036854775807L;
            }
            return true;
        }
    }
}
