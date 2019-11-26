package defpackage;

/* renamed from: zpr */
final /* synthetic */ class zpr implements zpy {
    private final zpo a;

    zpr(zpo zpo) {
        this.a = zpo;
    }

    public final void a(int i) {
        zpo zpo = this.a;
        zpu zpu = zpo.b;
        Object obj = null;
        if (i != -1 && i < zpu.c.size()) {
            obj = zpu.c.get(i);
        }
        zix zix = (zix) obj;
        zpt zpt = zpo.c;
        if (zpt != null && zix != null) {
            zpt.a(zix);
        }
    }
}
