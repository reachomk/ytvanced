package defpackage;

/* renamed from: amr */
final class amr {
    public aqj a;
    public aqj b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    amr(aqj aqj, aqj aqj2, int i, int i2, int i3, int i4) {
        this.a = aqj;
        this.b = aqj2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ChangeInfo{oldHolder=");
        stringBuilder.append(this.a);
        stringBuilder.append(", newHolder=");
        stringBuilder.append(this.b);
        stringBuilder.append(", fromX=");
        stringBuilder.append(this.c);
        stringBuilder.append(", fromY=");
        stringBuilder.append(this.d);
        stringBuilder.append(", toX=");
        stringBuilder.append(this.e);
        stringBuilder.append(", toY=");
        stringBuilder.append(this.f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
