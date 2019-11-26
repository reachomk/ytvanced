package defpackage;

import android.app.AlertDialog.Builder;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import com.google.android.youtube.R;

/* renamed from: jpj */
public final class jpj implements ezu {
    private final fgx a;

    public jpj(fgx fgx) {
        this.a = fgx;
    }

    public final int a() {
        return R.id.menu_inline_global_play_pause;
    }

    public final void a(MenuItem menuItem) {
    }

    public final boolean b() {
        return true;
    }

    public final int c() {
        return R.menu.inline_menu;
    }

    public final ezx d() {
        return null;
    }

    public final boolean b(MenuItem menuItem) {
        fgx fgx = this.a;
        if (fgx.g == null) {
            View inflate = LayoutInflater.from(fgx.a).inflate(R.layout.inline_global_play_pause_dialog, null);
            fgx.d = (RadioButton) inflate.findViewById(R.id.inline_global_play_on);
            fgx.e = (RadioButton) inflate.findViewById(R.id.inline_global_play_on_wifi_only);
            fgx.f = (RadioButton) inflate.findViewById(R.id.inline_global_play_off);
            fgx.h = fgx.b.t();
            fgx.h.a(new acvs(acwc.INLINE_DIALOG_SETTINGS_ON));
            fgx.h.a(new acvs(acwc.INLINE_DIALOG_SETTINGS_ONLY_WIFI));
            fgx.h.a(new acvs(acwc.INLINE_DIALOG_SETTINGS_OFF));
            fgx.g = new Builder(fgx.a).setView(inflate).setTitle(R.string.menu_inline_global_play_pause).setPositiveButton(R.string.ok, new fha(fgx)).setNegativeButton(R.string.cancel, null).setCancelable(true).create();
        }
        int c = fgx.c.c();
        if (c == 2) {
            fgx.d.setChecked(true);
        } else if (c == 1) {
            fgx.e.setChecked(true);
        } else if (c == 0) {
            fgx.f.setChecked(true);
        }
        fgx.g.show();
        return true;
    }
}
