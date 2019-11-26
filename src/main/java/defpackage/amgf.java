package defpackage;

/* renamed from: amgf */
final /* synthetic */ class amgf implements bbnw {
    private final String a;
    private final String b;

    amgf(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final void accept(Object obj) {
        String str = this.a;
        String str2 = this.b;
        amdz amdz = (amdz) obj;
        if (!str.isEmpty()) {
            amdz.copyOnWrite();
            amea amea = (amea) amdz.instance;
            amea.a |= 65536;
            amea.q = str;
        }
        if (!str2.isEmpty()) {
            amdz.copyOnWrite();
            amea amea2 = (amea) amdz.instance;
            amea2.a |= 32768;
            amea2.p = str2;
        }
    }
}
