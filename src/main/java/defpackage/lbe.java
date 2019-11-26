package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: lbe */
final class lbe implements ezu {
    private Dialog a;
    private final /* synthetic */ laz b;

    lbe(laz laz) {
        this.b = laz;
    }

    public final int a() {
        return R.id.menu_flag_playlist;
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
        if (this.a == null) {
            laz laz = this.b;
            fkz fkz = laz.e;
            ajxx ajxx = (ajxx) laz.a;
            this.a = new Builder(fkz.a).setMessage(fkz.a.getString(R.string.report_playlist_confirmation)).setPositiveButton(R.string.report_button, new fld(fkz, ajxx.o, ajxx.n)).setNegativeButton(R.string.cancel, null).create();
        }
        this.a.show();
        return true;
    }
}
