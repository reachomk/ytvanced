package defpackage;

/* renamed from: plp */
final class plp implements ptm {
    private final /* synthetic */ plm a;

    public final /* synthetic */ void a(ptn ptn) {
        if (((pma) ptn).a().f != 0) {
            this.a.a.c(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(r0), r5.g}), new Object[0]);
        }
        plm plm = this.a;
        plm.k = null;
        if (!plm.i.isEmpty()) {
            this.a.c();
        }
    }

    /* synthetic */ plp(plm plm) {
        this.a = plm;
    }
}
