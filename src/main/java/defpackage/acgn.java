package defpackage;

import android.os.Handler;

/* renamed from: acgn */
final class acgn implements afsw {
    public final acfk a;
    private final Handler b;
    private final acvx c;

    public acgn(Handler handler, acvx acvx, acfk acfk) {
        this.b = (Handler) amqw.a((Object) handler);
        this.c = (acvx) amqw.a((Object) acvx);
        this.a = (acfk) amqw.a((Object) acfk);
    }

    public final void a(bqn bqn) {
        Handler handler = this.b;
        acfk acfk = this.a;
        acfk.getClass();
        handler.post(new acgm(acfk));
    }
}
