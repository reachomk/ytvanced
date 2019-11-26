package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: anxg */
public final class anxg {
    public static final anxg d = new anxg((byte) 0);
    public final aoae a = aoae.a(16);
    public boolean b;
    public boolean c = false;

    private anxg() {
    }

    private anxg(byte b) {
        b();
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.a.isEmpty();
    }

    public final void b() {
        if (!this.b) {
            this.a.a();
            this.b = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anxg)) {
            return false;
        }
        return this.a.equals(((anxg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* renamed from: c */
    public final anxg clone() {
        Entry b;
        anxg anxg = new anxg();
        for (int i = 0; i < this.a.b(); i++) {
            b = this.a.b(i);
            anxg.a((anxf) b.getKey(), b.getValue());
        }
        for (Entry b2 : this.a.c()) {
            anxg.a((anxf) b2.getKey(), b2.getValue());
        }
        anxg.c = this.c;
        return anxg;
    }

    public final Iterator d() {
        if (this.c) {
            return new anyj(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final boolean a(anxf anxf) {
        return this.a.get(anxf) != null;
    }

    public final Object b(anxf anxf) {
        Object obj = this.a.get(anxf);
        return obj instanceof anyh ? anyh.a() : obj;
    }

    public final void a(anxf anxf, Object obj) {
        anxf.c();
        anxg.a(anxf.b(), obj);
        if (obj instanceof anyh) {
            this.c = true;
        }
        this.a.put(anxf, obj);
    }

    /* JADX WARNING: Missing block: B:24:0x0039, code skipped:
            if (r1 != false) goto L_0x003b;
     */
    /* JADX WARNING: Missing block: B:25:0x003b, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:27:0x0043, code skipped:
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
     */
    private static void a(defpackage.aobm r1, java.lang.Object r2) {
        /*
        defpackage.anxw.a(r2);
        r1 = r1.k;
        r0 = r1 + -1;
        if (r1 == 0) goto L_0x0044;
    L_0x0009:
        switch(r0) {
            case 0: goto L_0x0037;
            case 1: goto L_0x0034;
            case 2: goto L_0x0031;
            case 3: goto L_0x002e;
            case 4: goto L_0x002b;
            case 5: goto L_0x0028;
            case 6: goto L_0x001f;
            case 7: goto L_0x0016;
            case 8: goto L_0x000d;
            default: goto L_0x000c;
        };
    L_0x000c:
        goto L_0x003c;
    L_0x000d:
        r1 = r2 instanceof defpackage.anze;
        if (r1 != 0) goto L_0x003b;
    L_0x0011:
        r1 = r2 instanceof defpackage.anyh;
        if (r1 == 0) goto L_0x003c;
    L_0x0015:
        return;
    L_0x0016:
        r1 = r2 instanceof java.lang.Integer;
        if (r1 != 0) goto L_0x003b;
    L_0x001a:
        r1 = r2 instanceof defpackage.anxv;
        if (r1 == 0) goto L_0x003c;
    L_0x001e:
        return;
    L_0x001f:
        r1 = r2 instanceof defpackage.anvu;
        if (r1 != 0) goto L_0x003b;
    L_0x0023:
        r1 = r2 instanceof byte[];
        if (r1 == 0) goto L_0x003c;
    L_0x0027:
        return;
    L_0x0028:
        r1 = r2 instanceof java.lang.String;
        goto L_0x0039;
    L_0x002b:
        r1 = r2 instanceof java.lang.Boolean;
        goto L_0x0039;
    L_0x002e:
        r1 = r2 instanceof java.lang.Double;
        goto L_0x0039;
    L_0x0031:
        r1 = r2 instanceof java.lang.Float;
        goto L_0x0039;
    L_0x0034:
        r1 = r2 instanceof java.lang.Long;
        goto L_0x0039;
    L_0x0037:
        r1 = r2 instanceof java.lang.Integer;
    L_0x0039:
        if (r1 == 0) goto L_0x003c;
    L_0x003b:
        return;
    L_0x003c:
        r1 = new java.lang.IllegalArgumentException;
        r2 = "Wrong object type used with protocol message reflection.";
        r1.<init>(r2);
        throw r1;
    L_0x0044:
        r1 = 0;
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anxg.a(aobm, java.lang.Object):void");
    }

    public final boolean e() {
        for (int i = 0; i < this.a.b(); i++) {
            if (!anxg.c(this.a.b(i))) {
                return false;
            }
        }
        for (Entry c : this.a.c()) {
            if (!anxg.c(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(Entry entry) {
        anxf anxf = (anxf) entry.getKey();
        if (anxf.f() == 9) {
            anxf.c();
            Object value = entry.getValue();
            if (value instanceof anze) {
                if (!((anze) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof anyh) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static Object a(Object obj) {
        if (obj instanceof anzj) {
            return ((anzj) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final void a(Entry entry) {
        anxf anxf = (anxf) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof anyh) {
            value = anyh.a();
        }
        anxf.c();
        if (anxf.f() == 9) {
            Object b = b(anxf);
            if (b == null) {
                this.a.put(anxf, anxg.a(value));
                return;
            }
            if (b instanceof anzj) {
                value = anxf.e();
            } else {
                value = anxf.a(((anze) b).toBuilder(), (anze) value).build();
            }
            this.a.put(anxf, value);
            return;
        }
        this.a.put(anxf, anxg.a(value));
    }

    static void a(anwm anwm, aobm aobm, int i, Object obj) {
        if (aobm == aobm.GROUP) {
            anze anze = (anze) obj;
            anxw.a();
            anwm.b(i, 3);
            anwm.c(anze);
            anwm.b(i, 4);
            return;
        }
        anwm.b(i, aobm.j);
        switch (aobm.ordinal()) {
            case 0:
                anwm.a(((Double) obj).doubleValue());
                return;
            case 1:
                anwm.a(((Float) obj).floatValue());
                return;
            case 2:
                anwm.c(((Long) obj).longValue());
                return;
            case 3:
                anwm.c(((Long) obj).longValue());
                return;
            case 4:
                anwm.d(((Integer) obj).intValue());
                return;
            case 5:
                anwm.e(((Long) obj).longValue());
                return;
            case 6:
                anwm.g(((Integer) obj).intValue());
                return;
            case 7:
                anwm.b(((Boolean) obj).booleanValue());
                return;
            case 8:
                if (obj instanceof anvu) {
                    anwm.a((anvu) obj);
                    return;
                } else {
                    anwm.a((String) obj);
                    return;
                }
            case 9:
                anwm.c((anze) obj);
                return;
            case 10:
                anwm.a((anze) obj);
                return;
            case 11:
                if (obj instanceof anvu) {
                    anwm.a((anvu) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                anwm.a(bArr, bArr.length);
                return;
            case 12:
                anwm.e(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof anxv) {
                    anwm.d(((anxv) obj).getNumber());
                    return;
                } else {
                    anwm.d(((Integer) obj).intValue());
                    return;
                }
            case 14:
                anwm.g(((Integer) obj).intValue());
                return;
            case 15:
                anwm.e(((Long) obj).longValue());
                return;
            case 16:
                anwm.f(((Integer) obj).intValue());
                return;
            case 17:
                anwm.d(((Long) obj).longValue());
                return;
            default:
                return;
        }
    }

    public static int b(Entry entry) {
        anxf anxf = (anxf) entry.getKey();
        Object value = entry.getValue();
        if (anxf.f() != 9) {
            return anxg.b(anxf, value);
        }
        int a;
        int o;
        anxf.c();
        anxf.d();
        if (value instanceof anyh) {
            a = ((anxf) entry.getKey()).a();
            anym anym = (anyh) value;
            o = anwm.o(1);
            o = (o + o) + anwm.h(2, a);
            a = anwm.a(3, anym);
        } else {
            a = ((anxf) entry.getKey()).a();
            anze anze = (anze) value;
            o = anwm.o(1);
            o = (o + o) + anwm.h(2, a);
            a = anwm.c(3, anze);
        }
        return o + a;
    }

    static int a(aobm aobm, int i, Object obj) {
        i = anwm.o(i);
        if (aobm == aobm.GROUP) {
            i += i;
            anxw.a();
        }
        return i + anxg.b(aobm, obj);
    }

    private static int b(aobm aobm, Object obj) {
        switch (aobm.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                return anwm.g();
            case 1:
                ((Float) obj).floatValue();
                return anwm.f();
            case 2:
                return anwm.f(((Long) obj).longValue());
            case 3:
                return anwm.f(((Long) obj).longValue());
            case 4:
                return anwm.p(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                return anwm.d();
            case 6:
                ((Integer) obj).intValue();
                return anwm.b();
            case 7:
                ((Boolean) obj).booleanValue();
                return anwm.h();
            case 8:
                if (obj instanceof anvu) {
                    return anwm.b((anvu) obj);
                }
                return anwm.b((String) obj);
            case 9:
                return anwm.d((anze) obj);
            case 10:
                if (obj instanceof anyh) {
                    return anwm.a((anyh) obj);
                }
                return anwm.b((anze) obj);
            case 11:
                if (obj instanceof anvu) {
                    return anwm.b((anvu) obj);
                }
                return anwm.b((byte[]) obj);
            case 12:
                return anwm.q(((Integer) obj).intValue());
            case 13:
                if (obj instanceof anxv) {
                    return anwm.p(((anxv) obj).getNumber());
                }
                return anwm.p(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return anwm.c();
            case 15:
                ((Long) obj).longValue();
                return anwm.e();
            case 16:
                return anwm.r(((Integer) obj).intValue());
            case 17:
                return anwm.g(((Long) obj).longValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int b(anxf anxf, Object obj) {
        aobm b = anxf.b();
        int a = anxf.a();
        anxf.c();
        return anxg.a(b, a, obj);
    }
}
