package defpackage;

import android.text.TextUtils;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: tpy */
public final class tpy {
    public static String a(Map map, Map map2, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (String str3 : map2.keySet()) {
            if (((tqz) map2.get(str3)).a(map) != null) {
                arrayList.add(String.format("%s=%s", new Object[]{(String) r1.next(), ((tqz) map2.get(str3)).a(map)}));
            }
        }
        String join = TextUtils.join("&", arrayList);
        if (str == null) {
            return join;
        }
        String valueOf = String.valueOf(join);
        str2 = String.valueOf(str2);
        if (str2.length() == 0) {
            str2 = new String(valueOf);
        } else {
            str2 = valueOf.concat(str2);
        }
        if (tpy.a(str2) == null) {
            return join;
        }
        join = String.valueOf(join);
        valueOf = String.valueOf(String.format("&%s=%s", new Object[]{str, valueOf.substring(valueOf.length() - 8)}));
        return valueOf.length() == 0 ? new String(join) : join.concat(valueOf);
    }

    private static String a(String str) {
        try {
            return new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())).toString(16);
        } catch (ArithmeticException | NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
