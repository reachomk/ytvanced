package defpackage;

/* renamed from: pax */
public final class pax implements Comparable {
    public int a;
    public int b;

    private pax() {
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order{order=");
        stringBuilder.append(this.b);
        stringBuilder.append(", index=");
        stringBuilder.append(this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        pax pax = (pax) obj;
        int i = this.b;
        int i2 = pax.b;
        return i == i2 ? this.a - pax.a : i - i2;
    }

    public /* synthetic */ pax(byte b) {
    }
}
