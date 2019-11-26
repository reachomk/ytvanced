package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.cast.MediaInfo;

/* renamed from: sca */
final class sca implements OnClickListener {
    private final /* synthetic */ sbz a;

    sca(sbz sbz) {
        this.a = sbz;
    }

    public final void onClick(View view) {
        String str = "dialog";
        try {
            sbz sbz = this.a;
            or a = sbz.f().a();
            nf a2 = sbz.f().a(str);
            if (a2 != null) {
                a.a(a2);
            }
            a.f();
            MediaInfo v = sbz.h.v();
            scs scs = new scs();
            Bundle bundle = new Bundle();
            bundle.putBundle("media", sdh.a(v));
            scs.f(bundle);
            scs.a(a, str);
        } catch (sbt | sbv e) {
            sdf.a(sbz.g, "Failed to get the media", e);
        }
    }
}
