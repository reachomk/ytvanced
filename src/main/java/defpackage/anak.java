package defpackage;

/* renamed from: anak */
public abstract class anak {
    private static final char[] a = "0123456789abcdef".toCharArray();

    anak() {
    }

    public abstract int a();

    public abstract boolean a(anak anak);

    public abstract byte[] b();

    public abstract int c();

    /* Access modifiers changed, original: 0000 */
    public byte[] d() {
        throw null;
    }

    static anak a(byte[] bArr) {
        return new anaj(bArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anak) {
            anak anak = (anak) obj;
            if (a() == anak.a() && a(anak)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (a() >= 32) {
            return c();
        }
        byte[] d = d();
        int i = d[0] & 255;
        for (int i2 = 1; i2 < d.length; i2++) {
            i |= (d[i2] & 255) << (i2 << 3);
        }
        return i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(r2 + r2);
        for (byte b : d()) {
            stringBuilder.append(a[(b >> 4) & 15]);
            stringBuilder.append(a[b & 15]);
        }
        return stringBuilder.toString();
    }
}
