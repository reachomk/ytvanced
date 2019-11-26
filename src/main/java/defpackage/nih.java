package defpackage;

/* renamed from: nih */
final class nih implements Runnable {
    private final /* synthetic */ nid a;

    nih(nid nid) {
        this.a = nid;
    }

    public final void run() {
        mmv mmv = this.a.b;
        if (mmv.c()) {
            mmv.e.f();
            return;
        }
        mmx mmx = mmv.e;
        String str = (mmx == null || !(mmx instanceof mna)) ? "due to no playlist being set." : "as already at the start of the playlist.";
        String str2 = "Ignoring call to previous() on YouTubeThumbnailView ";
        ammj.a(str.length() == 0 ? new String(str2) : str2.concat(str), new Object[0]);
    }
}
