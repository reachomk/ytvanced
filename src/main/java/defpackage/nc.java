package defpackage;

import android.app.Dialog;

/* renamed from: nc */
final class nc implements Runnable {
    private final /* synthetic */ nd a;

    nc(nd ndVar) {
        this.a = ndVar;
    }

    public final void run() {
        nd ndVar = this.a;
        Dialog dialog = ndVar.c;
        if (dialog != null) {
            ndVar.onDismiss(dialog);
        }
    }
}
