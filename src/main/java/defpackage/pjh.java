package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;

/* renamed from: pjh */
public final class pjh {
    public final CastDevice a;
    public final pjk b;
    public int c = 0;
    public Bundle d;

    public pjh(CastDevice castDevice, pjk pjk) {
        pzr.a((Object) castDevice, (Object) "CastDevice parameter cannot be null");
        pzr.a((Object) pjk, (Object) "CastListener parameter cannot be null");
        this.a = castDevice;
        this.b = pjk;
    }

    public final pji a() {
        return new pji(this);
    }
}
