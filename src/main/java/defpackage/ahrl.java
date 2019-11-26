package defpackage;

import android.text.TextUtils;

/* renamed from: ahrl */
public final class ahrl extends ahor {
    public final ahqt a;
    public final ahqt b;
    private final ahqt c;

    public ahrl(ahpn ahpn, ahrd ahrd) {
        amqw.a((Object) ahpn);
        amqw.a((Object) ahrd);
        this.a = ahrd.a((ahpn) ahpn.clone(), 0.0f, 40.0f);
        this.a.b(17);
        this.a.a(true, true);
        this.a.a(-7829368);
        this.a.c(2.0f);
        this.a.b(0.0f, 6.0f, 0.0f);
        a(this.a);
        this.a.m_(true);
        this.b = ahrd.a((ahpn) ahpn.clone(), 40.0f, 0.0f);
        this.b.a(false, true);
        this.b.c(2.0f);
        this.b.b(1);
        this.b.b(0.0f, 2.0f, 0.0f);
        this.b.a(new ahrk(this));
        a(this.b);
        this.c = ahrd.a((ahpn) ahpn.clone(), 40.0f, 0.0f);
        this.c.a(false, true);
        this.c.c(1.5f);
        this.c.b(1);
        a(this.c);
    }

    public final void a(String str) {
        this.b.a(str);
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            this.c.a("");
            this.c.m_(true);
            return;
        }
        ahqt ahqt = this.c;
        if (str.length() > 40) {
            str = String.valueOf(str.substring(0, 37));
            String str2 = "...";
            if (str2.length() == 0) {
                str = new String(str);
            } else {
                str = str.concat(str2);
            }
        }
        ahqt.a(str);
        this.c.m_(false);
    }
}
