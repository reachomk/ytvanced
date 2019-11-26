package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: amwa */
abstract class amwa extends AbstractMap {
    private transient Set a;
    private transient Set b;
    private transient Collection c;

    amwa() {
    }

    public abstract Set a();

    public final Set entrySet() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        set = a();
        this.a = set;
        return set;
    }

    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        amvy amvy = new amvy(this);
        this.b = amvy;
        return amvy;
    }

    public final Collection values() {
        Collection collection = this.c;
        if (collection != null) {
            return collection;
        }
        amvx amvx = new amvx(this);
        this.c = amvx;
        return amvx;
    }
}
