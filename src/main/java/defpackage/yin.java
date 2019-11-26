package defpackage;

/* renamed from: yin */
final class yin extends bbze {
    private final /* synthetic */ String a;
    private final /* synthetic */ amul b;
    private final /* synthetic */ yiq c;
    private final /* synthetic */ yio d;

    yin(yio yio, String str, amul amul, yiq yiq) {
        this.d = yio;
        this.a = str;
        this.b = amul;
        this.c = yiq;
    }

    public final void a() {
    }

    public final void a(Throwable th) {
        this.d.c = this.d.c - 1;
        yio yio = this.d;
        if (yio.c == 0) {
            yio.a(this.b, this.c);
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        aadz aadz = (aadz) obj;
        if (aadz.c() != null) {
            bbnc bbnc = (bbnc) this.d.a.remove(aadz.c().a());
            if (!(bbnc == null || bbnc.c())) {
                bbnc.bK_();
            }
            this.d.b.put(this.a, aadz.c());
            this.d.c = this.d.c - 1;
            yio yio = this.d;
            if (yio.c == 0) {
                yio.a(this.b, this.c);
            }
        }
    }
}
