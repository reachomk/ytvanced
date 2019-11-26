package defpackage;

/* renamed from: plo */
final class plo implements ptm {
    private final /* synthetic */ plm a;

    public final /* synthetic */ void a(ptn ptn) {
        if (((pma) ptn).a().f != 0) {
            this.a.a.c(String.format("Error fetching queue items, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(r0), r5.g}), new Object[0]);
        }
        plm plm = this.a;
        plm.j = null;
        if (!plm.i.isEmpty()) {
            this.a.c();
        }
    }

    /* synthetic */ plo(plm plm) {
        this.a = plm;
    }
}
