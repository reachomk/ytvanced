package defpackage;

import android.database.Cursor;
import java.util.concurrent.TimeUnit;

/* renamed from: agcf */
final /* synthetic */ class agcf implements Runnable {
    private final agce a;

    agcf(agce agce) {
        this.a = agce;
    }

    public final void run() {
        agce agce = this.a;
        if (agce.i.v()) {
            long b = agce.b.b();
            if (agce.a == 0 || b - agce.a >= agce.l) {
                agce.a = b;
                b = ((agvs) agce.d.get()).a(agce.c);
                if (b > 0) {
                    long j = null;
                    Cursor rawQuery = ((agfi) agce.h.get()).c.a.a().rawQuery("SELECT min(last_refresh_timestamp) FROM videosV2", null);
                    try {
                        if (rawQuery.moveToFirst()) {
                            j = rawQuery.getLong(0);
                        } else {
                            rawQuery.close();
                            j = Long.MAX_VALUE;
                        }
                        if (agce.b.a() > j + TimeUnit.SECONDS.toMillis(b)) {
                            ((aguk) agce.e.get()).a(agce.c);
                        }
                    } finally {
                        rawQuery.close();
                    }
                }
            }
        }
    }
}
