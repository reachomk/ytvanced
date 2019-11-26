package defpackage;

import com.google.android.youtube.R;

/* renamed from: iri */
final class iri implements afsw {
    public final /* synthetic */ iqu a;
    private final /* synthetic */ atgy b;

    iri(iqu iqu, atgy atgy) {
        this.a = iqu;
        this.b = atgy;
    }

    public final void a(bqn bqn) {
        this.a.ao.c(atyw.LATENCY_ACTION_VOICE_ASSISTANT, "");
        if (foh.i(this.a.ar) && !foh.l(this.a.ar)) {
            if (this.a.ax.b()) {
                this.a.ax.a();
            } else {
                return;
            }
        }
        avlv avlv = (avlv) avls.g.createBuilder();
        avlv.a(ajqy.a(this.a.a.getString(R.string.error_generic)));
        this.a.an.d(new zye(null, (avls) ((anxl) avlv.build())));
    }
}
