package defpackage;

import java.util.Locale;

/* renamed from: xuq */
public final class xuq {
    public static String a(String str, String str2) {
        boolean z;
        xvd.a(str2);
        if (!bchh.a(str)) {
            String str3 = "%s";
            if (!bchh.a(str3)) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    i = str.toString().indexOf(str3.toString(), i);
                    if (i == -1) {
                        break;
                    }
                    i2++;
                    i += str3.length();
                }
                if (i2 == 1) {
                    z = true;
                    amqw.a(z);
                    return xuq.a(str, str2);
                }
            }
        }
        z = false;
        amqw.a(z);
        return xuq.a(str, str2);
    }

    public static String a(String str, Object... objArr) {
        amqw.a((Object) objArr);
        return String.format(Locale.US, str, objArr);
    }
}
