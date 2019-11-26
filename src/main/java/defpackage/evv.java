package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* renamed from: evv */
public class evv implements albc, ewm {
    private static final long b = TimeUnit.DAYS.toMillis(1);
    public View a;
    private final ewi c;
    private final SharedPreferences d;
    private final int e;
    private final String f;
    private final int g;
    private final albv h;
    private albu i;

    public evv(ewi ewi, SharedPreferences sharedPreferences, int i, String str, int i2, albv albv) {
        this.c = (ewi) amqw.a((Object) ewi);
        this.d = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.e = i;
        this.f = (String) amqw.a((Object) str);
        this.g = i2;
        this.h = (albv) amqw.a((Object) albv);
    }

    public final int a() {
        return this.e;
    }

    public final boolean b() {
        View view = this.a;
        if (view != null && view.isShown() && this.d.getBoolean(this.f, true) && a(ebn.TIME_LAST_BROWSE_CLING_SHOWN)) {
            SharedPreferences sharedPreferences = this.d;
            String str = ebn.TIME_FUSION_ENABLED;
            if (sharedPreferences.getLong(str, 0) != 0 && a(str)) {
                return true;
            }
        }
        return false;
    }

    private final boolean a(String str) {
        return fpc.a(this.d, str, b, System.currentTimeMillis());
    }

    public final void c() {
        if (this.a != null) {
            albv albv = this.h;
            albv.a(((albx) albv.a().a(this.a).c(this.a.getContext().getText(this.g)).d(2).e(2).a((albc) this).f()).b());
        }
    }

    public final void d() {
        this.h.b(this.i);
    }

    public final /* synthetic */ void a(Object obj, int i) {
        this.i = null;
        this.d.edit().putBoolean(this.f, false).putLong(ebn.TIME_LAST_BROWSE_CLING_SHOWN, System.currentTimeMillis()).apply();
        this.c.b(this);
    }
}
