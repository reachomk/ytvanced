package defpackage;

/* renamed from: ofa */
public class ofa {
    public final ofd a;
    private final ofg b;
    private off c;
    private final int d;

    protected ofa(ofe ofe, ofg ofg, long j, long j2, long j3, int i) {
        this.b = ofg;
        this.d = i;
        this.a = new ofd(ofe, j, j2, j3);
    }

    public final void a(long j) {
        off off = this.c;
        if (off == null || off.a != j) {
            long a = this.a.a.a(j);
            ofd ofd = this.a;
            this.c = new off(j, a, ofd.b, ofd.c, ofd.d);
        }
    }

    public final boolean a() {
        return this.c != null;
    }

    public final int a(ofp ofp, ofv ofv) {
        ofg ofg = (ofg) oxz.a(this.b);
        while (true) {
            off off = (off) oxz.a(this.c);
            long j = off.e;
            long j2 = off.f;
            long j3 = off.g;
            if (j2 - j <= ((long) this.d)) {
                b();
                return ofa.a(ofp, j, ofv);
            } else if (!ofa.a(ofp, j3)) {
                return ofa.a(ofp, j3, ofv);
            } else {
                ofp.a();
                ofh a = ofg.a(ofp, off.b);
                int i = a.b;
                long j4;
                long j5;
                if (i == -3) {
                    b();
                    return ofa.a(ofp, j3, ofv);
                } else if (i == -2) {
                    j4 = a.c;
                    j5 = a.d;
                    off.c = j4;
                    off.e = j5;
                    off.a();
                } else if (i == -1) {
                    j4 = a.c;
                    j5 = a.d;
                    off.d = j4;
                    off.f = j5;
                    off.a();
                } else if (i == 0) {
                    long j6 = a.d;
                    b();
                    ofa.a(ofp, a.d);
                    return ofa.a(ofp, a.d, ofv);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    private final void b() {
        this.c = null;
        this.b.a();
    }

    private static boolean a(ofp ofp, long j) {
        j -= ((ofl) ofp).c;
        if (j < 0 || j > 262144) {
            return false;
        }
        ofp.a((int) j);
        return true;
    }

    private static int a(ofp ofp, long j, ofv ofv) {
        if (j == ((ofl) ofp).c) {
            return 0;
        }
        ofv.a = j;
        return 1;
    }
}
