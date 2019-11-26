package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: qti */
public final class qti {
    public String a = "googleads.g.doubleclick.net";
    public String b = "/pagead/ads";
    public String[] c = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    public final qsp d;
    private final String e = "ad.doubleclick.net";

    public qti(qsp qsp) {
        this.d = qsp;
    }

    public final Uri a(Uri uri, Context context) {
        try {
            return a(uri, context, uri.getQueryParameter("ai"), true);
        } catch (UnsupportedOperationException unused) {
            throw new qth("Provided Uri is not in a valid state");
        }
    }

    public final Uri a(Uri uri, Context context, String str, boolean z) {
        if (uri != null) {
            boolean equals;
            String a;
            try {
                equals = uri.getHost().equals(this.e);
            } catch (NullPointerException unused) {
                equals = false;
            }
            String str2 = "ms";
            if (!equals) {
                try {
                    if (uri.getQueryParameter(str2) != null) {
                        throw new qth("Query parameter already exists: ms");
                    }
                } catch (UnsupportedOperationException unused2) {
                    throw new qth("Provided Uri is not in a valid state");
                }
            } else if (uri.toString().contains("dc_ms=")) {
                throw new qth("Parameter already exists: dc_ms");
            }
            if (z) {
                a = this.d.a(context, str);
            } else {
                a = this.d.a(context);
            }
            str = "=";
            String str3;
            int indexOf;
            StringBuilder stringBuilder;
            if (equals) {
                str3 = "dc_ms";
                str2 = uri.toString();
                indexOf = str2.indexOf(";adurl");
                String str4 = ";";
                if (indexOf != -1) {
                    indexOf++;
                    stringBuilder = new StringBuilder(str2.substring(0, indexOf));
                    stringBuilder.append(str3);
                    stringBuilder.append(str);
                    stringBuilder.append(a);
                    stringBuilder.append(str4);
                    stringBuilder.append(str2.substring(indexOf));
                    return Uri.parse(stringBuilder.toString());
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = str2.indexOf(encodedPath);
                StringBuilder stringBuilder2 = new StringBuilder(str2.substring(0, encodedPath.length() + indexOf2));
                stringBuilder2.append(str4);
                stringBuilder2.append(str3);
                stringBuilder2.append(str);
                stringBuilder2.append(a);
                stringBuilder2.append(str4);
                stringBuilder2.append(str2.substring(indexOf2 + encodedPath.length()));
                return Uri.parse(stringBuilder2.toString());
            }
            str3 = uri.toString();
            indexOf = str3.indexOf("&adurl");
            if (indexOf == -1) {
                indexOf = str3.indexOf("?adurl");
            }
            if (indexOf == -1) {
                return uri.buildUpon().appendQueryParameter(str2, a).build();
            }
            indexOf++;
            stringBuilder = new StringBuilder(str3.substring(0, indexOf));
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append(a);
            stringBuilder.append("&");
            stringBuilder.append(str3.substring(indexOf));
            return Uri.parse(stringBuilder.toString());
        }
        throw new NullPointerException();
    }
}
