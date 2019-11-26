package defpackage;

import android.view.View;

/* renamed from: fio */
final /* synthetic */ class fio implements Runnable {
    private final View a;

    fio(View view) {
        this.a = view;
    }

    public final void run() {
        this.a.setVisibility(0);
    }
}
