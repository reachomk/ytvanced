package defpackage;

import android.net.Uri;

/* renamed from: ajff */
final /* synthetic */ class ajff implements Runnable {
    private final ajfd a;
    private final xvo b;
    private final afsd c;
    private final afpt d;

    ajff(ajfd ajfd, xvo xvo, afsd afsd, afpt afpt) {
        this.a = ajfd;
        this.b = xvo;
        this.c = afsd;
        this.d = afpt;
    }

    public final void run() {
        ajfd ajfd = this.a;
        xvo xvo = this.b;
        afsd afsd = this.c;
        afpt afpt = this.d;
        Uri a = xvo.a();
        ajfb.a(a);
        afqy a2 = afqv.a("vss");
        a2.a(a);
        a2.e = true;
        a2.a(afsd);
        a2.h = afpt;
        ajfd.m.a(ajfd.n, a2, new ajfe(ajfd));
    }
}
