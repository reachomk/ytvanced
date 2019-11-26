package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;

/* renamed from: lzc */
public final class lzc implements exw {
    private final /* synthetic */ uwn a;

    public lzc(uwn uwn) {
        this.a = uwn;
    }

    public final void a(Configuration configuration) {
        uwn uwn = this.a;
        if (!uwn.d && uwn.a() != null) {
            uwn.e = true;
            Bundle bundle = uwn.a().j;
            nl a = uwn.a.f().a(uwn.a());
            or a2 = uwn.a.f().a().a(uwn.a());
            uwn.c = uwn.b.a();
            uwn.c.a(a);
            uwn.c.f(bundle);
            a2.a(uwn.c, "update_photo_fragment").c();
            uwn.e = false;
            if (uwn.f) {
                uwn.c();
                uwn.f = false;
            }
        }
    }
}
