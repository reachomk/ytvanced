package defpackage;

/* renamed from: jfs */
public final class jfs implements xcp, xpa {
    public hsr a;

    public final void a() {
        a(true);
    }

    public final void b() {
        a(false);
    }

    private final void a(boolean z) {
        hsr hsr = this.a;
        if (hsr != null) {
            hsr.a(z);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xgg.class};
        } else if (i == 0) {
            a(((xgg) obj).a ^ 1);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
