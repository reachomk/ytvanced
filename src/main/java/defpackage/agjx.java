package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflinePlaylistAutoSyncActivity;

/* renamed from: agjx */
public final /* synthetic */ class agjx implements OnClickListener {
    private final DebugOfflinePlaylistAutoSyncActivity a;

    public agjx(DebugOfflinePlaylistAutoSyncActivity debugOfflinePlaylistAutoSyncActivity) {
        this.a = debugOfflinePlaylistAutoSyncActivity;
    }

    public final void onClick(View view) {
        Context context = this.a;
        context.b.a(context.c.c(), false);
        xpr.a(context, (CharSequence) "Immediate auto sync requested.", 1);
    }
}
