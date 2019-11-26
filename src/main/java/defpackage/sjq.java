package defpackage;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Formatter;

/* renamed from: sjq */
public final class sjq {
    public static boolean a(Activity activity, sgz sgz) {
        sjp sjp = new sjp(activity.getApplicationContext());
        try {
            sga.a();
            return false;
        } catch (IllegalStateException e) {
            sjp.a(activity, sfz.a(2), sgz, e);
            activity.finish();
            return true;
        }
    }

    public static String a(PackageManager packageManager, String str) {
        String str2 = "ActivityHelper";
        try {
            Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
            signatureArr[0].toString();
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
            Formatter formatter = new Formatter();
            for (int i = 0; i < digest.length - 1; i++) {
                formatter.format("%02x:", new Object[]{Byte.valueOf(digest[i])});
            }
            formatter.format("%02x", new Object[]{Byte.valueOf(digest[digest.length - 1])});
            return formatter.toString();
        } catch (NoSuchAlgorithmException | CertificateException e) {
            Log.e(str2, "Failed to process the certificate", e);
            return null;
        } catch (NameNotFoundException e2) {
            Log.e(str2, "Failed to find an app with the given package name", e2);
            return null;
        }
    }
}
