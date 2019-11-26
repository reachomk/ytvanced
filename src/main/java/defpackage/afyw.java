package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: afyw */
public final class afyw implements agpn {
    private static final long a = TimeUnit.HOURS.toSeconds(1);
    private final wya b;
    private final zzl c;

    public afyw(wya wya, zzl zzl) {
        this.b = wya;
        this.c = zzl;
    }

    public final void a() {
        avoa avoa = this.c.b().h;
        if (avoa == null) {
            avoa = avoa.w;
        }
        avpy avpy = avoa.c;
        if (avpy == null) {
            avpy = avpy.d;
        }
        if (avpy.b) {
            long max = Math.max(a, avpy.c);
            wya wya = this.b;
            double d = (double) max;
            Double.isNaN(d);
            wya.a("offline_client_state", max, (long) (d * 0.5d), false, 1, false, null, null, true, false);
        }
    }
}
