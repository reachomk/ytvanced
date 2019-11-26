package defpackage;

import android.content.Context;
import android.view.MenuItem;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InviteMoreEndpointOuterClass$InviteMoreEndpoint;

/* renamed from: fqy */
public final class fqy extends fai {
    private final Context a;
    private final String b;
    private final aaas c;

    public fqy(Context context, String str, aaas aaas) {
        this.a = (Context) amqw.a((Object) context);
        this.b = xvd.a(str);
        this.c = (aaas) amqw.a((Object) aaas);
    }

    public final int a() {
        return R.id.action_bar_menu_item_add_chat_participants;
    }

    public final boolean b() {
        return false;
    }

    public final ezx d() {
        return null;
    }

    public final int f() {
        return 1;
    }

    public final void a(MenuItem menuItem) {
        menuItem.setTitle(e());
    }

    public final boolean b(MenuItem menuItem) {
        atuy atuy = (atuy) InviteMoreEndpointOuterClass$InviteMoreEndpoint.d.createBuilder();
        atuy.a(this.b);
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(InviteMoreEndpointOuterClass$InviteMoreEndpoint.inviteMoreEndpoint, (InviteMoreEndpointOuterClass$InviteMoreEndpoint) ((anxl) atuy.build()));
        this.c.a((apxu) ((anxl) apxx.build()), null);
        return true;
    }

    public final CharSequence e() {
        return this.a.getString(R.string.action_bar_menu_item_add_chat_participants);
    }
}
