package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: amww */
final class amww extends amxd {
    public static final long serialVersionUID = 0;
    private transient Set c;
    private transient Collection d;

    amww(Map map, Object obj) {
        super(map, obj);
    }

    public final Set entrySet() {
        Set set;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new amwv(a().entrySet(), this.b);
            }
            set = this.c;
        }
        return set;
    }

    public final Collection values() {
        Collection collection;
        synchronized (this.b) {
            if (this.d == null) {
                this.d = new amxa(a().values(), this.b);
            }
            collection = this.d;
        }
        return collection;
    }

    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final /* synthetic */ Object get(Object obj) {
        synchronized (this.b) {
            Collection collection = (Collection) super.get(obj);
            obj = collection != null ? amwt.b(collection, this.b) : null;
        }
        return obj;
    }
}
