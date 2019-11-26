package defpackage;

import android.text.Html;
import com.google.android.libraries.youtube.mdx.mediaroute.RemotePlaybackControlsService;
import com.google.android.youtube.R;

/* renamed from: adhb */
public final class adhb implements aitf {
    private final /* synthetic */ RemotePlaybackControlsService a;

    public adhb(RemotePlaybackControlsService remotePlaybackControlsService) {
        this.a = remotePlaybackControlsService;
    }

    public final qg a() {
        if (((adqf) this.a.h.get()).f().a() != 1) {
            return null;
        }
        CharSequence string = this.a.getString(R.string.mdx_connection_lost);
        CharSequence fromHtml = Html.fromHtml(this.a.getString(R.string.searching_for_screen, new Object[]{r0.b()}));
        qg qgVar = new qg(this.a);
        qgVar.a(string);
        qgVar.e(string);
        qgVar.b(fromHtml);
        qgVar.c(null);
        qgVar.a(this.a.i.e());
        qgVar.i = 2;
        xlr.a(qgVar);
        return qgVar;
    }
}
