package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources.NotFoundException;
import android.view.LayoutInflater;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.youtube.R;

/* renamed from: lyz */
public final /* synthetic */ class lyz {
    public static faf a(Activity activity, mjm mjm, hdk hdk, fab fab, zyw zyw, bcaa bcaa, SharedPreferences sharedPreferences) {
        faf faf = new faf();
        faf.a = activity.getString(R.string.application_name);
        faf.a((ezu) hdk);
        faf.a((ezu) fab);
        faf.a(new hdn(activity, sharedPreferences));
        faf.a(mjm.a());
        faf.c = faa.j().a(ezo.b(R.attr.ytBrandBackgroundSolid)).b(ezo.b(R.attr.ytStatusBarBackground)).a((int) R.style.f588ThemeOverlay.YouTube.ActionBar.Title.Main).c(ezo.b(R.attr.ytTextPrimary)).b((int) R.style.f587ThemeOverlay.YouTube.ActionBar.Subtitle.Main).d(ezo.b(R.attr.ytTextSecondary)).e(ezo.b(R.attr.ytIconActiveOther)).a();
        apxn a = zyw.a();
        if (a != null) {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            arnw arnw = auya.p;
            if (arnw == null) {
                arnw = arnw.c;
            }
            if (arnw.b) {
                faf.a((ezu) bcaa.get());
            }
        }
        return faf;
    }

    public static MediaRouteButton a(Context context) {
        MediaRouteButton mediaRouteButton = (MediaRouteButton) LayoutInflater.from(context).inflate(R.layout.player_cast_media_route_button, null);
        try {
            mediaRouteButton.a(ra.a(context, (int) R.drawable.ic_media_route_transparent_waves));
        } catch (NotFoundException | NullPointerException unused) {
        }
        return mediaRouteButton;
    }
}
