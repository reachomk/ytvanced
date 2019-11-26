package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.MenuItem;
import com.google.android.libraries.youtube.mdx.smartpairing.PairWithTvActivity;
import com.google.android.youtube.R;

/* renamed from: hdn */
public final class hdn implements ezu {
    private final Activity a;
    private final SharedPreferences b;

    public hdn(Activity activity, SharedPreferences sharedPreferences) {
        this.a = activity;
        this.b = sharedPreferences;
    }

    public final int a() {
        return R.id.menu_watch_on_tv;
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
        Intent intent = new Intent(this.a, PairWithTvActivity.class);
        intent.putExtra("com.google.android.libraries.youtube.mdx.smartpairing.darkTheme", fmv.a(this.b) == 2);
        this.a.startActivity(intent);
        return true;
    }
}
