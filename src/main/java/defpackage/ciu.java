package defpackage;

/* renamed from: ciu */
public abstract class ciu extends bakp {
    public ciu(String str) {
        super(str);
    }

    public abstract long[] a();

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        int length = a().length;
        StringBuilder stringBuilder = new StringBuilder(simpleName.length() + 24);
        stringBuilder.append(simpleName);
        stringBuilder.append("[entryCount=");
        stringBuilder.append(length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
