package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;

/* renamed from: pfo */
final class pfo extends pgb {
    public static final byte[] b = "\n".getBytes();
    public final pfv a;
    private final String c;

    pfo(pgd pgd) {
        String language;
        super(pgd);
        String str = pge.a;
        String str2 = VERSION.RELEASE;
        Locale locale = Locale.getDefault();
        String str3 = null;
        if (locale != null) {
            language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(language.toLowerCase(locale));
                if (!TextUtils.isEmpty(locale.getCountry())) {
                    stringBuilder.append("-");
                    stringBuilder.append(locale.getCountry().toLowerCase(locale));
                }
                str3 = stringBuilder.toString();
            }
        }
        String str4 = Build.MODEL;
        language = Build.ID;
        this.c = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", str, str2, str3, str4, language});
        this.a = new pfv(pgd.c);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        a("Network initialized. User agent", this.c);
    }

    public final boolean b() {
        NetworkInfo activeNetworkInfo;
        pgv.a();
        f();
        try {
            activeNetworkInfo = ((ConnectivityManager) i().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        a("No network connectivity");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f A:{SYNTHETIC, Splitter:B:25:0x006f} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A:{SYNTHETIC, Splitter:B:36:0x0084} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A:{SYNTHETIC, Splitter:B:36:0x0084} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008e  */
    public final int a(java.net.URL r10, byte[] r11) {
        /*
        r9 = this;
        r0 = "Error closing http post connection output stream";
        defpackage.pzr.a(r10);
        defpackage.pzr.a(r11);
        r1 = r11.length;
        r5 = java.lang.Integer.valueOf(r1);
        r3 = 3;
        r4 = "POST bytes, url";
        r7 = 0;
        r2 = r9;
        r6 = r10;
        r2.b(r3, r4, r5, r6, r7);
        r2 = 0;
        r3 = r9.i();	 Catch:{ IOException -> 0x0065, all -> 0x0061 }
        r3.getPackageName();	 Catch:{ IOException -> 0x0065, all -> 0x0061 }
        r10 = r9.a(r10);	 Catch:{ IOException -> 0x0065, all -> 0x0061 }
        r3 = 1;
        r10.setDoOutput(r3);	 Catch:{ IOException -> 0x005c, all -> 0x005a }
        r10.setFixedLengthStreamingMode(r1);	 Catch:{ IOException -> 0x005c, all -> 0x005a }
        r10.connect();	 Catch:{ IOException -> 0x005c, all -> 0x005a }
        r2 = r10.getOutputStream();	 Catch:{ IOException -> 0x005c, all -> 0x005a }
        r2.write(r11);	 Catch:{ IOException -> 0x005c, all -> 0x005a }
        r9.a(r10);	 Catch:{ IOException -> 0x005c, all -> 0x005a }
        r11 = r10.getResponseCode();	 Catch:{ IOException -> 0x005c, all -> 0x005a }
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r11 != r1) goto L_0x0045;
    L_0x003e:
        r1 = r9.m();	 Catch:{ IOException -> 0x005c, all -> 0x005a }
        r1.c();	 Catch:{ IOException -> 0x005c, all -> 0x005a }
    L_0x0045:
        r1 = "POST status";
        r3 = java.lang.Integer.valueOf(r11);	 Catch:{ IOException -> 0x005c, all -> 0x005a }
        r9.b(r1, r3);	 Catch:{ IOException -> 0x005c, all -> 0x005a }
        r2.close();	 Catch:{ IOException -> 0x0052 }
        goto L_0x0056;
    L_0x0052:
        r1 = move-exception;
        r9.d(r0, r1);
    L_0x0056:
        r10.disconnect();
        return r11;
    L_0x005a:
        r11 = move-exception;
        goto L_0x0082;
    L_0x005c:
        r11 = move-exception;
        r8 = r2;
        r2 = r10;
        r10 = r8;
        goto L_0x0068;
    L_0x0061:
        r10 = move-exception;
        r11 = r10;
        r10 = r2;
        goto L_0x0082;
    L_0x0065:
        r10 = move-exception;
        r11 = r10;
        r10 = r2;
    L_0x0068:
        r1 = "Network POST connection error";
        r9.c(r1, r11);	 Catch:{ all -> 0x007e }
        if (r10 == 0) goto L_0x0077;
    L_0x006f:
        r10.close();	 Catch:{ IOException -> 0x0073 }
        goto L_0x0077;
    L_0x0073:
        r10 = move-exception;
        r9.d(r0, r10);
    L_0x0077:
        if (r2 == 0) goto L_0x007c;
    L_0x0079:
        r2.disconnect();
    L_0x007c:
        r10 = 0;
        return r10;
    L_0x007e:
        r11 = move-exception;
        r8 = r2;
        r2 = r10;
        r10 = r8;
    L_0x0082:
        if (r2 == 0) goto L_0x008c;
    L_0x0084:
        r2.close();	 Catch:{ IOException -> 0x0088 }
        goto L_0x008c;
    L_0x0088:
        r1 = move-exception;
        r9.d(r0, r1);
    L_0x008c:
        if (r10 == 0) goto L_0x0091;
    L_0x008e:
        r10.disconnect();
    L_0x0091:
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfo.a(java.net.URL, byte[]):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x001f A:{SYNTHETIC, Splitter:B:18:0x001f} */
    public final void a(java.net.HttpURLConnection r4) {
        /*
        r3 = this;
        r0 = "Error closing http connection input stream";
        r4 = r4.getInputStream();	 Catch:{ all -> 0x001b }
        r1 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r1 = new byte[r1];	 Catch:{ all -> 0x0019 }
    L_0x000a:
        r2 = r4.read(r1);	 Catch:{ all -> 0x0019 }
        if (r2 > 0) goto L_0x000a;
    L_0x0010:
        r4.close();	 Catch:{ IOException -> 0x0014 }
        return;
    L_0x0014:
        r4 = move-exception;
        r3.d(r0, r4);
        return;
    L_0x0019:
        r1 = move-exception;
        goto L_0x001d;
    L_0x001b:
        r1 = move-exception;
        r4 = 0;
    L_0x001d:
        if (r4 == 0) goto L_0x0027;
    L_0x001f:
        r4.close();	 Catch:{ IOException -> 0x0023 }
        goto L_0x0027;
    L_0x0023:
        r4 = move-exception;
        r3.d(r0, r4);
    L_0x0027:
        goto L_0x0029;
    L_0x0028:
        throw r1;
    L_0x0029:
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pfo.a(java.net.HttpURLConnection):void");
    }

    public final HttpURLConnection a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(((Integer) pel.u.a).intValue());
            httpURLConnection.setReadTimeout(((Integer) pel.v.a).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.c);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    public final URL a(pff pff) {
        String valueOf;
        String valueOf2;
        if (pff.d) {
            valueOf2 = String.valueOf(pev.f());
            valueOf = String.valueOf(pev.h());
            if (valueOf.length() == 0) {
                valueOf = new String(valueOf2);
            } else {
                valueOf = valueOf2.concat(valueOf);
            }
        } else {
            valueOf2 = String.valueOf(pev.g());
            valueOf = String.valueOf(pev.h());
            if (valueOf.length() == 0) {
                valueOf = new String(valueOf2);
            } else {
                valueOf = valueOf2.concat(valueOf);
            }
        }
        try {
            return new URL(valueOf);
        } catch (MalformedURLException e) {
            d("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final URL a(pff pff, String str) {
        String f;
        String str2 = "?";
        String h;
        int length;
        StringBuilder stringBuilder;
        if (pff.d) {
            f = pev.f();
            h = pev.h();
            length = String.valueOf(f).length();
            stringBuilder = new StringBuilder(((length + 1) + String.valueOf(h).length()) + String.valueOf(str).length());
            stringBuilder.append(f);
            stringBuilder.append(h);
            stringBuilder.append(str2);
            stringBuilder.append(str);
            f = stringBuilder.toString();
        } else {
            f = pev.g();
            h = pev.h();
            length = String.valueOf(f).length();
            stringBuilder = new StringBuilder(((length + 1) + String.valueOf(h).length()) + String.valueOf(str).length());
            stringBuilder.append(f);
            stringBuilder.append(h);
            stringBuilder.append(str2);
            stringBuilder.append(str);
            f = stringBuilder.toString();
        }
        try {
            return new URL(f);
        } catch (MalformedURLException e) {
            d("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final URL c() {
        String valueOf = String.valueOf(pev.f());
        String valueOf2 = String.valueOf((String) pel.l.a);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        try {
            return new URL(valueOf2);
        } catch (MalformedURLException e) {
            d("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    public final String a(pff pff, boolean z) {
        pzr.a((Object) pff);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            String str;
            String str2;
            String str3;
            Iterator it = pff.a.entrySet().iterator();
            while (true) {
                str = "z";
                str2 = "qt";
                str3 = "ht";
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                String str4 = (String) entry.getKey();
                if (!(str3.equals(str4) || str2.equals(str4) || "AppUID".equals(str4) || str.equals(str4) || "_gmsv".equals(str4))) {
                    pfo.a(stringBuilder, str4, (String) entry.getValue());
                }
            }
            pfo.a(stringBuilder, str3, String.valueOf(pff.c));
            pfo.a(stringBuilder, str2, String.valueOf(h().a() - pff.c));
            if (z) {
                long parseLong;
                String valueOf;
                String str5 = "_s";
                String str6 = "0";
                pzr.a(str5);
                pzr.b(true, "Short param name required");
                str5 = (String) pff.a.get(str5);
                if (str5 == null) {
                    str5 = str6;
                }
                try {
                    parseLong = Long.parseLong(str5);
                } catch (NumberFormatException unused) {
                    parseLong = 0;
                }
                if (parseLong == 0) {
                    valueOf = String.valueOf(pff.b);
                } else {
                    valueOf = String.valueOf(parseLong);
                }
                pfo.a(stringBuilder, str, valueOf);
            }
            return stringBuilder.toString();
        } catch (UnsupportedEncodingException e) {
            d("Failed to encode name or value", e);
            return null;
        }
    }

    private static void a(StringBuilder stringBuilder, String str, String str2) {
        if (stringBuilder.length() != 0) {
            stringBuilder.append('&');
        }
        String str3 = "UTF-8";
        stringBuilder.append(URLEncoder.encode(str, str3));
        stringBuilder.append('=');
        stringBuilder.append(URLEncoder.encode(str2, str3));
    }
}
