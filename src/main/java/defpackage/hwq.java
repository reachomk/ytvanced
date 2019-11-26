package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: hwq */
public final class hwq implements aiav {
    public final nn a;
    public final hwr b;
    public final hws c;

    public hwq(nn nnVar, hws hws) {
        this.a = nnVar;
        this.b = new hwr(R.id.controls_overlay_menu_audio_track, nnVar.getString(R.string.audio_tracks_title), new hwp(this));
        this.b.d = ra.a((Context) nnVar, (int) R.drawable.ic_overflow_language);
        this.c = hws;
    }

    public final void a(aiay aiay) {
        throw null;
    }

    public final void f(boolean z) {
        this.b.a(z);
    }

    public final void a(aahn[] aahnArr, int i) {
        this.c.a(aahnArr, i);
        String str = null;
        if (aahnArr != null && i >= 0 && i < aahnArr.length) {
            str = aahnArr[i].b;
        }
        this.b.a(str);
    }
}
