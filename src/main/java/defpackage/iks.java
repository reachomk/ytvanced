package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.concurrent.Executor;

/* renamed from: iks */
public final class iks implements xcp {
    public final Context a;
    public final acwa b;
    public final akyy c;
    public final akyy d;
    public final LoadingFrameLayout e;
    public final View f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final akwy j;
    public final iky k;
    public final xci l;
    private final bcaa m;
    private final xoi n;
    private final Executor o;
    private final RecyclerView p;

    public iks(bcaa bcaa, xoi xoi, Context context, Executor executor, akzb akzb, akvz akvz, eod eod, fly fly, xci xci, acwa acwa, LoadingFrameLayout loadingFrameLayout, iky iky) {
        akzb akzb2 = akzb;
        LoadingFrameLayout loadingFrameLayout2 = loadingFrameLayout;
        this.m = bcaa;
        this.n = xoi;
        this.a = context;
        this.o = executor;
        this.b = acwa;
        this.e = loadingFrameLayout2;
        loadingFrameLayout2.a(new ikr(this));
        this.f = loadingFrameLayout2.findViewById(R.id.suggested_videos_header);
        this.h = (TextView) loadingFrameLayout2.findViewById(R.id.close_button);
        this.c = akzb2.a(this.h);
        this.i = (TextView) loadingFrameLayout2.findViewById(R.id.next_button);
        this.d = akzb2.a(this.i);
        this.g = (TextView) loadingFrameLayout2.findViewById(R.id.title);
        this.p = (RecyclerView) loadingFrameLayout2.findViewById(R.id.suggested_videos_list);
        this.p.a(new ans());
        fly fly2 = fly;
        this.j = fly2.a(null, this.p, (aana) bcaa.get(), eod.a((aana) bcaa.get(), acwa.t()), acwa.t(), (akpb) akvz.get(), akxw.n, akxj.d, 3, akhs.SUGGESTED_PLAYLIST, syb.a);
        this.l = xci;
        this.k = iky;
    }

    public final void a() {
        this.e.a();
        this.f.setVisibility(8);
        aaml c = ((abfm) this.m.get()).c();
        c.g();
        abfm abfm = (abfm) this.m.get();
        xan.a(abfm.g.a(c, this.o), aniv.a, new iku(this), new ikt(this));
    }

    public final void a(axak axak, akyy akyy, TextView textView) {
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        axak.a(access$000);
        if (axak.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            axak.a(access$000);
            Object b = axak.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aphg aphg = (aphg) b;
            akyy.b();
            akyy.a(aphg, this.b.t());
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Throwable th) {
        xtl.a("Error requesting suggested playlist videos.", th);
        this.e.a(this.n.a(th), true);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ilc.class};
        } else if (i == 0) {
            this.k.a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
