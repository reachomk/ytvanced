package defpackage;

/* renamed from: oko */
final class oko {
    public static okp a(ofp ofp) {
        oxz.a((Object) ofp);
        oza oza = new oza(16);
        if (okr.a(ofp, oza).a != ode.a) {
            return null;
        }
        ofp.c(oza.a, 0, 4);
        oza.c(0);
        int k = oza.k();
        String str = "WavHeaderReader";
        StringBuilder stringBuilder;
        if (k != ode.b) {
            stringBuilder = new StringBuilder(36);
            stringBuilder.append("Unsupported RIFF format: ");
            stringBuilder.append(k);
            oyp.b(str, stringBuilder.toString());
            return null;
        }
        okr a = okr.a(ofp, oza);
        while (a.a != ode.c) {
            ofp.b((int) a.b);
            a = okr.a(ofp, oza);
        }
        oxz.b(a.b >= 16);
        ofp.c(oza.a, 0, 16);
        oza.c(0);
        int f = oza.f();
        int f2 = oza.f();
        int p = oza.p();
        int p2 = oza.p();
        int f3 = oza.f();
        int f4 = oza.f();
        int i = (f2 * f4) / 8;
        if (f3 == i) {
            int a2 = ode.a(f, f4);
            if (a2 == 0) {
                stringBuilder = new StringBuilder(64);
                stringBuilder.append("Unsupported WAV format: ");
                stringBuilder.append(f4);
                stringBuilder.append(" bit/sample, type ");
                stringBuilder.append(f);
                oyp.b(str, stringBuilder.toString());
                return null;
            }
            ofp.b(((int) a.b) - 16);
            return new okp(f2, p, p2, f3, f4, a2);
        }
        StringBuilder stringBuilder2 = new StringBuilder(55);
        stringBuilder2.append("Expected block alignment: ");
        stringBuilder2.append(i);
        stringBuilder2.append("; got: ");
        stringBuilder2.append(f3);
        throw new oae(stringBuilder2.toString());
    }
}
