package defpackage;

import android.support.v4.widget.NestedScrollView;

/* renamed from: spp */
final /* synthetic */ class spp implements adh {
    private final swf a;
    private final bdhr b;

    spp(swf swf, bdhr bdhr) {
        this.a = swf;
        this.b = bdhr;
    }

    public final void a(NestedScrollView nestedScrollView, int i, int i2) {
        swf swf = this.a;
        bdhr bdhr = this.b;
        azve azve = (azve) azvf.d.createBuilder();
        azve.a((float) i);
        azve.b((float) i2);
        spq.a(nestedScrollView, swf, bdhr.f.toByteArray(), (azvf) ((anxl) azve.build()));
    }
}
