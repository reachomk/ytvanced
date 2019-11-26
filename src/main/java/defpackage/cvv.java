package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: cvv */
final class cvv implements cwy {
    private static final boolean a = cuj.c;
    private final cwy b;
    private final SparseArray c = new SparseArray();
    private final cxd d;
    private final String e;
    private int f = Integer.MAX_VALUE;
    private int g = -1;
    private int h = -1;

    cvv(cwy cwy, cxd cxd, String str) {
        this.b = cwy;
        this.d = cxd;
        this.e = str;
    }

    public final void a(int i, dbz dbz) {
        if (this.f == 1) {
            int i2 = this.g;
            if (i >= i2) {
                int i3 = this.h;
                int i4 = i2 + i3;
                if (i <= i4 && i >= i4) {
                    this.h = i3 + 1;
                    this.g = Math.min(i, i2);
                    this.c.put(i, dbz);
                    return;
                }
            }
        }
        b();
        this.g = i;
        this.h = 1;
        this.f = 1;
        this.c.put(i, dbz);
    }

    public final void a(int i, int i2, List list) {
        b();
        this.b.a(i, i2, list);
        if (a) {
            a(i, list);
        }
    }

    public final void b(int i, dbz dbz) {
        if (this.f == 2) {
            int i2 = this.g;
            int i3 = this.h + i2;
            if (i <= i3) {
                int i4 = i + 1;
                if (i4 >= i2) {
                    this.g = Math.min(i, i2);
                    this.h = Math.max(i3, i4) - this.g;
                    this.c.put(i, dbz);
                    return;
                }
            }
        }
        b();
        this.g = i;
        this.h = 1;
        this.f = 2;
        this.c.put(i, dbz);
    }

    public final void b(int i, int i2, List list) {
        b();
        this.b.b(i, i2, list);
        if (a) {
            b(i, list);
        }
    }

    public final void a(int i) {
        if (this.f == 3) {
            int i2 = this.g;
            if (i2 >= i && i2 <= i + 1) {
                this.h++;
                this.g = i;
                return;
            }
        }
        b();
        this.g = i;
        this.h = 1;
        this.f = 3;
    }

    public final void a(int i, int i2) {
        b();
        this.b.a(i, i2);
    }

    public final void b(int i, int i2) {
        b();
        this.b.b(i, i2);
        if (a) {
            this.d.a(this.e, i, i2, Thread.currentThread().getName());
        }
    }

    public final void a(boolean z, cyi cyi) {
        this.b.a(z, cyi);
    }

    public final boolean a() {
        return this.b.a();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        int i = this.f;
        if (i != Integer.MAX_VALUE) {
            List a;
            int i2;
            cwy cwy;
            int i3;
            cxd cxd;
            String str;
            if (i == 1) {
                a = cvv.a(this.g, this.h, this.c);
                i2 = this.h;
                if (i2 > 1) {
                    this.b.a(this.g, i2, a);
                    if (a) {
                        a(this.g, a);
                    }
                } else {
                    cwy = this.b;
                    i3 = this.g;
                    cwy.a(i3, (dbz) this.c.get(i3));
                    if (a) {
                        cxd = this.d;
                        str = this.e;
                        i2 = this.g;
                        cxd.a(str, i2, (dbz) this.c.get(i2), Thread.currentThread().getName());
                    }
                }
            } else if (i == 2) {
                a = cvv.a(this.g, this.h, this.c);
                i2 = this.h;
                if (i2 > 1) {
                    this.b.b(this.g, i2, a);
                    if (a) {
                        b(this.g, a);
                    }
                } else {
                    cwy = this.b;
                    i3 = this.g;
                    cwy.b(i3, (dbz) this.c.get(i3));
                    if (a) {
                        cxd = this.d;
                        str = this.e;
                        i2 = this.g;
                        cxd.b(str, i2, (dbz) this.c.get(i2), Thread.currentThread().getName());
                    }
                }
            } else if (i == 3) {
                i = this.h;
                if (i > 1) {
                    this.b.a(this.g, i);
                    if (a) {
                        i = this.g;
                        i3 = this.h;
                        for (i2 = 0; i2 < i3; i2++) {
                            this.d.a(this.e, i + i2, Thread.currentThread().getName());
                        }
                    }
                } else {
                    this.b.a(this.g);
                    if (a) {
                        this.d.a(this.e, this.g, Thread.currentThread().getName());
                    }
                }
            }
            this.f = Integer.MAX_VALUE;
            this.c.clear();
        }
    }

    private static List a(int i, int i2, SparseArray sparseArray) {
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i;
        while (i3 < i + i2) {
            dbz dbz = (dbz) sparseArray.get(i3);
            if (dbz != null) {
                arrayList.add(dbz);
                i3++;
            } else {
                throw new IllegalStateException(String.format(Locale.US, "Index %d does not have a corresponding renderInfo", new Object[]{Integer.valueOf(i3)}));
            }
        }
        return arrayList;
    }

    private final void a(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.d.a(this.e, i + i2, (dbz) list.get(i2), Thread.currentThread().getName());
        }
    }

    private final void b(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.d.b(this.e, i + i2, (dbz) list.get(i2), Thread.currentThread().getName());
        }
    }
}
