package defpackage;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: rai */
public final class rai implements rbi {
    private final SecretKeySpec a;
    private final int b;
    private final int c;

    public rai(byte[] bArr, int i) {
        rbq.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) ray.a.a("AES/CTR/NoPadding")).getBlockSize();
        this.c = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = i;
    }

    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr2 = new byte[(i + length)];
            byte[] a = rbj.a(i);
            System.arraycopy(a, 0, bArr2, 0, this.b);
            int i3 = this.b;
            Cipher cipher = (Cipher) ray.a.a("AES/CTR/NoPadding");
            byte[] bArr3 = new byte[this.c];
            System.arraycopy(a, 0, bArr3, 0, this.b);
            cipher.init(1, this.a, new IvParameterSpec(bArr3));
            if (cipher.doFinal(bArr, 0, length, bArr2, i3) == length) {
                return bArr2;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("plaintext length can not exceed ");
        stringBuilder.append(i2);
        throw new GeneralSecurityException(stringBuilder.toString());
    }
}
