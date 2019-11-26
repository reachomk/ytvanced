package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cjr */
public final class cjr extends bakp {
    public long[] a = new long[0];
    private long b;
    private int c;

    public cjr() {
        super("stsz");
    }

    public final long a(int i) {
        long j = this.b;
        return j <= 0 ? this.a[i] : j;
    }

    public final long a() {
        int i;
        if (this.b > 0) {
            i = this.c;
        } else {
            i = this.a.length;
        }
        return (long) i;
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) ((this.b == 0 ? this.a.length << 2 : 0) + 12);
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        this.b = cio.a(byteBuffer);
        int a = bana.a(cio.a(byteBuffer));
        this.c = a;
        if (this.b == 0) {
            this.a = new long[a];
            for (a = 0; a < this.c; a++) {
                this.a[a] = cio.a(byteBuffer);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, this.b);
        if (this.b == 0) {
            cin.a(byteBuffer, (long) this.a.length);
            for (long a : this.a) {
                cin.a(byteBuffer, a);
            }
            return;
        }
        cin.a(byteBuffer, (long) this.c);
    }

    public final String toString() {
        long j = this.b;
        long a = a();
        StringBuilder stringBuilder = new StringBuilder(79);
        stringBuilder.append("SampleSizeBox[sampleSize=");
        stringBuilder.append(j);
        stringBuilder.append(";sampleCount=");
        stringBuilder.append(a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
