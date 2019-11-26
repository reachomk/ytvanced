package defpackage;

/* renamed from: pks */
final class pks extends pnv {
    private final /* synthetic */ pkq a;

    public final int a() {
        return 13280009;
    }

    public final void a(String str, String str2) {
        pkq pkq = this.a;
        ptd ptd = pkq.f;
        if (ptd != null) {
            pkq.d.b(ptd, str, str2).a(new pkt(this.a, "joinApplication"));
        }
    }

    public final void a(String str, pjr pjr) {
        pkq pkq = this.a;
        ptd ptd = pkq.f;
        if (ptd != null) {
            pkq.d.a(ptd, str, pjr).a(new pkt(this.a, "launchApplication"));
        }
    }

    public final void a(String str) {
        pkq pkq = this.a;
        ptd ptd = pkq.f;
        if (ptd != null) {
            pkq.d.a(ptd, str);
        }
    }

    public final void a(int i) {
        this.a.a(i);
    }

    /* synthetic */ pks(pkq pkq) {
        this.a = pkq;
    }
}
