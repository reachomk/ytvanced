package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cma */
public class cma extends cmm implements cof, cor, Cloneable {
    public static final AtomicInteger h = new AtomicInteger(1);
    private AtomicBoolean a = new AtomicBoolean();
    private boolean b = false;
    private ConcurrentHashMap c;
    private SparseIntArray d;
    private Set e;
    private final String f;
    public boolean i = cuj.q;
    public int j = h.getAndIncrement();
    public String k;
    public String l;
    public String m;
    public boolean n;
    public boolean o;
    public cmg p;
    public clt q;
    public coj r;
    public List s;

    protected cma(String str) {
        this.f = str;
    }

    /* Access modifiers changed, original: protected */
    public boolean a() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void b(cma cma) {
    }

    /* Access modifiers changed, original: protected */
    public cma c() {
        return null;
    }

    /* Access modifiers changed, original: protected */
    public crh d() {
        return null;
    }

    public void k() {
    }

    @Deprecated
    public final coh m() {
        return this;
    }

    public final String b() {
        cma c = c();
        if (c == null) {
            return this.f;
        }
        String str = this.f;
        while (c.c() != null) {
            c = c.c();
        }
        String b = c.b();
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 2) + String.valueOf(b).length());
        stringBuilder.append(str);
        stringBuilder.append("(");
        stringBuilder.append(b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public boolean a(cma cma) {
        if (this == cma) {
            return true;
        }
        if (cma == null || getClass() != cma.getClass()) {
            return false;
        }
        if (this.j != cma.j) {
            return cni.a(this, cma);
        }
        return true;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void e() {
        if (this.b) {
            String valueOf = String.valueOf(this);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 33);
            stringBuilder.append("Duplicate layout of a component: ");
            stringBuilder.append(valueOf);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.b = true;
    }

    /* Access modifiers changed, original: final */
    public final String f() {
        if (this.m == null && !this.n) {
            this.m = Integer.toString(this.t);
        }
        return this.m;
    }

    private final int h(cma cma) {
        if (this.d == null) {
            this.d = new SparseIntArray();
        }
        int i = cma.t;
        int i2 = this.d.get(i, 0);
        this.d.put(i, i2 + 1);
        return i2;
    }

    private final void a(cma cma, String str) {
        cnh cnh = this.p.d;
        if (cnh != null) {
            String b = cma.b();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 158) + String.valueOf(b).length());
            stringBuilder.append("The manual key ");
            stringBuilder.append(str);
            stringBuilder.append(" you are setting on this ");
            stringBuilder.append(b);
            stringBuilder.append(" is a duplicate and will be changed into a unique one. This will result in unexpected behavior if you don't change it.");
            cnh.a(1, stringBuilder.toString());
        }
    }

    public cma g() {
        try {
            cma cma = (cma) super.clone();
            if (this.i) {
                cma.l = null;
            }
            cma.b = false;
            cma.n = false;
            cma.a = new AtomicBoolean();
            cma.p = null;
            cma.d = null;
            cma.e = null;
            return cma;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* Access modifiers changed, original: final */
    public final coz h() {
        ConcurrentHashMap concurrentHashMap = this.c;
        return concurrentHashMap != null ? (coz) concurrentHashMap.get(Long.valueOf(Thread.currentThread().getId())) : null;
    }

    public final void i() {
        if (h() != null) {
            this.c.remove(Long.valueOf(Thread.currentThread().getId()));
        }
    }

    public final void a(cmg cmg, int i, int i2, crd crd) {
        coz h = h();
        if (!(h != null && cpz.a(h.l(), i, h.a()) && cpz.a(h.m(), i2, h.b()))) {
            i();
            h = cpg.a(cmg, this, null, i, i2, null);
            synchronized (this) {
                if (this.c == null) {
                    this.c = new ConcurrentHashMap(2);
                }
            }
            this.c.put(Long.valueOf(Thread.currentThread().getId()), h);
            if (cma.i(this)) {
                h.a(i);
                h.b(i2);
                h.a((float) h.a());
                h.b((float) h.b());
            }
        }
        crd.a = h.a();
        crd.b = h.b();
    }

    public static boolean c(cma cma) {
        return cma instanceof cot;
    }

    private static boolean i(cma cma) {
        return cma != null && cma.A() == 1;
    }

    static boolean d(cma cma) {
        return (cma == null || cma.A() == 1) ? false : true;
    }

    public static boolean e(cma cma) {
        return cma != null && cma.A() == 3;
    }

    static boolean f(cma cma) {
        return cma.i(cma) && cma.n();
    }

    static boolean g(cma cma) {
        boolean z = true;
        if (!cma.f(cma)) {
            if (cma == null) {
                z = false;
            } else if (cma.h() != null) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void d(cmg cmg) {
        a(cmg, false);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(cmg cmg, boolean z) {
        String f;
        boolean z2 = false;
        if (cuj.f && (!this.i || this.l == null)) {
            String str;
            cnh cnh;
            StringBuilder stringBuilder;
            cma cma = cmg.h;
            f = f();
            if (cma != null) {
                str = cma.l;
                if (str == null) {
                    String b;
                    cnh = cmg.d;
                    if (cnh != null) {
                        String b2 = b();
                        b = cma.b();
                        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(b2).length() + 192) + String.valueOf(b).length());
                        stringBuilder2.append("Trying to generate parent-based key for component ");
                        stringBuilder2.append(b2);
                        stringBuilder2.append(" , but parent ");
                        stringBuilder2.append(b);
                        stringBuilder2.append(" has a null global key \". This is most likely a configuration mistake, check the value of ComponentsConfiguration.useGlobalKeys.");
                        cnh.a(2, stringBuilder2.toString());
                    }
                    b = String.valueOf(f);
                    f = "null";
                    f = b.length() == 0 ? new String(f) : f.concat(b);
                } else {
                    stringBuilder = new StringBuilder((str.length() + f.length()) + 1);
                    stringBuilder.append(str);
                    stringBuilder.append(',');
                    stringBuilder.append(f);
                    str = stringBuilder.toString();
                    cpb cpb = cma.p.f;
                    if (cpb != null) {
                        if (cma.i) {
                            if (this.n) {
                                if (cma.e == null) {
                                    cma.e = new HashSet();
                                }
                                if (cma.e.contains(str)) {
                                    cma.a(this, f);
                                } else {
                                    cma.e.add(str);
                                    cma.h(this);
                                }
                            }
                            int h = cma.h(this);
                            if (h != 0) {
                                f = cmk.a(str, h);
                            }
                        } else if (cpb.b.contains(str)) {
                            if (this.n) {
                                cma.a(this, f);
                            }
                            f = cmk.a(str, cma.h(this));
                        }
                    }
                    f = str;
                }
            }
            this.l = f;
            cpb cpb2 = cmg.f;
            if (!(this.i || cpb2 == null)) {
                if (cpb2.b.contains(this.l)) {
                    Object obj;
                    f = b();
                    str = f();
                    stringBuilder = new StringBuilder((String.valueOf(f).length() + 44) + String.valueOf(str).length());
                    stringBuilder.append("Found another ");
                    stringBuilder.append(f);
                    stringBuilder.append(" Component with the same key: ");
                    stringBuilder.append(str);
                    f = stringBuilder.toString();
                    if (cpb2.a != null) {
                        int i;
                        int size;
                        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                        ArrayList arrayList = new ArrayList();
                        for (StackTraceElement fileName : stackTrace) {
                            String fileName2 = fileName.getFileName();
                            if (fileName2 != null) {
                                Object obj2 = (arrayList.isEmpty() || !((String) arrayList.get(arrayList.size() - 1)).equals(fileName2)) ? null : 1;
                                for (String contains : cpb2.a.a()) {
                                    if (fileName2.contains(contains)) {
                                        if (!cpb2.a.b().contains(fileName2) && obj2 == null) {
                                            arrayList.add(fileName2);
                                        }
                                    }
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            obj = "Unable to determine root of duplicate key in a *Spec.java file.";
                        } else {
                            Collections.reverse(arrayList);
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Please look at the following spec hierarchy and make sure all sibling children components of the same type have unique keys:\n");
                            size = arrayList.size();
                            int i2 = 1;
                            for (i = 0; i < size; i++) {
                                String str2 = (String) arrayList.get(i);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    stringBuilder3.append("\t");
                                }
                                i2++;
                                stringBuilder3.append(str2);
                                stringBuilder3.append("\n");
                            }
                            obj = stringBuilder3.toString();
                        }
                    } else {
                        obj = f;
                    }
                    if (y()) {
                        StringBuilder stringBuilder4 = new StringBuilder((String.valueOf(f).length() + 1) + String.valueOf(obj).length());
                        stringBuilder4.append(f);
                        stringBuilder4.append("\n");
                        stringBuilder4.append(obj);
                        throw new RuntimeException(stringBuilder4.toString());
                    }
                    cnh = cpb2.a;
                    if (cnh != null) {
                        stringBuilder = new StringBuilder((String.valueOf(f).length() + 1) + String.valueOf(obj).length());
                        stringBuilder.append(f);
                        stringBuilder.append("\n");
                        stringBuilder.append(obj);
                        cnh.a(2, stringBuilder.toString());
                    }
                }
                cpb2.b.add(this.l);
            }
        }
        this.p = cmg.a(cmg, this);
        a(this.p.d());
        if (y()) {
            crg crg = cmg.e;
            crg.b();
            crg.c();
            if (y()) {
                crh crh;
                List<cmq> list;
                f = this.l;
                synchronized (crg) {
                    crh = (crh) crg.d.get(f);
                    crg.e.add(f);
                }
                if (crh != null) {
                    a(crh, d());
                } else {
                    f(this.p);
                }
                synchronized (crg) {
                    Map map = crg.a;
                    list = map != null ? (List) map.get(f) : null;
                }
                if (list != null) {
                    for (cmq a : list) {
                        a.a(d());
                    }
                    cxx.a.addAndGet((long) list.size());
                    if (this.p.g()) {
                        synchronized (crg) {
                            crg.a.remove(f);
                            crg.c.put(f, list);
                        }
                    }
                }
                synchronized (crg) {
                    crh = d();
                    crg.d.put(f, crh);
                    if (crh instanceof cmt) {
                        List a2 = ((cmt) crh).a();
                        if (!a2.isEmpty()) {
                            crg.d();
                            crg.b.put(f, a2);
                        }
                    }
                }
            }
        }
        crf a3 = crf.a(cmg);
        if (a3 != null && a3.a.contains(getClass().getSimpleName())) {
            z2 = true;
        }
        this.o = z2;
        cma cma2 = cmg.h;
        if (cma2 != null && z) {
            this.o = cma2.o;
        }
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
    }

    /* Access modifiers changed, original: final */
    public final cma j() {
        AtomicBoolean atomicBoolean = this.a;
        return (atomicBoolean == null || !atomicBoolean.getAndSet(true)) ? this : g();
    }

    public final clt l() {
        if (this.q == null) {
            this.q = new clt();
        }
        return this.q;
    }

    public static void a(String str, csv csv, cma cma) {
        if (cma.s == null) {
            cma.s = new ArrayList();
        }
        cma.s.add(new cta(str, csv, cma));
    }
}
