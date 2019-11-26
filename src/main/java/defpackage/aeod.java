package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: aeod */
public final class aeod implements aeof {
    private final Cipher a;

    public aeod(byte[] bArr) {
        try {
            this.a = Cipher.getInstance("AES/CTR/NoPadding");
            this.a.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(new byte[bArr.length]));
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new aeoi(e);
        }
    }

    public final byte[] a(byte[] bArr) {
        return this.a.update(bArr);
    }

    public final byte[] a() {
        try {
            return this.a.doFinal();
        } catch (BadPaddingException | IllegalBlockSizeException unused) {
            return null;
        }
    }
}
