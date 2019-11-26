package defpackage;

/* renamed from: xcr */
final class xcr implements xcm {
    xcr() {
    }

    public final xcq[] a(Object obj, Class cls, Object obj2) {
        if (!(obj instanceof xcp)) {
            return null;
        }
        xcp xcp = (xcp) obj;
        Class[] a = xcp.a(cls, null, -1);
        int i = 0;
        if (a != null) {
            int length = a.length;
            if (length > 0) {
                xcs xcs = new xcs(xcp, cls, a);
                xcq[] xcqArr = new xcq[length];
                while (i < a.length) {
                    xcqArr[i] = new xcq(obj, a[i], obj2, xcs);
                    i++;
                }
                return xcqArr;
            }
        }
        throw new IllegalArgumentException(String.format("Class %s does not contain any injected methods annotated with @Subscribe", new Object[]{cls.getSimpleName()}));
    }
}
