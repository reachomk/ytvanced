package defpackage;

import android.view.View;

/* renamed from: guc */
final /* synthetic */ class guc implements Runnable {
    private final gub a;

    guc(gub gub) {
        this.a = gub;
    }

    public final void run() {
        gub gub = this.a;
        View z = gub.z();
        if (z != null) {
            z.post(new guh(gub));
        }
    }
}
