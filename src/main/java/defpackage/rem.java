package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: rem */
final class rem {
    public static final rem c = new rem((byte) 0);
    public final rhb a = rhb.a(16);
    public boolean b;
    private boolean d = false;

    private rem() {
    }

    private rem(byte b) {
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
        if (!(obj instanceof rem)) {
            return false;
        }
        return this.a.equals(((rem) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator c() {
        if (this.d) {
            return new rfn(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public final Object a(reo reo) {
        Object obj = this.a.get(reo);
        return obj instanceof rfl ? rfl.a() : obj;
    }

    public final void a(reo reo, Object obj) {
        if (!reo.c()) {
            rem.a(reo.b(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                rem.a(reo.b(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof rfl) {
            this.d = true;
        }
        this.a.put(reo, obj);
    }

    /* JADX WARNING: Missing block: B:25:0x003d, code skipped:
            if (r2 != false) goto L_0x003f;
     */
    /* JADX WARNING: Missing block: B:26:0x003f, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:28:0x0047, code skipped:
            throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
     */
    private static void a(defpackage.rii r2, java.lang.Object r3) {
        /*
        defpackage.rfc.a(r3);
        r0 = defpackage.rel.a;
        r2 = r2.t;
        r1 = r2 + -1;
        if (r2 == 0) goto L_0x0048;
    L_0x000b:
        r2 = r0[r1];
        switch(r2) {
            case 1: goto L_0x003b;
            case 2: goto L_0x0038;
            case 3: goto L_0x0035;
            case 4: goto L_0x0032;
            case 5: goto L_0x002f;
            case 6: goto L_0x002c;
            case 7: goto L_0x0023;
            case 8: goto L_0x001a;
            case 9: goto L_0x0011;
            default: goto L_0x0010;
        };
    L_0x0010:
        goto L_0x0040;
    L_0x0011:
        r2 = r3 instanceof defpackage.rgh;
        if (r2 != 0) goto L_0x003f;
    L_0x0015:
        r2 = r3 instanceof defpackage.rfl;
        if (r2 == 0) goto L_0x0040;
    L_0x0019:
        return;
    L_0x001a:
        r2 = r3 instanceof java.lang.Integer;
        if (r2 != 0) goto L_0x003f;
    L_0x001e:
        r2 = r3 instanceof defpackage.rfd;
        if (r2 == 0) goto L_0x0040;
    L_0x0022:
        return;
    L_0x0023:
        r2 = r3 instanceof defpackage.rdg;
        if (r2 != 0) goto L_0x003f;
    L_0x0027:
        r2 = r3 instanceof byte[];
        if (r2 == 0) goto L_0x0040;
    L_0x002b:
        return;
    L_0x002c:
        r2 = r3 instanceof java.lang.String;
        goto L_0x003d;
    L_0x002f:
        r2 = r3 instanceof java.lang.Boolean;
        goto L_0x003d;
    L_0x0032:
        r2 = r3 instanceof java.lang.Double;
        goto L_0x003d;
    L_0x0035:
        r2 = r3 instanceof java.lang.Float;
        goto L_0x003d;
    L_0x0038:
        r2 = r3 instanceof java.lang.Long;
        goto L_0x003d;
    L_0x003b:
        r2 = r3 instanceof java.lang.Integer;
    L_0x003d:
        if (r2 == 0) goto L_0x0040;
    L_0x003f:
        return;
    L_0x0040:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "Wrong object type used with protocol message reflection.";
        r2.<init>(r3);
        throw r2;
    L_0x0048:
        r2 = 0;
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rem.a(rii, java.lang.Object):void");
    }

    public final boolean d() {
        for (int i = 0; i < this.a.b(); i++) {
            if (!rem.c(this.a.b(i))) {
                return false;
            }
        }
        for (Entry c : this.a.c()) {
            if (!rem.c(c)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(Entry entry) {
        reo reo = (reo) entry.getKey();
        if (reo.g() == 9) {
            if (reo.c()) {
                for (rgh c : (List) entry.getValue()) {
                    if (!c.c()) {
                        return false;
                    }
                }
            }
            Object value = entry.getValue();
            if (value instanceof rgh) {
                if (!((rgh) value).c()) {
                    return false;
                }
            } else if (value instanceof rfl) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private static Object a(Object obj) {
        if (obj instanceof rgq) {
            return ((rgq) obj).a();
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
        reo reo = (reo) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof rfl) {
            value = rfl.a();
        }
        Object a;
        if (reo.c()) {
            a = a(reo);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(rem.a(a2));
            }
            this.a.put(reo, a);
        } else if (reo.g() == 9) {
            a = a(reo);
            if (a == null) {
                this.a.put(reo, rem.a(value));
                return;
            }
            if (a instanceof rgq) {
                value = reo.f();
            } else {
                ((rgh) a).i();
                value = reo.e().f();
            }
            this.a.put(reo, value);
        } else {
            this.a.put(reo, rem.a(value));
        }
    }

    static void a(rdt rdt, rii rii, int i, Object obj) {
        if (rii != rii.GROUP) {
            rdt.a(i, rii.s);
            switch (rii) {
                case DOUBLE:
                    rdt.a(((Double) obj).doubleValue());
                    break;
                case FLOAT:
                    rdt.a(((Float) obj).floatValue());
                    return;
                case INT64:
                    rdt.a(((Long) obj).longValue());
                    return;
                case UINT64:
                    rdt.a(((Long) obj).longValue());
                    return;
                case INT32:
                    rdt.a(((Integer) obj).intValue());
                    return;
                case FIXED64:
                    rdt.c(((Long) obj).longValue());
                    return;
                case FIXED32:
                    rdt.d(((Integer) obj).intValue());
                    return;
                case BOOL:
                    rdt.a(((Boolean) obj).booleanValue());
                    return;
                case GROUP:
                    ((rgh) obj).a(rdt);
                    return;
                case MESSAGE:
                    rdt.a((rgh) obj);
                    return;
                case STRING:
                    if (obj instanceof rdg) {
                        rdt.a((rdg) obj);
                        return;
                    } else {
                        rdt.a((String) obj);
                        return;
                    }
                case BYTES:
                    if (obj instanceof rdg) {
                        rdt.a((rdg) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    rdt.a(bArr, bArr.length);
                    return;
                case UINT32:
                    rdt.b(((Integer) obj).intValue());
                    return;
                case SFIXED32:
                    rdt.d(((Integer) obj).intValue());
                    return;
                case SFIXED64:
                    rdt.c(((Long) obj).longValue());
                    return;
                case SINT32:
                    rdt.c(((Integer) obj).intValue());
                    return;
                case SINT64:
                    rdt.b(((Long) obj).longValue());
                    return;
                case ENUM:
                    if (!(obj instanceof rfd)) {
                        rdt.a(((Integer) obj).intValue());
                        break;
                    } else {
                        rdt.a(((rfd) obj).a());
                        return;
                    }
            }
            return;
        }
        rgh rgh = (rgh) obj;
        rfc.a();
        rdt.a(i, 3);
        rgh.a(rdt);
        rdt.a(i, 4);
    }

    public static int b(Entry entry) {
        reo reo = (reo) entry.getKey();
        Object value = entry.getValue();
        if (reo.g() != 9 || reo.c() || reo.d()) {
            return rem.b(reo, value);
        }
        int a;
        int l;
        if (value instanceof rfl) {
            a = ((reo) entry.getKey()).a();
            rfq rfq = (rfl) value;
            l = rdt.l(1);
            l = (l + l) + rdt.g(2, a);
            a = rdt.a(3, rfq);
        } else {
            a = ((reo) entry.getKey()).a();
            rgh rgh = (rgh) value;
            l = rdt.l(1);
            l = (l + l) + rdt.g(2, a);
            a = rdt.c(3, rgh);
        }
        return l + a;
    }

    static int a(rii rii, int i, Object obj) {
        i = rdt.l(i);
        if (rii == rii.GROUP) {
            i += i;
            rfc.a();
        }
        return i + rem.b(rii, obj);
    }

    private static int b(rii rii, Object obj) {
        switch (rii) {
            case DOUBLE:
                ((Double) obj).doubleValue();
                return rdt.f();
            case FLOAT:
                ((Float) obj).floatValue();
                return rdt.e();
            case INT64:
                return rdt.d(((Long) obj).longValue());
            case UINT64:
                return rdt.d(((Long) obj).longValue());
            case INT32:
                return rdt.m(((Integer) obj).intValue());
            case FIXED64:
                ((Long) obj).longValue();
                return rdt.c();
            case FIXED32:
                ((Integer) obj).intValue();
                return rdt.a();
            case BOOL:
                ((Boolean) obj).booleanValue();
                return rdt.g();
            case GROUP:
                return rdt.c((rgh) obj);
            case MESSAGE:
                if (obj instanceof rfl) {
                    return rdt.a((rfl) obj);
                }
                return rdt.b((rgh) obj);
            case STRING:
                if (obj instanceof rdg) {
                    return rdt.b((rdg) obj);
                }
                return rdt.b((String) obj);
            case BYTES:
                if (obj instanceof rdg) {
                    return rdt.b((rdg) obj);
                }
                return rdt.b((byte[]) obj);
            case UINT32:
                return rdt.n(((Integer) obj).intValue());
            case SFIXED32:
                ((Integer) obj).intValue();
                return rdt.b();
            case SFIXED64:
                ((Long) obj).longValue();
                return rdt.d();
            case SINT32:
                return rdt.o(((Integer) obj).intValue());
            case SINT64:
                return rdt.e(((Long) obj).longValue());
            case ENUM:
                if (obj instanceof rfd) {
                    return rdt.m(((rfd) obj).a());
                }
                return rdt.m(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int b(reo reo, Object obj) {
        rii b = reo.b();
        int a = reo.a();
        if (!reo.c()) {
            return rem.a(b, a, obj);
        }
        int i = 0;
        if (reo.d()) {
            for (Object obj2 : (List) obj2) {
                i += rem.b(b, obj2);
            }
            return (rdt.l(a) + i) + rdt.n(i);
        }
        for (Object obj22 : (List) obj22) {
            i += rem.a(b, a, obj22);
        }
        return i;
    }

    public final /* synthetic */ Object clone() {
        Entry b;
        rem rem = new rem();
        for (int i = 0; i < this.a.b(); i++) {
            b = this.a.b(i);
            rem.a((reo) b.getKey(), b.getValue());
        }
        for (Entry b2 : this.a.c()) {
            rem.a((reo) b2.getKey(), b2.getValue());
        }
        rem.d = this.d;
        return rem;
    }
}
