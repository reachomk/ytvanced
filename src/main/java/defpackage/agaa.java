package defpackage;

import android.database.Cursor;
import java.util.concurrent.TimeUnit;

/* renamed from: agaa */
final /* synthetic */ class agaa implements Runnable {
    private final afzs a;

    agaa(afzs afzs) {
        this.a = afzs;
    }

    public final void run() {
        afzs afzs = this.a;
        if (afzs.i.v()) {
            long b = afzs.c.b();
            if (afzs.w == 0 || b - afzs.w >= afzs.a) {
                afzs.w = b;
                b = ((agvs) afzs.e.get()).b(afzs.d);
                if (b > 0) {
                    boolean z = "SELECT min(saved_timestamp) FROM playlistsV13";
                    Cursor rawQuery = ((agfi) afzs.k.get()).d.a.a().rawQuery(z, null);
                    try {
                        long j;
                        z = false;
                        if (rawQuery.moveToFirst()) {
                            j = rawQuery.getLong(0);
                        } else {
                            rawQuery.close();
                            j = Long.MAX_VALUE;
                        }
                        if (afzs.c.a() > j + TimeUnit.SECONDS.toMillis(b)) {
                            ((agxf) afzs.g.get()).a(afzs.d, z);
                        }
                    } finally {
                        rawQuery.close();
                    }
                } else {
                    Object agae = new agae(afzs);
                    amqw.a(agae);
                    if (afzs.i.v()) {
                        afzs.j.execute(new afzv(afzs, agae));
                    }
                }
            }
        }
    }
}
