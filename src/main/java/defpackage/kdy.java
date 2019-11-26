package defpackage;

import android.view.View;

/* renamed from: kdy */
final /* synthetic */ class kdy implements Runnable {
    private final View a;

    public kdy(View view) {
        this.a = view;
    }

    public final void run() {
        this.a.requestFocus();
    }
}
