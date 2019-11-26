package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.Locale;

/* renamed from: deu */
final class deu implements Runnable {
    private final int a;
    private final deq b;
    private final der c;
    private final def d;
    private final dev e;
    private final int f;
    private final boolean g;

    public deu(int i, deq deq, der der, def def, dev dev, boolean z, int i2) {
        this.a = i;
        this.b = deq;
        this.c = der;
        this.d = def;
        this.e = dev;
        this.g = z;
        this.f = i2;
    }

    private static deu a(deq deq, dev dev, boolean z, int i) {
        return new deu(2, deq, null, null, dev, z, i);
    }

    static deu a(deq deq, der der, int i) {
        return new deu(7, deq, der, null, null, false, i);
    }

    public final void run() {
        deq deq;
        der der;
        switch (this.a) {
            case 1:
                deq = this.b;
                der = this.c;
                if (!deq.a(der)) {
                    deq.b.execute(deu.a(deq, der, 0));
                }
                return;
            case 2:
                deq = this.b;
                dev dev = this.e;
                boolean z = this.g;
                int i = this.f;
                boolean a = deq.a();
                if (z) {
                    deq.b.execute(new deu(6, null, null, null, dev, false, !a ? i : 1));
                }
                return;
            case 3:
                deq = this.b;
                synchronized (deq.c) {
                    int i2 = deq.c.b;
                    while (true) {
                        i2--;
                        if (i2 < 0) {
                        } else {
                            aac aac = deq.c;
                            dev dev2 = (dev) aac.remove(aac.b(i2));
                            if (dev2 != null) {
                                deq.a.post(deu.a(deq, dev2, false, 2));
                            }
                        }
                    }
                }
                return;
            case 4:
                deq deq2 = this.b;
                der der2 = this.c;
                def def = this.d;
                synchronized (deq2.c) {
                    if (deq2.c.containsKey(der2.c())) {
                        Log.w("FJD.JobService", String.format(Locale.US, "Job with tag = %s was already running.", new Object[]{der2.c()}));
                        return;
                    }
                    deq2.c.put(der2.c(), new dev(der2, def, SystemClock.elapsedRealtime()));
                    deq.a.post(new deu(1, deq2, der2, null, null, false, 0));
                    return;
                }
            case 5:
                deq = this.b;
                der = this.c;
                boolean z2 = this.g;
                synchronized (deq.c) {
                    dev dev3 = (dev) deq.c.remove(der.c());
                    if (dev3 == null) {
                        return;
                    }
                    deq.a.post(deu.a(deq, dev3, z2, 0));
                    return;
                }
            case 6:
                this.e.a(this.f);
                return;
            case 7:
                deq = this.b;
                der = this.c;
                int i3 = this.f;
                synchronized (deq.c) {
                    dev dev4 = (dev) deq.c.remove(der.c());
                    if (dev4 != null) {
                        dev4.a(i3);
                    }
                }
                return;
            default:
                throw new AssertionError("unreachable");
        }
    }
}
