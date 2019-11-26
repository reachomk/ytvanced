package defpackage;

import com.google.android.youtube.R;
import java.util.Arrays;

/* renamed from: gtp */
final class gtp implements zqj {
    private final /* synthetic */ gso a;

    gtp(gso gso) {
        this.a = gso;
    }

    public final void bo_() {
        gso gso = this.a;
        if (!gso.o || alai.a(gso.a, 3)) {
            gso.J.a(R.id.location_search_view);
            return;
        }
        gso.am = new alak(alan.a(gso.a), gso.g, Arrays.asList(new alad[]{new alad(3, acwc.UPLOAD_VIDEO_APPROVE_LOCATION_BUTTON, acwc.UPLOAD_VIDEO_DENY_LOCATION_BUTTON)}), R.string.permission_open_settings_location, R.string.permissions_missing_location, new gtg(gso));
        gso.am.a();
    }
}
