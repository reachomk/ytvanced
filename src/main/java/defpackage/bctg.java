package defpackage;

import java.io.DataInput;

/* renamed from: bctg */
final class bctg {
    public final String a;
    public final int b;
    private final bcte c;

    static bctg a(DataInput dataInput) {
        return new bctg(new bcte((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) bctc.a(dataInput)), dataInput.readUTF(), (int) bctc.a(dataInput));
    }

    private bctg(bcte bcte, String str, int i) {
        this.c = bcte;
        this.a = str;
        this.b = i;
    }

    public final long a(long j, int i, int i2) {
        bcte bcte = this.c;
        char c = bcte.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = (long) i;
        j += j2;
        bcrf bcrf = bcrf.n;
        long a = bcte.a(bcrf, bcrf.h.a(bcrf.h.b(bcrf.l.b(j, bcte.b), 0), bcte.d));
        if (bcte.c != 0) {
            a = bcte.c(bcrf, a);
            if (a <= j) {
                a = bcte.c(bcrf, bcte.a(bcrf, bcrf.l.b(bcrf.m.a(a, 1), bcte.b)));
            }
        } else if (a <= j) {
            a = bcte.a(bcrf, bcrf.m.a(a, 1));
        }
        return a - j2;
    }

    public final long b(long j, int i, int i2) {
        bcte bcte = this.c;
        char c = bcte.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = (long) i;
        j += j2;
        bcrf bcrf = bcrf.n;
        long b = bcte.b(bcrf, bcrf.h.a(bcrf.h.b(bcrf.l.b(j, bcte.b), 0), bcte.d));
        if (bcte.c != 0) {
            b = bcte.c(bcrf, b);
            if (b >= j) {
                b = bcte.c(bcrf, bcte.b(bcrf, bcrf.l.b(bcrf.m.a(b, -1), bcte.b)));
            }
        } else if (b >= j) {
            b = bcte.b(bcrf, bcrf.m.a(b, -1));
        }
        return b - j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bctg) {
            bctg bctg = (bctg) obj;
            return this.b == bctg.b && this.a.equals(bctg.a) && this.c.equals(bctg.c);
        }
    }
}
