package defpackage;

import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.List;

/* renamed from: jjx */
public final class jjx extends apa {
    public final avef c;
    public final /* synthetic */ jjv d;
    private final List e;
    private final akko f = akko.h().a((int) R.drawable.missing_avatar).a();

    public jjx(jjv jjv, List list, avef avef) {
        this.d = jjv;
        this.e = list;
        this.c = avef;
    }

    public static void a(jjz jjz, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        arml arml;
        jjz.q.setAlpha(1.0f);
        jjz.r.setAlpha(1.0f);
        jjz.s.setVisibility(8);
        TextView textView = jjz.r;
        if ((reelItemRendererOuterClass$ReelItemRenderer.a & 4) != 0) {
            arml = reelItemRendererOuterClass$ReelItemRenderer.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
    }

    public static void a(jjz jjz, avef avef) {
        arml arml;
        jjz.q.setAlpha(0.5f);
        jjz.r.setAlpha(0.5f);
        jjz.s.setVisibility(0);
        TextView textView = jjz.r;
        if ((avef.a & 4) != 0) {
            arml = avef.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
    }

    public final int a() {
        return this.e.size();
    }
}
