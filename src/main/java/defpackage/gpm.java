package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter;

/* renamed from: gpm */
public final /* synthetic */ class gpm implements Runnable {
    private final ReelPlayerProgressPresenter a;

    public gpm(ReelPlayerProgressPresenter reelPlayerProgressPresenter) {
        this.a = reelPlayerProgressPresenter;
    }

    public final void run() {
        this.a.a();
    }
}
