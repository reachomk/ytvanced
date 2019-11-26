package defpackage;

/* renamed from: aenw */
final class aenw implements aeob {
    private xto a;
    private final long b;

    aenw() {
        this(0);
    }

    public final synchronized void b() {
    }

    aenw(long j) {
        this.a = new aenv("fastByteArrayOutputStream");
        this.b = j;
    }

    public final long a() {
        return this.b;
    }

    public final synchronized void a(byte[] bArr, int i, int i2, aepb aepb) {
        ((aeny) this.a.get()).write(bArr, i, i2);
    }

    public final synchronized int a(long j, int i, byte[] bArr, int i2) {
        if (j > 2147483647L) {
            afpc.a(2, afpf.onesie, "position_greater_than_int_max_value");
            return 0;
        } else if (j > ((long) ((aeny) this.a.get()).size())) {
            afpc.a(2, afpf.onesie, "position_greater_than_size");
            return 0;
        } else {
            i = Math.min((int) (((long) ((aeny) this.a.get()).size()) - j), i);
            ((aeny) this.a.get()).a((int) j, i, bArr, i2);
            return i;
        }
    }

    public final synchronized boolean a(long j) {
        return ((long) ((aeny) this.a.get()).size()) > j;
    }
}
