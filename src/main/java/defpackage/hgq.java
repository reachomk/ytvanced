package defpackage;

/* renamed from: hgq */
final class hgq implements xcp {
    private final /* synthetic */ hgl a;

    hgq(hgl hgl) {
        this.a = hgl;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ahjl.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (!((ahjl) obj).a) {
            this.a.g = false;
            return null;
        }
        return clsArr;
    }
}
