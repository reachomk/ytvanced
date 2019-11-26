package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: xsf */
public final class xsf {
    private final bapu a;

    public xsf(bapu bapu) {
        this.a = bapu;
    }

    private final Key a() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(128, (SecureRandom) this.a.get());
            return instance.generateKey();
        } catch (NoSuchAlgorithmException e) {
            xtl.a("AES not recognized as a supported algorithm", e);
            return null;
        }
    }

    public final Key a(SharedPreferences sharedPreferences) {
        String str = "downloads_encryption_key";
        if (!sharedPreferences.contains(str)) {
            sharedPreferences.edit().putString(str, Base64.encodeToString(a().getEncoded(), 0)).apply();
        }
        return new SecretKeySpec(Base64.decode(sharedPreferences.getString(str, null), 0), "AES");
    }

    public static IvParameterSpec a(String str) {
        MessageDigest instance;
        try {
            instance = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            xtl.a("MD5 not recognized as a supported algorithm", e);
            instance = null;
        }
        return new IvParameterSpec(instance.digest(str.getBytes()));
    }

    private static void a(byte[] bArr, int i, int i2, Key key, IvParameterSpec ivParameterSpec, int i3, long j) {
        long j2 = j / 16;
        int i4 = (int) (j % 16);
        byte[] bArr2 = new byte[(i4 + i2)];
        for (int i5 = 0; i5 < i2; i5++) {
            bArr2[i4 + i5] = bArr[i + i5];
        }
        Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
        ByteBuffer wrap = ByteBuffer.wrap(ivParameterSpec.getIV());
        wrap.order(ByteOrder.BIG_ENDIAN);
        wrap.putLong(8, wrap.getLong(8) + j2);
        instance.init(i3, key, new IvParameterSpec(wrap.array()));
        byte[] doFinal = instance.doFinal(bArr2);
        for (int i6 = 0; i6 < i2; i6++) {
            bArr[i + i6] = doFinal[i4 + i6];
        }
    }

    public static void a(byte[] bArr, int i, int i2, Key key, IvParameterSpec ivParameterSpec, long j) {
        xsf.a(bArr, i, i2, key, ivParameterSpec, 2, j);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, Key key) {
        bArr2 = (byte[]) bArr2.clone();
        try {
            xsf.a(bArr2, 0, bArr2.length, key, new IvParameterSpec(bArr), 1, 0);
            return bArr2;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new RuntimeException("Unable to encrypt Disco key.", e);
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, Key key) {
        bArr2 = (byte[]) bArr2.clone();
        try {
            xsf.a(bArr2, 0, bArr2.length, key, new IvParameterSpec(bArr), 0);
            return bArr2;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            throw new RuntimeException("Unable to decrypt Disco key.", e);
        }
    }
}
