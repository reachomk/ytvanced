package defpackage;

/* renamed from: acbp */
final /* synthetic */ class acbp implements acai {
    private final acay a;

    acbp(acay acay) {
        this.a = acay;
    }

    public final void a(int i) {
        acay acay = this.a;
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("ABR controller error: ");
        stringBuilder.append(i);
        xtl.a("MediaMuxCapturePipelineMgr", stringBuilder.toString());
        acay.a(i);
    }
}
