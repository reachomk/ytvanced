package defpackage;

/* renamed from: amb */
public final class amb {
    private long a = 0;
    private amb b;

    amb() {
    }

    public final void a(int i) {
        if (i < 64) {
            this.a |= 1 << i;
            return;
        }
        b();
        this.b.a(i - 64);
    }

    private final void b() {
        if (this.b == null) {
            this.b = new amb();
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        if (i < 64) {
            this.a &= (1 << i) ^ -1;
            return;
        }
        amb amb = this.b;
        if (amb != null) {
            amb.b(i - 64);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean c(int i) {
        if (i < 64) {
            return (this.a & (1 << i)) != 0;
        } else {
            b();
            return this.b.c(i - 64);
        }
    }

    public final void a() {
        this.a = 0;
        amb amb = this.b;
        if (amb != null) {
            amb.a();
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, boolean z) {
        if (i < 64) {
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            long j3 = (-1 ^ j2) & j;
            this.a = (j & j2) | (j3 + j3);
            if (z) {
                a(i);
            } else {
                b(i);
            }
            if (z2 || this.b != null) {
                b();
                this.b.a(0, z2);
            }
            return;
        }
        b();
        this.b.a(i - 64, z);
    }

    /* Access modifiers changed, original: final */
    public final boolean d(int i) {
        if (i < 64) {
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            j2 &= j ^ -1;
            this.a = j2;
            j--;
            this.a = Long.rotateRight((j ^ -1) & j2, 1) | (j2 & j);
            amb amb = this.b;
            if (amb != null) {
                if (amb.c(0)) {
                    a(63);
                }
                this.b.d(0);
            }
            return z;
        }
        b();
        return this.b.d(i - 64);
    }

    /* Access modifiers changed, original: final */
    public final int e(int i) {
        amb amb = this.b;
        if (amb == null) {
            if (i >= 64) {
                return Long.bitCount(this.a);
            }
            return Long.bitCount(this.a & ((1 << i) - 1));
        } else if (i >= 64) {
            return amb.e(i - 64) + Long.bitCount(this.a);
        } else {
            return Long.bitCount(this.a & ((1 << i) - 1));
        }
    }

    public final String toString() {
        if (this.b == null) {
            return Long.toBinaryString(this.a);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.toString());
        stringBuilder.append("xx");
        stringBuilder.append(Long.toBinaryString(this.a));
        return stringBuilder.toString();
    }
}
