package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: abqi */
public final class abqi {
    public final LinkedList a = new LinkedList();

    public final void a(abql abql) {
        this.a.add(new WeakReference(abql));
    }

    public final void a(abql abql, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            abql abql2 = (abql) ((WeakReference) it.next()).get();
            if (!(abql2 == null || abql2.equals(abql))) {
                abql2.a(z);
            }
        }
    }
}
