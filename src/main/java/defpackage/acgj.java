package defpackage;

import android.os.Handler;

/* renamed from: acgj */
final class acgj implements afsw {
    public final acfi a;
    private final Handler b;
    private final acvx c;

    public acgj(Handler handler, acvx acvx, acfi acfi) {
        this.b = (Handler) amqw.a((Object) handler);
        this.c = (acvx) amqw.a((Object) acvx);
        this.a = (acfi) amqw.a((Object) acfi);
    }

    public final void a(bqn bqn) {
        Handler handler = this.b;
        acfi acfi = this.a;
        acfi.getClass();
        handler.post(new acgi(acfi));
    }
}
