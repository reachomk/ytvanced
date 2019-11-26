package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflinePlaylistAutoSyncActivity;

/* renamed from: agjw */
public final /* synthetic */ class agjw implements OnClickListener {
    private final DebugOfflinePlaylistAutoSyncActivity a;

    public agjw(DebugOfflinePlaylistAutoSyncActivity debugOfflinePlaylistAutoSyncActivity) {
        this.a = debugOfflinePlaylistAutoSyncActivity;
    }

    public final void onClick(View view) {
        Context context = this.a;
        context.b.a(context.c.c(), true);
        xpr.a(context, (CharSequence) "Starting AutoSync in forceSync mode (will always make the server request to fetch playlists update regardless of what the server tells us)", 1);
    }
}
