package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: txn */
public final class txn {
    public static tti a(Application application, tya tya) {
        tzm a;
        Object a2 = tzm.a().a();
        application = (Application) uhy.a((Object) application);
        txq txq = new txq(application);
        txq.c = new uau();
        txq.b = new ttl();
        txq.c = new uaw(application);
        txq.f = (tya) uhy.a((Object) tya);
        txq.g = (tzm) uhy.a(a2);
        ttm ttm = (ttm) uhy.a(txq.b);
        Application application2 = (Application) uhy.a(txq.a);
        tya tya2 = (tya) uhy.a(txq.f);
        tzu tzu = (tzu) uhy.a(txq.c);
        tzu tzu2 = txq.d;
        txp txp = new txp(txq);
        if (txq.g == null) {
            a = tzm.a().a();
        } else {
            a = txq.g;
        }
        tzm tzm = a;
        tzu2 = txq.e;
        return ttm.a(application2, tya2, tzu, txp, tzm, new txs());
    }

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
    }
}
