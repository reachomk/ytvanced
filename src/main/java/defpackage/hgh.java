package defpackage;

/* renamed from: hgh */
public abstract class hgh implements aadq {
    private static final aadv a = new hgg();

    public abstract String a();

    public abstract boolean b();

    public static hgh a(String str) {
        hge hge = new hge();
        if (str != null) {
            hge.a = str;
            hge.b = Boolean.valueOf(false);
            return hge.a();
        }
        throw new NullPointerException("Null key");
    }

    public final byte[] c() {
        String valueOf = String.valueOf(getClass());
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
        stringBuilder.append("toByteArray is not supported by ");
        stringBuilder.append(valueOf);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    public aadv getType() {
        return a;
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("entityKey", a());
        a.a("shouldIndicate", b());
        return a.toString();
    }

    public static String b(String str) {
        str = String.valueOf(str);
        String str2 = "InboxNotificationEntity";
        return str.length() == 0 ? new String(str2) : str2.concat(str);
    }

    public final amuw d() {
        return amwp.a;
    }
}
