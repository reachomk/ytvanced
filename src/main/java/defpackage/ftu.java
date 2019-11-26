package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.apps.youtube.app.MainLiveCreationActivity;
import com.google.android.libraries.youtube.edit.gallery.GalleryActivity;
import java.util.Map;

/* renamed from: ftu */
public final class ftu implements aaap {
    private final Activity a;
    private final wxd b;
    private final acjk c;

    public ftu(Activity activity, wxd wxd, acjk acjk) {
        this.a = activity;
        this.b = wxd;
        this.c = acjk;
    }

    public final void a(apxu apxu, Map map) {
        Intent a = GalleryActivity.a(this.a, apxu);
        a.putExtra("extra_gallery_secondary_action_class", MainLiveCreationActivity.class.getCanonicalName());
        a.addFlags(536870912);
        wxe wxe = (wxe) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", wxe.class);
        this.c.a();
        if (wxe != null) {
            this.b.a(a, 1800, wxe);
        } else {
            this.a.startActivity(a);
        }
    }
}
