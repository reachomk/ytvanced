package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: afdn */
final class afdn extends HandlerThread {
    public final Runnable a = new afdm(this);
    public Handler b;
    public volatile long c;
    public final /* synthetic */ afdj d;
    private int e;

    afdn(afdj afdj) {
        this.d = afdj;
        super("YouTubePlayer.ProgressDetector");
    }

    public final synchronized void start() {
        super.start();
        this.b = new Handler(getLooper());
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        int i = this.e + 1;
        this.e = i;
        StringBuilder stringBuilder = new StringBuilder(53);
        stringBuilder.append("Retrying MediaPlayer error [retry=");
        stringBuilder.append(i);
        stringBuilder.append(", max=3]");
        xtl.d(stringBuilder.toString());
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean b() {
        return this.e < 3;
    }

    public final synchronized void c() {
        this.e = 0;
        d();
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        this.b.removeCallbacksAndMessages(null);
    }

    public final boolean quit() {
        d();
        return super.quit();
    }
}
