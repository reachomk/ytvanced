package defpackage;

/* renamed from: nii */
final class nii implements Runnable {
    private final /* synthetic */ nid a;

    nii(nid nid) {
        this.a = nid;
    }

    public final void run() {
        mmv mmv = this.a.b;
        if (mmv.b()) {
            mmv.e.e();
            return;
        }
        mmx mmx = mmv.e;
        String str = (mmx == null || !(mmx instanceof mna)) ? "due to no playlist being set." : "as already at the end of the playlist.";
        String str2 = "Ignoring call to next() on YouTubeThumbnailView ";
        ammj.a(str.length() == 0 ? new String(str2) : str2.concat(str), new Object[0]);
    }
}
