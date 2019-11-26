package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: agdv */
final class agdv {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    agdv() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized agea a(agqr agqr, Collection collection) {
        agea agea;
        amqw.a((Object) agqr);
        String str = agqr.a;
        agea = new agea(this, agqr);
        agea.a();
        agea.b();
        if (collection != null) {
            for (String a : collection) {
                agea.a(a);
            }
        }
        this.a.put(str, agea);
        return agea;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized agea a(String str) {
        xvd.a(str);
        return (agea) this.a.get(str);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(String str) {
        xvd.a(str);
        this.a.remove(str);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized List c(String str) {
        LinkedList linkedList;
        xvd.a(str);
        linkedList = new LinkedList();
        Set<String> set = (Set) this.b.get(str);
        if (set != null) {
            for (String a : set) {
                agea a2 = a(a);
                if (a2 != null) {
                    linkedList.add(a2);
                }
            }
        }
        return linkedList;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(String str, String str2) {
        xvd.a(str);
        xvd.a(str2);
        Set set = (Set) this.b.get(str);
        if (set == null) {
            set = new HashSet();
            this.b.put(str, set);
        }
        set.add(str2);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(String str, String str2) {
        xvd.a(str);
        xvd.a(str2);
        Set set = (Set) this.b.get(str);
        if (set != null) {
            set.remove(str2);
            if (set.isEmpty()) {
                this.b.remove(str);
            }
        }
    }
}
