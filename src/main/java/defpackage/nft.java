package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: nft */
final class nft {
    private static final List a = amul.a("youtube.com", "www.youtube.com", "m.youtube.com", "youtu.be");
    private static final List b = amul.a((Object) "start", (Object) "t");

    public static nhm a(String str) {
        Uri b = nft.b(str);
        if (b != null) {
            List pathSegments;
            if ("youtu.be".equals(b.getHost())) {
                pathSegments = b.getPathSegments();
                if (pathSegments.size() == 1) {
                    return nhm.a((String) pathSegments.get(0), null, null, 0, 0, nft.c(b));
                }
            }
            nhm a = nft.a(b, true);
            if (a != null) {
                return a;
            }
            pathSegments = b.getPathSegments();
            if (pathSegments.size() > 0) {
                if ("watch".equals(pathSegments.get(0))) {
                    return nhm.a(nft.a(b), null, b.getQueryParameter("list"), 0, nft.b(b), nft.c(b));
                }
            }
            return null;
        }
        return null;
    }

    public static Uri b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (!parse.isAbsolute()) {
                parse = Uri.fromParts("https", str, null);
            }
            if (parse.getHost() != null && a.contains(parse.getHost().toLowerCase())) {
                List pathSegments = parse.getPathSegments();
                if (pathSegments == null || pathSegments.size() <= 0 || pathSegments.size() > 2) {
                    return null;
                }
                return parse;
            }
        }
        return null;
    }

    public static nhm a(Uri uri, boolean z) {
        nhm nhm = null;
        if (!"embed".equals(uri.getPathSegments().get(0))) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("playlist");
        if (queryParameter != null) {
            nhm = Arrays.asList(queryParameter.split(","));
        }
        nhm nhm2 = nhm;
        String a = nft.a(uri);
        String queryParameter2 = uri.getQueryParameter("list");
        int i = (z || nft.a(uri, "autoplay") != 1) ? 0 : 1;
        return nhm.a(a, nhm2, queryParameter2, i, nft.b(uri), nft.c(uri));
    }

    private static String a(Uri uri) {
        List pathSegments = uri.getPathSegments();
        CharSequence charSequence = pathSegments.size() >= 2 ? (String) pathSegments.get(1) : null;
        return TextUtils.isEmpty(charSequence) ? uri.getQueryParameter("v") : charSequence;
    }

    private static int b(Uri uri) {
        return nft.a(uri, "index");
    }

    private static int c(Uri uri) {
        int i = 0;
        for (String a : b) {
            i = nft.a(uri, a);
            if (i != 0) {
                break;
            }
        }
        return (int) TimeUnit.SECONDS.toMillis((long) i);
    }

    private static int a(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                return Integer.parseInt(queryParameter);
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
