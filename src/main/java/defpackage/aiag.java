package defpackage;

/* renamed from: aiag */
public final class aiag implements xcp {
    private final /* synthetic */ aiac a;

    public aiag(aiac aiac) {
        this.a = aiac;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkk.class};
        } else if (i == 0) {
            this.a.a.c(((ahkk) obj).a ^ 1);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
