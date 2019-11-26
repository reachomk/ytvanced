package defpackage;

import android.widget.Toast;
import com.google.android.youtube.R;

/* renamed from: wku */
final class wku implements wmg {
    private final /* synthetic */ wmb a;
    private final /* synthetic */ wkr b;

    wku(wkr wkr, wmb wmb) {
        this.b = wkr;
        this.a = wmb;
    }

    public final void a() {
        wjv wjv = this.b.a;
        if (wjv.av == null) {
            wjv.ax = null;
            wjv.ac();
            this.a.a();
            Toast.makeText(this.b.a.p(), R.string.backstage_post_attach_video_failed, 1).show();
        }
    }

    public final void a(String str) {
        wjv wjv = this.b.a;
        wjv.aw = str;
        wjv.ac();
        this.a.a();
    }
}
