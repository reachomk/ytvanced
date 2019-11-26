package defpackage;

/* renamed from: pkg */
final class pkg implements poq {
    public ptd a;
    public final /* synthetic */ pka b;
    private long c = 0;

    public pkg(pka pka) {
        this.b = pka;
    }

    public final void a(String str, String str2, long j) {
        if (this.a != null) {
            pje.b.a(this.a, str, str2).a(new pqm(this, j));
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
