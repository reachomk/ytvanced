package defpackage;

import com.google.android.libraries.material.progress.MaterialProgressBar;

/* renamed from: ttf */
public final class ttf implements Runnable {
    private final /* synthetic */ MaterialProgressBar a;

    public ttf(MaterialProgressBar materialProgressBar) {
        this.a = materialProgressBar;
    }

    public final void run() {
        if (this.a.getVisibility() == 0) {
            this.a.setVisibility(4);
        }
    }
}
