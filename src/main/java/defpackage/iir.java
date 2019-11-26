package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;

/* renamed from: iir */
public final class iir {
    public final RecyclerView a;
    public final Rect b = new Rect();
    public final int c;
    private final akpk d = new akpk();

    public iir(Context context, iis iis, akpe akpe, zyw zyw, RecyclerView recyclerView) {
        this.a = recyclerView;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.metadata_highlights_column_margin);
        apn ans = new ans();
        ans.b(0);
        recyclerView.a(ans);
        aknw aknw = new aknw();
        aknw.a(arns.class, (akox) iis);
        apa a = akpe.a(aknw);
        a.a(this.d);
        if (foh.d(zyw)) {
            a.a(true);
            recyclerView.r = true;
        }
        recyclerView.a(a);
        recyclerView.a(new iit(this));
        a.a(iiu.a);
    }

    /* Access modifiers changed, original: final */
    public final void a(arnu arnu) {
        this.d.clear();
        if (!(arnu == null || arnu.e.size() == 0)) {
            for (axak axak : arnu.e) {
                anxr access$000 = anxl.checkIsLite(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementChannelRenderer);
                axak.a(access$000);
                if (axak.h.a(access$000.d)) {
                    akpk akpk = this.d;
                    anxr access$0002 = anxl.checkIsLite(FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementChannelRenderer);
                    axak.a(access$0002);
                    Object b = axak.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    akpk.add(b);
                }
            }
        }
        xpr.a(this.a, this.d.size() > 0);
        this.d.a();
    }
}
