package defpackage;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: gaq */
public final class gaq {
    private final wya a;
    private final zyw b;

    public gaq(wya wya, zyw zyw) {
        this.a = wya;
        this.b = zyw;
    }

    public final void a() {
        apxn a = this.b.a();
        if (a != null) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.q) {
                int i;
                Calendar instance = Calendar.getInstance();
                apxn a2 = this.b.a();
                int i2 = 0;
                if (a2 == null || (a2.a & 16) == 0) {
                    i = 0;
                } else {
                    aulu aulu2 = a2.e;
                    if (aulu2 == null) {
                        aulu2 = aulu.bw;
                    }
                    i = aulu2.r;
                }
                long toSeconds = TimeUnit.MILLISECONDS.toSeconds(instance.getTimeInMillis());
                if (instance.get(11) >= i) {
                    instance.add(5, 1);
                }
                instance.set(11, i);
                long toSeconds2 = TimeUnit.MILLISECONDS.toSeconds(instance.getTimeInMillis()) - toSeconds;
                wya wya = this.a;
                a = this.b.a();
                if (!(a == null || (a.a & 16) == 0)) {
                    aulu = a.e;
                    if (aulu == null) {
                        aulu = aulu.bw;
                    }
                    i2 = aulu.s;
                }
                wya.a("NetworkStatusReporter", toSeconds2, (long) i2, true, 0, false, null, null, false, false);
                return;
            }
        }
        this.a.a("NetworkStatusReporter");
    }
}
