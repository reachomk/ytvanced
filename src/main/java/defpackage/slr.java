package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: slr */
final class slr extends apv {
    private final /* synthetic */ swf a;
    private final /* synthetic */ bdgl b;

    slr(swf swf, bdgl bdgl) {
        this.a = swf;
        this.b = bdgl;
    }

    public final void a(RecyclerView recyclerView, int i) {
        swf swf = this.a;
        azsr azsr = this.b.e;
        View a = recyclerView.a((float) (recyclerView.getWidth() / 2), (float) (recyclerView.getHeight() / 2));
        Integer valueOf = Integer.valueOf(a != null ? RecyclerView.e(a) : -1);
        byte[] toByteArray = azsr.toByteArray();
        azso azso = (azso) azsp.c.createBuilder();
        azso.a(valueOf.intValue());
        azvk azvk = (azvk) azvl.a.createBuilder();
        azvk.a(azsp.d, (azsp) ((anxl) azso.build()));
        swf.a(toByteArray, skh.g().a((View) recyclerView).a((azvl) ((anxl) azvk.build())).a()).c();
    }
}
