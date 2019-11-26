package defpackage;

/* renamed from: kir */
final /* synthetic */ class kir implements Runnable {
    private final kip a;
    private final String b;
    private final ayuq c;

    kir(kip kip, String str, ayuq ayuq) {
        this.a = kip;
        this.b = str;
        this.c = ayuq;
    }

    public final void run() {
        kip kip = this.a;
        String str = this.b;
        ayuq ayuq = this.c;
        fno fno = (fno) kip.a.e.get(str);
        if (ayuq != null && fno != null) {
            int a = ayus.a(ayuq.b);
            if (a == 0) {
                a = 1;
            }
            fno.j = a;
            int a2 = ayus.a(ayuq.b);
            if (a2 != 0 && a2 == 3) {
                kip.a.a(fno);
            }
        }
    }
}
