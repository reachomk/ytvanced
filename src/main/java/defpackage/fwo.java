package defpackage;

import android.content.Intent;

/* renamed from: fwo */
final /* synthetic */ class fwo implements wxe {
    private final fwl a;

    fwo(fwl fwl) {
        this.a = fwl;
    }

    public final boolean a(int i, int i2, Intent intent) {
        gax gax = this.a.a;
        if (gax != null) {
            for (Runnable runnable : gax.b.values()) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
        return false;
    }
}
