package defpackage;

/* renamed from: amfy */
final /* synthetic */ class amfy implements bbnw {
    private final String a;
    private final amec b;
    private final String c;

    amfy(String str, amec amec, String str2) {
        this.a = str;
        this.b = amec;
        this.c = str2;
    }

    public final void accept(Object obj) {
        String str = this.a;
        amec amec = this.b;
        String str2 = this.c;
        amdz amdz = (amdz) obj;
        if (!(str.isEmpty() || amec == null)) {
            amdz.d(str);
            amdz.h(amec);
        }
        if (!str2.isEmpty()) {
            amdz.e(str2);
        }
    }
}
