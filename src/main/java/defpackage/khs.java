package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: khs */
public final class khs extends akpl {
    private final Context a;
    private final RecyclerView b = ((RecyclerView) LayoutInflater.from(this.a).inflate(R.layout.reels_grid, null));
    private final akou c;
    private final gau d;
    private final akpk e = new akpk();
    private final akpd f;

    public khs(Context context, flu flu, epf epf, akpe akpe) {
        this.a = context;
        this.c = flu;
        this.b.a(new anm(this.a, c()));
        this.f = akpe.a((akpb) epf.get());
        this.f.a(this.e);
        this.b.a(this.f);
        this.d = new gau();
        this.f.a(this.d);
        this.b.addOnLayoutChangeListener(new khv(this));
        flu.a(this.b);
        this.b.setFocusable(false);
    }

    public final View K_() {
        return this.c.a();
    }

    public final void a(akpb akpb) {
        this.e.clear();
        this.d.a();
    }

    public final void b() {
        int c = c();
        apn apn = (anm) this.b.n;
        if (apn.a != c) {
            apn.a(c);
            this.b.a(apn);
        }
    }

    private final int c() {
        return this.a.getResources().getInteger(R.integer.reel_grid_column_count);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        awxi awxi = (awxi) obj;
        b();
        akor.a.a(awxi.c.d(), null);
        this.f.a(new akod(akor.a));
        Object a = akor.a("sectionListController");
        if (a != null) {
            this.f.a(new khu(a));
        }
        this.e.clear();
        ArrayList arrayList = new ArrayList();
        for (axak axak : awxi.b) {
            Object b;
            anxr access$000 = anxl.checkIsLite(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
                axak.a(access$000);
                b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                b = (ReelItemRendererOuterClass$ReelItemRenderer) b;
            } else {
                b = null;
            }
            if (b != null) {
                this.e.add(b);
                anxp anxp = b.j;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                anxr access$0002 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                anxp.a(access$0002);
                if (anxp.h.a(access$0002.d)) {
                    anxp anxp2 = b.j;
                    if (anxp2 == null) {
                        anxp2 = apxu.d;
                    }
                    access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                    anxp2.a(access$000);
                    b = anxp2.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    arrayList.add((ReelWatchEndpointOuterClass$ReelWatchEndpoint) b);
                }
            }
        }
        this.d.a = new gas(Collections.unmodifiableList(arrayList));
        this.c.a(akor);
    }
}
