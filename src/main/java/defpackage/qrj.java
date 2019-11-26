package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: qrj */
final class qrj implements Runnable {
    private qrj() {
    }

    public final void run() {
        try {
            qrk.a = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } finally {
            qrk.b.countDown();
        }
    }

    /* synthetic */ qrj(byte b) {
    }
}
