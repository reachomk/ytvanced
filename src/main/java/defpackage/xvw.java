package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: xvw */
public final class xvw {
    public static long a(long j, long j2) {
        return j != 0 ? j : j2;
    }

    public static String a(TelephonyManager telephonyManager) {
        String networkCountryIso = telephonyManager != null ? telephonyManager.getNetworkCountryIso() : null;
        if (TextUtils.isEmpty(networkCountryIso)) {
            networkCountryIso = "";
        }
        return xvw.a(networkCountryIso);
    }

    public static String a(String str) {
        str = xvd.b((CharSequence) str).trim().replace(",", "");
        if (str.length() > 2) {
            str = str.substring(0, 2);
        }
        return xvd.d(str);
    }

    public static boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        } else {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!xvw.a((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                        return false;
                    }
                } else if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean a(Context context) {
        amqw.a((Object) context);
        return ((ActivityManager) context.getSystemService("activity")).getLargeMemoryClass() >= 256;
    }

    public static byte[] a(byte[] bArr) {
        synchronized (xvv.class) {
            bArr = xvv.a.digest(bArr);
        }
        return bArr;
    }

    public static synchronized byte[] b(byte[] bArr) {
        synchronized (xvw.class) {
            synchronized (xvy.class) {
                bArr = xvy.a.digest(bArr);
            }
        }
        return bArr;
    }

    public static String c(byte[] bArr) {
        Scanner scanner = new Scanner(new GZIPInputStream(new ByteArrayInputStream(bArr)));
        scanner.useDelimiter("\\A");
        try {
            String next = scanner.hasNext() ? scanner.next() : "";
            scanner.close();
            return next;
        } catch (Throwable th) {
            scanner.close();
        }
    }

    public static byte[] b(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(str.getBytes());
        gZIPOutputStream.close();
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return toByteArray;
    }
}
