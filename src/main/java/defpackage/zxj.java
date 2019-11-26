package defpackage;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;

/* renamed from: zxj */
public final class zxj extends wxo {
    public bapu a;
    public Application b;
    public aadw c;
    public bapu d;
    public bapu e;

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        ((xhf) this.d.get()).a();
        ((xhf) this.e.get()).a();
        this.c.a();
        this.b.registerActivityLifecycleCallbacks((ActivityLifecycleCallbacks) this.a.get());
    }
}
