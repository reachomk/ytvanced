package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: hxd */
public final class hxd implements aiet {
    public final nn a;
    public final hwr b;
    public final hxf c;
    public boolean d;

    public hxd(nn nnVar, hxf hxf) {
        this.a = (nn) amqw.a((Object) nnVar);
        this.b = new hwr(R.id.controls_overlay_menu_playback_rate, nnVar.getString(R.string.playback_rate_title), new hxg(this));
        this.b.d = ra.a((Context) nnVar, (int) R.drawable.quantum_ic_slow_motion_video_grey600_24);
        this.c = hxf;
    }

    public final void a(boolean z) {
        this.b.a(z);
    }

    public final void b(boolean z) {
        this.d = z;
    }

    public final void a(aywt[] aywtArr, int i) {
        this.c.a(aywtArr, i);
        String str = null;
        if (aywtArr != null && i >= 0 && i < aywtArr.length) {
            str = hxi.a(aywtArr[i]);
        }
        this.b.a(str);
    }
}
