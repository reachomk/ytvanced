package defpackage;

import com.google.android.libraries.youtube.mdx.mediaroute.RemotePlaybackControlsService;

/* renamed from: adhc */
public final class adhc implements aitg {
    private final /* synthetic */ RemotePlaybackControlsService a;

    public adhc(RemotePlaybackControlsService remotePlaybackControlsService) {
        this.a = remotePlaybackControlsService;
    }

    public final boolean a() {
        adqf adqf = (adqf) this.a.h.get();
        if (adqf.g() || adqf.d() == 0 || adqf.d() == 1) {
            return true;
        }
        return false;
    }
}
