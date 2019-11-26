package defpackage;

/* renamed from: ulo */
public final class ulo {
    public final long a;
    public final String b;
    public final byte[] c;
    public final long d;
    public final long e;
    public final boolean f;

    private ulo(long j, String str, byte[] bArr, long j2, long j3, boolean z) {
        this.a = j;
        this.b = str;
        this.c = bArr;
        this.d = j2;
        this.e = j3;
        this.f = z;
    }

    public static ulo a(ulh ulh) {
        boolean z;
        long f = ulh.f();
        long j = ulh.b;
        long b = ulh.b();
        String e = ulh.e();
        if (b == 1) {
            b = ulh.d();
            z = true;
        } else {
            z = false;
        }
        return new ulo(b, e, e.equals("uuid") ? ulh.a(16) : null, f, ulh.b - j, z);
    }
}
