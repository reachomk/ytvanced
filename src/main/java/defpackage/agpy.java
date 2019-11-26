package defpackage;

/* renamed from: agpy */
public final class agpy {
    public final String a;
    public final String b;
    public final aaft c;
    public final avnc d;
    public final boolean e;

    private agpy(String str, String str2, boolean z, aaft aaft, avnc avnc) {
        this.a = (String) amqw.a((Object) str);
        this.b = str2;
        this.c = aaft;
        this.e = z;
        this.d = avnc;
    }

    public static agpy a(avnc avnc, aaft aaft) {
        if (avnc == null || (avnc.a & 1) == 0) {
            return null;
        }
        avna avna = avnc.b;
        if (avna == null) {
            avna = avna.g;
        }
        String str = avna.b;
        avna = avnc.b;
        if (avna == null) {
            avna = avna.g;
        }
        String str2 = avna.d;
        avna = avnc.b;
        if (avna == null) {
            avna = avna.g;
        }
        return new agpy(str, str2, avna.f, aaft, avnc);
    }

    public static agpy a(avnc avnc) {
        if (avnc == null || (avnc.a & 1) == 0) {
            return null;
        }
        avna avna = avnc.b;
        if (avna == null) {
            avna = avna.g;
        }
        aygk aygk = avna.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        return agpy.a(avnc, new aaft(aygk));
    }
}
