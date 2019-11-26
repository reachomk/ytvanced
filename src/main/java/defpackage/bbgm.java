package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: bbgm */
final class bbgm {
    public final boolean a;
    public final List b;
    public final Collection c;
    public final Collection d;
    public final int e;
    public final bbgp f;
    public final boolean g;
    public final boolean h;

    bbgm(List list, Collection collection, Collection collection2, bbgp bbgp, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        this.c = (Collection) amqw.a((Object) collection, (Object) "drainedSubstreams");
        this.f = bbgp;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        z3 = true;
        boolean z4 = !z2 || list == null;
        amqw.b(z4, (Object) "passThrough should imply buffer is null");
        z4 = (z2 && bbgp == null) ? false : true;
        amqw.b(z4, (Object) "passThrough should imply winningSubstream != null");
        z4 = !z2 || ((collection.size() == 1 && collection.contains(bbgp)) || (collection.size() == 0 && bbgp.b));
        amqw.b(z4, (Object) "passThrough should imply winningSubstream is drained");
        if (z && bbgp == null) {
            z3 = false;
        }
        amqw.b(z3, (Object) "cancelled should imply committed");
    }

    /* Access modifiers changed, original: final */
    public final bbgm a() {
        return !this.h ? new bbgm(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e) : this;
    }

    /* Access modifiers changed, original: final */
    public final bbgm a(bbgp bbgp) {
        Set singleton;
        amqw.b(this.h ^ 1, (Object) "hedging frozen");
        amqw.b(this.f == null, (Object) "already committed");
        Collection collection = this.d;
        if (collection == null) {
            singleton = Collections.singleton(bbgp);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(bbgp);
            singleton = Collections.unmodifiableCollection(arrayList);
        }
        return new bbgm(this.b, this.c, singleton, this.f, this.g, this.a, this.h, this.e + 1);
    }
}
