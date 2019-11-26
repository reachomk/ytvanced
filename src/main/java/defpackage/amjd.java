package defpackage;

import android.text.TextUtils;

/* renamed from: amjd */
abstract class amjd {
    amjd() {
    }

    public abstract String a();

    public abstract amuw b();

    public abstract amqp c();

    /* Access modifiers changed, original: final */
    public final boolean d() {
        return (TextUtils.isEmpty(a()) || c().a() || !b().isEmpty()) ? false : true;
    }

    static amjg a(String str) {
        amfr amfr = new amfr();
        if (str != null) {
            amfr.a = str;
            amfr.a(amwp.a);
            amfr.a(ampo.a);
            return amfr;
        }
        throw new NullPointerException("Null id");
    }
}
