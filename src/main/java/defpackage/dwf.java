package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: dwf */
abstract class dwf implements dwm {
    private final bcaa a;
    private final int b;
    private final boolean c;
    private final boolean d;
    private final String e;
    private final Set f = new HashSet();
    private final amsp g = new amtt();
    private final ReferenceQueue h = new ReferenceQueue();
    private final Queue i = new ArrayDeque();

    protected dwf(bcaa bcaa, int i, boolean z, boolean z2, String str) {
        this.a = bcaa;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    public abstract int b();

    public void a(dwl dwl, String str, Object obj, boolean z) {
        if (!z) {
            if (this.c) {
                WeakReference weakReference = (WeakReference) this.g.get(dwl);
                if (weakReference == null || weakReference.get() != obj) {
                    alwu alwu;
                    String str2;
                    if (obj != null) {
                        this.g.put(dwl, new WeakReference(obj, this.h));
                        alwu = (alwu) this.a.get();
                        str = amqu.b(str);
                        str2 = this.e;
                        ((uib) alwu.c.get()).a(str, str2);
                    } else if (weakReference != null) {
                        this.g.remove(dwl);
                        alwu = (alwu) this.a.get();
                        str = amqu.b(str);
                        str2 = this.e;
                        ((uib) alwu.d.get()).a(str, str2);
                    }
                }
            }
            if (this.d) {
                this.f.remove(dwl);
            }
        }
    }

    public void a(dwl dwl) {
        if (this.c && this.g.containsKey(dwl)) {
            this.g.remove(dwl);
        }
        if (this.d) {
            this.f.add(dwl);
        }
    }

    public final boolean b(dwl dwl) {
        return this.d ? this.f.contains(dwl) : false;
    }

    public final boolean a() {
        c();
        Object obj = (this.b == 0 || b() <= this.b) ? null : 1;
        return (obj == null && (this.i.isEmpty() ^ 1) == 0) ? false : true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(List list) {
        if (this.c) {
            c();
            if (!this.i.isEmpty()) {
                for (WeakReference weakReference : this.i) {
                    dwl dwl = (dwl) this.g.a().get(weakReference);
                    if (dwl != null) {
                        list.add(dwl);
                    }
                }
            }
        }
    }

    private final void c() {
        if (this.c) {
            while (true) {
                Reference poll = this.h.poll();
                if (poll != null) {
                    Class cls = WeakReference.class;
                    if (cls.isInstance(poll)) {
                        this.i.add((WeakReference) cls.cast(poll));
                    }
                } else {
                    return;
                }
            }
        }
    }
}
