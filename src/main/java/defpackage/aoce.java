package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: aoce */
final class aoce implements Cloneable {
    public aobz a;
    public Object b;
    public List c;

    aoce(aobz aobz, Object obj) {
        this.a = aobz;
        this.b = obj;
    }

    aoce() {
        this.c = new ArrayList();
    }

    /* Access modifiers changed, original: final */
    public final void a(aobz aobz, Object obj) {
        this.a = aobz;
        this.b = obj;
        this.c = null;
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        Object obj = this.b;
        if (obj != null) {
            aobz aobz = this.a;
            if (aobz.d) {
                return aobz.a(obj);
            }
            return aobz.b(obj);
        }
        int i = 0;
        for (aoch aoch : this.c) {
            i += aoby.j(aoch.a) + aoch.b.length;
        }
        return i;
    }

    /* Access modifiers changed, original: final */
    public final void a(aoby aoby) {
        Object obj = this.b;
        if (obj != null) {
            aobz aobz = this.a;
            if (aobz.d) {
                aobz.b(obj, aoby);
            } else {
                aobz.a(obj, aoby);
                return;
            }
        }
        for (aoch aoch : this.c) {
            aoby.i(aoch.a);
            aoby.b(aoch.b);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aoce)) {
            return false;
        }
        aoce aoce = (aoce) obj;
        if (this.b == null || aoce.b == null) {
            List list = this.c;
            if (list != null) {
                List list2 = aoce.c;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(c(), aoce.c());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        aobz aobz = this.a;
        if (aobz != aoce.a) {
            return false;
        }
        if (!aobz.b.isArray()) {
            return this.b.equals(aoce.b);
        }
        Object obj2 = this.b;
        if (obj2 instanceof byte[]) {
            return Arrays.equals((byte[]) obj2, (byte[]) aoce.b);
        }
        if (obj2 instanceof int[]) {
            return Arrays.equals((int[]) obj2, (int[]) aoce.b);
        }
        if (obj2 instanceof long[]) {
            return Arrays.equals((long[]) obj2, (long[]) aoce.b);
        }
        if (obj2 instanceof float[]) {
            return Arrays.equals((float[]) obj2, (float[]) aoce.b);
        }
        if (obj2 instanceof double[]) {
            return Arrays.equals((double[]) obj2, (double[]) aoce.b);
        }
        if (obj2 instanceof boolean[]) {
            return Arrays.equals((boolean[]) obj2, (boolean[]) aoce.b);
        }
        return Arrays.deepEquals((Object[]) obj2, (Object[]) aoce.b);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(c()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] c() {
        byte[] bArr = new byte[a()];
        a(aoby.a(bArr, bArr.length));
        return bArr;
    }

    /* renamed from: b */
    public final aoce clone() {
        aoce aoce = new aoce();
        try {
            aoce.a = this.a;
            List list = this.c;
            if (list == null) {
                aoce.c = null;
            } else {
                aoce.c.addAll(list);
            }
            Object obj = this.b;
            if (obj != null) {
                if (obj instanceof aocf) {
                    aoce.b = (aocf) ((aocf) obj).clone();
                } else if (obj instanceof byte[]) {
                    aoce.b = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        aoce.b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        aoce.b = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        aoce.b = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        aoce.b = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        aoce.b = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        aoce.b = ((double[]) obj).clone();
                    } else if (obj instanceof aocf[]) {
                        aocf[] aocfArr = (aocf[]) obj;
                        aocf[] aocfArr2 = new aocf[aocfArr.length];
                        aoce.b = aocfArr2;
                        while (i < aocfArr.length) {
                            aocfArr2[i] = (aocf) aocfArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return aoce;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
