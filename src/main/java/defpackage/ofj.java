package defpackage;

import java.util.Arrays;

/* renamed from: ofj */
public final class ofj implements ofu {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public ofj(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            length--;
            this.f = jArr2[length] + jArr3[length];
            return;
        }
        this.f = 0;
    }

    public final boolean aS_() {
        return true;
    }

    public final int b(long j) {
        return ozp.a(this.e, j, true);
    }

    public final long b() {
        return this.f;
    }

    public final ofx a(long j) {
        int b = b(j);
        ofz ofz = new ofz(this.e[b], this.c[b]);
        if (ofz.b >= j || b == this.a - 1) {
            return new ofx(ofz);
        }
        b++;
        return new ofx(ofz, new ofz(this.e[b], this.c[b]));
    }

    public final String toString() {
        int i = this.a;
        String arrays = Arrays.toString(this.b);
        String arrays2 = Arrays.toString(this.c);
        String arrays3 = Arrays.toString(this.e);
        String arrays4 = Arrays.toString(this.d);
        int length = String.valueOf(arrays).length();
        int length2 = String.valueOf(arrays2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 71) + length2) + String.valueOf(arrays3).length()) + String.valueOf(arrays4).length());
        stringBuilder.append("ChunkIndex(length=");
        stringBuilder.append(i);
        stringBuilder.append(", sizes=");
        stringBuilder.append(arrays);
        stringBuilder.append(", offsets=");
        stringBuilder.append(arrays2);
        stringBuilder.append(", timeUs=");
        stringBuilder.append(arrays3);
        stringBuilder.append(", durationsUs=");
        stringBuilder.append(arrays4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
