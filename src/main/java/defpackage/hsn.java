package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;

/* renamed from: hsn */
public final class hsn implements ezu {
    private final aaas a;

    public hsn(aaas aaas) {
        this.a = aaas;
    }

    public final int a() {
        return R.id.menu_settings;
    }

    public final boolean b() {
        return true;
    }

    public final int c() {
        return R.menu.menu;
    }

    public final ezx d() {
        return null;
    }

    public final void a(MenuItem menuItem) {
        menuItem.setVisible(true);
    }

    public final boolean b(MenuItem menuItem) {
        aoxg aoxg = (aoxg) aoxe.e.createBuilder();
        aoxg.a(Integer.toString(10013));
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint, (aoxe) ((anxl) aoxg.build()));
        this.a.a((apxu) ((anxl) apxx.build()), null);
        return true;
    }
}
