package defpackage;

/* renamed from: jkr */
final /* synthetic */ class jkr implements Runnable {
    private final jkp a;
    private final String b;
    private final ameo c;

    jkr(jkp jkp, String str, ameo ameo) {
        this.a = jkp;
        this.b = str;
        this.c = ameo;
    }

    public final void run() {
        jkp jkp = this.a;
        String str = this.b;
        ameo ameo = this.c;
        fnp a = jkp.a.a(str, null);
        if (a != null) {
            Object obj = ameo.b;
            amqw.a(obj);
            a.c = obj;
            int a2 = ames.a(ameo.d);
            if (a2 == 0) {
                a2 = 1;
            }
            a.d = jkj.a(a2);
            jkp.a.a(a);
        }
    }
}
