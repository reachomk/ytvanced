package defpackage;

/* renamed from: pmc */
final class pmc implements poq {
    public ptd a;
    public final /* synthetic */ plw b;
    private long c = 0;

    public pmc(plw plw) {
        this.b = plw;
    }

    public final void a(String str, String str2, long j) {
        ptd ptd = this.a;
        if (ptd != null) {
            this.b.d.a(ptd, str, str2).a(new pmr(this, j));
            return;
        }
        throw new IllegalStateException("No GoogleApiClient available");
    }

    public final long a() {
        long j = this.c + 1;
        this.c = j;
        return j;
    }
}
