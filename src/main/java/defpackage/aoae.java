package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: aoae */
class aoae extends AbstractMap {
    public List a = Collections.emptyList();
    public Map b = Collections.emptyMap();
    public boolean c;
    private final int d;
    private volatile aoaj e;
    private Map f = Collections.emptyMap();

    static aoae a(int i) {
        return new aoad(i);
    }

    public void a() {
        if (!this.c) {
            Map emptyMap;
            if (this.b.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.b);
            }
            this.b = emptyMap;
            if (this.f.isEmpty()) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = Collections.unmodifiableMap(this.f);
            }
            this.f = emptyMap;
            this.c = true;
        }
    }

    public final int b() {
        return this.a.size();
    }

    public final Entry b(int i) {
        return (Entry) this.a.get(i);
    }

    public final Iterable c() {
        if (this.b.isEmpty()) {
            return aoag.b;
        }
        return this.b.entrySet();
    }

    public final int size() {
        return this.a.size() + this.b.size();
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((aoah) this.a.get(a)).b;
        }
        return this.b.get(comparable);
    }

    /* renamed from: a */
    public final Object put(Comparable comparable, Object obj) {
        d();
        int a = a(comparable);
        if (a >= 0) {
            return ((aoah) this.a.get(a)).setValue(obj);
        }
        d();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(this.d);
        }
        a = -(a + 1);
        if (a >= this.d) {
            return e().put(comparable, obj);
        }
        int size = this.a.size();
        int i = this.d;
        if (size == i) {
            aoah aoah = (aoah) this.a.remove(i - 1);
            e().put(aoah.a, aoah.b);
        }
        this.a.add(a, new aoah(this, comparable, obj));
        return null;
    }

    public final void clear() {
        d();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }

    public final Object remove(Object obj) {
        d();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return c(a);
        }
        return !this.b.isEmpty() ? this.b.remove(comparable) : null;
    }

    public final Object c(int i) {
        d();
        Object obj = ((aoah) this.a.remove(i)).b;
        if (!this.b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            this.a.add(new aoah(this, (Entry) it.next()));
            it.remove();
        }
        return obj;
    }

    private final int a(Comparable comparable) {
        int compareTo;
        int size = this.a.size() - 1;
        int i = 0;
        if (size >= 0) {
            compareTo = comparable.compareTo(((aoah) this.a.get(size)).a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            compareTo = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((aoah) this.a.get(compareTo)).a);
            if (compareTo2 < 0) {
                size = compareTo - 1;
            } else if (compareTo2 <= 0) {
                return compareTo;
            } else {
                i = compareTo + 1;
            }
        }
        return -(i + 1);
    }

    public final Set entrySet() {
        if (this.e == null) {
            this.e = new aoaj(this);
        }
        return this.e;
    }

    public final void d() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap e() {
        d();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            this.b = new TreeMap();
            this.f = ((TreeMap) this.b).descendingMap();
        }
        return (SortedMap) this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoae)) {
            return super.equals(obj);
        }
        aoae aoae = (aoae) obj;
        int size = size();
        if (size != aoae.size()) {
            return false;
        }
        int b = b();
        if (b != aoae.b()) {
            return entrySet().equals(aoae.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!b(i).equals(aoae.b(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.b.equals(aoae.b);
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < b(); i2++) {
            i += ((aoah) this.a.get(i2)).hashCode();
        }
        return this.b.size() > 0 ? i + this.b.hashCode() : i;
    }

    /* synthetic */ aoae(int i) {
        this.d = i;
    }
}
