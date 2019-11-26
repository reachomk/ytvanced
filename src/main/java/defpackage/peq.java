package defpackage;

import android.database.sqlite.SQLiteException;

/* renamed from: peq */
final class peq extends pex {
    private final /* synthetic */ pgq d;

    peq(pgq pgq, pgd pgd) {
        this.d = pgq;
        super(pgd);
    }

    public final void a() {
        pgq pgq = this.d;
        try {
            pgl pgl = pgq.b;
            pgv.a();
            pgl.f();
            if (pgl.c.a(86400000)) {
                pgl.c.a();
                pgl.a("Deleting stale hits (if any)");
                pgl.a("Deleted stale hits, count", Integer.valueOf(pgl.q().delete("hits2", "hit_time < ?", new String[]{Long.toString(pgl.h().a() - 2592000000L)})));
            }
            pgq.d();
        } catch (SQLiteException e) {
            pgq.c("Failed to delete stale hits", e);
        }
        pgq.c.a(86400000);
    }
}
