package defpackage;

/* renamed from: bcte */
final class bcte {
    public final char a;
    public final int b;
    public final int c;
    public final int d;
    private final int e;
    private final boolean f;

    bcte(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c == 'u' || c == 'w' || c == 's') {
            this.a = c;
            this.b = i;
            this.e = i2;
            this.c = i3;
            this.f = z;
            this.d = i4;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(15);
        stringBuilder.append("Unknown mode: ");
        stringBuilder.append(c);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcte) {
            bcte bcte = (bcte) obj;
            return this.a == bcte.a && this.b == bcte.b && this.e == bcte.e && this.c == bcte.c && this.f == bcte.f && this.d == bcte.d;
        }
    }

    public final long a(bcpl bcpl, long j) {
        try {
            bcpl = d(bcpl, j);
            return bcpl;
        } catch (IllegalArgumentException e) {
            if (this.b == 2 && this.e == 29) {
                while (true) {
                    bcqk bcqk = (bcqk) bcpl;
                    if (bcqk.m.b(j)) {
                        return d(bcpl, j);
                    }
                    j = bcqk.m.a(j, 1);
                }
            } else {
                throw e;
            }
        }
    }

    public final long b(bcpl bcpl, long j) {
        try {
            bcpl = d(bcpl, j);
            return bcpl;
        } catch (IllegalArgumentException e) {
            if (this.b == 2 && this.e == 29) {
                while (true) {
                    bcqk bcqk = (bcqk) bcpl;
                    if (bcqk.m.b(j)) {
                        return d(bcpl, j);
                    }
                    j = bcqk.m.a(j, -1);
                }
            } else {
                throw e;
            }
        }
    }

    private final long d(bcpl bcpl, long j) {
        int i = this.e;
        if (i >= 0) {
            return ((bcqk) bcpl).j.b(j, i);
        }
        bcqk bcqk = (bcqk) bcpl;
        return bcqk.j.a(bcqk.l.a(bcqk.j.b(j, 1), 1), this.e);
    }

    public final long c(bcpl bcpl, long j) {
        bcqk bcqk = (bcqk) bcpl;
        int a = this.c - bcqk.i.a(j);
        if (a == 0) {
            return j;
        }
        if (this.f) {
            if (a < 0) {
                a += 7;
            }
        } else if (a > 0) {
            a -= 7;
        }
        return bcqk.i.a(j, a);
    }
}
