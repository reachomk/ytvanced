package defpackage;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ddp */
public final class ddp {
    public static final Map a = new zj();
    public final def b = new dds(this);
    public final ddo c;
    public final Context d;
    public final ddq e;
    public final ddw f;
    public final ScheduledExecutorService g;

    public ddp(ddo ddo, Context context, ddq ddq, ddw ddw) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ddr());
        this.c = ddo;
        this.d = context;
        this.e = ddq;
        this.g = newSingleThreadScheduledExecutor;
        this.f = ddw;
    }

    public final void a(dep dep) {
        if (dep != null) {
            this.g.execute(new ddu(this, dep));
        }
    }

    static void a(dep dep, boolean z) {
        dex dex;
        synchronized (a) {
            dex = (dex) a.get(dep.b);
        }
        if (dex != null) {
            dex.a(dep, z);
            if (dex.a()) {
                synchronized (a) {
                    a.remove(dep.b);
                }
            }
        }
    }
}
