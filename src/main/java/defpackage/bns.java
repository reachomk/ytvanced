package defpackage;

/* renamed from: bns */
public final class bns implements bnc {
    public final String a;
    public final bmo b;
    public final bmo c;
    public final bmo d;
    public final boolean e;
    public final int f;

    public final bku a(bju bju, bnr bnr) {
        return new blk(bnr, this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Trim Path: {start: ");
        stringBuilder.append(this.b);
        stringBuilder.append(", end: ");
        stringBuilder.append(this.c);
        stringBuilder.append(", offset: ");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public bns(String str, int i, bmo bmo, bmo bmo2, bmo bmo3, boolean z) {
        this.a = str;
        this.f = i;
        this.b = bmo;
        this.c = bmo2;
        this.d = bmo3;
        this.e = z;
    }
}
