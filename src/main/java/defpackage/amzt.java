package defpackage;

/* renamed from: amzt */
public abstract class amzt {
    public final int a;
    public final amyo b;

    protected amzt(amyo amyo, int i) {
        if (amyo == null) {
            throw new IllegalArgumentException("format options cannot be null");
        } else if (i >= 0) {
            this.a = i;
            this.b = amyo;
        } else {
            StringBuilder stringBuilder = new StringBuilder(26);
            stringBuilder.append("invalid index: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public abstract void a(amzw amzw, Object obj);
}
