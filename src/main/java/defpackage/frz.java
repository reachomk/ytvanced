package defpackage;

import android.content.Context;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: frz */
public final class frz extends fai {
    private final Context a;
    private final String b;
    private final String c;
    private final ysc d;

    public frz(Context context, String str, String str2, ysc ysc) {
        this.a = (Context) amqw.a((Object) context);
        this.b = xvd.a(str);
        this.c = xvd.a(str2);
        this.d = ysc;
    }

    public final int a() {
        return R.id.action_bar_menu_item_edit_chat_name;
    }

    public final boolean b() {
        return false;
    }

    public final ezx d() {
        return null;
    }

    public final int f() {
        return 2;
    }

    public final void a(MenuItem menuItem) {
        menuItem.setTitle(e());
    }

    public final boolean b(MenuItem menuItem) {
        this.d.a(this.b, this.c);
        return true;
    }

    public final CharSequence e() {
        return this.a.getString(R.string.action_bar_menu_item_edit_chat_name);
    }
}
