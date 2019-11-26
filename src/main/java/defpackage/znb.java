package defpackage;

/* renamed from: znb */
final /* synthetic */ class znb implements zmr {
    private final zmt a;

    znb(zmt zmt) {
        this.a = zmt;
    }

    public final void a(Object obj) {
        zmt zmt = this.a;
        zjt zjt = (zjt) obj;
        zmt.n = true;
        znf b = zmt.b(ayza.EFFECT_SUBPACKAGE_ID_PRESET);
        if ("NORMAL".equals(zjt.a)) {
            b.a(true);
        } else {
            b.a(false);
        }
        zmt.n = false;
    }
}
