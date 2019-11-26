package defpackage;

import android.media.Rating;
import android.media.RemoteControlClient.OnMetadataUpdateListener;

/* renamed from: xa */
final class xa implements OnMetadataUpdateListener {
    private final /* synthetic */ xb a;

    xa(xb xbVar) {
        this.a = xbVar;
    }

    public final void onMetadataUpdate(int i, Object obj) {
        if (i == 268435457 && (obj instanceof Rating)) {
            this.a.a(19, -1, -1, vo.a(obj), null);
        }
    }
}
