package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* renamed from: amrz */
abstract class amrz extends amsl implements Serializable {
    public static final long serialVersionUID = 2447537837011683357L;
    public transient Map a;
    public transient int b;

    protected amrz(Map map) {
        amqw.a(map.isEmpty());
        this.a = map;
    }

    public abstract Collection a();

    /* Access modifiers changed, original: 0000 */
    public Collection a(Object obj, Collection collection) {
        throw null;
    }

    public boolean a(Object obj) {
        throw null;
    }

    public Collection b(Object obj) {
        throw null;
    }

    public void b() {
        throw null;
    }

    /* Access modifiers changed, original: final */
    public final List a(Object obj, List list, amsi amsi) {
        if (list instanceof RandomAccess) {
            return new amsf(this, obj, list, amsi);
        }
        return new amsk(this, obj, list, amsi);
    }

    static /* synthetic */ int b(amrz amrz, int i) {
        int i2 = amrz.b - i;
        amrz.b = i2;
        return i2;
    }
}
