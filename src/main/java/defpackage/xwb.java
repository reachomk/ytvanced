package defpackage;

/* renamed from: xwb */
public final class xwb {
    public final int a;

    public static xwb a(int i) {
        amqw.a(true, (Object) "Invalid resource identifier: 0");
        return new xwb(i);
    }

    private xwb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xwb) && ((xwb) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a + 527;
    }
}
