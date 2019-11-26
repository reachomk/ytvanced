package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: agdr */
final class agdr {
    public final Map a = new HashMap();
    private final Map b = new HashMap();

    agdr() {
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized agdu a(agqi agqi, Collection collection) {
        agdu agdu;
        amqw.a((Object) agqi);
        String str = agqi.a;
        agdu = new agdu(this, agqi);
        if (collection != null) {
            agdu.a(agqi.e - collection.size());
        }
        agdu.a();
        agdu.b();
        if (collection != null) {
            for (String a : collection) {
                agdu.a(a);
            }
        }
        this.a.put(str, agdu);
        return agdu;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized agdu a(String str) {
        xvd.a(str);
        return (agdu) this.a.get(str);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(String str) {
        xvd.a(str);
        this.a.remove(str);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized List c(String str) {
        ArrayList arrayList;
        xvd.a(str);
        arrayList = new ArrayList();
        Set<String> set = (Set) this.b.get(str);
        if (set != null) {
            for (String a : set) {
                agdu a2 = a(a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        return arrayList;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(String str, String str2) {
        Set set = (Set) this.b.get(str);
        if (set == null) {
            set = new HashSet();
            this.b.put(str, set);
        }
        set.add(str2);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b(String str, String str2) {
        Set set = (Set) this.b.get(str);
        if (set != null) {
            set.remove(str2);
            if (set.isEmpty()) {
                this.b.remove(str);
            }
        }
    }
}
