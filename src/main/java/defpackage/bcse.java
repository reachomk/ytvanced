package defpackage;

import java.util.ArrayList;

/* renamed from: bcse */
public final class bcse {
    private final ArrayList a = new ArrayList();
    private Object b;

    public final bcsf a() {
        Object c = c();
        bcsv bcsv = null;
        bcsz bcsz = (!(c instanceof bcsz) || ((c instanceof bcsg) && ((bcsg) c).a == null)) ? null : (bcsz) c;
        if (bcse.b(c)) {
            bcsv = (bcsv) c;
        }
        if (bcsz != null || bcsv != null) {
            return new bcsf(bcsz, bcsv);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    public final bcsv b() {
        Object c = c();
        if (bcse.b(c)) {
            return (bcsv) c;
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final bcse a(bcsf bcsf) {
        if (bcsf != null) {
            a(bcsf.a, bcsf.b);
            return this;
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public final bcse a(bcsv bcsv) {
        bcse.c(bcsv);
        a(null, bcsv);
        return this;
    }

    public final bcse a(bcsv[] bcsvArr) {
        int length = bcsvArr.length;
        bcsv[] bcsvArr2 = new bcsv[length];
        int i = 0;
        while (i < length - 1) {
            bcsv bcsv = bcsvArr[i];
            bcsvArr2[i] = bcsv;
            if (bcsv != null) {
                i++;
            } else {
                throw new IllegalArgumentException("Incomplete parser array");
            }
        }
        bcsvArr2[i] = bcsvArr[i];
        a(null, new bcsl(bcsvArr2));
        return this;
    }

    public final bcse b(bcsv bcsv) {
        bcse.c(bcsv);
        a(null, new bcsl(new bcsv[]{bcsv, null}));
        return this;
    }

    private static void c(bcsv bcsv) {
        if (bcsv == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    public final bcse a(Object obj) {
        this.b = null;
        this.a.add(obj);
        this.a.add(obj);
        return this;
    }

    public final bcse a(bcsz bcsz, bcsv bcsv) {
        this.b = null;
        this.a.add(bcsz);
        this.a.add(bcsv);
        return this;
    }

    public final bcse a(char c) {
        a(new bcsh(c));
        return this;
    }

    public final bcse a(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                a(new bcsm(str));
                return this;
            }
            a(new bcsh(str.charAt(0)));
        }
        return this;
    }

    public final bcse a(bcpm bcpm, int i, int i2) {
        if (bcpm != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i < 0 || i2 <= 0) {
                throw new IllegalArgumentException();
            } else if (i <= 1) {
                a(new bcss(bcpm, i2, false));
                return this;
            } else {
                a(new bcsn(bcpm, i2, false, i));
                return this;
            }
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public final bcse a(bcpm bcpm, int i) {
        if (bcpm != null) {
            a(new bcsj(bcpm, i));
            return this;
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public final bcse b(bcpm bcpm, int i, int i2) {
        if (bcpm != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i < 0 || i2 <= 0) {
                throw new IllegalArgumentException();
            } else if (i <= 1) {
                a(new bcss(bcpm, i2, true));
                return this;
            } else {
                a(new bcsn(bcpm, i2, true, i));
                return this;
            }
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public final bcse a(bcpm bcpm) {
        if (bcpm != null) {
            a(new bcsp(bcpm, false));
            return this;
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public final bcse b(bcpm bcpm) {
        if (bcpm != null) {
            a(new bcsp(bcpm, true));
            return this;
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public final bcse c(bcpm bcpm, int i, int i2) {
        if (bcpm != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i < 0 || i2 <= 0) {
                throw new IllegalArgumentException();
            }
            a(new bcsi(bcpm, i, i2));
            return this;
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    public final bcse a(int i, int i2) {
        return c(bcpm.t, i, i2);
    }

    public final bcse a(int i) {
        return a(bcpm.u, i, 2);
    }

    public final bcse b(int i) {
        return a(bcpm.s, i, 2);
    }

    public final bcse c(int i) {
        return a(bcpm.q, i, 2);
    }

    public final bcse d(int i) {
        return a(bcpm.l, i, 1);
    }

    public final bcse e(int i) {
        return a(bcpm.h, i, 2);
    }

    public final bcse f(int i) {
        return a(bcpm.f, i, 3);
    }

    public final bcse g(int i) {
        return a(bcpm.k, i, 2);
    }

    public final bcse b(int i, int i2) {
        return b(bcpm.j, i, i2);
    }

    public final bcse h(int i) {
        return a(bcpm.g, i, 2);
    }

    public final bcse c(int i, int i2) {
        return b(bcpm.e, i, i2);
    }

    public final bcse a(String str, boolean z, int i) {
        a(new bcsq(str, str, z, i));
        return this;
    }

    public final bcse a(String str, boolean z) {
        a(new bcsq(null, str, z, 2));
        return this;
    }

    private final Object c() {
        Object obj = this.b;
        if (obj == null) {
            if (this.a.size() == 2) {
                Object obj2 = this.a.get(0);
                Object obj3 = this.a.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new bcsg(this.a);
            }
            this.b = obj;
        }
        return obj;
    }

    private static boolean b(Object obj) {
        if (!(obj instanceof bcsv)) {
            return false;
        }
        if ((obj instanceof bcsg) && ((bcsg) obj).b == null) {
            return false;
        }
        return true;
    }

    static void a(StringBuffer stringBuffer, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                stringBuffer.append(65533);
            } else {
                return;
            }
        }
    }
}
