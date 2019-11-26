package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: slo */
final class slo extends apv {
    private final /* synthetic */ baoo a;
    private final /* synthetic */ swf b;

    slo(baoo baoo, swf swf) {
        this.a = baoo;
        this.b = swf;
    }

    public final void a(RecyclerView recyclerView, int i) {
        azsr a = syt.a(this.a.c());
        swf swf = this.b;
        View a2 = recyclerView.a((float) (recyclerView.getWidth() / 2), (float) (recyclerView.getHeight() / 2));
        azso azso = (azso) azsp.c.createBuilder();
        azso.a(Integer.valueOf(a2 != null ? RecyclerView.e(a2) : -1).intValue());
        azvk azvk = (azvk) azvl.a.createBuilder();
        azvk.a(azsp.d, (azsp) ((anxl) azso.build()));
        swf.a(a, skh.g().a((View) recyclerView).a((azvl) ((anxl) azvk.build())).a()).c();
    }
}
