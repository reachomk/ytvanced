package defpackage;

import android.os.Handler;

/* renamed from: acgo */
final class acgo implements afsw {
    private final Handler a;
    private final acfp b;

    acgo(Handler handler, acfp acfp) {
        this.a = (Handler) amqw.a((Object) handler);
        this.b = acfp;
    }

    public final void a(bqn bqn) {
        acef.a().a(7, 1, bqn);
        acfp acfp = this.b;
        if (acfp != null) {
            Handler handler = this.a;
            acfp.getClass();
            handler.post(new acgr(acfp));
        }
    }
}
