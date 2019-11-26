package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: agfd */
public final class agfd {
    public agfg a = new agax(this);
    private final String b;
    private final aghj c;
    private final agff d = new agff(this);
    private final agem e;
    private agfy f;

    public agfd(aghj aghj, agem agem, String str) {
        this.b = str;
        this.c = aghj;
        this.e = agem;
    }

    public final synchronized SQLiteDatabase a() {
        try {
            if (this.f == null) {
                aghj aghj = this.c;
                this.f = new agfy((xsc) aghj.a((xsc) aghj.a.get(), 1), (Context) aghj.a((Context) aghj.b.get(), 2), (agpi) aghj.a((agpi) aghj.c.get(), 3), this.b, (agga) aghj.a(this.d, 5), (zyw) aghj.a((zyw) aghj.d.get(), 6));
            }
        } catch (SQLiteException e) {
            SQLiteException e2 = e;
            int i = 0;
            while (i < this.e.h()) {
                try {
                    e2 = this.f.getWritableDatabase();
                    return e2;
                } catch (SQLiteException e3) {
                    xtl.a("SQLiteException when retrying to get offline database", e3);
                    i++;
                }
            }
            throw e2;
        }
        return this.f.getWritableDatabase();
    }
}
