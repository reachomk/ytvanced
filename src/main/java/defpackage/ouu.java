package defpackage;

/* renamed from: ouu */
public final class ouu {
    public final int a;
    public final oan[] b;
    public final oun c;
    public final Object d;

    public ouu(oan[] oanArr, oum[] oumArr, Object obj) {
        this.b = oanArr;
        this.c = new oun(oumArr);
        this.d = obj;
        this.a = oanArr.length;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }

    public final boolean a(ouu ouu, int i) {
        if (ouu != null && ozp.a(this.b[i], ouu.b[i]) && ozp.a(this.c.a(i), ouu.c.a(i))) {
            return true;
        }
        return false;
    }
}
