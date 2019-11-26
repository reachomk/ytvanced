package defpackage;

/* renamed from: akk */
final class akk implements ajm {
    private final /* synthetic */ akf a;

    akk(akf akf) {
        this.a = akf;
    }

    public final boolean a(aiw aiw) {
        if (aiw != null) {
            akf akf = this.a;
            akf.q = ((aju) aiw).l.a;
            ajm ajm = akf.e;
            if (ajm != null) {
                return ajm.a(aiw);
            }
        }
        return false;
    }

    public final void a(aiw aiw, boolean z) {
        if (aiw instanceof aju) {
            aiw.m().a(false);
        }
        ajm ajm = this.a.e;
        if (ajm != null) {
            ajm.a(aiw, z);
        }
    }
}
