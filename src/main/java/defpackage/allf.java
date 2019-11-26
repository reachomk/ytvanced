package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: allf */
public final class allf {
    public final SharedPreferences a;
    public long b;

    public allf(SharedPreferences sharedPreferences) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    public static String a(long j, String str, String str2) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(String.format("contact%s_phone%s_type%s", new Object[]{Long.valueOf(j), str, str2}).getBytes(StandardCharsets.UTF_8)), 2);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
