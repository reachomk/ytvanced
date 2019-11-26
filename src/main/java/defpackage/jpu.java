package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: jpu */
public final class jpu implements ezu {
    private final Activity a;

    public jpu(Activity activity) {
        this.a = activity;
    }

    public final int a() {
        return R.id.menu_privacy_policy;
    }

    public final void a(MenuItem menuItem) {
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

    public final boolean b(MenuItem menuItem) {
        fom.a(this.a, Uri.parse(this.a.getResources().getString(R.string.mobile_privacy_uri)));
        return true;
    }
}
