package defpackage;

/* renamed from: dqi */
final class dqi implements Runnable {
    private final /* synthetic */ dos a;

    dqi(dos dos) {
        this.a = dos;
    }

    public final void run() {
        ajbg ajbg = (ajbg) this.a.aq.get();
        ajbg.d.a(ajbg.a);
        ajbg.d.a(ajbg.b);
        if (aipo.a(ajbg.g, 2147483648L)) {
            bctz bctz = ajbg.f.a;
            ajql ajql = ajbg.c;
            ajql.getClass();
            bctz.a(new ajbj(ajql));
            bctz = ajbg.f.d;
            ajql = ajbg.c;
            ajql.getClass();
            bctz.a(new ajbi(ajql));
        } else {
            ajbg.d.a(ajbg.c);
        }
        for (aiqv a : ajbg.e) {
            aiqx.a(a);
        }
        for (aipq a2 : ajbg.h) {
            a2.a();
        }
    }
}
