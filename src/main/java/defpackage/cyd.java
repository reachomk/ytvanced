package defpackage;

import java.util.Map;

/* renamed from: cyd */
public class cyd implements dbz {
    public Map a;
    private final Map b;

    cyd(cyg cyg) {
        this.b = cyg.a;
        this.a = cyg.b;
    }

    public boolean c() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public final void k() {
    }

    public final boolean a() {
        Map map = this.b;
        if (map != null) {
            String str = "is_sticky";
            if (map.containsKey(str)) {
                return ((Boolean) this.b.get(str)).booleanValue();
            }
        }
        return false;
    }

    public final boolean b() {
        Map map = this.b;
        if (map != null) {
            String str = "is_full_span";
            if (map.containsKey(str)) {
                return ((Boolean) this.b.get(str)).booleanValue();
            }
        }
        return false;
    }

    public final Object a(String str) {
        Map map = this.b;
        return map != null ? map.get(str) : null;
    }

    public cma d() {
        throw new UnsupportedOperationException();
    }

    public coj e() {
        throw new UnsupportedOperationException();
    }

    public cyb g() {
        throw new UnsupportedOperationException();
    }

    public cye h() {
        throw new UnsupportedOperationException();
    }

    public int j() {
        throw new UnsupportedOperationException();
    }

    public void a(int i) {
        throw new UnsupportedOperationException();
    }
}
