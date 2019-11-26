package defpackage;

/* renamed from: yie */
public class yie implements aadq {
    public final String a;
    private final aadq b;

    public yie(String str, aadq aadq) {
        this.a = xvd.a(str);
        this.b = aadq;
    }

    public long e() {
        return 0;
    }

    public String getSyncToken() {
        return null;
    }

    public aadv getType() {
        return null;
    }

    public final String a() {
        return this.a;
    }

    public final amuw d() {
        return getEntity().d();
    }

    public final boolean b() {
        return this.b != null;
    }

    public aadq getEntity() {
        amqw.b(b(), (Object) "Not loaded!");
        return this.b;
    }

    public final byte[] c() {
        String valueOf = String.valueOf(getClass());
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
        stringBuilder.append("toByteArray is not supported by ");
        stringBuilder.append(valueOf);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }
}
