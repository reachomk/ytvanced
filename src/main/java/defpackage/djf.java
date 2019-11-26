package defpackage;

import com.google.android.libraries.youtube.offline.developer.DebugOfflineAdActivity;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAutoOfflineActivity;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineDatabaseActivity;
import com.google.android.libraries.youtube.offline.developer.DebugOfflinePlaylistAutoSyncActivity;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineResyncActivity;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineStartupLatencyActivity;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineStoreActivity;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineStreamsActivity;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineVideosActivity;

/* renamed from: djf */
final class djf implements agiz {
    public volatile Object a = new baqe();
    private volatile bcaa b;
    private final /* synthetic */ diu c;

    public final void a(DebugOfflineAdActivity debugOfflineAdActivity) {
        debugOfflineAdActivity.e = this.c.ed();
        debugOfflineAdActivity.f = this.c.oy();
        debugOfflineAdActivity.g = this.c.k();
        debugOfflineAdActivity.h = this.c.dr();
        bcaa bcaa = this.b;
        if (bcaa == null) {
            bcaa = new dje(this);
            this.b = bcaa;
        }
        debugOfflineAdActivity.i = new akoe(bcaa);
        debugOfflineAdActivity.j = this.c.ox();
        debugOfflineAdActivity.k = this.c.dX();
        debugOfflineAdActivity.l = this.c.fL();
    }

    public final void a(DebugOfflinePlaylistAutoSyncActivity debugOfflinePlaylistAutoSyncActivity) {
        debugOfflinePlaylistAutoSyncActivity.a = this.c.k();
        debugOfflinePlaylistAutoSyncActivity.b = this.c.jk();
        debugOfflinePlaylistAutoSyncActivity.c = this.c.dz();
    }

    public final void a(DebugOfflineAutoOfflineActivity debugOfflineAutoOfflineActivity) {
        debugOfflineAutoOfflineActivity.a = this.c.k();
        debugOfflineAutoOfflineActivity.b = this.c.hU();
        debugOfflineAutoOfflineActivity.c = this.c.dz();
    }

    public final void a(DebugOfflineDatabaseActivity debugOfflineDatabaseActivity) {
        debugOfflineDatabaseActivity.a = this.c.dz();
    }

    public final void a(DebugOfflineResyncActivity debugOfflineResyncActivity) {
        debugOfflineResyncActivity.c = this.c.oy();
        debugOfflineResyncActivity.d = this.c.k();
        debugOfflineResyncActivity.e = this.c.dr();
        debugOfflineResyncActivity.f = this.c.jq();
        debugOfflineResyncActivity.g = this.c.oG();
        debugOfflineResyncActivity.h = this.c.jp();
    }

    public final void a(DebugOfflineStreamsActivity debugOfflineStreamsActivity) {
        debugOfflineStreamsActivity.a = this.c.db();
        debugOfflineStreamsActivity.b = this.c.oJ();
        debugOfflineStreamsActivity.c = this.c.dr();
        debugOfflineStreamsActivity.d = this.c.jr();
        debugOfflineStreamsActivity.e = this.c.k();
    }

    public final void a(DebugOfflineVideosActivity debugOfflineVideosActivity) {
        debugOfflineVideosActivity.a = this.c.dz();
        debugOfflineVideosActivity.b = this.c.k();
        debugOfflineVideosActivity.c = this.c.ox();
    }

    public final void a(DebugOfflineStartupLatencyActivity debugOfflineStartupLatencyActivity) {
        debugOfflineStartupLatencyActivity.a = this.c.k();
        debugOfflineStartupLatencyActivity.b = this.c.dr();
    }

    public final void a(DebugOfflineStoreActivity debugOfflineStoreActivity) {
        debugOfflineStoreActivity.a = this.c.ox();
    }

    /* synthetic */ djf(diu diu) {
        this.c = diu;
    }
}
