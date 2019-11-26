package defpackage;

/* renamed from: alyk */
final /* synthetic */ class alyk implements alzf {
    private final String a;
    private final int b;

    alyk(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final amea a(amea amea) {
        String str = this.a;
        int i = this.b;
        if (amea == null) {
            return null;
        }
        amdz amdz = (amdz) ((anxo) amea.toBuilder());
        amen amen = (amen) ameo.g.createBuilder();
        amen.a(str);
        amen.a(i);
        amdz.copyOnWrite();
        amea amea2 = (amea) amdz.instance;
        amea2.f = (ameo) ((anxl) amen.build());
        amea2.a |= 8;
        return (amea) ((anxl) amdz.build());
    }
}
