package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: ahds */
final class ahds implements ahdr {
    private final MessageDigest a;
    private final boolean b;
    private int c;

    ahds(boolean z) {
        try {
            this.a = MessageDigest.getInstance("SHA-256");
            a();
            this.b = z;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void a() {
        this.a.reset();
        this.c = 0;
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.c == 0 && i2 > 0) {
            this.a.update(ahdp.a);
            this.c += ahdp.a.length;
        }
        this.a.update(bArr, i, i2);
        this.c += i2;
    }

    public final int b() {
        int i = this.c;
        return i > 0 ? i - ahdp.a.length : 0;
    }

    public final byte[] c() {
        return this.b ? ahdp.b(this.a.digest()) : this.a.digest();
    }
}
