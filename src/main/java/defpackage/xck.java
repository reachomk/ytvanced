package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: xck */
final class xck implements Runnable {
    private final xci a;
    private final Object b;
    private final Object c;

    xck(xci xci, Object obj, Object obj2) {
        this.a = xci;
        this.b = obj;
        this.c = obj2;
    }

    public final void run() {
        Object obj = this.c;
        obj.getClass();
        xci xci = this.a;
        xci.c.readLock().lock();
        Collection collection = null;
        Collection collection2;
        try {
            Map map = xci.b;
            Class cls = obj.getClass();
            if (map != null && map.containsKey(cls)) {
                collection2 = (Set) map.get(cls);
                if (!(collection2 == null || collection2.isEmpty())) {
                    collection2 = amuw.a(collection2);
                    xci.c.readLock().unlock();
                    if (r0 != null || r0.isEmpty()) {
                        xvj.a();
                    }
                    for (xcq xcq : r0) {
                        Object a = xcq.a();
                        if (a == null) {
                            if (collection == null) {
                                collection = new ArrayList();
                            }
                            collection.add(xcq);
                        } else {
                            int i = xcq.c;
                            if (i == this.b.hashCode() || i == xci.a.hashCode()) {
                                a.getClass();
                                xcq.b.a(this.c);
                            }
                        }
                    }
                    if (collection != null) {
                        this.a.a(collection);
                    }
                    xvj.a();
                    return;
                }
            }
            collection2 = amwp.a;
            xci.c.readLock().unlock();
        } catch (Exception e) {
            try {
                xtl.a("exception ", e);
                xci.c.readLock().unlock();
                collection2 = null;
            } catch (Throwable th) {
                xci.c.readLock().unlock();
            }
        }
        if (r0 != null) {
        }
        xvj.a();
    }
}
