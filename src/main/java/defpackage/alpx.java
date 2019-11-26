package defpackage;

import com.google.android.libraries.quantum.snackbar.Snackbar;

/* renamed from: alpx */
final /* synthetic */ class alpx implements Runnable {
    private final Snackbar a;

    alpx(Snackbar snackbar) {
        this.a = snackbar;
    }

    public final void run() {
        this.a.d();
    }
}
