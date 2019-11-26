package defpackage;

/* renamed from: jwd */
public final class jwd implements Comparable {
    public final jwc a;
    public final boolean b;

    /* renamed from: a */
    public final int compareTo(jwd jwd) {
        amqw.a((Object) jwd);
        return Boolean.compare(this.b, jwd.b);
    }

    public /* synthetic */ jwd(jwc jwc, boolean z) {
        this.a = jwc;
        this.b = z;
    }
}
