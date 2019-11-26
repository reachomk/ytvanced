package defpackage;

import android.app.Notification;
import android.util.Pair;
import java.util.HashSet;
import java.util.Set;

/* renamed from: agrn */
public final class agrn {
    public boolean a = false;
    private final xah b;
    private final agrs c;
    private String d;
    private int e;
    private final Set f = new HashSet();

    public agrn(agrs agrs, xah xah) {
        this.c = agrs;
        this.b = xah;
    }

    private final void b(String str, int i) {
        if (this.a && this.e == i && this.d.equals(str)) {
            b();
        }
    }

    private final void b() {
        agxq agxq = (agxq) this.b.a();
        if (agxq != null) {
            agxq.a.b();
        }
        this.a = false;
    }

    public final synchronized void a(String str, int i, Notification notification) {
        agxq agxq = (agxq) this.b.a();
        if (agxq != null) {
            xtl.e("Transfer service: Starting Foreground ...");
            agxq.a.startForeground(i, notification);
            this.e = i;
            this.d = str;
            this.a = true;
            this.f.add(new Pair(str, Integer.valueOf(i)));
            return;
        }
        xtl.d("Transfer service: Failed to start foreground due to null binder.");
        this.c.a(str, i, notification);
    }

    public final synchronized void b(String str, int i, Notification notification) {
        b(str, i);
        this.c.a(str, i, notification);
    }

    public final synchronized void a(String str, int i) {
        b(str, i);
        Set set = this.f;
        Integer valueOf = Integer.valueOf(i);
        set.remove(new Pair(str, valueOf));
        agrs agrs = this.c;
        synchronized (agrs.b) {
            agrs.b.remove(new Pair(str, valueOf));
        }
        agrs.a.cancel(str, i);
    }

    public final synchronized void a() {
        b();
        this.f.clear();
        agrs agrs = this.c;
        synchronized (agrs.b) {
            synchronized (agrs.b) {
                Set<Pair> set = agrs.b;
            }
            for (Pair pair : set) {
                agrs.a.cancel((String) pair.first, ((Integer) pair.second).intValue());
            }
            agrs.b.clear();
        }
    }
}
