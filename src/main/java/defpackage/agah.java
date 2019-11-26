package defpackage;

/* renamed from: agah */
final /* synthetic */ class agah implements Runnable {
    private final agag a;
    private final agqz b;

    agah(agag agag, agqz agqz) {
        this.a = agag;
        this.b = agqz;
    }

    public final void run() {
        agag agag = this.a;
        agqz agqz = this.b;
        for (agdu agdu : agag.a.s.c(agxj.b(agqz.f))) {
            if (agdu.a(agqz)) {
                agag.a.a(agdu.c());
            }
        }
    }
}
