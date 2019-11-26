package defpackage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: rip */
final class rip implements Cloneable {
    public Object a;
    public List b = new ArrayList();
    private rin c;

    rip() {
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        Object obj = this.a;
        int i;
        if (obj == null) {
            i = 0;
            for (riw riw : this.b) {
                i += rim.d(riw.a) + riw.b.length;
            }
            return i;
        } else if (!this.c.b) {
            return rin.c();
        } else {
            int length = Array.getLength(obj);
            i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Array.get(obj, i2) != null) {
                    Array.get(obj, i2);
                    i += rin.c();
                }
            }
            return i;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(rim rim) {
        Object obj = this.a;
        if (obj == null) {
            for (riw riw : this.b) {
                rim.c(riw.a);
                rim.b(riw.b);
            }
        } else if (this.c.b) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                if (Array.get(obj, i) != null) {
                    rin.b();
                }
            }
        } else {
            rin.b();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rip)) {
            return false;
        }
        rip rip = (rip) obj;
        if (this.a == null || rip.a == null) {
            List list = this.b;
            if (list != null) {
                List list2 = rip.b;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(c(), rip.c());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
        rin rin = this.c;
        if (rin != rip.c) {
            return false;
        }
        if (!rin.a.isArray()) {
            return this.a.equals(rip.a);
        }
        Object obj2 = this.a;
        if (obj2 instanceof byte[]) {
            return Arrays.equals((byte[]) obj2, (byte[]) rip.a);
        }
        if (obj2 instanceof int[]) {
            return Arrays.equals((int[]) obj2, (int[]) rip.a);
        }
        if (obj2 instanceof long[]) {
            return Arrays.equals((long[]) obj2, (long[]) rip.a);
        }
        if (obj2 instanceof float[]) {
            return Arrays.equals((float[]) obj2, (float[]) rip.a);
        }
        if (obj2 instanceof double[]) {
            return Arrays.equals((double[]) obj2, (double[]) rip.a);
        }
        if (obj2 instanceof boolean[]) {
            return Arrays.equals((boolean[]) obj2, (boolean[]) rip.a);
        }
        return Arrays.deepEquals((Object[]) obj2, (Object[]) rip.a);
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
        a(rim.a(bArr, bArr.length));
        return bArr;
    }

    /* renamed from: b */
    public final rip clone() {
        rip rip = new rip();
        try {
            rip.c = this.c;
            List list = this.b;
            if (list == null) {
                rip.b = null;
            } else {
                rip.b.addAll(list);
            }
            Object obj = this.a;
            if (obj != null) {
                if (obj instanceof riu) {
                    rip.a = (riu) ((riu) obj).clone();
                } else if (obj instanceof byte[]) {
                    rip.a = ((byte[]) obj).clone();
                } else {
                    int i = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length][];
                        rip.a = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (obj instanceof boolean[]) {
                        rip.a = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        rip.a = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        rip.a = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        rip.a = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        rip.a = ((double[]) obj).clone();
                    } else if (obj instanceof riu[]) {
                        riu[] riuArr = (riu[]) obj;
                        riu[] riuArr2 = new riu[riuArr.length];
                        rip.a = riuArr2;
                        while (i < riuArr.length) {
                            riuArr2[i] = (riu) riuArr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return rip;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
