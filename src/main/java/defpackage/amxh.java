package defpackage;

import java.util.Set;

/* renamed from: amxh */
class amxh extends amxc implements Set {
    public static final long serialVersionUID = 0;

    amxh(Set set, Object obj) {
        super(set, obj);
    }

    /* Access modifiers changed, original: 0000 */
    /* renamed from: b */
    public Set a() {
        return (Set) super.a();
    }

    public boolean equals(Object obj) {
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
