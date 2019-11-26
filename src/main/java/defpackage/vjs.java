package defpackage;

/* renamed from: vjs */
public final class vjs implements vju {
    private final zzl a;
    private final xua b;

    public vjs(zzl zzl, xua xua) {
        this.a = zzl;
        this.b = xua;
    }

    public final String a(String str, aett aett) {
        if (!wcf.b(this.a)) {
            return this.b.a();
        }
        String str2 = aett.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final String a(String str, vsm vsm, vqy vqy) {
        if (!wcf.b(this.a)) {
            return this.b.a();
        }
        str = String.valueOf(str).concat("_");
        if (vsm == vsm.PRE_ROLL) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 1);
            stringBuilder.append(str);
            stringBuilder.append(0);
            return stringBuilder.toString();
        }
        long a = vqy.a();
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 20);
        stringBuilder2.append(str);
        stringBuilder2.append(a);
        return stringBuilder2.toString();
    }
}
