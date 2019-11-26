package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: aijg */
public final class aijg {
    public static final aiji a = new aijf();
    public final airv b;
    private final Executor c;
    private final zzl d;

    public aijg(airv airv, Executor executor, zzl zzl) {
        this.b = (airv) amqw.a((Object) airv);
        this.c = (Executor) amqw.a((Object) executor);
        this.d = (zzl) amqw.a((Object) zzl);
    }

    public final void a(aiqq aiqq, airf airf, aiji aiji) {
        if (TextUtils.isEmpty(aiqq.b()) || airf == null || (airf.b() == 1 && airf.a() <= 0)) {
            aiji.a(4);
            return;
        }
        awdw awdw = this.d.b().l;
        if (awdw == null) {
            awdw = awdw.E;
        }
        if (awdw.m) {
            aiji.a(5);
        } else {
            this.c.execute(new aijh(this, aiqq, airf, aiji));
        }
    }
}
