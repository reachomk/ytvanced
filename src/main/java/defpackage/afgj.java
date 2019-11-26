package defpackage;

/* renamed from: afgj */
public final class afgj extends afgh {
    private final long a;
    private final long b;

    afgj(int i, int i2, int i3, aeqo aeqo) {
        super(i3, aeqo);
        if (i == -1 && i2 == -1) {
            this.a = 11000000;
            this.b = 10000000;
            return;
        }
        if (i == -1) {
            this.a = Long.MAX_VALUE;
        } else if (i >= 0) {
            this.a = ((long) i) * 1000;
        } else {
            this.a = 11000000;
        }
        if (i2 == -1) {
            this.b = Long.MAX_VALUE;
        } else if (i2 >= 0) {
            this.b = ((long) i2) * 1000;
        } else {
            this.b = 10000000;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(long j, long j2, long j3, long j4) {
        return j + j3 <= this.a && j2 + j4 <= this.b;
    }
}
