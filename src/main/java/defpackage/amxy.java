package defpackage;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: amxy */
public abstract class amxy implements amyh, amys {
    private static final String a = new String();
    private final Level b;
    private final long c;
    private amya d = null;
    private amyc e = null;
    private amzg f = null;
    private Object[] g = null;

    protected amxy(Level level, boolean z) {
        long e = amyv.e();
        this.b = (Level) anad.a(level, "level");
        this.c = e;
        if (z) {
            a(amxx.e, Boolean.TRUE);
        }
    }

    public abstract amzz a();

    public abstract amxq b();

    public abstract amyh c();

    public final Level d() {
        return this.b;
    }

    public final long e() {
        return this.c;
    }

    public final amyc f() {
        amyc amyc = this.e;
        if (amyc != null) {
            return amyc;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    public final amzg g() {
        return this.f;
    }

    public final Object[] h() {
        if (this.f != null) {
            return this.g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    public final Object i() {
        if (this.f == null) {
            return this.g[0];
        }
        throw new IllegalStateException("cannot get literal argument if a template context exists");
    }

    public final boolean j() {
        return this.d != null && Boolean.TRUE.equals(this.d.b(amxx.e));
    }

    public final amyt k() {
        amyt amyt = this.d;
        return amyt == null ? amyw.a : amyt;
    }

    private final void a(amyj amyj, Object obj) {
        if (this.d == null) {
            this.d = new amya();
        }
        amya amya = this.d;
        int a = amya.a(amyj);
        String str = "metadata value";
        if (a != -1) {
            amya.a[(a + a) + 1] = anad.a(obj, str);
            return;
        }
        a = amya.b + 1;
        Object[] objArr = amya.a;
        int length = objArr.length;
        if (a + a > length) {
            amya.a = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = amya.a;
        int i = amya.b;
        objArr2[i + i] = anad.a(amyj, "metadata key");
        Object[] objArr3 = amya.a;
        a = amya.b;
        objArr3[(a + a) + 1] = anad.a(obj, str);
        amya.b++;
    }

    private final boolean l() {
        Object obj;
        Class cls = amxy.class;
        if (this.e == null) {
            this.e = (amyc) anad.a(amyv.a().a(cls, 1), "logger backend must not return a null LogSite");
        }
        if (this.e != amyc.a) {
            obj = this.e;
            String str = (String) k().b(amxx.d);
            if (str != null) {
                obj = new amxz(this.e, str);
            }
        } else {
            obj = null;
        }
        amya amya = this.d;
        if (!(amya == null || obj == null)) {
            Integer num = (Integer) amya.b(amxx.b);
            amyf amyf = (amyf) this.d.b(amxx.c);
            amyi amyi = amyg.a;
            amyg amyg = (amyg) amyi.a.get(obj);
            if (amyg == null) {
                amyg = new amyg();
                amyg amyg2 = (amyg) amyi.a.putIfAbsent(obj, amyg);
                if (amyg2 != null) {
                    amyg = amyg2;
                }
            }
            if (num != null) {
                if (amyg.b.getAndIncrement() % ((long) num.intValue()) != 0) {
                    return false;
                }
            }
            if (amyf != null) {
                amyg.c.get();
                throw new NoSuchMethodError();
            }
        }
        amym amym = (amym) k().b(amxx.g);
        if (amym != null) {
            amyj amyj = amxx.g;
            amya amya2 = this.d;
            if (amya2 != null) {
                int a = amya2.a(amyj);
                if (a >= 0) {
                    int i;
                    a += a;
                    int i2 = a + 2;
                    while (true) {
                        i = amya2.b;
                        if (i2 >= i + i) {
                            break;
                        }
                        Object obj2 = amya2.a[i2];
                        if (!obj2.equals(amyj)) {
                            Object[] objArr = amya2.a;
                            objArr[a] = obj2;
                            objArr[a + 1] = objArr[i2 + 1];
                            a += 2;
                        }
                        i2 += 2;
                    }
                    amya2.b = i - ((i2 - a) >> 1);
                    while (a < i2) {
                        int i3 = a + 1;
                        amya2.a[a] = null;
                        a = i3;
                    }
                }
            }
            a(amxx.a, new amyd((Throwable) k().b(amxx.a), amym, anae.a(cls, new Throwable(), amym.a)));
        }
        Object c = amyv.c();
        if (!c.b.isEmpty()) {
            a(amxx.f, c);
        }
        return true;
    }

    private final void a(String str, Object... objArr) {
        this.g = objArr;
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof amxv) {
                objArr[i] = ((amxv) obj).a();
            }
        }
        if (str != a) {
            this.f = new amzg(a(), str);
        }
        amxq b = b();
        anad.a(this, "data");
        try {
            b.a.a((amys) this);
        } catch (RuntimeException e) {
            try {
                b.a.a(e, this);
            } catch (amyu e2) {
                throw e2;
            } catch (RuntimeException e3) {
                PrintStream printStream = System.err;
                String valueOf = String.valueOf(e3.getMessage());
                String str2 = "logging error: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                printStream.println(valueOf);
                ankx.a(e3, System.err);
            }
        }
    }

    public final amyh a(String str, String str2, int i, String str3) {
        amyc a = amyc.a(str, str2, i, str3);
        if (this.e == null) {
            this.e = (amyc) anad.a(a, "log site");
        }
        return c();
    }

    public final amyh a(Throwable th) {
        a(amxx.a, (Object) th);
        return c();
    }

    public final void a(String str) {
        if (l()) {
            a(a, str);
        }
    }

    public final void a(String str, Object obj) {
        if (l()) {
            a(str, obj);
        }
    }

    public final void a(String str, Object obj, Object obj2) {
        if (l()) {
            a(str, obj, obj2);
        }
    }

    public final void a(String str, int i) {
        if (l()) {
            a(str, Integer.valueOf(i));
        }
    }

    public final void a(String str, int i, int i2) {
        if (l()) {
            a(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
