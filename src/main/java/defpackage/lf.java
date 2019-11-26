package defpackage;

import android.support.design.textfield.TextInputLayout;

/* renamed from: lf */
public final class lf implements Runnable {
    private final /* synthetic */ TextInputLayout a;

    public lf(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public final void run() {
        this.a.a.requestLayout();
    }
}
