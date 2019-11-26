package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.conversation.technodrome.view.ChatInlineFixedVideoView;

/* renamed from: yny */
public final class yny implements yxa, zcm {
    public final View a;
    public final String b;
    public final zac c;
    public final yxd d;
    public final ykf e;
    public ynx f;
    public ChatInlineFixedVideoView g;
    public boolean h;
    private final yvb i;

    public yny(yvb yvb, String str, View view, yxd yxd, ykf ykf) {
        this.i = (yvb) amqw.a((Object) yvb);
        this.b = (String) amqw.a((Object) str);
        this.a = (View) amqw.a((Object) view);
        this.d = (yxd) amqw.a((Object) yxd);
        this.e = (ykf) amqw.a((Object) ykf);
        if (yxd != null) {
            this.c = new zac(yxd);
            return;
        }
        throw new NullPointerException("@AutoFactory method argument is null but is not marked @Nullable. Argument index: 1");
    }

    public final void b(boolean z) {
        if (this.h) {
            d();
        }
        this.f.n();
        this.c.b(z);
        this.g.a(this.d.c);
        this.i.a(this.b);
    }

    public final void a() {
        b(true);
    }

    public final ImageView b() {
        return this.d.a;
    }

    public final void c() {
        this.h = true;
        this.g.a();
        this.f.a(this.g.b);
        this.d.a.setVisibility(4);
    }

    public final void d() {
        this.h = false;
        this.d.a.setVisibility(0);
        this.f.a(this.d.a);
        this.g.setVisibility(8);
    }
}
