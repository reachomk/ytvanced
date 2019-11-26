package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.youtube.R;

/* renamed from: jbx */
public final class jbx implements ezu {
    private final Context a;
    private final ebk b;

    public jbx(Context context, ebk ebk) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (ebk) amqw.a((Object) ebk);
    }

    public final int a() {
        return R.id.menu_settings;
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
        Context context = this.a;
        context.startActivity(new Intent(context, SettingsActivity.class).putExtra("show_offline_items", this.b.a));
        return true;
    }
}
