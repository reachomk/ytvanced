package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: vur */
public final class vur extends ajea {
    private final Context a;
    private final tax b;
    private Pattern c;
    private Pattern d;
    private Pattern e;

    public vur(Context context, tax tax) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (tax) amqw.a((Object) tax);
    }

    public final boolean a(Uri uri) {
        if (uri == null) {
            return false;
        }
        String uri2 = uri.toString();
        if (a(uri2) || b(uri2) || c(uri2)) {
            return true;
        }
        return false;
    }

    private final boolean a(String str) {
        if (this.e == null) {
            this.e = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID_FOR_CONVERSION_TRACKING)(?:\\]|%5D|%5d)");
        }
        Matcher matcher = this.e.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }

    private final boolean b(String str) {
        if (this.c == null) {
            this.c = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID)(?:\\]|%5D|%5d)");
        }
        Matcher matcher = this.c.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }

    private final boolean c(String str) {
        if (this.d == null) {
            this.d = Pattern.compile("(?:\\[|%5B|%5b)(DEVICE_LAT)(?:\\]|%5D|%5d)");
        }
        Matcher matcher = this.d.matcher(str);
        return matcher.find() && matcher.groupCount() == 1;
    }

    public final Uri b(Uri uri) {
        xak.b();
        amqw.a((Object) uri);
        if (uri != null) {
            String uri2 = uri.toString();
            if (!TextUtils.isEmpty(uri2)) {
                boolean b = b(uri2);
                boolean a = a(uri2);
                boolean c = c(uri2);
                if (!b && !a && !c) {
                    return uri;
                }
                try {
                    tba a2 = this.b.a(this.a);
                    if (a2 != null) {
                        boolean b2 = a2.b();
                        if (c) {
                            uri2 = uri2.replaceAll("(?:\\[|%5B|%5b)(DEVICE_LAT)(?:\\]|%5D|%5d)", b2 ? "1" : "0");
                        }
                        String a3 = a2.a();
                        if (a3 != null) {
                            if (b) {
                                if (!b2) {
                                    uri2 = uri2.replaceAll("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID)(?:\\]|%5D|%5d)", a3);
                                }
                            }
                            if (a) {
                                uri2 = uri2.replaceAll("(?:\\[|%5B|%5b)(DEVICE_ADVERTISER_ID_FOR_CONVERSION_TRACKING)(?:\\]|%5D|%5d)", a3);
                            }
                        }
                    }
                } catch (Exception e) {
                    xtl.a("Failed to get advertising id", e);
                }
                try {
                    uri = xvt.a(uri2);
                    return uri;
                } catch (MalformedURLException unused) {
                    uri2 = String.valueOf(uri);
                    StringBuilder stringBuilder = new StringBuilder(uri2.length() + 35);
                    stringBuilder.append("Failed macro substitution for URI: ");
                    stringBuilder.append(uri2);
                    xtl.d(stringBuilder.toString());
                }
            }
        }
        return uri;
    }
}
