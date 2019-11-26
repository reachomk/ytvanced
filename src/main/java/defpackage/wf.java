package defpackage;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.PlaybackState;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: wf */
final class wf extends Callback {
    private final WeakReference a;

    wf(wc wcVar) {
        this.a = new WeakReference(wcVar);
    }

    public final void onSessionDestroyed() {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a();
        }
    }

    public final void onSessionEvent(String str, Bundle bundle) {
        wq.a(bundle);
        wc wcVar = (wc) this.a.get();
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null && wcVar.b == null) {
            wcVar.a(xs.a(playbackState));
        }
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        wc wcVar = (wc) this.a.get();
        if (wcVar != null) {
            wcVar.a(vj.a((Object) mediaMetadata));
        }
    }

    public final void onQueueChanged(List list) {
        if (((wc) this.a.get()) != null) {
            xk.a(list);
        }
    }

    public final void onQueueTitleChanged(CharSequence charSequence) {
        this.a.get();
    }

    public final void onExtrasChanged(Bundle bundle) {
        wq.a(bundle);
        this.a.get();
    }

    public final void onAudioInfoChanged(PlaybackInfo playbackInfo) {
        if (((wc) this.a.get()) != null) {
            playbackInfo.getPlaybackType();
            AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
            tg tgVar;
            if (VERSION.SDK_INT >= 26) {
                tgVar = new tg(new tm(audioAttributes));
            } else if (VERSION.SDK_INT >= 21) {
                tgVar = new tg(new tk(audioAttributes));
            }
            playbackInfo.getVolumeControl();
            playbackInfo.getMaxVolume();
            playbackInfo.getCurrentVolume();
            wm wmVar = new wm();
        }
    }
}
