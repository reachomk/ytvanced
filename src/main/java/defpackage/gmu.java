package defpackage;

import java.util.Locale;

/* renamed from: gmu */
final /* synthetic */ class gmu implements bcvk {
    private final gng a;

    public gmu(gng gng) {
        this.a = gng;
    }

    public final void a(Object obj) {
        gng gng = this.a;
        aakj aakj = (aakj) obj;
        String b = aakj != null ? aakj.b() : "";
        if (gng.a.d(b)) {
            long j;
            gml gml = gng.a.ad;
            synchronized (gml.a) {
                if (gml.c == null || gml.e || !gml.b(b)) {
                    j = 0;
                } else {
                    j = gml.b.a();
                    gml.c.a("r_tr");
                    gml.e = true;
                    j -= gml.d;
                }
            }
            aahr k = gng.a.ak.k();
            if (k != null) {
                gml gml2 = gng.a.ad;
                int b2 = k.b();
                synchronized (gml2.a) {
                    if (gml2.c != null) {
                        if (gml2.b(b)) {
                            atyn atyn = (atyn) atyk.i.createBuilder();
                            atyn.a(b2);
                            atyk atyk = (atyk) ((anxl) atyn.build());
                            atyl atyl = (atyl) atyi.l.createBuilder();
                            atyl.copyOnWrite();
                            atyi atyi = (atyi) atyl.instance;
                            if (atyk != null) {
                                atyi.j = atyk;
                                atyi.b |= 32;
                                gml2.c.a((atyi) ((anxl) atyl.build()));
                            } else {
                                throw new NullPointerException();
                            }
                        }
                    }
                }
            }
            gng.a.ac().f.b();
            gng.a.aK.a(j);
            if (gng.a.aK.c()) {
                xtl.e(String.format(Locale.US, "Reels[%s] Playback Time: %d ms", new Object[]{b, Long.valueOf(j)}));
            }
        }
    }
}
