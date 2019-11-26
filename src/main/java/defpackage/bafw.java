package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

/* renamed from: bafw */
public final class bafw implements Callback, FrameCallback {
    private static final String d = bafw.class.getSimpleName();
    public final HandlerThread a = new HandlerThread("FrameMonitor");
    public Handler b;
    public boolean c;
    private final FrameCallback e;
    private Choreographer f = null;

    public bafw(FrameCallback frameCallback) {
        this.e = frameCallback;
    }

    public final void a() {
        if (this.c) {
            this.c = false;
            this.b.sendEmptyMessage(2);
        }
    }

    public final void b() {
        a();
        this.a.quitSafely();
        try {
            this.a.join();
        } catch (InterruptedException e) {
            String str = d;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 45);
            stringBuilder.append("Interrupted when shutting down FrameMonitor: ");
            stringBuilder.append(valueOf);
            Log.e(str, stringBuilder.toString());
        }
    }

    public final void doFrame(long j) {
        this.e.doFrame(j);
        this.f.postFrameCallback(this);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            if (this.f == null) {
                this.f = Choreographer.getInstance();
            }
            return true;
        } else if (i == 1) {
            this.f.postFrameCallback(this);
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f.removeFrameCallback(this);
            return true;
        }
    }
}
