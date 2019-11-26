package defpackage;

import android.support.v4.widget.ContentLoadingProgressBar;

/* renamed from: acw */
public final class acw implements Runnable {
    private final /* synthetic */ ContentLoadingProgressBar a;

    public acw(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    public final void run() {
        ContentLoadingProgressBar contentLoadingProgressBar = this.a;
        contentLoadingProgressBar.b = false;
        contentLoadingProgressBar.a = -1;
        contentLoadingProgressBar.setVisibility(8);
    }
}
