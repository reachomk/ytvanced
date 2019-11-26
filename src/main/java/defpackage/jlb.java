package defpackage;

/* renamed from: jlb */
final /* synthetic */ class jlb implements Runnable {
    private final jky a;
    private final String b;
    private final String c;
    private final awob d;

    jlb(jky jky, String str, String str2, awob awob) {
        this.a = jky;
        this.b = str;
        this.c = str2;
        this.d = awob;
    }

    public final void run() {
        jky jky = this.a;
        String str = this.b;
        String str2 = this.c;
        awob awob = this.d;
        fnp a = jky.a.a(str, str2);
        if (a != null) {
            a.o = awob.b;
            arml arml = awob.c;
            if (arml == null) {
                arml = arml.f;
            }
            a.p = ajqy.a(arml);
            arml = awob.d;
            if (arml == null) {
                arml = arml.f;
            }
            a.q = ajqy.a(arml);
            jky.a.a(a);
        }
    }
}
