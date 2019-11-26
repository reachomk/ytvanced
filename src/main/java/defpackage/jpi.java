package defpackage;

import android.app.Activity;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: jpi */
public final class jpi implements ezu {
    private final Activity a;
    private final aaey b;
    private final amro c;

    public jpi(Activity activity, aaey aaey, amro amro) {
        this.a = (Activity) amqw.a((Object) activity);
        this.b = (aaey) amqw.a((Object) aaey);
        this.c = (amro) amqw.a((Object) amro);
    }

    public final int a() {
        return R.id.menu_help;
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
        this.b.a(this.a, (String) this.c.get());
        return true;
    }
}
