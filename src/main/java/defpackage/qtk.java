package defpackage;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: qtk */
public final class qtk {
    private static Cipher a;
    private static final Object b = new Object();
    private static final Object c = new Object();

    public static String a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 16) {
            try {
                byte[] iv;
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (b) {
                    qtk.a().init(1, secretKeySpec, null);
                    bArr2 = qtk.a().doFinal(bArr2);
                    iv = qtk.a().getIV();
                }
                int length = bArr2.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(bArr2);
                allocate.flip();
                bArr = new byte[length];
                allocate.get(bArr);
                return qri.a(bArr, false);
            } catch (NoSuchAlgorithmException e) {
                throw new qtj(e);
            } catch (InvalidKeyException e2) {
                throw new qtj(e2);
            } catch (IllegalBlockSizeException e3) {
                throw new qtj(e3);
            } catch (NoSuchPaddingException e4) {
                throw new qtj(e4);
            } catch (BadPaddingException e5) {
                throw new qtj(e5);
            }
        }
        throw new qtj();
    }

    public static byte[] a(byte[] bArr, String str) {
        if (bArr.length == 16) {
            try {
                byte[] a = qri.a(str, false);
                int length = a.length;
                if (length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(length);
                    allocate.put(a);
                    allocate.flip();
                    a = new byte[16];
                    byte[] bArr2 = new byte[(length - 16)];
                    allocate.get(a);
                    allocate.get(bArr2);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (b) {
                        qtk.a().init(2, secretKeySpec, new IvParameterSpec(a));
                        a = qtk.a().doFinal(bArr2);
                    }
                    return a;
                }
                throw new qtj();
            } catch (NoSuchAlgorithmException e) {
                throw new qtj(e);
            } catch (InvalidKeyException e2) {
                throw new qtj(e2);
            } catch (IllegalBlockSizeException e3) {
                throw new qtj(e3);
            } catch (NoSuchPaddingException e4) {
                throw new qtj(e4);
            } catch (BadPaddingException e5) {
                throw new qtj(e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new qtj(e6);
            } catch (IllegalArgumentException e7) {
                throw new qtj(e7);
            }
        }
        throw new qtj();
    }

    private static Cipher a() {
        Cipher cipher;
        synchronized (c) {
            if (a == null) {
                a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = a;
        }
        return cipher;
    }
}
