package defpackage;

import java.math.BigInteger;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: azxx */
public final class azxx {
    public final Cipher a;
    public final SecretKeySpec b;
    private final byte[] c;

    public azxx(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException("Symmetric key must not be null and is 16-byte.");
        } else if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("iv must not be null and is 16-byte.");
        } else {
            this.c = Arrays.copyOf(bArr2, 16);
            Arrays.copyOf(bArr, 16);
            this.b = new SecretKeySpec(bArr, "AES");
            this.a = Cipher.getInstance("AES/CTR/NoPadding");
        }
    }

    public final byte[] a(long j) {
        byte[] bArr = new byte[17];
        bArr[0] = (byte) 1;
        System.arraycopy(this.c, 0, bArr, 1, 16);
        byte[] toByteArray = new BigInteger(1, bArr).add(BigInteger.valueOf(j / ((long) a()))).toByteArray();
        int length = toByteArray.length;
        return Arrays.copyOfRange(toByteArray, length - 16, length);
    }

    public final int a() {
        return this.a.getBlockSize();
    }
}
