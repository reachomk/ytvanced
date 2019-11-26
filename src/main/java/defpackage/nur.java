package defpackage;

import android.util.Log;

/* renamed from: nur */
final class nur {
    public static nus a(nrb nrb) {
        nwf.a((Object) nrb);
        nwz nwz = new nwz(16);
        if (nuu.a(nrb, nwz).a != nxf.c("RIFF")) {
            return null;
        }
        nrb.c(nwz.a, 0, 4);
        nwz.c(0);
        int j = nwz.j();
        String str = "WavHeaderReader";
        StringBuilder stringBuilder;
        if (j != nxf.c("WAVE")) {
            stringBuilder = new StringBuilder(36);
            stringBuilder.append("Unsupported RIFF format: ");
            stringBuilder.append(j);
            Log.e(str, stringBuilder.toString());
            return null;
        }
        nuu a = nuu.a(nrb, nwz);
        while (a.a != nxf.c("fmt ")) {
            nrb.b((int) a.b);
            a = nuu.a(nrb, nwz);
        }
        nwf.b(a.b >= 16);
        nrb.c(nwz.a, 0, 16);
        nwz.c(0);
        int f = nwz.f();
        int f2 = nwz.f();
        int o = nwz.o();
        int o2 = nwz.o();
        int f3 = nwz.f();
        int f4 = nwz.f();
        int i = (f2 * f4) / 8;
        if (f3 == i) {
            int a2 = nxf.a(f4);
            if (a2 == 0) {
                stringBuilder = new StringBuilder(38);
                stringBuilder.append("Unsupported WAV bit depth: ");
                stringBuilder.append(f4);
                Log.e(str, stringBuilder.toString());
                return null;
            } else if (f == 1 || f == 65534) {
                nrb.b(((int) a.b) - 16);
                return new nus(f2, o, o2, f3, f4, a2);
            } else {
                stringBuilder = new StringBuilder(40);
                stringBuilder.append("Unsupported WAV format type: ");
                stringBuilder.append(f);
                Log.e(str, stringBuilder.toString());
                return null;
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder(55);
        stringBuilder2.append("Expected block alignment: ");
        stringBuilder2.append(i);
        stringBuilder2.append("; got: ");
        stringBuilder2.append(f3);
        throw new nnc(stringBuilder2.toString());
    }
}
