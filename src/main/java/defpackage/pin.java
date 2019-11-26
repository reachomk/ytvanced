package defpackage;

import android.content.Context;
import android.net.Uri.Builder;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pin */
public final class pin {
    public final Context a;
    private final CookieManager b;

    public pin(Context context) {
        pio pio = new pio();
        CookieManager instance = CookieManager.getInstance();
        this.a = context;
        this.b = instance;
    }

    public final Set a(qnd[] qndArr) {
        Set hashSet = r0 != 0 ? r0 > 128 ? new HashSet(r0, 0.75f) : new zl(r0) : new zl();
        for (qnd qnd : qndArr) {
            String str = TextUtils.isEmpty(qnd.e) ? qnd.d : qnd.e;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(qnd.b) || TextUtils.isEmpty(qnd.c)) {
                Log.w("WebLoginHelper", "Invalid cookie.");
            } else {
                Boolean bool = qnd.g;
                pzr.a(str);
                String str2 = !pif.a(bool) ? "http" : "https";
                StringBuilder stringBuilder = new StringBuilder((str2.length() + 3) + String.valueOf(str).length());
                stringBuilder.append(str2);
                stringBuilder.append("://");
                stringBuilder.append(str);
                str = stringBuilder.toString();
                str2 = qnd.b;
                String str3 = qnd.c;
                String str4 = qnd.d;
                String str5 = qnd.f;
                Boolean bool2 = qnd.h;
                Boolean bool3 = qnd.g;
                Integer num = qnd.i;
                Long valueOf = num != null ? Long.valueOf(num.longValue()) : null;
                StringBuilder stringBuilder2 = new StringBuilder(str2);
                stringBuilder2.append('=');
                if (!TextUtils.isEmpty(str3)) {
                    stringBuilder2.append(str3);
                }
                if (pif.a(bool2)) {
                    stringBuilder2.append(";HttpOnly");
                }
                if (pif.a(bool3)) {
                    stringBuilder2.append(";Secure");
                }
                if (!TextUtils.isEmpty(str4)) {
                    stringBuilder2.append(";Domain=");
                    stringBuilder2.append(str4);
                }
                if (!TextUtils.isEmpty(str5)) {
                    stringBuilder2.append(";Path=");
                    stringBuilder2.append(str5);
                }
                if (valueOf != null && valueOf.longValue() > 0) {
                    stringBuilder2.append(";Max-Age=");
                    stringBuilder2.append(valueOf);
                }
                String stringBuilder3 = stringBuilder2.toString();
                str2 = String.valueOf(str);
                str3 = "Setting cookie for url: ";
                if (str2.length() == 0) {
                    str2 = new String(str3);
                } else {
                    str3.concat(str2);
                }
                this.b.setCookie(str, stringBuilder3);
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static String a(String... strArr) {
        Builder builder = new Builder();
        String str = strArr[0];
        String host;
        try {
            URL url = new URL(str);
            str = url.getProtocol();
            host = url.getHost();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(host).length());
            stringBuilder.append(str);
            stringBuilder.append("://");
            stringBuilder.append(host);
            builder.appendQueryParameter("url", stringBuilder.toString());
            str = String.valueOf(builder.build().getQuery());
            String str2 = "weblogin:";
            return str.length() == 0 ? new String(str2) : str2.concat(str);
        } catch (MalformedURLException unused) {
            str = String.valueOf(str);
            host = "Invalid URL: ";
            throw new IllegalArgumentException(str.length() == 0 ? new String(host) : host.concat(str));
        }
    }
}
