package defpackage;

/* renamed from: lic */
public final class lic implements ekm, ela, lra, lrm, xcp {
    private static final lix a = new lid(1, 1.777f);
    private final lip b;
    private final ekj c;
    private final ekt d;
    private final xci e;
    private final boolean f;
    private Float g;
    private String h;
    private float i;
    private boolean j;
    private boolean k;

    public lic(ekj ekj, ekt ekt, xci xci, zyw zyw, lip lip) {
        boolean f = foh.f(zyw);
        this.c = ekj;
        this.d = ekt;
        this.e = xci;
        this.f = f;
        this.b = lip;
    }

    public final void a(int i, int i2) {
        boolean b = lrh.b(i);
        boolean b2 = lrh.b(i2);
        if (b == b2) {
            return;
        }
        if (b2) {
            this.e.a((Object) this);
            this.d.a((ela) this);
            return;
        }
        this.e.b(this);
        this.d.a.remove(this);
    }

    public final void a(lqz lqz, lqz lqz2) {
        Object c;
        Object obj;
        if (lqz != null) {
            c = lqz.a.c();
        } else {
            c = null;
        }
        if (lqz2 == null) {
            obj = null;
        } else {
            obj = lqz2.a.c();
        }
        this.j = false;
        this.g = null;
        this.k = false;
        if (c != null) {
            xsb.b(this.c.a, c, this);
            lqz.h = this.b.b;
        }
        if (obj != null) {
            float a = this.c.a((String) obj);
            this.i = a;
            if (this.f) {
                float f = lqz2.h;
                if (f == 0.0f) {
                    f = a;
                }
                this.g = Float.valueOf(f);
                a();
            }
            xsb.a(this.c.a, obj, (Object) this);
            this.b.a(this.i);
            this.b.b(5, false);
        } else if (!this.f) {
            a(1.777f, 1.777f);
            this.i = 0.0f;
        }
        this.h = obj;
    }

    public final void a(String str, float f) {
        String str2 = this.h;
        if ((str == str2 || (str != null && str2 != null && str.length() == str2.length() && str.equals(str2))) && (this.j || !fnz.a(this.i, f))) {
            this.i = f;
            a();
        }
    }

    private final void a() {
        float f;
        if (this.j) {
            f = this.i;
            a(f, f);
            return;
        }
        f = this.i;
        if (f != 0.0f) {
            Float f2 = this.g;
            a(f, f2 != null ? f2.floatValue() : f);
            this.g = null;
            this.k = true;
        }
    }

    private final void a(float f, float f2) {
        if (fnz.a(f)) {
            this.b.a(a);
            this.b.a(f);
        } else {
            this.b.a(f);
            this.b.a(1);
        }
        this.b.a(f2, true, false);
    }

    public final void a(int i) {
        if (i == 2 && !this.k) {
            a();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{vpa.class};
        } else if (i == 0) {
            vpa vpa = (vpa) obj;
            int ordinal = vpa.a.ordinal();
            if (ordinal == 1) {
                this.j = true;
                if (vpa.b == vsm.MID_ROLL) {
                    this.g = Float.valueOf(this.b.b);
                    return null;
                }
            } else if (ordinal == 3) {
                this.j = false;
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
