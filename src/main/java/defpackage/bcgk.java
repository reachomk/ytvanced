package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bcgk */
public final class bcgk {
    public final String a;
    public final Boolean b;
    private final Set c;
    private final String d;

    public bcgk(PackageInfo packageInfo, boolean z) {
        String str = packageInfo.packageName;
        Signature[] signatureArr = packageInfo.signatures;
        HashSet hashSet = new HashSet();
        for (Signature a : signatureArr) {
            hashSet.add(bcgk.a(a));
        }
        String str2 = packageInfo.versionName;
        this.a = str;
        this.c = hashSet;
        this.d = str2;
        this.b = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof bcgk)) {
            bcgk bcgk = (bcgk) obj;
            return this.a.equals(bcgk.a) && this.d.equals(bcgk.d) && this.b == bcgk.b && this.c.equals(bcgk.c);
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 92821) + this.d.hashCode()) * 92821) + this.b.booleanValue();
        for (String hashCode2 : this.c) {
            hashCode = (hashCode * 92821) + hashCode2.hashCode();
        }
        return hashCode;
    }

    private static String a(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }
}
