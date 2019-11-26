package defpackage;

import android.text.TextUtils;

/* renamed from: agpp */
public final class agpp {
    public static int a(int i) {
        int i2 = (i & 8) != 0 ? 2 : 0;
        if ((i & 256) != 0) {
            i2 |= 4;
        }
        if ((i & 2) != 0) {
            i2 |= 8;
        }
        if ((i & 4) != 0) {
            i2 |= 16;
        }
        if ((i & 16) != 0) {
            i2 |= 32;
        }
        if ((i & 128) != 0) {
            i2 |= 64;
        }
        if ((i & 2048) != 0) {
            i2 |= 128;
        }
        return (i & 4096) != 0 ? i2 | 256 : i2;
    }

    public static boolean a(agej agej, agpw agpw) {
        return agpp.a(agpw) && agej.c();
    }

    public static boolean a(agpw agpw) {
        int a = agxj.a(agpw);
        return (a == 1 || a == 3 || a == 4 || a == 7) && !TextUtils.isEmpty(agxj.b(agpw));
    }

    public static avqw a(agqz agqz) {
        avqv avqv = (avqv) avqw.B.createBuilder();
        String b = agxj.b(agqz.f);
        if (b != null) {
            avqv.a(b);
        }
        b = agxj.l(agqz.f);
        int i = 2;
        if (b != null) {
            avqv.copyOnWrite();
            avqw avqw = (avqw) avqv.instance;
            avqw.a |= 2;
            avqw.c = b;
        }
        b = agxj.n(agqz.f);
        if (b != null) {
            avqv.copyOnWrite();
            avqw avqw2 = (avqw) avqv.instance;
            avqw2.a |= 4;
            avqw2.d = b;
        }
        long j = agqz.d;
        avqv.copyOnWrite();
        avqw avqw3 = (avqw) avqv.instance;
        avqw3.a |= 32;
        avqw3.g = j / 1024;
        j = agqz.e;
        avqv.copyOnWrite();
        avqw3 = (avqw) avqv.instance;
        avqw3.a |= 128;
        avqw3.i = j / 1024;
        avqv.a(agxj.a(agqz.f) == 3);
        avqv.b(agxj.o(agqz.f));
        avqv.a(ahdl.a(agxj.e(agqz.f)));
        int F = agxj.F(agqz.f);
        avqv.copyOnWrite();
        avqw avqw4 = (avqw) avqv.instance;
        if (F != 0) {
            avqw4.a |= 262144;
            avqw4.s = F - 1;
            avqv.e(!agxj.i(agqz.f) ? 2 : 3);
            switch (agxj.a(agqz.f)) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 7;
                    break;
                case 7:
                    i = 8;
                    break;
                default:
                    xtl.c("Unrecognized offline transfer type, defaulting to unknown.");
                    break;
            }
            i = 1;
            avqv.copyOnWrite();
            avqw3 = (avqw) avqv.instance;
            avqw3.a |= 1073741824;
            avqw3.A = i - 1;
            F = agxj.j(agqz.f);
            avqv.copyOnWrite();
            avqw avqw5 = (avqw) avqv.instance;
            avqw5.a |= 32768;
            avqw5.p = F;
            agpw agpw = agqz.f;
            b = agxj.c(agpw);
            if (TextUtils.isEmpty(b)) {
                b = agxj.d(agpw);
            }
            if (b != null) {
                avqv.b(b);
            }
            return (avqw) ((anxl) avqv.build());
        }
        throw new NullPointerException();
    }

    public static avqw a(agqy agqy, int i, String str) {
        avqv avqv = (avqv) avqw.B.createBuilder();
        avqv.a(agqy.a());
        avqv.c(4);
        avqv.a(agqy.b);
        avqv.e(agqy.m.a());
        int B = agqy.B();
        avqv.copyOnWrite();
        avqw avqw = (avqw) avqv.instance;
        if (B != 0) {
            avqw.a |= 16384;
            avqw.o = B - 1;
            avqv.b(xvd.f(str));
            return (avqw) ((anxl) avqv.build());
        }
        throw new NullPointerException();
    }
}
