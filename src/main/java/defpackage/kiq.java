package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: kiq */
final /* synthetic */ class kiq implements Runnable {
    private final kip a;
    private final String b;
    private final aygi c;

    kiq(kip kip, String str, aygi aygi) {
        this.a = kip;
        this.b = str;
        this.c = aygi;
    }

    public final void run() {
        kip kip = this.a;
        String str = this.b;
        aygi aygi = this.c;
        kik kik = kip.a;
        if (!kik.h) {
            aygk aygk = aygi.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            View findViewWithTag = kik.f.findViewWithTag(str);
            if (findViewWithTag != null) {
                ImageView imageView = (ImageView) findViewWithTag.findViewById(R.id.reel_upload_thumbnail);
                if (imageView != null) {
                    new akle(new akkj(kik.c), new xna(), imageView, true).a(aygk);
                }
            }
        }
    }
}
