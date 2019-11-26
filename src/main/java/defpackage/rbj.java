package defpackage;

import java.security.SecureRandom;

/* renamed from: rbj */
public final class rbj {
    private static final ThreadLocal a = new rbm();

    public static byte[] a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }
}
