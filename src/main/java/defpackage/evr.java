package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: evr */
public final class evr implements evs, Comparable {
    public final long a;
    private final WeakReference b;

    public evr(evs evs, long j) {
        this.b = new WeakReference((evs) amqw.a((Object) evs));
        this.a = j;
    }

    public final void a(String str) {
        evs evs = (evs) this.b.get();
        if (evs != null) {
            evs.a(str);
        }
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj instanceof evr) {
            evs evs = (evs) this.b.get();
            evs evs2 = (evs) ((evr) obj).b.get();
            if (evs != evs2) {
                if (evs == null) {
                    z = false;
                } else if (evs.equals(evs2)) {
                    return z;
                }
            }
            return z;
        }
        return false;
    }

    public final int hashCode() {
        evs evs = (evs) this.b.get();
        if (evs == null) {
            return 0;
        }
        return evs.hashCode();
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.a).compareTo(Long.valueOf(((evr) obj).a));
    }
}
