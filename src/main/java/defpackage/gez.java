package defpackage;

import android.view.View;

/* renamed from: gez */
final /* synthetic */ class gez implements Runnable {
    private final View a;

    gez(View view) {
        this.a = view;
    }

    public final void run() {
        this.a.setEnabled(true);
    }
}
