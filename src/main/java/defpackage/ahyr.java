package defpackage;

import android.net.Uri;

/* renamed from: ahyr */
final class ahyr implements aftl {
    private final /* synthetic */ ahys a;

    ahyr(ahys ahys) {
        this.a = ahys;
    }

    public final String a() {
        return "CreatorEndscreenMacroSubstitutor";
    }

    public final String a(Uri uri, String str) {
        String str2 = "";
        String str3;
        if ("CPN".equals(str)) {
            str3 = this.a.p;
            return str3 == null ? str2 : str3;
        } else if ("AD_CPN".equals(str)) {
            str3 = this.a.q;
            return str3 == null ? str2 : str3;
        } else if (!"MT".equals(str)) {
            return null;
        } else {
            ajmq ajmq = this.a.o;
            if (ajmq == null) {
                return str2;
            }
            long d = ajmq.d();
            StringBuilder stringBuilder = new StringBuilder(20);
            stringBuilder.append(d / 1000);
            return stringBuilder.toString();
        }
    }
}
