package defpackage;

import android.support.rastermill.FrameSequenceDrawable;
import android.support.rastermill.FrameSequenceDrawable.OnFinishedListener;

/* renamed from: akia */
final /* synthetic */ class akia implements OnFinishedListener {
    private final akhx a;

    akia(akhx akhx) {
        this.a = akhx;
    }

    public final void onFinished(FrameSequenceDrawable frameSequenceDrawable) {
        akhx akhx = this.a;
        akhx.f.a(akhx.c, skh.g().a()).a(akhx.g).c();
    }
}
