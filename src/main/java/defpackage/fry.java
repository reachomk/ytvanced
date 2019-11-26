package defpackage;

import android.content.Context;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: fry */
public final class fry extends fai {
    private final Context a;
    private final String b;
    private final boolean c;
    private final ywk d;

    public fry(Context context, String str, boolean z, ywk ywk) {
        this.a = (Context) amqw.a((Object) context);
        this.b = xvd.a(str);
        this.c = z;
        this.d = (ywk) amqw.a((Object) ywk);
    }

    public final int a() {
        return R.id.action_bar_menu_item_mute_or_unmute_chat;
    }

    public final boolean b() {
        return false;
    }

    public final ezx d() {
        return null;
    }

    public final int f() {
        return 4;
    }

    public final void a(MenuItem menuItem) {
        menuItem.setTitle(e());
    }

    public final boolean b(MenuItem menuItem) {
        ywk ywk;
        if (this.c) {
            ywk = this.d;
            ywk.f.a(this.b, 6);
        } else {
            ywk = this.d;
            ywk.f.a(this.b, 5);
        }
        return true;
    }

    public final CharSequence e() {
        if (this.c) {
            return this.a.getString(R.string.action_bar_menu_item_unmute_chat);
        }
        return this.a.getString(R.string.action_bar_menu_item_mute_chat);
    }
}
