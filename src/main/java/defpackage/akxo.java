package defpackage;

/* renamed from: akxo */
final /* synthetic */ class akxo implements bbnv {
    private final akxm a;

    akxo(akxm akxm) {
        this.a = akxm;
    }

    public final Object a(Object obj) {
        akxm akxm = this.a;
        for (akxt akxt : akxm.b) {
            if (akxt.a() != null && akxt.a().a(obj)) {
                return akxt;
            }
        }
        return akxm.a;
    }
}
