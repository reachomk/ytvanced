package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: vui */
public final class vui {
    private static final Pattern b = Pattern.compile("^NO_MATCH_REGEX$");
    public final afqv a;
    private final Pattern c = b;
    private final afqv d;
    private final xsc e;

    public vui(afqv afqv, afqv afqv2, xsc xsc) {
        this.a = (afqv) amqw.a((Object) afqv);
        this.d = (afqv) amqw.a((Object) afqv2);
        this.e = (xsc) amqw.a((Object) xsc);
    }

    public final afqy a(Uri uri, String str) {
        afqy a;
        if (this.c.matcher(uri.toString()).find()) {
            a = afqv.a(str);
        } else {
            a = afqv.a(str);
        }
        a.a(uri);
        return a;
    }

    public final afqy a(Uri uri, byte[] bArr, String str) {
        afqy a;
        if (this.c.matcher(uri.toString()).find()) {
            a = afqv.a(bArr, str);
        } else {
            a = afqv.a(bArr, str);
        }
        a.a(uri);
        return a;
    }

    @Deprecated
    public final void a(afqy afqy, Pattern pattern, bqk bqk) {
        if (!this.c.matcher(afqy.c.toString()).find() && (pattern == null || !pattern.matcher(afqy.c.toString()).find())) {
            a(afqy, bqk);
        } else {
            this.a.a(afqy, bqk);
        }
    }

    public final void a(afqy afqy, bqk bqk) {
        Uri uri = afqy.c;
        if (uri.getHost() != null && ((uri.getHost().endsWith(".doubleclick.net") || TextUtils.equals(uri.getHost(), "doubleclick.net")) && afqy.e)) {
            uri = afqy.c;
            String valueOf = String.valueOf(this.e.a() / 1000);
            String encodedQuery = uri.getEncodedQuery();
            String str = "ts";
            if (encodedQuery == null || encodedQuery.length() == 0) {
                uri = uri.buildUpon().appendQueryParameter(str, valueOf).build();
            } else {
                str = Uri.encode(str, null);
                valueOf = Uri.encode(valueOf, null);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length());
                stringBuilder.append(str);
                stringBuilder.append("=");
                stringBuilder.append(valueOf);
                valueOf = stringBuilder.toString();
                Builder buildUpon = uri.buildUpon();
                StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + 1) + encodedQuery.length());
                stringBuilder2.append(valueOf);
                stringBuilder2.append("&");
                stringBuilder2.append(encodedQuery);
                uri = buildUpon.encodedQuery(stringBuilder2.toString()).build();
            }
            afqy.a(uri);
        }
        this.d.a(afqy, bqk);
    }
}
