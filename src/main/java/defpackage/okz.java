package defpackage;

/* renamed from: okz */
final /* synthetic */ class okz implements olh {
    public static final olh a = new okz();

    private okz() {
    }

    public final int a(Object obj) {
        String str = ((okq) obj).a;
        int i = 0;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            i = 1;
        } else if (ozp.a < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return -1;
        }
        return i;
    }
}
