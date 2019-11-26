package defpackage;

import android.view.View;
import android.view.View.OnScrollChangeListener;

/* renamed from: sps */
final /* synthetic */ class sps implements OnScrollChangeListener {
    private final swf a;
    private final bdhr b;

    sps(swf swf, bdhr bdhr) {
        this.a = swf;
        this.b = bdhr;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        swf swf = this.a;
        bdhr bdhr = this.b;
        azve azve = (azve) azvf.d.createBuilder();
        azve.a((float) i);
        azve.b((float) i2);
        spq.a(view, swf, bdhr.f.toByteArray(), (azvf) ((anxl) azve.build()));
    }
}
