package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: hnl */
public final class hnl implements xcp {
    private static final long a = TimeUnit.HOURS.toMillis(4);
    private final xhv b;
    private final xsc c;
    private final SharedPreferences d;
    private final bcaa e;
    private final bcaa f;

    public hnl(xhv xhv, xsc xsc, SharedPreferences sharedPreferences, bcaa bcaa, bcaa bcaa2) {
        this.b = xhv;
        this.c = xsc;
        this.d = sharedPreferences;
        this.e = bcaa;
        this.f = bcaa2;
    }

    public final void a() {
        if (this.b.c()) {
            long a = this.c.a();
            SharedPreferences sharedPreferences = this.d;
            String str = ebn.OFFLINE_LAST_SCHEDULED_AD_HOC_REFRESH_TIME_MILLIS;
            if (a - sharedPreferences.getLong(str, 0) >= a) {
                ((aguk) this.f.get()).a(((agwc) this.e.get()).c());
                this.d.edit().putLong(str, this.c.a()).apply();
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xgg.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((xgg) obj).a) {
            a();
            return null;
        }
        return clsArr;
    }
}
