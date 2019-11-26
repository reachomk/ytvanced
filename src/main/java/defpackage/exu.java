package defpackage;

import android.content.res.Configuration;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: exu */
public final class exu {
    public boolean a = false;
    private final bcaa b;
    private Set c;
    private Set d;
    private Set e;

    public exu(bcaa bcaa) {
        this.b = bcaa;
    }

    public final void a() {
        for (exv a : (Set) this.b.get()) {
            a(a);
        }
    }

    public final void a(exv exv) {
        if (this.c == null) {
            this.c = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        this.c.add(exv);
    }

    public final void b(exv exv) {
        Set set = this.c;
        if (set != null) {
            set.remove(exv);
        }
    }

    public final void a(exw exw) {
        if (this.d == null) {
            this.d = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        this.d.add(exw);
    }

    public final void b(exw exw) {
        Set set = this.d;
        if (set != null) {
            set.remove(exw);
        }
    }

    public final void a(ext ext) {
        if (this.e == null) {
            this.e = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        this.e.add(ext);
    }

    public final void b() {
        this.a = true;
        Set<exv> set = this.c;
        if (set != null) {
            for (exv a : set) {
                a.a();
            }
        }
    }

    public final void c() {
        this.a = false;
        Set<exv> set = this.c;
        if (set != null) {
            for (exv b : set) {
                b.b();
            }
        }
    }

    public final void d() {
        Set<ext> set = this.e;
        if (set != null) {
            for (ext a : set) {
                a.a();
            }
        }
        this.e = null;
        this.d = null;
        this.c = null;
    }

    public final void a(Configuration configuration) {
        Set<exw> set = this.d;
        if (set != null) {
            for (exw a : set) {
                a.a(configuration);
            }
        }
    }
}
