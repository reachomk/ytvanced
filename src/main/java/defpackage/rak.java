package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: rak */
public final class rak implements quq {
    private final SecretKey a;

    public rak(byte[] bArr) {
        rbq.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            AlgorithmParameterSpec gCMParameterSpec;
            byte[] bArr3 = new byte[(length + 28)];
            byte[] a = rbj.a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            Cipher cipher = (Cipher) ray.a.a("AES/GCM/NoPadding");
            int length2 = a.length;
            try {
                Class.forName("javax.crypto.spec.GCMParameterSpec");
                gCMParameterSpec = new GCMParameterSpec(128, a, 0, length2);
            } catch (ClassNotFoundException unused) {
                if (rbn.a()) {
                    gCMParameterSpec = new IvParameterSpec(a, 0, length2);
                } else {
                    throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
                }
            }
            cipher.init(1, this.a, gCMParameterSpec);
            if (!(bArr2 == null || bArr2.length == 0)) {
                cipher.updateAAD(bArr2);
            }
            int length3 = bArr.length;
            if (cipher.doFinal(bArr, 0, length3, bArr3, 12) == length3 + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{Integer.valueOf(16), Integer.valueOf(cipher.doFinal(bArr, 0, length3, bArr3, 12) - length3)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
