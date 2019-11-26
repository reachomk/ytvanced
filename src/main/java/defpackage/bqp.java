package defpackage;

import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: bqp */
public final class bqp {
    public static bpz a(bqd bqd) {
        long j;
        long j2;
        Object obj;
        long j3;
        bqd bqd2 = bqd;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = bqd2.c;
        String str = (String) map.get("Date");
        long a = str != null ? bqp.a(str) : 0;
        str = (String) map.get("Cache-Control");
        int i = 0;
        if (str != null) {
            String[] split = str.split(",", 0);
            int i2 = 0;
            j = 0;
            j2 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    j = Long.parseLong(trim.substring(8));
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(23));
                    } catch (Exception unused) {
                    }
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            obj = 1;
        } else {
            j = 0;
            j2 = 0;
            obj = null;
        }
        str = (String) map.get("Expires");
        long a2 = str != null ? bqp.a(str) : 0;
        str = (String) map.get("Last-Modified");
        long a3 = str != null ? bqp.a(str) : 0;
        str = (String) map.get("ETag");
        if (obj != null) {
            currentTimeMillis += j * 1000;
            a2 = i == 0 ? (j2 * 1000) + currentTimeMillis : currentTimeMillis;
            j3 = currentTimeMillis;
        } else {
            j3 = 0;
            if (a <= 0 || a2 < a) {
                a2 = 0;
            } else {
                a2 = (a2 - a) + currentTimeMillis;
                j3 = a2;
            }
        }
        bpz bpz = new bpz();
        bpz.a = bqd2.b;
        bpz.b = str;
        bpz.f = j3;
        bpz.e = a2;
        bpz.c = a;
        bpz.d = a3;
        bpz.g = map;
        return bpz;
    }

    private static long a(String str) {
        String methodName;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            Object[] objArr = new Object[]{str};
            str = bqq.a;
            String format = String.format(Locale.US, "Unable to parse dateStr: %s, falling back to 0", objArr);
            StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
            for (int i = 2; i < stackTrace.length; i++) {
                if (!stackTrace[i].getClassName().equals(bqq.b)) {
                    String className = stackTrace[i].getClassName();
                    className = className.substring(className.lastIndexOf(46) + 1);
                    className = className.substring(className.lastIndexOf(36) + 1);
                    methodName = stackTrace[i].getMethodName();
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(className).length() + 1) + String.valueOf(methodName).length());
                    stringBuilder.append(className);
                    stringBuilder.append(".");
                    stringBuilder.append(methodName);
                    methodName = stringBuilder.toString();
                    break;
                }
            }
            methodName = "<unknown>";
            Log.e(str, String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), methodName, format}), e);
            return 0;
        }
    }

    public static String a(Map map, String str) {
        String str2 = (String) map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    public static String a(Map map) {
        return bqp.a(map, "ISO-8859-1");
    }
}
