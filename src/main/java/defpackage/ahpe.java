package defpackage;

import android.view.View;

/* renamed from: ahpe */
public final /* synthetic */ class ahpe implements Runnable {
    private final View a;

    public ahpe(View view) {
        this.a = view;
    }

    public final void run() {
        this.a.callOnClick();
    }
}
