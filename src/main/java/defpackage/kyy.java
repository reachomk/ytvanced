package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: kyy */
public final class kyy implements ewm {
    public final SharedPreferences a;
    public View b;
    public boolean c;
    public ewd d;
    private final Context e;
    private final albv f;
    private final eig g;
    private albu h;

    public kyy(Context context, SharedPreferences sharedPreferences, albv albv, eig eig) {
        this.e = context;
        this.a = sharedPreferences;
        this.f = albv;
        this.g = eig;
    }

    public final int a() {
        return 5001;
    }

    public final boolean b() {
        return this.c && this.b != null && !this.g.e() && e();
    }

    public final boolean e() {
        return this.a.getBoolean(ebn.OFFLINE_FIRST_ADD_TOOLTIP, true);
    }

    public final void c() {
        if (b()) {
            this.f.a(f());
        }
    }

    public final void d() {
        this.f.b(f());
    }

    public final void a(View view) {
        this.b = view;
        this.h = null;
        d();
    }

    private final albu f() {
        if (this.h == null) {
            this.h = ((albx) this.f.a().a(this.b).d(this.e.getString(R.string.offline_stub_header_tooltip_tutorial_title)).c(this.e.getString(R.string.offline_stub_header_tooltip_tutorial_subtitle)).e(1).d(1).a(new kyx(this)).f()).b();
        }
        return this.h;
    }
}
