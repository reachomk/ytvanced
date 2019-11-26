package defpackage;

/* renamed from: bno */
public final class bno implements bnc {
    public final String a;
    public final bmu b;
    public final boolean c;
    private final int d;

    public bno(String str, int i, bmu bmu, boolean z) {
        this.a = str;
        this.d = i;
        this.b = bmu;
        this.c = z;
    }

    public final bku a(bju bju, bnr bnr) {
        return new bli(bju, bnr, this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ShapePath{name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", index=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
