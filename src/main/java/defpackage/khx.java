package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* renamed from: khx */
public final class khx extends akpl {
    private final Context a;
    private final nn b;
    private final akkq c;
    private final akvo d;
    private final aaas e;
    private final flu f;
    private final gax g;
    private final FrameLayout h;
    private akpl i;
    private akpl j;
    private akpl k;
    private akpl l;
    private akpl m;

    public khx(Context context, nn nnVar, akkq akkq, akvo akvo, aaas aaas, flu flu, gax gax) {
        this.a = context;
        this.b = nnVar;
        this.c = akkq;
        this.e = aaas;
        this.f = flu;
        this.g = gax;
        this.d = akvo;
        this.h = new FrameLayout(context);
        flu.a(this.h);
    }

    public final View K_() {
        return this.f.b;
    }

    public final void a(akpb akpb) {
        akpl akpl = this.i;
        if (akpl != null) {
            akpl.a(akpb);
        }
    }

    public static String a(ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        aodx aodx = reelItemRendererOuterClass$ReelItemRenderer.n;
        if (aodx == null) {
            aodx = aodx.c;
        }
        if ((aodx.a & 1) == 0) {
            return null;
        }
        aodx aodx2 = reelItemRendererOuterClass$ReelItemRenderer.n;
        if (aodx2 == null) {
            aodx2 = aodx.c;
        }
        aodv aodv = aodx2.b;
        if (aodv == null) {
            aodv = aodv.c;
        }
        return aodv.b;
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) obj;
        akor.a.a(reelItemRendererOuterClass$ReelItemRenderer.m.d(), null);
        this.h.removeAllViews();
        int a = awwp.a(reelItemRendererOuterClass$ReelItemRenderer.o);
        if (a != 0 && a == 6) {
            if (this.j == null) {
                this.j = new kib(this.a, this.d, this.c, this.e, this.g);
            }
            this.h.setLayoutParams(new LayoutParams(-1, -2));
            this.i = this.j;
        } else {
            a = awwp.a(reelItemRendererOuterClass$ReelItemRenderer.o);
            if (a != 0 && a == 7) {
                if (this.k == null) {
                    this.k = new kie(this.a, this.d, this.c, this.e, this.g);
                    this.h.setLayoutParams(new LayoutParams(-1, -2));
                }
                this.i = this.k;
            } else {
                a = awwp.a(reelItemRendererOuterClass$ReelItemRenderer.o);
                if (a != 0 && a == 8) {
                    if (this.l == null) {
                        this.l = new kia(this.a, this.b, this.d, this.c, this.e, this.g);
                    }
                    this.h.setLayoutParams(new LayoutParams(-2, -2));
                    this.i = this.l;
                } else {
                    a = awwp.a(reelItemRendererOuterClass$ReelItemRenderer.o);
                    if (a != 0 && a == 9) {
                        if (this.m == null) {
                            this.m = new kic(this.a, this.b, this.d, this.c, this.e, this.g);
                        }
                        this.h.setLayoutParams(new LayoutParams(-2, -2));
                        this.i = this.m;
                    } else {
                        return;
                    }
                }
            }
        }
        this.h.addView(this.i.K_());
        this.i.a_(akor, reelItemRendererOuterClass$ReelItemRenderer);
    }
}
