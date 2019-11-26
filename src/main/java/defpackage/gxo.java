package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: gxo */
final class gxo implements ezu {
    public final /* synthetic */ gxf a;

    public final int a() {
        return R.id.menu_save_playlist;
    }

    public final void a(MenuItem menuItem) {
    }

    public final boolean b() {
        return true;
    }

    public final boolean b(MenuItem menuItem) {
        this.a.b(new gxr(this));
        return true;
    }

    public final int c() {
        return R.menu.playlist_editor_menu;
    }

    public final ezx d() {
        return null;
    }

    /* synthetic */ gxo(gxf gxf) {
        this.a = gxf;
    }
}
