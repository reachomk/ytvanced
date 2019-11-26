package defpackage;

import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: afoz */
final class afoz {
    public final String a;
    public final byte[] b;
    private final afoy c;
    private final Key d;

    static byte[] a(Key key, byte[] bArr) {
        byte[] doFinal;
        synchronized (afpb.a) {
            try {
                afpb.a.init(key);
                doFinal = afpb.a.doFinal(bArr);
            } catch (InvalidKeyException e) {
                throw new RuntimeException("Fatal error: hmac key is invalid.", e);
            } catch (Throwable th) {
            }
        }
        return doFinal;
    }

    afoz(String str, byte[] bArr) {
        this.a = xvd.a(str);
        this.b = (byte[]) ((byte[]) amqw.a((Object) bArr)).clone();
        this.d = new SecretKeySpec(bArr, "HmacSHA1");
        this.c = new afoy(bArr);
    }

    /* Access modifiers changed, original: final */
    public final String a(byte[] bArr, int i) {
        bArr = afoz.a(this.d, bArr);
        if (i != 20) {
            bArr = xsa.a(bArr, 0, i);
        }
        r1 = new byte[3][];
        r1[0] = new byte[]{(byte) 0};
        r1[1] = (byte[]) this.c.get();
        r1[2] = bArr;
        return new String(Base64.encode(xsa.a(r1), 3));
    }
}
