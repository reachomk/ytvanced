package defpackage;

/* renamed from: afgh */
public abstract class afgh implements afgf {
    private final int a;
    private final aeqo b;

    public abstract boolean a(long j, long j2, long j3, long j4);

    public final int a(int i, ofj ofj) {
        ofj ofj2 = ofj;
        if (i < 0 || ofj2 == null) {
            return this.a;
        }
        long max = Math.max(this.b.a(), 1);
        int i2 = i;
        long j = 0;
        long j2 = j;
        while (i2 < ofj2.a) {
            long j3 = ofj2.d[i2];
            long j4 = (((long) ofj2.b[i2]) * 8000000) / max;
            if (!a(j, j2, j3, j4)) {
                break;
            }
            j += j3;
            j2 += j4;
            i2++;
        }
        return Math.max(i2 - i, 1);
    }

    /* synthetic */ afgh(int i, aeqo aeqo) {
        this.a = i;
        this.b = aeqo;
    }
}
