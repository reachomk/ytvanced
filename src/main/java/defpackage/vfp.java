package defpackage;

/* renamed from: vfp */
public final class vfp {
    public final xua a;

    public vfp(xua xua) {
        this.a = xua;
    }

    public final vry a(arku arku, String str, ajmq ajmq, aakj aakj, vsd vsd, vsv vsv) {
        return new vry(this.a.a(), arku, vsd, vsv, str, aakj, ajmq);
    }

    public final vst a(String str, ajmq ajmq, aakj aakj, vsd vsd, vsd vsd2) {
        if (vsd == null) {
            return new vst(this.a.a(), vsm.PRE_ROLL, str, ajmq, aakj, null);
        }
        if (vsd.e() == vsm.PRE_ROLL) {
            return new vst(this.a.a(), vsm.PRE_ROLL, str, ajmq, aakj, (vqy) vsd);
        }
        return new vst(this.a.a(), new vsv(vfp.a(vsd), vfp.a(vsd2)), str, ajmq, aakj, (vqy) vsd);
    }

    public static long a(vsd vsd) {
        if (vsd == null || vsd.e() != vsm.MID_ROLL) {
            return 9223372036854775806L;
        }
        return vsd.a();
    }
}
