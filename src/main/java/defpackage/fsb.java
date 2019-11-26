package defpackage;

import android.content.Context;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* renamed from: fsb */
public final class fsb extends fai {
    public final String a;
    public final fjg b;
    public final ywk c;
    private final Context d;
    private final boolean e;

    public fsb(Context context, String str, boolean z, fjg fjg, ywk ywk, yyi yyi) {
        this.d = (Context) amqw.a((Object) context);
        this.a = xvd.a(str);
        this.e = z;
        this.b = (fjg) amqw.a((Object) fjg);
        this.c = (ywk) amqw.a((Object) ywk);
        amqw.a((Object) yyi);
    }

    public final int a() {
        return R.id.action_bar_menu_item_remove_chat;
    }

    public final boolean b() {
        return false;
    }

    public final ezx d() {
        return null;
    }

    public final int f() {
        return 3;
    }

    public final void a(MenuItem menuItem) {
        menuItem.setTitle(e());
    }

    public final boolean b(MenuItem menuItem) {
        if (this.e) {
            yyl a = yyi.a(this.d);
            a.a(R.string.delete_chat_confirm_dialog_title);
            a.b(R.string.delete_chat_confirm_dialog_message);
            a.a(R.string.delete_chat_confirm_button, new fsa(this));
            a.c(R.string.delete_chat_cancel_button);
            a.a();
        } else {
            ywk ywk = this.c;
            ywk.f.a(this.a, 4);
            this.b.d();
        }
        return true;
    }

    public final CharSequence e() {
        if (this.e) {
            return this.d.getString(R.string.action_bar_menu_item_delete_chat);
        }
        return this.d.getString(R.string.action_bar_menu_item_leave_chat);
    }
}
