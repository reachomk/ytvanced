package defpackage;

/* renamed from: alyt */
public final class alyt extends alyv {
    public String a;
    public int b = 0;

    public alyt(zzf zzf, xvx xvx, amdg amdg, zyw zyw, amac amac) {
        super(zzf, xvx, amdg, zyw, amac);
        this.a = xvx.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        int i = this.b;
        StringBuilder stringBuilder = new StringBuilder(11);
        stringBuilder.append(i);
        String stringBuilder2 = stringBuilder.toString();
        this.b++;
        return stringBuilder2;
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return this.a;
    }
}
