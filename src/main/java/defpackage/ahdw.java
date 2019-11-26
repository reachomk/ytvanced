package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: ahdw */
public final class ahdw implements ahdy {
    private final MessageDigest a;

    public ahdw() {
        try {
            this.a = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void a(byte[] bArr, int i) {
        this.a.update(bArr, 0, i);
    }

    public final byte[] a() {
        return this.a.digest();
    }
}
