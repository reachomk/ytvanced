package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: zzj */
public final class zzj implements afmw {
    private static final int a = ((int) TimeUnit.DAYS.toMinutes(1));
    private final aqtw b;

    public zzj(aqtw aqtw) {
        this.b = aqtw;
    }

    public final int a() {
        aqtw aqtw = this.b;
        if (aqtw == null) {
            return 720;
        }
        return aqtw.b;
    }

    public final int b() {
        aqtw aqtw = this.b;
        if (aqtw != null) {
            int i = aqtw.c;
            if (i > 0) {
                return i;
            }
        }
        return 100;
    }

    public final int c() {
        aqtw aqtw = this.b;
        if (!(aqtw == null || (aqtw.a & 4) == 0)) {
            aqty aqty = aqtw.d;
            if (aqty == null) {
                aqty = aqty.d;
            }
            if (aqty.b >= 0) {
                aqty = this.b.d;
                if (aqty == null) {
                    aqty = aqty.d;
                }
                return aqty.b;
            }
        }
        return 0;
    }

    public final int d() {
        aqtw aqtw = this.b;
        if (!(aqtw == null || (aqtw.a & 4) == 0)) {
            aqty aqty = aqtw.d;
            if (aqty == null) {
                aqty = aqty.d;
            }
            if (aqty.c > 0) {
                aqty = this.b.d;
                if (aqty == null) {
                    aqty = aqty.d;
                }
                return aqty.c;
            }
        }
        return a;
    }
}
