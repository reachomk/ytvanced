package defpackage;

/* renamed from: aijm */
final class aijm implements aiji {
    private final /* synthetic */ aijj a;

    aijm(aijj aijj) {
        this.a = aijj;
    }

    public final void a(aakj aakj) {
        if (!this.a.a.b) {
            aakj a = this.a.a.j.a() ? ((aijo) this.a.a.j.b()).a(aakj) : null;
            aakj aakj2 = a != null ? a : aakj;
            aijb aijb = this.a.a.k;
            aipx aipx = (aipx) aijb.b.get();
            if (aipx == null) {
                afpc.a(2, afpf.player, "MediaCacheDownloadManagerProvider misconfigured");
            } else {
                aijb.d = aipx.a(aakj2, aakj2.n().as(), (long) aijb.a.b, aijb, 1);
            }
        }
    }

    public final void a(int i) {
        i--;
        if (i == 2 || i == 3 || i == 4) {
            this.a.a.l = true;
        }
    }
}
