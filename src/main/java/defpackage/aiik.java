package defpackage;

/* renamed from: aiik */
public final class aiik implements xcp {
    private final /* synthetic */ aiii a;

    public aiik(aiii aiii) {
        this.a = aiii;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkk.class};
        } else if (i == 0) {
            this.a.c.c(((ahkk) obj).a);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
