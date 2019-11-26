package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: pwq */
final class pwq implements Runnable {
    private final /* synthetic */ LifecycleCallback a;
    private final /* synthetic */ String b;
    private final /* synthetic */ pwr c;

    pwq(pwr pwr, LifecycleCallback lifecycleCallback, String str) {
        this.c = pwr;
        this.a = lifecycleCallback;
        this.b = str;
    }

    public final void run() {
        pwr pwr = this.c;
        if (pwr.b > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            Bundle bundle = pwr.c;
            lifecycleCallback.a(bundle != null ? bundle.getBundle(this.b) : null);
        }
        if (this.c.b >= 2) {
            this.a.b();
        }
        if (this.c.b >= 3) {
            this.a.c();
        }
        if (this.c.b >= 4) {
            this.a.d();
        }
        int i = this.c.b;
    }
}
