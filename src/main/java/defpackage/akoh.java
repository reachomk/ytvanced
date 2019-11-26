package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: akoh */
public final class akoh extends aknb {
    public final List a = new ArrayList();

    public final void a(aknh aknh) {
        a(-1, aknh);
    }

    public final void b(aknh aknh) {
        a(0, aknh);
    }

    public final void a(int i, aknh aknh) {
        if (i == -1) {
            i = this.a.size();
        }
        a(i, aknh, true);
    }

    public final void c(aknh aknh) {
        xak.a();
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                akog akog = (akog) this.a.get(size);
                if (akog.a == aknh) {
                    b(size);
                    c();
                    if (!akog.a.isEmpty()) {
                        d(akog.b, akog.a.d());
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void a(aknh aknh, aknh aknh2) {
        xak.a();
        int i = 0;
        while (i < this.a.size()) {
            akog akog = (akog) this.a.get(i);
            if (akog.a != aknh) {
                i++;
            } else {
                b(i);
                a(i, aknh2, false);
                c();
                if (akog.a.isEmpty()) {
                    int d = ((akog) this.a.get(i)).a.d();
                    if (d > 0) {
                        b(akog.b, d);
                    }
                } else {
                    akog akog2 = (akog) this.a.get(i);
                    int d2 = akog2.a.d();
                    int d3 = akog.a.d();
                    a(akog.b, Math.min(d3, d2));
                    if (d2 > d3) {
                        b(akog.b + d3, d2 - d3);
                    } else if (d3 > d2) {
                        d(akog2.b + d2, d3 - d2);
                        return;
                    }
                }
            }
        }
    }

    public final boolean a() {
        xak.a();
        if (this.a.isEmpty()) {
            return false;
        }
        int d = d();
        int size = this.a.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b(size);
        }
        if (d > 0) {
            d(0, d);
        }
        return true;
    }

    private final void a(int i, aknh aknh, boolean z) {
        xak.a();
        akog akog = new akog(this, aknh);
        akog.a.b(akog);
        this.a.add(i, akog);
        c();
        if (z && !akog.a.isEmpty()) {
            b(akog.b, akog.a.d());
        }
    }

    public final void b(int i) {
        xak.a();
        akng akng = (akog) this.a.get(i);
        akng.a.a(akng);
        this.a.remove(i);
    }

    public final void c() {
        int i = 0;
        for (akog akog : this.a) {
            akog.b = i;
            i = akog.b();
        }
    }

    public final akog d(int i) {
        if (i >= 0 && i < d()) {
            int size = this.a.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >> 1;
                akog akog = (akog) this.a.get(i3);
                if (i < akog.b) {
                    size = i3 - 1;
                } else if (i < akog.b()) {
                    return akog;
                } else {
                    i2 = i3 + 1;
                }
            }
        }
        return null;
    }

    public final int d(aknh aknh) {
        if (!(aknh == null || this.a.isEmpty())) {
            for (int i = 0; i < this.a.size(); i++) {
                if (((akog) this.a.get(i)).a == aknh) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int e(aknh aknh) {
        for (akog akog : this.a) {
            if (akog.a == aknh) {
                return akog.b;
            }
        }
        return -1;
    }

    public final int d() {
        if (this.a.isEmpty()) {
            return 0;
        }
        List list = this.a;
        return ((akog) list.get(list.size() - 1)).b();
    }

    public final boolean isEmpty() {
        return d() == 0;
    }

    public final Object c(int i) {
        akog d = d(i);
        if (d == null) {
            return null;
        }
        return d.a.c(d.a(i));
    }

    public final long a(int i) {
        akog d = d(i);
        if (d == null) {
            return 0;
        }
        return d.a.a(d.a(i));
    }

    public final void a(akor akor, int i) {
        super.a(akor, i);
        akog d = d(i);
        if (d != null) {
            d.a.a(akor, d.a(i));
        }
    }
}
