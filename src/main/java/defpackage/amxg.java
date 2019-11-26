package defpackage;

import java.util.Collection;
import java.util.Map;

/* renamed from: amxg */
class amxg extends amxf implements amvz {
    public static final long serialVersionUID = 0;
    private transient Map c;

    /* Access modifiers changed, original: 0000 */
    public amvz a() {
        return (amvz) this.a;
    }

    amxg(amvz amvz) {
        super(amvz, null);
    }

    public final boolean a(Object obj) {
        boolean a;
        synchronized (this.b) {
            a = a().a(obj);
        }
        return a;
    }

    public final boolean a(Object obj, Object obj2) {
        boolean a;
        synchronized (this.b) {
            a = a().a(obj, obj2);
        }
        return a;
    }

    public final boolean b(Object obj, Object obj2) {
        boolean b;
        synchronized (this.b) {
            b = a().b(obj, obj2);
        }
        return b;
    }

    public Collection b(Object obj) {
        Collection b;
        synchronized (this.b) {
            b = a().b(obj);
        }
        return b;
    }

    public final Map c() {
        Map map;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = new amww(a().c(), this.b);
            }
            map = this.c;
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean equals;
        synchronized (this.b) {
            equals = a().equals(obj);
        }
        return equals;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.b) {
            hashCode = a().hashCode();
        }
        return hashCode;
    }
}
