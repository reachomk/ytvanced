package defpackage;

/* renamed from: uay */
public final class uay extends ubb {
    public final uax a;

    uay(int i, uax uax) {
        super(i);
        this.a = uax;
    }

    public final int a(ubl ubl) {
        return ubl.a.getInt((this.k + ubl.b) + 4);
    }

    public final int a(ubl ubl, int i) {
        uhy.a(i, a(ubl));
        int i2 = this.k;
        int i3 = ubl.b;
        return ubl.d((((i2 + i3) + 8) + i3) + (i * i3));
    }

    public final String b(ubl ubl, int i) {
        uhy.a(i, a(ubl));
        StringBuilder stringBuilder = new StringBuilder(13);
        stringBuilder.append("[");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final String c(ubl ubl, int i) {
        int a = a(ubl);
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("Object[");
        stringBuilder.append(i);
        stringBuilder.append("/");
        stringBuilder.append(a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final int b(ubl ubl) {
        return ubl.b * a(ubl);
    }
}
