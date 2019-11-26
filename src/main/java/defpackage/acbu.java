package defpackage;

/* renamed from: acbu */
final class acbu implements acho {
    private final /* synthetic */ acay a;

    acbu(acay acay) {
        this.a = acay;
    }

    public final void a(achm achm, int i) {
        String valueOf = String.valueOf(achm.e());
        String str = "Encoder error for ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        xtl.a("MediaMuxCapturePipelineMgr", valueOf);
        this.a.a(i);
    }
}
