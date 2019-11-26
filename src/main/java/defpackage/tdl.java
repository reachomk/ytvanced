package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;

/* renamed from: tdl */
final class tdl implements tbq {
    tdl() {
    }

    public final tbn a(Bundle bundle) {
        CastDevice a = CastDevice.a(bundle);
        return a != null ? new tdn(a) : null;
    }
}
