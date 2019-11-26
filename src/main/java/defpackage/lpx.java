package defpackage;

import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;

/* renamed from: lpx */
public final /* synthetic */ class lpx implements Runnable {
    private final NextGenWatchLayout a;

    public lpx(NextGenWatchLayout nextGenWatchLayout) {
        this.a = nextGenWatchLayout;
    }

    public final void run() {
        this.a.requestLayout();
    }
}
