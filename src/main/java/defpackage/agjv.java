package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineDatabaseActivity;

/* renamed from: agjv */
public final /* synthetic */ class agjv implements OnClickListener {
    private final DebugOfflineDatabaseActivity a;

    public agjv(DebugOfflineDatabaseActivity debugOfflineDatabaseActivity) {
        this.a = debugOfflineDatabaseActivity;
    }

    public final void onClick(View view) {
        Context context = this.a;
        agfi h = context.a.b().h();
        if (h == null) {
            xpr.a(context, (CharSequence) "No active offline database found!", 1);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Client Version: ");
        try {
            stringBuilder.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (NameNotFoundException unused) {
            stringBuilder.append("NameNotFoundException");
        }
        stringBuilder.append("\n");
        h.a(stringBuilder, "videosV2", agiq.b);
        h.a(stringBuilder, "playlistsV13", agfv.b);
        h.a(stringBuilder, "playlist_video", agfw.a);
        h.a(stringBuilder, "video_listsV13", aghz.b);
        h.a(stringBuilder, "video_list_videos", agia.a);
        h.a(stringBuilder, "streams", aghn.a);
        h.a(stringBuilder, "ads", ages.b);
        h.a(stringBuilder, "channelsV13", agev.a);
        h.a(stringBuilder, "subscriptionsV31", aghs.a);
        agkw.a(context, stringBuilder.toString());
    }
}
