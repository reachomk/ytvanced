package defpackage;

/* renamed from: jla */
final /* synthetic */ class jla implements Runnable {
    private final jky a;
    private final String b;
    private final String c;
    private final aygi d;

    jla(jky jky, String str, String str2, aygi aygi) {
        this.a = jky;
        this.b = str;
        this.c = str2;
        this.d = aygi;
    }

    public final void run() {
        jky jky = this.a;
        String str = this.b;
        String str2 = this.c;
        aygi aygi = this.d;
        fnp a = jky.a.a(str, str2);
        if (a != null) {
            aygk aygk = aygi.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a.f = aygk;
            jky.a.a(a);
        }
    }
}
