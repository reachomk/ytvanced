package defpackage;

/* renamed from: oaw */
public final class oaw {
    public Object a;
    public int b;
    public long c;
    public long d;
    public oqa e = oqa.a;

    public final oaw a(Object obj, long j, long j2) {
        oqa oqa = oqa.a;
        this.a = obj;
        this.b = 0;
        this.c = j;
        this.d = j2;
        this.e = oqa;
        return this;
    }

    public final long a() {
        return nyr.a(this.d);
    }

    public final long a(int i) {
        return this.e.c[i];
    }

    public final int b(int i) {
        return this.e.d[i].a();
    }

    public final int a(long j) {
        oqa oqa = this.e;
        int length = oqa.c.length - 1;
        while (length >= 0 && j != Long.MIN_VALUE) {
            long j2 = oqa.c[length];
            if (j2 != Long.MIN_VALUE) {
                if (j >= j2) {
                    break;
                }
            } else {
                long j3 = oqa.f;
                if (j3 != -9223372036854775807L && j >= j3) {
                    break;
                }
            }
            length--;
        }
        if (length < 0) {
            length = -1;
        } else if (oqa.d[length].b()) {
            return length;
        } else {
            return -1;
        }
        return length;
    }

    public final int b(long j) {
        oqa oqa = this.e;
        long j2 = this.c;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        int i = 0;
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        while (true) {
            long[] jArr = oqa.c;
            if (i >= jArr.length) {
                break;
            }
            long j3 = jArr[i];
            if (j3 == Long.MIN_VALUE || (j < j3 && oqa.d[i].b())) {
                break;
            }
            i++;
        }
        if (i < oqa.c.length) {
            return i;
        }
        return -1;
    }

    public final boolean a(int i, int i2) {
        oqd oqd = this.e.d[i];
        return (oqd.a == -1 || oqd.b[i2] == 0) ? false : true;
    }

    public final long b(int i, int i2) {
        oqd oqd = this.e.d[i];
        return oqd.a != -1 ? oqd.c[i2] : -9223372036854775807L;
    }
}
