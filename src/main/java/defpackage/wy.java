package defpackage;

import android.media.RemoteControlClient.OnPlaybackPositionUpdateListener;

/* renamed from: wy */
final class wy implements OnPlaybackPositionUpdateListener {
    private final /* synthetic */ wz a;

    wy(wz wzVar) {
        this.a = wzVar;
    }

    public final void onPlaybackPositionUpdate(long j) {
        this.a.a(18, -1, -1, Long.valueOf(j), null);
    }
}
