package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;

/* renamed from: yrw */
public final class yrw extends aqj {
    public final Context p;
    public final Handler q;
    public final yyt r;
    public final yim s;
    public final ymx t;
    public String u;

    public yrw(Handler handler, View view, yyt yyt, yim yim, ymx ymx) {
        super(view);
        this.p = view.getContext();
        this.q = (Handler) amqw.a((Object) handler);
        this.r = (yyt) amqw.a((Object) yyt);
        this.s = (yim) amqw.a((Object) yim);
        this.t = (ymx) amqw.a((Object) ymx);
    }
}
