package defpackage;

import com.google.android.youtube.R;

/* renamed from: acpl */
final /* synthetic */ class acpl implements acjs {
    private final acpe a;

    acpl(acpe acpe) {
        this.a = acpe;
    }

    public final void a(arog arog) {
        acpe acpe = this.a;
        if (arog != null) {
            aroj aroj = (aroj) arog.e.createBuilder();
            aroj.a(arog.b);
            aroj.b(arog.d);
            acpe.an = (arog) ((anxl) aroj.build());
            acpe.af.a(arog.b);
        } else {
            acpe.an = null;
        }
        acpe.b.a(R.id.pre_stream_content);
    }
}
