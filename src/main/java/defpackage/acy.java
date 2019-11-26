package defpackage;

import android.support.v4.widget.ContentLoadingProgressBar;

/* renamed from: acy */
public final class acy implements Runnable {
    private final /* synthetic */ ContentLoadingProgressBar a;

    public acy(ContentLoadingProgressBar contentLoadingProgressBar) {
        this.a = contentLoadingProgressBar;
    }

    public final void run() {
        ContentLoadingProgressBar contentLoadingProgressBar = this.a;
        contentLoadingProgressBar.c = false;
        if (!contentLoadingProgressBar.d) {
            contentLoadingProgressBar.a = System.currentTimeMillis();
            this.a.setVisibility(0);
        }
    }
}
