package defpackage;

/* renamed from: aetv */
public final class aetv {
    public static final aajq[] a = afgu.g;
    public final aahr b;
    public final aahr c;
    public final aahr d;
    public final aajq[] e;
    public final aahn[] f;
    public final afgq g;
    public final int h;
    public final long i;
    public final int j;

    public aetv(aahr aahr, aajq[] aajqArr, aahn[] aahnArr) {
        this(null, aahr, null, aajqArr, aahnArr, null, 0, -1, 0);
    }

    public aetv(aajq[] aajqArr, aahn[] aahnArr, afgq afgq) {
        this(null, null, null, aajqArr, aahnArr, afgq, 0, -1, 0);
    }

    public aetv(aahr aahr, aahr aahr2, aahr aahr3, aajq[] aajqArr, aahn[] aahnArr, afgq afgq, int i, long j, int i2) {
        this.b = aahr;
        this.c = aahr2;
        this.d = aahr3;
        this.e = (aajq[]) amqw.a((Object) aajqArr);
        this.f = (aahn[]) amqw.a((Object) aahnArr);
        this.g = afgq;
        this.h = i;
        this.i = j;
        this.j = i2;
    }

    public final boolean a() {
        return this.e.length > 1;
    }

    public final boolean b() {
        return this.f.length > 1;
    }

    public final String toString() {
        aahr aahr = this.b;
        int i = 0;
        int b = aahr != null ? aahr.b() : 0;
        aahr aahr2 = this.c;
        int b2 = aahr2 != null ? aahr2.b() : 0;
        aahr aahr3 = this.d;
        if (aahr3 != null) {
            i = aahr3.b();
        }
        String b3 = afhz.b(this.h);
        long j = this.i;
        int i2 = this.j;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b3).length() + 147);
        stringBuilder.append("currentVideoFormat=");
        stringBuilder.append(b);
        stringBuilder.append(" currentAudioFormat=");
        stringBuilder.append(b2);
        stringBuilder.append(" bestVideoFormat=");
        stringBuilder.append(i);
        stringBuilder.append(" trigger=");
        stringBuilder.append(b3);
        stringBuilder.append(" estimate=");
        stringBuilder.append(j);
        stringBuilder.append(" source=");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }
}
