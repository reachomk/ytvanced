package defpackage;

/* renamed from: amiz */
final class amiz implements anjg {
    private final /* synthetic */ String a;
    private final /* synthetic */ amip b;
    private final /* synthetic */ amjc c;
    private final /* synthetic */ long d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ String f;
    private final /* synthetic */ anjv g;
    private final /* synthetic */ amir h;

    amiz(amir amir, String str, amip amip, amjc amjc, long j, boolean z, String str2, anjv anjv) {
        this.h = amir;
        this.a = str;
        this.b = amip;
        this.c = amjc;
        this.d = j;
        this.e = z;
        this.f = str2;
        this.g = anjv;
    }

    public final void a(Throwable th) {
        if (this.g.isCancelled()) {
            String.valueOf(this.f).concat(" interrupted because the Future was cancelled");
            return;
        }
        this.h.a(this.a, this.b.a(th, this.a, this.h.c, this.e ^ 1), this.b, this.c, this.d, this.e, this.f);
    }
}
