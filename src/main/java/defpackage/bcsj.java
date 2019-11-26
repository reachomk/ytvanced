package defpackage;

/* renamed from: bcsj */
final class bcsj extends bcsn {
    protected bcsj(bcpm bcpm, int i) {
        super(bcpm, i, false, i);
    }

    public final int a(bcsu bcsu, String str, int i) {
        int a = super.a(bcsu, str, i);
        if (a >= 0) {
            int i2 = this.b + i;
            if (a != i2) {
                if (this.c) {
                    char charAt = str.charAt(i);
                    if (charAt == '-' || charAt == '+') {
                        i2++;
                    }
                }
                if (a > i2) {
                    return (i2 + 1) ^ -1;
                }
                if (a < i2) {
                    a ^= -1;
                }
            }
        }
        return a;
    }
}
