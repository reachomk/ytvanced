package defpackage;

/* renamed from: amss */
public final class amss {
    public static void a(Object obj, Object obj2) {
        StringBuilder stringBuilder;
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            stringBuilder = new StringBuilder(valueOf.length() + 24);
            stringBuilder.append("null key in entry: null=");
            stringBuilder.append(valueOf);
            throw new NullPointerException(stringBuilder.toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            stringBuilder = new StringBuilder(valueOf2.length() + 26);
            stringBuilder.append("null value in entry: ");
            stringBuilder.append(valueOf2);
            stringBuilder.append("=null");
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    static int a(int i, String str) {
        if (i >= 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 40);
        stringBuilder.append(str);
        stringBuilder.append(" cannot be negative but was: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    static void a(boolean z) {
        amqw.b(z, (Object) "no calls to next() since the last call to remove()");
    }
}
