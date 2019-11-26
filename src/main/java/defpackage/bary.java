package defpackage;

/* renamed from: bary */
public final class bary {
    private final String a;

    private bary(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }

    public static bary a(String str) {
        amqw.a((Object) str, (Object) "debugString");
        return new bary(str);
    }
}
