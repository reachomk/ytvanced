package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

/* renamed from: afht */
public final class afht {
    private static final Pattern a = Pattern.compile("[0-9a-zA-Z._$]+@[0-9a-f]+$");
    private static final Pattern b = Pattern.compile("[\\.$]");
    private static final Map c;

    public static String a(Object obj) {
        return afht.a(obj, false);
    }

    public static String a(Object obj, boolean z) {
        return afht.a(obj, z, 0, 160);
    }

    public static String a(Object obj, boolean z, int i, int i2) {
        if (obj instanceof Throwable) {
            StringBuilder stringBuilder = new StringBuilder();
            Throwable th = (Throwable) obj;
            stringBuilder.append(afht.a(th.getClass().getSimpleName()));
            String str = ".";
            stringBuilder.append(str);
            stringBuilder.append(afht.a(th, 3));
            while (th.getCause() != null && i > 0) {
                th = th.getCause();
                stringBuilder.append(";");
                stringBuilder.append(afht.a(th.getClass().getSimpleName()));
                stringBuilder.append(str);
                stringBuilder.append(afht.a(th, 1));
                i--;
            }
            if (z) {
                stringBuilder.append(str);
                stringBuilder.append(th.getMessage());
            }
            return afht.a(stringBuilder.toString(), i2);
        }
        String valueOf = String.valueOf(obj);
        if (a.matcher(valueOf).matches()) {
            valueOf = valueOf.substring(0, valueOf.lastIndexOf(64));
        }
        return afht.a(valueOf, i2);
    }

    private static String a(String str) {
        for (Entry entry : c.entrySet()) {
            String str2 = (String) entry.getKey();
            if (str.contains(str2)) {
                str = str.replace(str2, (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    private static String a(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        if (length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        i = Math.min(i, length);
        for (int i2 = 0; i2 < i; i2++) {
            String a = afht.a(r3.getClassName(), stackTrace[i2].getMethodName());
            String num = Integer.toString(r3.getLineNumber());
            String[] split = b.split(a);
            for (int i3 = 0; i3 < split.length; i3++) {
                if (split[i3].length() > 4) {
                    split[i3] = split[i3].substring(0, 4);
                }
            }
            stringBuilder.append(afht.a(split));
            stringBuilder.append(".");
            stringBuilder.append(num);
            if (i2 != i - 1) {
                stringBuilder.append(":");
            }
        }
        return stringBuilder.toString();
    }

    private static String a(String... strArr) {
        return TextUtils.join(".", strArr);
    }

    private static String a(String str, int i) {
        return str.length() > i ? str.substring(0, i) : str;
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("IllegalArgument", "IA");
        hashMap.put("IllegalState", "IS");
        hashMap.put("NullPointer", "NP");
        hashMap.put("Exception", "E");
        hashMap.put("Error", "Er");
        hashMap.put("DataSource", "DSo");
        hashMap.put("DataSink", "DSi");
        hashMap.put("Interrupted", "Ir");
        c = Collections.unmodifiableMap(hashMap);
    }
}
