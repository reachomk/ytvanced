package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;

/* renamed from: afpa */
public final class afpa {
    private static final byte[] a = new byte[]{(byte) 83, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private final Cipher b = Cipher.getInstance("AES/CTR/NoPadding");
    private final byte[] c;
    private final Key d;
    private final Key e;
    private final int f;

    public afpa(byte[] bArr) {
        boolean z = true;
        amqw.a(true);
        this.f = 4;
        int length = bArr.length;
        if (length <= 16) {
            z = false;
        }
        amqw.a(z, (Object) "projectKey must contain 16-byte key");
        int i = length - 16;
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        System.arraycopy(bArr, 16, bArr3, 0, i);
        this.d = new SecretKeySpec(bArr2, "AES");
        this.e = new SecretKeySpec(bArr3, "HmacSHA1");
        ByteBuffer allocate = ByteBuffer.allocate(length + 16);
        allocate.putLong(16);
        allocate.put(bArr2);
        allocate.putLong((long) i);
        allocate.put(bArr3);
        this.c = xsa.a(xvw.a(allocate.array()), 4);
    }

    /* Access modifiers changed, original: final */
    public final byte[] a(String str) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        amqw.b(length > 17, (Object) "Encrypted string is invalid.");
        if (decode[0] != (byte) 0) {
            throw new JSONException("Bad 'type' in encoded string.");
        } else if (Arrays.equals(xsa.a(decode, 1, 4), this.c)) {
            int i = length - this.f;
            byte[] a = xsa.a(decode, 0, i);
            if (Arrays.equals(xsa.a(decode, i, this.f), xsa.a(afoz.a(this.e, xsa.a(a, a)), this.f))) {
                byte[] a2 = xsa.a(xsa.a(decode, 5, 8));
                length = (length - 13) - this.f;
                decode = xsa.a(xsa.a(decode, 13, length));
                try {
                    synchronized (this.b) {
                        this.b.init(2, this.d, new IvParameterSpec(a2));
                        decode = xsa.a(this.b.doFinal(decode), length);
                    }
                    return decode;
                } catch (InvalidKeyException e) {
                    throw new RuntimeException("Fatal error: project encryption key invalid.", e);
                } catch (InvalidAlgorithmParameterException e2) {
                    throw new RuntimeException("Fatal error: initialization vector is the wrong size.", e2);
                } catch (IllegalBlockSizeException e3) {
                    throw new RuntimeException("Unexpected IllegalBlockSizeException.", e3);
                } catch (BadPaddingException unused) {
                    throw new JSONException("Bad input padding.");
                }
            }
            throw new JSONException("HMAC signature does not match.");
        } else {
            throw new JSONException("Project key signature does not match.");
        }
    }
}
