package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: jhf */
public final class jhf {
    public final ata a = new ata(this.h);
    public final Map b = new IdentityHashMap();
    public akwy c;
    public akoq d;
    public Set e;
    public Set f;
    public Set g;
    private final atg h = new jhh(this);

    public final boolean a(RecyclerView recyclerView) {
        return recyclerView == this.c.o;
    }

    public final boolean a(aqj aqj) {
        return this.b.get(jhf.b(aqj)) != null;
    }

    public final boolean a(aqj aqj, aqj aqj2) {
        akpk akpk = (akpk) this.b.get(jhf.b(aqj));
        return akpk != null && akpk == ((akpk) this.b.get(jhf.b(aqj2)));
    }

    public static int a(aqj aqj, akpk akpk, akos akos) {
        return akpk.indexOf(akos.getItem(aqj.d()));
    }

    public static akot b(aqj aqj) {
        if (aqj == null) {
            return null;
        }
        if (aqj instanceof akoy) {
            return ((akoy) aqj).p;
        }
        return akoz.a(aqj.a);
    }

    public final void a(jhm jhm) {
        this.e = jhf.b(this.e, jhm);
    }

    public final void a(jhj jhj) {
        this.f = jhf.b(this.f, jhj);
    }

    public final void a(jhk jhk) {
        this.g = jhf.b(this.g, jhk);
    }

    private static Set b(Set set, Object obj) {
        if (obj != null) {
            if (set == null) {
                set = new HashSet();
            }
            set.add(obj);
        }
        return set;
    }

    public static void a(Set set, Object obj) {
        if (set != null) {
            set.remove(obj);
        }
    }

    public static void a(akor akor, String str, Object obj) {
        if (akor != null && obj != null) {
            akor.a(str, obj);
        }
    }

    public static Object a(akor akor, String str, Class cls) {
        Object a = akor != null ? akor.a(str) : null;
        if (cls.isInstance(a)) {
            return cls.cast(a);
        }
        return null;
    }
}
