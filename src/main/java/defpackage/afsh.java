package defpackage;

import java.util.Locale;
import java.util.Map.Entry;

/* renamed from: afsh */
public final class afsh implements xhk {
    private final afms a;
    private final xsc b;

    public afsh(afms afms, xsc xsc) {
        this.a = (afms) amqw.a((Object) afms);
        this.b = (xsc) amqw.a((Object) xsc);
    }

    public final Long a(xle xle) {
        String str = "'";
        if (xle instanceof afsv) {
            afsv afsv = (afsv) xle;
            if (this.a.a()) {
                for (String str2 : afsv.m()) {
                    xtl.e(str2);
                }
            }
            return Long.valueOf(this.b.b());
        } else if (!this.a.b()) {
            return null;
        } else {
            String f;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Basic CURL command:");
            try {
                for (Entry entry : xle.c().entrySet()) {
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str3).length() + 7) + String.valueOf(str4).length());
                    stringBuilder2.append("-H \"");
                    stringBuilder2.append(str3);
                    stringBuilder2.append(":");
                    stringBuilder2.append(str4);
                    stringBuilder2.append("\" ");
                    stringBuilder.append(stringBuilder2.toString());
                }
                f = xle.f();
                StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(f).length() + 2);
                stringBuilder3.append(str2);
                stringBuilder3.append(f);
                stringBuilder3.append(str2);
                stringBuilder.append(stringBuilder3.toString());
                f = stringBuilder.toString();
            } catch (bpx e) {
                xtl.a("Auth failure.", e);
                f = "Received exception while trying to get logs.";
            }
            xtl.e(f);
            return Long.valueOf(this.b.b());
        }
    }

    public final void a(xle xle, bqd bqd, Long l) {
        String str = "Response for %s took %d ms and had status code %d";
        long b;
        if (xle instanceof afsv) {
            afsv afsv = (afsv) xle;
            b = this.b.b() - l.longValue();
            if (this.a.a()) {
                xtl.e(String.format(Locale.US, str, new Object[]{afsv.f(), Long.valueOf(b), Integer.valueOf(bqd.a)}));
            }
            if (this.a.c()) {
                xtl.e("Logging response for YouTube API call.");
                for (String e : afsv.b(bqd)) {
                    xtl.e(e);
                }
            }
        } else if (this.a.b()) {
            b = this.b.b();
            long longValue = l.longValue();
            xtl.e(String.format(Locale.US, str, new Object[]{xle.f(), Long.valueOf(b - longValue), Integer.valueOf(bqd.a)}));
        }
    }
}
