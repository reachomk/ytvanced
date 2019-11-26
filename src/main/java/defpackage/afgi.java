package defpackage;

/* renamed from: afgi */
public final class afgi extends afgh {
    private final long a;
    private final long b;

    afgi(int i, int i2, int i3, aeqo aeqo) {
        super(i3, aeqo);
        this.a = ((long) i) * 1000;
        if (i2 == -1) {
            this.b = Long.MAX_VALUE;
        } else if (i2 >= 0) {
            this.b = ((long) i2) * 1000;
        } else {
            this.b = 11000000;
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean a(long j, long j2, long j3, long j4) {
        j2 -= this.a;
        return Math.abs(j4 + j2) < Math.abs(j2) && j + j3 <= this.b;
    }
}
