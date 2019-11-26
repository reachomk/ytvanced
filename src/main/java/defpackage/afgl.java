package defpackage;

/* renamed from: afgl */
public final class afgl extends afgh {
    private final long a;
    private final long b;

    afgl(int i, int i2, int i3, aeqo aeqo) {
        super(i3, aeqo);
        this.a = ((long) i) * 1000;
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
        j -= this.a;
        return Math.abs(j3 + j) < Math.abs(j) && j2 + j4 <= this.b;
    }
}
