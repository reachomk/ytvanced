package defpackage;

/* renamed from: afas */
public class afas {
    public final afjc a;
    public final afag b;
    public final int c;
    private final ovh d;
    private final int e;
    private final int f;

    public afas(ovh ovh, afjc afjc, int i, int i2, afag afag, int i3) {
        this.d = ovh;
        this.a = afjc;
        this.e = i;
        this.f = i2;
        this.b = afag;
        this.c = i3;
    }

    /* Access modifiers changed, original: protected */
    public afao a(oqx oqx, afjc afjc, int[] iArr, oum oum, int i, owt owt, afag afag, int i2) {
        int i3 = i;
        return new afao(oqx, afjc, iArr, oum, i3, a(owt), a(i3), afag, i2);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(int i) {
        if (i != 1) {
            return this.e;
        }
        return this.f;
    }

    /* Access modifiers changed, original: protected|final */
    public final ovi a(owt owt) {
        ovi a = this.d.a();
        if (owt != null) {
            a.a(owt);
        }
        return a;
    }
}
