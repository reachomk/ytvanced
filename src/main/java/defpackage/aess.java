package defpackage;

/* renamed from: aess */
final /* synthetic */ class aess implements Runnable {
    private final aesp a;

    aess(aesp aesp) {
        this.a = aesp;
    }

    public final void run() {
        aesp aesp = this.a;
        try {
            aesp.a.a(aesp.i);
        } catch (Exception e) {
            afpf afpf = afpf.media;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 68);
            stringBuilder.append("Exception while trying to close DRM Session with a delay of 100 ms: ");
            stringBuilder.append(valueOf);
            afpc.a(1, afpf, stringBuilder.toString());
        }
        aesp.i = null;
    }
}
