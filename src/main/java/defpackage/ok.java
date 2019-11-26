package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: ok */
final class ok extends az {
    private static final be f = new on();
    public final HashSet a = new HashSet();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final boolean d;
    public boolean e = false;

    static ok a(bf bfVar) {
        return (ok) new bc(bfVar, f).a(ok.class);
    }

    ok(boolean z) {
        this.d = z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        this.e = true;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(nf nfVar) {
        if (this.a.contains(nfVar) && this.d) {
            return this.e;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ok okVar = (ok) obj;
            return this.a.equals(okVar.a) && this.b.equals(okVar.b) && this.c.equals(okVar.c);
        }
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("FragmentManagerViewModel{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("} Fragments (");
        Iterator it = this.a.iterator();
        while (true) {
            str = ", ";
            if (!it.hasNext()) {
                break;
            }
            stringBuilder.append(it.next());
            if (it.hasNext()) {
                stringBuilder.append(str);
            }
        }
        stringBuilder.append(") Child Non Config (");
        it = this.b.keySet().iterator();
        while (it.hasNext()) {
            stringBuilder.append((String) it.next());
            if (it.hasNext()) {
                stringBuilder.append(str);
            }
        }
        stringBuilder.append(") ViewModelStores (");
        it = this.c.keySet().iterator();
        while (it.hasNext()) {
            stringBuilder.append((String) it.next());
            if (it.hasNext()) {
                stringBuilder.append(str);
            }
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
