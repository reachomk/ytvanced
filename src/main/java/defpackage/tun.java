package defpackage;

import android.content.Intent;
import android.os.Debug;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: tun */
final class tun implements Runnable {
    private final long a;
    private final /* synthetic */ tul b;

    tun(tul tul, long j) {
        this.b = tul;
        this.a = j;
    }

    public final void run() {
        long a = this.b.k.a();
        if (this.a <= a) {
            this.b.g();
            return;
        }
        tul tul = this.b;
        Intent registerReceiver = tul.a.registerReceiver(null, tul.j);
        bcba bcba = (bcba) bcax.e.createBuilder();
        bcaz a2 = this.b.a(registerReceiver);
        bcba.copyOnWrite();
        bcax bcax = (bcax) bcba.instance;
        if (a2 != null) {
            bcax.b = a2;
            bcax.a |= 1;
            bcax bcax2 = (bcax) ((anxl) bcba.build());
            File h = this.b.h();
            if (h == null) {
                tyv.d("CpuProfilingService", "Can't create file, aborting method sampling", new Object[0]);
                return;
            }
            this.b.i();
            String absolutePath = h.getAbsolutePath();
            tul tul2 = this.b;
            Debug.startMethodTracingSampling(absolutePath, tul2.e, tul2.f);
            tul tul3 = this.b;
            tul3.l = tul3.c().schedule(new tuk(this.b, h, bcax2, Float.valueOf(tul.b(registerReceiver)), Long.valueOf(this.a), Long.valueOf(a)), this.a - a, TimeUnit.MILLISECONDS);
            return;
        }
        throw new NullPointerException();
    }
}
