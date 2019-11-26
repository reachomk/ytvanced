package defpackage;

/* renamed from: kio */
final /* synthetic */ class kio implements Runnable {
    private final kip a;
    private final String b;
    private final awob c;

    kio(kip kip, String str, awob awob) {
        this.a = kip;
        this.b = str;
        this.c = awob;
    }

    public final void run() {
        kip kip = this.a;
        String str = this.b;
        awob awob = this.c;
        fno fno = (fno) kip.a.e.get(str);
        if (fno != null) {
            fno.h = awob.b;
            kip.a.a(str);
        }
    }
}
