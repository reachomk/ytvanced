package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: azze */
public final class azze implements azyl {
    private final byte[] a;
    private int b;
    private int c;

    public azze(String str) {
        try {
            this.a = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public final synchronized void close() {
    }

    public final synchronized long e() {
        return Long.MAX_VALUE;
    }

    public final synchronized int a(byte[] bArr, int i, int i2) {
        int i3 = 0;
        amqw.a(bArr.length - i >= i2, (Object) "Buffer length too small.");
        if (i2 == 0) {
            return 0;
        }
        int i4 = this.b;
        int length = this.a.length;
        if (i4 == length) {
            return 0;
        }
        i2 = Math.min(i2, length - i4);
        while (i3 < i2) {
            byte[] bArr2 = this.a;
            length = this.b;
            bArr[i + i3] = bArr2[length];
            this.b = length + 1;
            i3++;
        }
        return i2;
    }

    public final synchronized void b() {
        this.c = this.b;
    }

    public final synchronized long c() {
        return (long) this.c;
    }

    public final synchronized long d() {
        return (long) this.b;
    }

    public final synchronized void f() {
        this.b = this.c;
    }

    public final synchronized long a(long j) {
        j = Math.min(j, (long) (this.a.length - this.b));
        this.b = (int) (((long) this.b) + j);
        return j;
    }

    public final synchronized long a() {
        return (long) this.a.length;
    }

    public final synchronized boolean g() {
        return this.b < this.a.length;
    }
}
