package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: lbc */
final class lbc implements ezu {
    private final /* synthetic */ laz a;

    lbc(laz laz) {
        this.a = laz;
    }

    public final int a() {
        return R.id.menu_delete_playlist;
    }

    public final void a(MenuItem menuItem) {
    }

    public final boolean b() {
        return true;
    }

    public final int c() {
        return R.menu.browse_playlist_menu;
    }

    public final ezx d() {
        return null;
    }

    public final boolean b(MenuItem menuItem) {
        laz laz = this.a;
        if (laz.h == null) {
            laz.h = laz.e.a(((ajxx) laz.a).a);
        }
        this.a.h.show();
        return true;
    }
}
