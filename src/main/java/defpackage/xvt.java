package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.net.MalformedURLException;

/* renamed from: xvt */
public final class xvt {
    public static boolean a(Uri uri) {
        amqw.a((Object) uri);
        return "file".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean b(Uri uri) {
        amqw.a((Object) uri);
        return "content".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean c(Uri uri) {
        if (!"127.0.0.1".equals(uri.getHost())) {
            if (!"localhost".equals(uri.getHost())) {
                return false;
            }
        }
        return true;
    }

    public static Uri a(String str) {
        Uri parse = Uri.parse(xvt.e(str));
        if (parse.isAbsolute()) {
            return parse;
        }
        throw new MalformedURLException("Uri must have an absolute scheme");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0046 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|10) */
    /* JADX WARNING: Missing block: B:9:?, code skipped:
            r1 = android.net.Uri.encode(r0.getEncodedAuthority(), ",;:$&+=@[]");
            r2 = android.net.Uri.encode(r0.getEncodedPath(), ",;:$&+=/@");
            r0 = r0.buildUpon().encodedAuthority(r1).encodedPath(r2).encodedQuery(android.net.Uri.encode(r0.getEncodedQuery(), ",;:$&+=/@[]?")).build().toString();
            r1 = new java.net.URI(r0);
     */
    /* JADX WARNING: Missing block: B:10:0x0081, code skipped:
            return r0;
     */
    /* JADX WARNING: Missing block: B:13:0x0088, code skipped:
            return android.net.Uri.encode(r5, ":/");
     */
    private static java.lang.String e(java.lang.String r5) {
        /*
        r0 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0006 }
        r0.<init>(r5);	 Catch:{ URISyntaxException -> 0x0006 }
        return r5;
    L_0x0006:
        r0 = android.net.Uri.parse(r5);
        r1 = r0.getEncodedAuthority();	 Catch:{ URISyntaxException -> 0x0046 }
        r2 = "%,;:$&+=@[]";
        r1 = android.net.Uri.encode(r1, r2);	 Catch:{ URISyntaxException -> 0x0046 }
        r2 = r0.getEncodedPath();	 Catch:{ URISyntaxException -> 0x0046 }
        r3 = "%,;:$&+=/@";
        r2 = android.net.Uri.encode(r2, r3);	 Catch:{ URISyntaxException -> 0x0046 }
        r3 = r0.getEncodedQuery();	 Catch:{ URISyntaxException -> 0x0046 }
        r4 = "%,;:$&+=/[]@?";
        r3 = android.net.Uri.encode(r3, r4);	 Catch:{ URISyntaxException -> 0x0046 }
        r4 = r0.buildUpon();	 Catch:{ URISyntaxException -> 0x0046 }
        r1 = r4.encodedAuthority(r1);	 Catch:{ URISyntaxException -> 0x0046 }
        r1 = r1.encodedPath(r2);	 Catch:{ URISyntaxException -> 0x0046 }
        r1 = r1.encodedQuery(r3);	 Catch:{ URISyntaxException -> 0x0046 }
        r1 = r1.build();	 Catch:{ URISyntaxException -> 0x0046 }
        r1 = r1.toString();	 Catch:{ URISyntaxException -> 0x0046 }
        r2 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0046 }
        r2.<init>(r1);	 Catch:{ URISyntaxException -> 0x0046 }
        return r1;
    L_0x0046:
        r1 = r0.getEncodedAuthority();	 Catch:{ URISyntaxException -> 0x0082 }
        r2 = ",;:$&+=@[]";
        r1 = android.net.Uri.encode(r1, r2);	 Catch:{ URISyntaxException -> 0x0082 }
        r2 = r0.getEncodedPath();	 Catch:{ URISyntaxException -> 0x0082 }
        r3 = ",;:$&+=/@";
        r2 = android.net.Uri.encode(r2, r3);	 Catch:{ URISyntaxException -> 0x0082 }
        r3 = r0.getEncodedQuery();	 Catch:{ URISyntaxException -> 0x0082 }
        r4 = ",;:$&+=/@[]?";
        r3 = android.net.Uri.encode(r3, r4);	 Catch:{ URISyntaxException -> 0x0082 }
        r0 = r0.buildUpon();	 Catch:{ URISyntaxException -> 0x0082 }
        r0 = r0.encodedAuthority(r1);	 Catch:{ URISyntaxException -> 0x0082 }
        r0 = r0.encodedPath(r2);	 Catch:{ URISyntaxException -> 0x0082 }
        r0 = r0.encodedQuery(r3);	 Catch:{ URISyntaxException -> 0x0082 }
        r0 = r0.build();	 Catch:{ URISyntaxException -> 0x0082 }
        r0 = r0.toString();	 Catch:{ URISyntaxException -> 0x0082 }
        r1 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0082 }
        r1.<init>(r0);	 Catch:{ URISyntaxException -> 0x0082 }
        return r0;
    L_0x0082:
        r0 = ":/";
        r5 = android.net.Uri.encode(r5, r0);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvt.e(java.lang.String):java.lang.String");
    }

    public static Uri d(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("v");
            String scheme = uri.getScheme();
            if (!(host == null || !host.contains("youtube.com") || TextUtils.isEmpty(queryParameter))) {
                uri = new Builder().scheme(scheme).authority("youtu.be").appendPath(queryParameter).build();
            }
        } catch (UnsupportedOperationException unused) {
        }
        return uri;
    }

    public static Uri b(String str) {
        return xvt.a(str, "", -1, 0, "https");
    }

    public static Uri a(String str, String str2, int i, long j, String str3) {
        Builder appendQueryParameter = new Builder().scheme(str3).authority("www.youtube.com").appendPath("watch").appendQueryParameter("v", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("list", str2);
            if (i != -1) {
                appendQueryParameter.appendQueryParameter("index", String.valueOf(i));
            }
        }
        if (j != 0) {
            StringBuilder stringBuilder = new StringBuilder(22);
            stringBuilder.append("t=");
            stringBuilder.append(j);
            appendQueryParameter.encodedFragment(stringBuilder.toString());
        }
        return appendQueryParameter.build();
    }

    public static boolean e(Uri uri) {
        amqw.a((Object) uri);
        return "https".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean c(String str) {
        return xvt.e(Uri.parse(str));
    }

    public static Uri d(String str) {
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            parse = parse.buildUpon().scheme("https").build();
        } else if (!str.contains("://") && str.contains(":")) {
            Object str2;
            String str3 = "//";
            if (!str2.startsWith(str3)) {
                if (str2.length() == 0) {
                    str2 = new String(str3);
                } else {
                    str2 = str3.concat(str2);
                }
            }
            str2 = String.valueOf(str2);
            str3 = "https:";
            parse = Uri.parse(str2.length() == 0 ? new String(str3) : str3.concat(str2));
        }
        return parse;
    }
}
