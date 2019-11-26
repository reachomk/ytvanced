package defpackage;

import android.util.Property;
import java.util.concurrent.TimeUnit;

/* renamed from: ahle */
final class ahle extends Property {
    ahle(Class cls, String str) {
        super(cls, str);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return ((ahlh) obj).b;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ahlh ahlh = (ahlh) obj;
        Long l = (Long) obj2;
        ahlh.b = l;
        ahlh.c.a.b(l.longValue(), ahlh.a);
        ahlh.c.c.d(new ahkv(TimeUnit.MILLISECONDS.toSeconds(l.longValue()), TimeUnit.MILLISECONDS.toSeconds(ahlh.a)));
        if (l.longValue() == ahlh.a) {
            ahlh.c.b(true);
        }
    }
}
