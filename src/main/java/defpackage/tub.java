package defpackage;

import android.app.Application;

/* renamed from: tub */
public final class tub {
    public final tua a = new tua();

    public final void a(Application application) {
        application.registerActivityLifecycleCallbacks(this.a);
        application.registerComponentCallbacks(this.a);
    }

    public final void b(Application application) {
        application.unregisterActivityLifecycleCallbacks(this.a);
        application.unregisterComponentCallbacks(this.a);
    }

    public final void a(ttp ttp) {
        uhy.a((Object) ttp);
        this.a.a.add(ttp);
    }

    public final void b(ttp ttp) {
        uhy.a((Object) ttp);
        this.a.a.remove(ttp);
    }
}
