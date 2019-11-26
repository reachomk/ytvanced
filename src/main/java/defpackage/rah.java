package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: rah */
public final class rah implements quq {
    private final byte[] a;
    private final byte[] b;
    private final SecretKeySpec c;
    private final int d;

    public rah(byte[] bArr, int i) {
        if (i == 12 || i == 16) {
            this.d = i;
            rbq.a(bArr.length);
            this.c = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.c);
            this.a = rah.a(instance.doFinal(new byte[16]));
            this.b = rah.a(this.a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    private static byte[] a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            byte b = bArr[i2];
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((b + b) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        byte b2 = bArr[15];
        i2 = b2 + b2;
        if ((bArr[0] & 128) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i2 ^ i);
        return bArr2;
    }

    private final byte[] a(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(rah.b(bArr2, this.a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        byte[] bArr3 = doFinal;
        i = 0;
        while (i3 - i > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArr3[i5] = (byte) (bArr3[i5] ^ bArr[(i2 + i) + i5]);
            }
            bArr3 = cipher.doFinal(bArr3);
            i += 16;
        }
        doFinal = Arrays.copyOfRange(bArr, i + i2, i2 + i3);
        if (doFinal.length == 16) {
            doFinal = rah.b(doFinal, this.a);
        } else {
            bArr = Arrays.copyOf(this.b, 16);
            while (true) {
                i2 = doFinal.length;
                if (i4 >= i2) {
                    break;
                }
                bArr[i4] = (byte) (bArr[i4] ^ doFinal[i4]);
                i4++;
            }
            bArr[i2] = (byte) (bArr[i2] ^ 128);
            doFinal = bArr;
        }
        return cipher.doFinal(rah.b(bArr3, doFinal));
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.d;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[((i + length) + 16)];
            byte[] a = rbj.a(i);
            int i2 = 0;
            System.arraycopy(a, 0, bArr3, 0, this.d);
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.c);
            byte[] a2 = a(instance, 0, a, 0, a.length);
            a = bArr2 == null ? new byte[0] : bArr2;
            byte[] a3 = a(instance, 1, a, 0, a.length);
            Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
            instance2.init(1, this.c, new IvParameterSpec(a2));
            instance2.doFinal(bArr, 0, length, bArr3, this.d);
            byte[] a4 = a(instance, 2, bArr3, this.d, length);
            length += this.d;
            while (i2 < 16) {
                bArr3[length + i2] = (byte) ((a3[i2] ^ a2[i2]) ^ a4[i2]);
                i2++;
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
