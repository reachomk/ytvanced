package defpackage;

/* renamed from: anju */
final class anju extends anjp {
    public static final anju a = new anju(null);
    private final Object b;

    anju(Object obj) {
        this.b = obj;
    }

    public final Object get() {
        return this.b;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(obj).length() + 27) + valueOf.length());
        stringBuilder.append(obj);
        stringBuilder.append("[status=SUCCESS, result=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}
