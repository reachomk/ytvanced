package defpackage;

/* renamed from: gly */
final /* synthetic */ class gly implements akwb {
    private final weo a;
    private final aapn b;
    private final acwa c;

    gly(weo weo, aapn aapn, acwa acwa) {
        this.a = weo;
        this.b = aapn;
        this.c = acwa;
    }

    public final akvy a(Object obj, akyd akyd, akxv akxv) {
        weo weo = this.a;
        aana aana = this.b;
        acwa acwa = this.c;
        if (!(obj instanceof aafj)) {
            return null;
        }
        wel a = weo.a(aana, acwa.t());
        a.a((aafj) obj);
        return a;
    }
}
