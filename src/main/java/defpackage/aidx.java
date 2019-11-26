package defpackage;

/* renamed from: aidx */
public final class aidx implements xcp {
    private final /* synthetic */ aidq a;

    public aidx(aidq aidq) {
        this.a = aidq;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aakt.class, aaks.class};
        } else if (i == 0) {
            aakt aakt = (aakt) obj;
            this.a.l = aakt.a;
            return null;
        } else if (i == 1) {
            aaks aaks = (aaks) obj;
            this.a.m = aaks.a;
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
