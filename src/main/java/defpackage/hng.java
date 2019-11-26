package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: hng */
public final class hng implements xcp {
    public boolean a = false;
    private final Set b = Collections.newSetFromMap(new WeakHashMap());

    hng() {
    }

    public final void a(hnj hnj) {
        this.b.add(hnj);
    }

    public final void b(hnj hnj) {
        this.b.remove(hnj);
    }

    private final void a(boolean z) {
        xak.a();
        if (this.a != z) {
            this.a = z;
            if (!this.b.isEmpty()) {
                amxn amxn = (amxn) amul.a(this.b).listIterator();
                while (amxn.hasNext()) {
                    ((hnj) amxn.next()).a();
                }
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aglt.class, aglw.class, aglv.class};
        } else if (i == 0) {
            a(false);
            return null;
        } else if (i == 1) {
            a(true);
            return null;
        } else if (i == 2) {
            a(false);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
