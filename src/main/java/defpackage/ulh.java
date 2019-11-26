package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: ulh */
public final class ulh {
    public final DataInputStream a;
    public long b;
    private final long c;
    private ulh d;
    private ulh e;
    private boolean f;

    public ulh(InputStream inputStream, long j) {
        this(new DataInputStream(inputStream), j, null);
    }

    private ulh(DataInputStream dataInputStream, long j, ulh ulh) {
        this.b = 0;
        this.d = null;
        this.e = null;
        boolean z = false;
        this.f = false;
        if (j >= 0) {
            z = true;
        }
        amqw.a(z);
        this.a = dataInputStream;
        this.c = j;
        this.d = ulh;
    }

    public final ulh a(long j) {
        boolean z = true;
        amqw.b(this.f ^ 1);
        amqw.b(this.e == null);
        if (j < 0) {
            z = false;
        }
        amqw.a(z);
        if (j <= g()) {
            this.e = new ulh(this.a, j, this);
            return this.e;
        }
        throw new ult("Cannot create a reader with a readLimit that exceeds its parent.");
    }

    public final void a(ulh ulh) {
        amqw.a((Object) ulh);
        boolean z = false;
        amqw.a(this.e == ulh);
        if (ulh.d == this) {
            z = true;
        }
        amqw.a(z);
        amqw.b(ulh.f ^ 1);
        this.b += this.e.b;
        ulh.d = null;
        ulh.f = true;
        this.e = null;
    }

    public final short a() {
        d(2);
        short readShort = this.a.readShort();
        c(2);
        return readShort;
    }

    public final long b() {
        return ((long) c()) & 4294967295L;
    }

    public final int c() {
        d(4);
        int readInt = this.a.readInt();
        c(4);
        return readInt;
    }

    public final long d() {
        d(8);
        long readLong = this.a.readLong();
        if (readLong >= 0) {
            c(8);
            return readLong;
        }
        throw new ult("Uint64 values larger than int64 are not supported.");
    }

    public final String e() {
        d(4);
        byte[] bArr = new byte[4];
        long read = (long) this.a.read(bArr);
        c(read);
        if (read == 4) {
            return new String(bArr, 0, 4, ampv.b);
        }
        throw new ult("Did not consumed the expected number of bytes");
    }

    public final byte[] a(int i) {
        long j = (long) i;
        d(j);
        byte[] bArr = new byte[i];
        anaz.a(this.a, bArr);
        c(j);
        return bArr;
    }

    public final void b(long j) {
        d(j);
        anaz.b(this.a, j);
        c(j);
    }

    public final long f() {
        amqw.b(this.e == null);
        amqw.b(this.f ^ 1);
        long j = this.b;
        for (ulh ulh = this.d; ulh != null; ulh = ulh.d) {
            j += ulh.b;
        }
        return j;
    }

    public final long g() {
        return this.c - this.b;
    }

    public final void c(long j) {
        this.b += j;
    }

    public final void d(long j) {
        amqw.b(this.e == null);
        amqw.b(this.f ^ 1);
        if (j > g()) {
            throw new ult("Attempt to read past the end of the box.");
        }
    }
}
