package defpackage;

/* renamed from: bnh */
public final class bnh implements bnc {
    public final String a;
    public final bmx b;
    public final bms c;
    public final bmo d;
    public final boolean e;

    public bnh(String str, bmx bmx, bms bms, bmo bmo, boolean z) {
        this.a = str;
        this.b = bmx;
        this.c = bms;
        this.d = bmo;
        this.e = z;
    }

    public final bku a(bju bju, bnr bnr) {
        return new blg(bju, bnr, this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RectangleShape{position=");
        stringBuilder.append(this.b);
        stringBuilder.append(", size=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
