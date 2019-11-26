package defpackage;

import java.security.cert.X509Certificate;

/* renamed from: rkm */
final class rkm extends rkl {
    private final byte[] a;

    public rkm(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.a = bArr;
    }

    public final byte[] getEncoded() {
        return this.a;
    }
}
