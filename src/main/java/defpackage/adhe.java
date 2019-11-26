package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.libraries.youtube.mdx.mediaroute.RemotePlaybackControlsService;
import com.google.android.youtube.R;

/* renamed from: adhe */
public final class adhe implements aitl {
    private final /* synthetic */ RemotePlaybackControlsService a;

    public adhe(RemotePlaybackControlsService remotePlaybackControlsService) {
        this.a = remotePlaybackControlsService;
    }

    public final aitj a() {
        if (!((adqf) this.a.h.get()).g()) {
            return null;
        }
        return aitj.f().a(true).a((int) R.drawable.ic_notifications_pause_disabled).b(R.string.playback_control_play_pause).a(PendingIntent.getBroadcast(this.a, 0, new Intent(null), 0)).a().b();
    }
}
