package defpackage;

/* renamed from: fok */
final class fok implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ fon b;
    private final /* synthetic */ int c;
    private final /* synthetic */ long d;
    private final /* synthetic */ fol e;
    private final /* synthetic */ int f;
    private final /* synthetic */ int g;

    public final void run() {
        axck axck = (axck) axcl.i.createBuilder();
        String str = this.a;
        axck.copyOnWrite();
        axcl axcl = (axcl) axck.instance;
        if (str != null) {
            axcl.a |= 1;
            axcl.b = str;
            long j = this.b.d;
            axck.copyOnWrite();
            axcl axcl2 = (axcl) axck.instance;
            axcl2.a |= 2;
            axcl2.c = (int) j;
            int i = this.c;
            axck.copyOnWrite();
            axcl = (axcl) axck.instance;
            axcl.a |= 4;
            axcl.d = i;
            i = this.f;
            axck.copyOnWrite();
            axcl = (axcl) axck.instance;
            if (i != 0) {
                axcl.a |= 8;
                axcl.e = i - 1;
                i = this.g;
                axck.copyOnWrite();
                axcl = (axcl) axck.instance;
                if (i != 0) {
                    axcl.a |= 16;
                    axcl.f = i - 1;
                    axck.copyOnWrite();
                    axcl axcl3 = (axcl) axck.instance;
                    axcl3.a |= 64;
                    int i2 = 0;
                    axcl3.g = false;
                    fon fon = this.b;
                    aqyq aqyq = (aqyq) aqyr.d.createBuilder();
                    long j2 = fon.d;
                    aqyq.copyOnWrite();
                    aqyr aqyr = (aqyr) aqyq.instance;
                    aqyr.a |= 1;
                    aqyr.c = (int) j2;
                    while (i2 < fol.a.length) {
                        j2 = (long) fon.c[i2];
                        long j3 = fon.b[i2];
                        long j4 = 0;
                        if (j2 > 0) {
                            j4 = j3 / j2;
                        }
                        int i3 = (int) j4;
                        if (fon.a[i2] > 0 || i3 > 0) {
                            aqyo aqyo = (aqyo) aqyp.e.createBuilder();
                            int i4 = fol.b[i2];
                            aqyo.copyOnWrite();
                            aqyp aqyp = (aqyp) aqyo.instance;
                            aqyp.a |= 1;
                            aqyp.b = i4;
                            i4 = fon.a[i2];
                            aqyo.copyOnWrite();
                            aqyp = (aqyp) aqyo.instance;
                            aqyp.a |= 2;
                            aqyp.c = i4;
                            aqyo.copyOnWrite();
                            aqyp aqyp2 = (aqyp) aqyo.instance;
                            aqyp2.a |= 4;
                            aqyp2.d = i3;
                            aqyq.copyOnWrite();
                            aqyr aqyr2 = (aqyr) aqyq.instance;
                            if (!aqyr2.b.a()) {
                                aqyr2.b = anxl.mutableCopy(aqyr2.b);
                            }
                            aqyr2.b.add((aqyp) ((anxl) aqyo.build()));
                        }
                        i2++;
                    }
                    aqyr aqyr3 = (aqyr) ((anxl) aqyq.build());
                    axck.copyOnWrite();
                    axcl = (axcl) axck.instance;
                    if (aqyr3 != null) {
                        axcl.h = aqyr3;
                        axcl.a |= 256;
                        axcl axcl4 = (axcl) ((anxl) axck.build());
                        asmz asmz = (asmz) asmw.f.createBuilder();
                        asmz.copyOnWrite();
                        asmw asmw = (asmw) asmz.instance;
                        if (axcl4 != null) {
                            asmw.c = axcl4;
                            asmw.b = 125;
                            this.e.l.a((asmw) ((anxl) asmz.build()), this.d);
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
        throw new NullPointerException();
    }

    fok(fol fol, String str, fon fon, int i, int i2, int i3, long j) {
        this.e = fol;
        this.a = str;
        this.b = fon;
        this.c = i;
        this.f = i2;
        this.g = i3;
        this.d = j;
    }
}
