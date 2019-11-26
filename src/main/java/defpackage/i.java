package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: i */
public class i implements Iterable {
    public j b;
    public j c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    /* Access modifiers changed, original: protected */
    public j a(Object obj) {
        j jVar = this.b;
        while (jVar != null && !jVar.a.equals(obj)) {
            jVar = jVar.c;
        }
        return jVar;
    }

    public Object a(Object obj, Object obj2) {
        j a = a(obj);
        if (a != null) {
            return a.b;
        }
        b(obj, obj2);
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final j b(Object obj, Object obj2) {
        j jVar = new j(obj, obj2);
        this.e++;
        j jVar2 = this.c;
        if (jVar2 == null) {
            this.b = jVar;
            this.c = this.b;
            return jVar;
        }
        jVar2.c = jVar;
        jVar.d = jVar2;
        this.c = jVar;
        return jVar;
    }

    public Object b(Object obj) {
        j a = a(obj);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (o c : this.d.keySet()) {
                c.c(a);
            }
        }
        j jVar = a.d;
        if (jVar != null) {
            jVar.c = a.c;
        } else {
            this.b = a.c;
        }
        j jVar2 = a.c;
        if (jVar2 != null) {
            jVar2.d = jVar;
        } else {
            this.c = jVar;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    public final Iterator iterator() {
        h hVar = new h(this.b, this.c);
        this.d.put(hVar, Boolean.valueOf(false));
        return hVar;
    }

    public final m a() {
        m mVar = new m(this);
        this.d.put(mVar, Boolean.valueOf(false));
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.e == iVar.e) {
                Iterator it = iterator();
                Iterator it2 = iVar.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Entry entry = (Entry) it.next();
                    Object next = it2.next();
                    if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                        return false;
                    }
                }
                return (it.hasNext() || it2.hasNext()) ? false : true;
            }
        }
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Entry) it.next()).hashCode();
        }
        return i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
