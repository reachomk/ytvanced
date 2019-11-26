package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: kyw */
public final class kyw implements ewg {
    public final SharedPreferences a;
    public View b;
    public boolean c;
    private final Context d;
    private final albv e;
    private albu f;

    public kyw(Context context, SharedPreferences sharedPreferences, albv albv) {
        this.d = context;
        this.a = sharedPreferences;
        this.e = albv;
    }

    public final int a() {
        return 3000;
    }

    public final boolean b() {
        return this.a.getBoolean(ebn.MOVING_THUMBNAILS_FIRST_ADD_TOOLTIP, true);
    }

    public final void c() {
        if (this.c && this.b != null && b()) {
            this.e.a(e());
        }
    }

    public final void a(View view) {
        if (view != null) {
            this.b = view.findViewById(R.id.thumbnail_layout);
            this.f = null;
        }
        d();
    }

    public final void d() {
        this.e.b(e());
    }

    private final albu e() {
        if (this.f == null) {
            this.f = ((albx) this.e.a().a(this.b).c(this.d.getString(R.string.moving_thumbnails_tooltip_tutorial_text)).e(1).d(2).a(0.55f).a(new kyv(this)).f()).b();
        }
        return this.f;
    }
}
