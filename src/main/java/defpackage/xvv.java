package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: xvv */
final class xvv {
    public static MessageDigest a;

    private xvv() {
    }

    static {
        try {
            a = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException("Fatal error: system missing SHA1 implementation.");
        }
    }
}
