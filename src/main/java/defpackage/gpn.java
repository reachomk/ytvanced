package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter;

/* renamed from: gpn */
public final /* synthetic */ class gpn implements Runnable {
    private final ReelPlayerProgressPresenter a;

    public gpn(ReelPlayerProgressPresenter reelPlayerProgressPresenter) {
        this.a = reelPlayerProgressPresenter;
    }

    public final void run() {
        this.a.a();
    }
}
