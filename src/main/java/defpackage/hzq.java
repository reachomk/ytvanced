package defpackage;

import android.os.Build.VERSION;

/* renamed from: hzq */
public final /* synthetic */ class hzq implements bcvk {
    private final hzr a;

    public hzq(hzr hzr) {
        this.a = hzr;
    }

    public final void a(Object obj) {
        hzr hzr = this.a;
        hzz hzz = (hzz) obj;
        awba awba = (awba) awbb.d.createBuilder();
        boolean z = hzr.g;
        awba.copyOnWrite();
        awbb awbb = (awbb) awba.instance;
        int i = 1;
        awbb.a |= 1;
        awbb.b = z;
        z = hzr.h;
        awba.copyOnWrite();
        awbb = (awbb) awba.instance;
        awbb.a |= 2;
        awbb.c = z;
        awbb awbb2 = (awbb) ((anxl) awba.build());
        hzw b = hzz.b();
        awbc awbc = (awbc) awbd.j.createBuilder();
        boolean b2 = b.a().b();
        awbc.copyOnWrite();
        awbd awbd = (awbd) awbc.instance;
        awbd.a |= 1;
        awbd.b = b2;
        b2 = hzr.e.i;
        awbc.copyOnWrite();
        awbd = (awbd) awbc.instance;
        awbd.a |= 2;
        awbd.c = b2;
        b2 = b.a().c();
        awbc.copyOnWrite();
        awbd = (awbd) awbc.instance;
        awbd.a |= 4;
        awbd.d = b2;
        int d = b.a().d();
        awbc.copyOnWrite();
        awbd = (awbd) awbc.instance;
        if (d != 0) {
            awbd.a |= 16;
            awbd.f = d - 1;
            awbc.copyOnWrite();
            awbd awbd2 = (awbd) awbc.instance;
            if (awbb2 != null) {
                boolean isPowerSaveMode;
                awbd2.e = awbb2;
                awbd2.a |= 8;
                int b3 = b.b();
                if (b3 != 0) {
                    switch (b3) {
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
                        case 8:
                            i = 9;
                            break;
                        case 9:
                            i = 10;
                            break;
                        case 10:
                            i = 11;
                            break;
                    }
                }
                i = 2;
                awbc.copyOnWrite();
                awbd awbd3 = (awbd) awbc.instance;
                awbd3.a |= 32;
                awbd3.g = i - 1;
                if (VERSION.SDK_INT >= 21) {
                    isPowerSaveMode = hzr.d.isPowerSaveMode();
                    awbc.copyOnWrite();
                    awbd2 = (awbd) awbc.instance;
                    awbd2.a |= 128;
                    awbd2.i = isPowerSaveMode;
                }
                if (VERSION.SDK_INT >= 23) {
                    isPowerSaveMode = hzr.d.isDeviceIdleMode();
                    awbc.copyOnWrite();
                    awbd2 = (awbd) awbc.instance;
                    awbd2.a |= 64;
                    awbd2.h = isPowerSaveMode;
                }
                awbe a = hzz.a().a();
                b3 = hzr.b.m();
                a.copyOnWrite();
                awbf awbf = (awbf) a.instance;
                if (b3 != 0) {
                    awbf.a |= 4;
                    awbf.d = b3 - 1;
                    String a2 = b.a().a();
                    a.copyOnWrite();
                    awbf awbf2 = (awbf) a.instance;
                    if (a2 != null) {
                        awbf2.a |= 8;
                        awbf2.e = a2;
                        a.copyOnWrite();
                        awbf awbf3 = (awbf) a.instance;
                        awbf3.c = (awbd) ((anxl) awbc.build());
                        awbf3.a |= 2;
                        asmz asmz = (asmz) asmw.f.createBuilder();
                        asmz.copyOnWrite();
                        asmw asmw = (asmw) asmz.instance;
                        asmw.c = (anxl) a.build();
                        asmw.b = 157;
                        hzr.a.a((asmw) ((anxl) asmz.build()));
                        return;
                    }
                    throw new NullPointerException();
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
