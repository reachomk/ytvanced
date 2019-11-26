package defpackage;

import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: xcs */
final class xcs implements xcn {
    private final WeakReference a;
    private final Class b;
    private final Class[] c;
    private final int d;

    xcs(xcp xcp, Class cls, Class[] clsArr) {
        this.a = new WeakReference((xcp) amqw.a((Object) xcp));
        this.b = cls;
        this.c = clsArr;
        this.d = Arrays.hashCode(new Object[]{xcp, Integer.valueOf(Arrays.hashCode(clsArr))});
    }

    public final void a(Object obj) {
        xcp xcp = (xcp) this.a.get();
        if (xcp != null) {
            Class cls = obj.getClass();
            Class cls2 = this.b;
            Class[] clsArr = this.c;
            int length = clsArr.length;
            for (int i = 0; i < length; i++) {
                if (clsArr[i] == cls) {
                    length = i;
                    break;
                }
            }
            xcp.a(cls2, obj, length);
        }
    }

    public final int hashCode() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xcs) {
            xcs xcs = (xcs) obj;
            return xcs.a.get() == this.a.get() && Arrays.equals(this.c, xcs.c);
        }
    }
}
