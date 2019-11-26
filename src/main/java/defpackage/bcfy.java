package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.regex.Pattern;

/* renamed from: bcfy */
public final class bcfy {
    private static final Pattern a = Pattern.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    public static void a(String str) {
        boolean z = true;
        bcgg.a(str.length() >= 43, (Object) "codeVerifier length is shorter than allowed by the PKCE specification");
        if (str.length() > 128) {
            z = false;
        }
        bcgg.a(z, (Object) "codeVerifier length is longer than allowed by the PKCE specification");
        bcgg.a(a.matcher(str).matches(), (Object) "codeVerifier string contains illegal characters");
    }

    public static String a() {
        Object secureRandom = new SecureRandom();
        bcgg.a(secureRandom, (Object) "entropySource cannot be null");
        bcgg.a(true, (Object) "entropyBytes is less than the minimum permitted");
        bcgg.a(true, (Object) "entropyBytes is greater than the maximum permitted");
        byte[] bArr = new byte[64];
        secureRandom.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    public static String b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("ISO_8859_1"));
            str = Base64.encodeToString(instance.digest(), 11);
            return str;
        } catch (NoSuchAlgorithmException e) {
            bcgn.c("SHA-256 is not supported on this device! Using plain challenge", e);
            return str;
        } catch (UnsupportedEncodingException e2) {
            bcgn.d("ISO-8859-1 encoding not supported on this device!", e2);
            throw new IllegalStateException("ISO-8859-1 encoding not supported", e2);
        }
    }

    public static String b() {
        try {
            MessageDigest.getInstance("SHA-256");
            return "S256";
        } catch (NoSuchAlgorithmException unused) {
            return "plain";
        }
    }
}
