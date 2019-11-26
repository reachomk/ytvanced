package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import java.util.concurrent.TimeUnit;

/* renamed from: dqb */
final class dqb implements Runnable {
    private final /* synthetic */ dos a;

    dqb(dos dos) {
        this.a = dos;
    }

    public final void run() {
        zyw zyw = (zyw) this.a.aj.get();
        if (VERSION.SDK_INT >= 23) {
            apxn a = zyw.a();
            if (a != null) {
                avlu avlu = a.t;
                if (avlu == null) {
                    avlu = avlu.d;
                }
                if (avlu.c) {
                    ejf ejf = (ejf) this.a.ay.get();
                    Context context = this.a.aD;
                    if (VERSION.SDK_INT >= 23 && !ejf.b.getAndSet(true)) {
                        context.registerReceiver(ejf, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
                        bbng bbng = ejf.c;
                        bbzt bbzt = ejf.a;
                        Object obj = bbod.a;
                        bbow.a(obj, "keySelector is null");
                        bbnz.a(bbng.a, new bbtq(bbzt, obj, bbow.a).a(TimeUnit.MILLISECONDS).a(bbzi.c).c(new eje(ejf)));
                    }
                }
            }
        }
    }
}
