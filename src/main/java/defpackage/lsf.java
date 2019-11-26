package defpackage;

import android.content.res.Configuration;

/* renamed from: lsf */
final class lsf implements akoq {
    private final /* synthetic */ lru a;

    lsf(lru lru) {
        this.a = lru;
    }

    public final void a(akor akor, aknh aknh, int i) {
        Configuration configuration = this.a.a.getResources().getConfiguration();
        boolean z = false;
        if (xss.b(this.a.a) && configuration.orientation == 2) {
            z = true;
        }
        akor.a("always_display_as_grid", Boolean.valueOf(z));
    }
}
