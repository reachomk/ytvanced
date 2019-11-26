package defpackage;

import java.util.Arrays;

/* renamed from: aepc */
public final class aepc {
    public static final aepb a = aepb.a(-1, -1);
    public final byte[] b;
    public final String c;
    public final int d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final String j;
    public aepb k;

    public aepc(byte[] bArr, String str, String str2) {
        this(bArr, str, 0, 0, -1, false, false, str2, 0, a);
    }

    public aepc(byte[] bArr, String str, int i, long j, long j2, boolean z, boolean z2, String str2, long j3, aepb aepb) {
        this.b = (byte[]) amqw.a((Object) bArr);
        this.c = (String) amqw.a((Object) str);
        this.d = i;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = z2;
        this.j = str2;
        this.i = j3;
        this.k = (aepb) amqw.a((Object) aepb);
        if (aepb != a && ((long) bArr.length) != aepb.b() - aepb.a()) {
            afpc.a(1, afpf.onesie, "data_byte_range_mismatch");
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof aepc)) {
                return false;
            }
            aepc aepc = (aepc) obj;
            if (!(this.c.equals(aepc.c) && this.d == aepc.d && this.e == aepc.e && this.f == aepc.f && this.g == aepc.g && this.h == aepc.h && this.k.a() == aepc.k.a() && this.k.b() == aepc.k.b() && Arrays.equals(this.b, aepc.b))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
}
