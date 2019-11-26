package defpackage;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: oxx */
public final class oxx {
    private final Cipher a;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private int e;

    public oxx(int i, byte[] bArr, long j, long j2) {
        try {
            this.a = Cipher.getInstance("AES/CTR/NoPadding");
            int blockSize = this.a.getBlockSize();
            this.b = blockSize;
            this.c = new byte[blockSize];
            this.d = new byte[blockSize];
            long j3 = (long) blockSize;
            long j4 = j2 / j3;
            blockSize = (int) (j2 % j3);
            Cipher cipher = this.a;
            byte[] bArr2 = bArr;
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, ozp.b(cipher.getAlgorithm(), "/")[0]);
            long j5 = j;
            IvParameterSpec ivParameterSpec = new IvParameterSpec(ByteBuffer.allocate(16).putLong(j).putLong(j4).array());
            int i2 = i;
            cipher.init(i, secretKeySpec, ivParameterSpec);
            if (blockSize != 0) {
                byte[] bArr3 = new byte[blockSize];
                a(bArr3, 0, blockSize, bArr3, 0);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    public final void a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i;
        while (true) {
            i = this.e;
            if (i > 0) {
                bArr2[i3] = (byte) (bArr[i4] ^ this.d[this.b - i]);
                i3++;
                i4++;
                this.e = i - 1;
                i2--;
                if (i2 == 0) {
                    return;
                }
            } else {
                int b = b(bArr, i4, i2, bArr2, i3);
                if (i2 != b) {
                    i2 -= b;
                    int i5 = 0;
                    boolean z = true;
                    oxz.b(i2 < this.b);
                    i3 += b;
                    int i6 = this.b - i2;
                    this.e = i6;
                    if (b(this.c, 0, i6, this.d, 0) != this.b) {
                        z = false;
                    }
                    oxz.b(z);
                    while (i5 < i2) {
                        b = i3 + 1;
                        bArr2[i3] = this.d[i5];
                        i5++;
                        i3 = b;
                    }
                }
                return;
            }
        }
    }

    private final int b(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        try {
            return this.a.update(bArr, i, i2, bArr2, i3);
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }
}
