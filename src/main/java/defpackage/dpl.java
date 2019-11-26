package defpackage;

/* renamed from: dpl */
final class dpl implements Runnable {
    private final /* synthetic */ dos a;

    dpl(dos dos) {
        this.a = dos;
    }

    public final void run() {
        wxw wxw = (wxw) this.a.ac.get();
        dos dos = this.a;
        ebf ebf = new ebf(dos.h, dos.A, dos.t, dos.s, dos.u);
        wxw.a("offline_settings_fetch", new ebh(ebf));
        wxw.a("offline_library_browse_fetch", new ebi("FElibrary", ebf.a, ebf.d, ebf.c));
    }
}
