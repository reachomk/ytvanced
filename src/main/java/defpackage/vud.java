package defpackage;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: vud */
public final class vud implements aite {
    private final bcaa b;

    public vud(bcaa bcaa) {
        this.b = bcaa;
    }

    public final int b() {
        return R.id.title;
    }

    public final int c() {
        return R.id.byline;
    }

    public final int a() {
        return TextUtils.isEmpty(((vtx) this.b.get()).a.i) ? R.layout.ad_notification_no_title : R.layout.ad_notification;
    }

    public final boolean d() {
        return VERSION.SDK_INT > 23;
    }
}
