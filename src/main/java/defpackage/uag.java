package defpackage;

import android.os.health.HealthStats;
import android.os.health.TimerStat;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: uag */
public final class uag {
    public static bcah a(String str) {
        bcak bcak = (bcak) bcah.d.createBuilder();
        bcak.copyOnWrite();
        bcah bcah = (bcah) bcak.instance;
        bcah.a |= 2;
        bcah.c = str;
        return (bcah) ((anxl) bcak.build());
    }

    public static bcar a(String str, TimerStat timerStat) {
        bcau bcau = (bcau) bcar.e.createBuilder();
        bcau.a(timerStat.getCount());
        bcau.a(timerStat.getTime());
        if (bcau.a() < 0) {
            bcau.a(0);
        }
        if (str != null) {
            bcau.a(uag.a(str));
        }
        if (bcau.a() == 0 && ((bcar) bcau.instance).c == 0) {
            return null;
        }
        return (bcar) ((anxl) bcau.build());
    }

    public static bcar a(bcar bcar, bcar bcar2) {
        if (!(bcar == null || bcar2 == null)) {
            int i = bcar.b - bcar2.b;
            long j = bcar.c - bcar2.c;
            if (i == 0 && j == 0) {
                return null;
            }
            bcau bcau = (bcau) bcar.e.createBuilder();
            bcah bcah = bcar.d;
            if (bcah == null) {
                bcah = bcah.d;
            }
            bcau.a(bcah);
            bcau.a(i);
            bcau.a(j);
            bcar = (bcar) ((anxl) bcau.build());
        }
        return bcar;
    }

    public static boolean a(bcan bcan) {
        return bcan == null || (bcan.b <= 0 && bcan.c <= 0 && bcan.d <= 0 && bcan.e <= 0 && bcan.f <= 0 && bcan.g <= 0);
    }

    public static boolean a(bcaj bcaj) {
        boolean z = true;
        if (bcaj != null) {
            if (bcaj.b.size() != 0) {
                z = false;
            } else if (bcaj.c.size() == 0) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public static boolean a(bcap bcap) {
        boolean z = true;
        if (bcap != null) {
            if (((long) bcap.b) > 0) {
                z = false;
            } else if (((long) bcap.c) <= 0) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public static long a(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasMeasurement(i)) ? 0 : healthStats.getMeasurement(i);
    }

    public static bcar b(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasTimer(i)) ? null : uag.a(null, healthStats.getTimer(i));
    }

    public static List c(HealthStats healthStats, int i) {
        if (healthStats != null && healthStats.hasTimers(i)) {
            return uam.a.a(healthStats.getTimers(i));
        }
        return Collections.emptyList();
    }

    public static Map d(HealthStats healthStats, int i) {
        return (healthStats != null && healthStats.hasStats(i)) ? healthStats.getStats(i) : Collections.emptyMap();
    }
}
