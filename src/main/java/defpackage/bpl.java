package defpackage;

import java.util.Arrays;

/* renamed from: bpl */
final class bpl {
    public int a;
    public long[] b;

    private bpl() {
        this.a = 0;
        this.b = new long[4];
    }

    public final void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    /* synthetic */ bpl(byte b) {
        this.a = 0;
        this.b = new long[4];
    }
}
