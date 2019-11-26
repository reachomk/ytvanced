package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: bxp */
final class bxp implements cib {
    bxp() {
    }

    private static bxs b() {
        try {
            return new bxs(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ Object a() {
        return bxp.b();
    }
}
