package defpackage;

import android.content.Context;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: fsd */
public final class fsd extends fai {
    private final Context a;
    private final String b;
    private final String c;
    private final fjg d;

    public fsd(Context context, String str, String str2, fjg fjg) {
        this.a = (Context) amqw.a((Object) context);
        this.b = xvd.a(str);
        this.c = xvd.a(str2);
        this.d = (fjg) amqw.a((Object) fjg);
    }

    public final int a() {
        return R.id.action_bar_menu_item_view_chat_participants;
    }

    public final boolean b() {
        return false;
    }

    public final ezx d() {
        return null;
    }

    public final int f() {
        return 0;
    }

    public final void a(MenuItem menuItem) {
        menuItem.setTitle(e());
    }

    public final boolean b(MenuItem menuItem) {
        this.d.a(frn.a(this.b, this.c));
        return true;
    }

    public final CharSequence e() {
        return this.a.getString(R.string.action_bar_menu_item_view_chat_participants);
    }
}
