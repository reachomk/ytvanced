package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: xvy */
final class xvy {
    public static MessageDigest a;

    private xvy() {
    }

    static {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            a = instance;
            instance.reset();
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException("Fatal error: system missing SHA-256 implementation.");
        }
    }
}
