package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: pwj */
final class pwj implements Runnable {
    private final /* synthetic */ LifecycleCallback a;
    private final /* synthetic */ String b;
    private final /* synthetic */ pwg c;

    pwj(pwg pwg, LifecycleCallback lifecycleCallback, String str) {
        this.c = pwg;
        this.a = lifecycleCallback;
        this.b = str;
    }

    public final void run() {
        pwg pwg = this.c;
        if (pwg.b > 0) {
            LifecycleCallback lifecycleCallback = this.a;
            Bundle bundle = pwg.c;
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
