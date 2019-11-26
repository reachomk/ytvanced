package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: qnk */
public final class qnk extends pld {
    private final pko d;
    private final qnu e;

    public qnk(Context context, pko pko, qnu qnu) {
        String str;
        String str2 = "namespaces cannot be null";
        String str3 = "applicationId cannot be null";
        String str4 = "com.google.android.gms.cast.CATEGORY_CAST";
        if (pko.e) {
            if (pko.a().isEmpty()) {
                str = pko.a;
                if (str != null) {
                    str = pjn.a(str4, str, null, true);
                } else {
                    throw new IllegalArgumentException(str3);
                }
            }
            str = pko.a;
            List a = pko.a();
            if (str == null) {
                throw new IllegalArgumentException(str3);
            } else if (a != null) {
                str = pjn.a(str4, str, a, true);
            } else {
                throw new IllegalArgumentException(str2);
            }
        } else if (pko.a().isEmpty()) {
            str = pjn.a(pko.a);
        } else {
            str = pko.a;
            List a2 = pko.a();
            if (str == null) {
                throw new IllegalArgumentException(str3);
            } else if (a2 != null) {
                str = pjn.a(str4, str, a2, false);
            } else {
                throw new IllegalArgumentException(str2);
            }
        }
        super(context, str);
        this.d = pko;
        this.e = qnu;
    }

    public final pla a(String str) {
        Context context = this.a;
        String str2 = this.b;
        pko pko = this.d;
        pjg pjg = pje.b;
        qnj qnj = new qnj();
        return new pkq(context, str2, str, pko, pjg, new qod(this.a, this.d, this.e));
    }

    public final boolean a() {
        return this.d.b;
    }
}
