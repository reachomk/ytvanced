package defpackage;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* renamed from: afpb */
final class afpb {
    public static final Mac a;

    static {
        try {
            a = Mac.getInstance("HmacSHA1");
        } catch (NoSuchAlgorithmException unused) {
            throw new RuntimeException("Fatal error: system missing standard encryption algorithm.");
        }
    }
}
