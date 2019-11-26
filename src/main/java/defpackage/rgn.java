package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: rgn */
final class rgn implements rha {
    private final rgh a;
    private final rhp b;
    private final boolean c;
    private final rei d;

    private rgn(rhp rhp, rei rei, rgh rgh) {
        this.b = rhp;
        this.c = rei.a(rgh);
        this.d = rei;
        this.a = rgh;
    }

    static rgn a(rhp rhp, rei rei, rgh rgh) {
        return new rgn(rhp, rei, rgh);
    }

    public final Object a() {
        return this.a.j().e();
    }

    public final boolean a(Object obj, Object obj2) {
        if (this.b.b(obj).equals(this.b.b(obj2))) {
            return this.c ? this.d.a(obj).equals(this.d.a(obj2)) : true;
        } else {
            return false;
        }
    }

    public final int a(Object obj) {
        int hashCode = this.b.b(obj).hashCode();
        return this.c ? (hashCode * 53) + this.d.a(obj).hashCode() : hashCode;
    }

    public final void b(Object obj, Object obj2) {
        rhc.a(this.b, obj, obj2);
        if (this.c) {
            rhc.a(this.d, obj, obj2);
        }
    }

    public final void a(Object obj, rik rik) {
        Iterator c = this.d.a(obj).c();
        while (c.hasNext()) {
            Entry entry = (Entry) c.next();
            reo reo = (reo) entry.getKey();
            if (reo.g() != 9 || reo.c() || reo.d()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof rfo) {
                rik.a(reo.a(), ((rfl) ((rfo) entry).a.getValue()).c());
            } else {
                rik.a(reo.a(), entry.getValue());
            }
        }
        rhp rhp = this.b;
        rhp.b(rhp.b(obj), rik);
    }

    public final void a(Object obj, byte[] bArr, int i, int i2, rcx rcx) {
        reu reu = (reu) obj;
        rhs rhs = reu.zzuhr;
        if (rhs == rhs.a) {
            rhs = rhs.a();
            reu.zzuhr = rhs;
        }
        rhs rhs2 = rhs;
        while (i < i2) {
            int a = rcy.a(bArr, i, rcx);
            int i3 = rcx.a;
            if (i3 == 11) {
                i = 0;
                Object obj2 = null;
                while (a < i2) {
                    a = rcy.a(bArr, a, rcx);
                    int i4 = rcx.a;
                    int i5 = i4 & 7;
                    int i6 = i4 >>> 3;
                    if (i6 != 2) {
                        if (i6 == 3 && i5 == 2) {
                            a = rcy.e(bArr, a, rcx);
                            obj2 = (rdg) rcx.c;
                        }
                    } else if (i5 == 0) {
                        a = rcy.a(bArr, a, rcx);
                        i = rcx.a;
                    }
                    if (i4 == 12) {
                        break;
                    }
                    a = rcy.a(i4, bArr, a, i2, rcx);
                }
                if (obj2 != null) {
                    rhs2.a((i << 3) | 2, obj2);
                }
                i = a;
            } else if ((i3 & 7) != 2) {
                i = rcy.a(i3, bArr, a, i2, rcx);
            } else {
                i = rcy.a(i3, bArr, a, i2, rhs2, rcx);
            }
        }
        if (i != i2) {
            throw rfk.h();
        }
    }

    public final void a(Object obj, rgx rgx, reg reg) {
        rhp rhp = this.b;
        rei rei = this.d;
        Object c = rhp.c(obj);
        rem b = rei.b(obj);
        while (rgx.a() != Integer.MAX_VALUE) {
            int b2 = rgx.b();
            if (b2 != 11) {
                boolean c2;
                if ((b2 & 7) != 2) {
                    c2 = rgx.c();
                } else if (rei.a(reg, this.a, b2 >>> 3) != null) {
                    rei.a(rgx, reg, b);
                } else {
                    c2 = rhp.a(c, rgx);
                }
                if (!c2) {
                    return;
                }
            } else {
                b2 = 0;
                Object obj2 = null;
                rdg rdg = null;
                while (rgx.a() != Integer.MAX_VALUE) {
                    try {
                        int b3 = rgx.b();
                        if (b3 == 16) {
                            b2 = rgx.o();
                            obj2 = rei.a(reg, this.a, b2);
                        } else if (b3 != 26) {
                            if (!rgx.c()) {
                                break;
                            }
                        } else if (obj2 == null) {
                            rdg = rgx.n();
                        } else {
                            rei.a(rgx, reg, b);
                        }
                    } finally {
                        rhp.b(obj, c);
                    }
                }
                if (rgx.b() != 12) {
                    throw rfk.e();
                } else if (rdg != null) {
                    if (obj2 != null) {
                        rei.a(rdg, reg, b);
                    } else {
                        rhp.a(c, b2, rdg);
                    }
                }
            }
        }
        rhp.b(obj, c);
    }

    public final void c(Object obj) {
        this.b.d(obj);
        this.d.c(obj);
    }

    public final boolean d(Object obj) {
        return this.d.a(obj).d();
    }

    public final int b(Object obj) {
        rhp rhp = this.b;
        int e = rhp.e(rhp.b(obj));
        if (!this.c) {
            return e;
        }
        rem a = this.d.a(obj);
        int i = 0;
        for (int i2 = 0; i2 < a.a.b(); i2++) {
            i += rem.b(a.a.b(i2));
        }
        for (Entry b : a.a.c()) {
            i += rem.b(b);
        }
        return e + i;
    }
}
