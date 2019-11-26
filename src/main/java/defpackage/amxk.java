package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: amxk */
final class amxk extends amxh implements SortedSet {
    public static final long serialVersionUID = 0;

    amxk(SortedSet sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    private final SortedSet c() {
        return (SortedSet) super.a();
    }

    public final Comparator comparator() {
        Comparator comparator;
        synchronized (this.b) {
            comparator = c().comparator();
        }
        return comparator;
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        SortedSet a;
        synchronized (this.b) {
            a = amwt.a(c().subSet(obj, obj2), this.b);
        }
        return a;
    }

    public final SortedSet headSet(Object obj) {
        SortedSet a;
        synchronized (this.b) {
            a = amwt.a(c().headSet(obj), this.b);
        }
        return a;
    }

    public final SortedSet tailSet(Object obj) {
        SortedSet a;
        synchronized (this.b) {
            a = amwt.a(c().tailSet(obj), this.b);
        }
        return a;
    }

    public final Object first() {
        Object first;
        synchronized (this.b) {
            first = c().first();
        }
        return first;
    }

    public final Object last() {
        Object last;
        synchronized (this.b) {
            last = c().last();
        }
        return last;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Set b() {
        return c();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Collection a() {
        return c();
    }
}
