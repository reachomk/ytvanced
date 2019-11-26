package defpackage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: azxw */
public final class azxw {
    private static final anam a = anao.a();
    private static final String[] b = new String[]{"GmsCore_OpenSSL", "AndroidOpenSSL", "SC", "BC"};
    private static final ECParameterSpec c;

    public static Map a(azxu azxu) {
        Map a = amvr.a();
        try {
            for (azxv azxv : azxu.a) {
                Object obj;
                byte[] bArr = new byte[4];
                byte[][] bArr2 = new byte[][]{azxv.c, azxv.d};
                anal a2 = a.a();
                for (int i = 0; i < 2; i++) {
                    byte[] array;
                    byte[] bArr3 = bArr2[i];
                    if (bArr3 != null) {
                        int length = bArr3.length;
                        if (length != 0) {
                            array = ByteBuffer.allocate(length + 4).putInt(length).put(bArr3).array();
                            a2.a(array);
                        }
                    }
                    array = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
                    a2.a(array);
                }
                System.arraycopy(a2.a().b(), 0, bArr, 0, 4);
                amqw.a(true, "array too small: %s < %s", 4, 4);
                Integer valueOf = Integer.valueOf(anhe.a(bArr[0], bArr[1], bArr[2], bArr[3]));
                if (azxv.b == 2) {
                    obj = (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, azxv.c), new BigInteger(1, azxv.d)), c));
                } else {
                    obj = null;
                }
                if (obj == null) {
                    a = null;
                    break;
                }
                List list = (List) a.put(valueOf, amul.a(obj));
                if (list != null) {
                    amuo j = amul.j();
                    j.b(list);
                    j.c(obj);
                    a.put(valueOf, j.a());
                }
            }
            return a;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static boolean a(Map map, byte[] bArr, byte[] bArr2) {
        int length;
        int a;
        Signature signature = null;
        for (String a2 : b) {
            signature = azxw.a("SHA256withECDSA", a2);
            if (signature != null) {
                break;
            }
        }
        if (signature != null) {
            a = anhe.a(bArr2[1], bArr2[2], bArr2[3], bArr2[4]);
            length = bArr2.length - 5;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr2, 5, bArr3, 0, length);
            Iterable iterable = (List) map.get(Integer.valueOf(a));
            if (iterable == null) {
                iterable = Collections.emptyList();
            }
            for (ECPublicKey initVerify : iterable) {
                try {
                    signature.initVerify(initVerify);
                    signature.update(bArr);
                    signature.update(bArr2[0]);
                    if (signature.verify(bArr3)) {
                        return true;
                    }
                } catch (InvalidKeyException | SignatureException unused) {
                }
            }
        }
        return false;
    }

    private static Signature a(String str, String str2) {
        try {
            return Signature.getInstance(str, str2);
        } catch (NoSuchAlgorithmException | NoSuchProviderException unused) {
            return null;
        }
    }

    static {
        BigInteger bigInteger = new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951");
        c = new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", 16)), new ECPoint(new BigInteger("6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", 16), new BigInteger("4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5", 16)), new BigInteger("115792089210356248762697446949407573529996955224135760342422259061068512044369"), 1);
    }
}
