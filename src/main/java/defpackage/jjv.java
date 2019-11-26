package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: jjv */
public final class jjv {
    public final Context a;
    public final akkq b;
    public final aaas c;
    public final acwa d;
    public final gax e;
    public final Map f = new HashMap();
    public aeh g;
    public final List h = new ArrayList();
    public List i;

    public jjv(Context context, akkq akkq, aaas aaas, acwa acwa, gax gax) {
        this.a = context;
        this.b = akkq;
        this.c = aaas;
        this.d = acwa;
        this.e = gax;
    }

    public final View a(avef avef, axak[] axakArr, kjj kjj) {
        arml arml;
        arml arml2;
        arml arml3;
        int i = 0;
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.multi_reel_dismissal, null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.multi_reel_dismissal_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.multi_reel_dismissal_sub_title);
        Button button = (Button) inflate.findViewById(R.id.multi_reel_dismissal_done_button);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.multi_reel_dismissal_items);
        recyclerView.a(new ans(1, false));
        if ((avef.a & 1) != 0) {
            arml = avef.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        if ((avef.a & 2) != 0) {
            arml2 = avef.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        textView2.setText(ajqy.a(arml2));
        ArrayList arrayList = new ArrayList();
        int length = axakArr.length;
        while (i < length) {
            Object obj;
            anxp anxp = axakArr[i];
            anxr access$000 = anxl.checkIsLite(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b);
            }
            ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) obj;
            anxr access$0002 = anxl.checkIsLite(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer);
            anxp.a(access$0002);
            if (anxp.h.a(access$0002.d) && (262144 & reelItemRendererOuterClass$ReelItemRenderer.a) != 0) {
                List list = this.i;
                Object obj2 = reelItemRendererOuterClass$ReelItemRenderer.p;
                if (obj2 == null) {
                    obj2 = awxn.c;
                }
                if (!list.contains(obj2)) {
                    arrayList.add(reelItemRendererOuterClass$ReelItemRenderer);
                }
            }
            i++;
        }
        recyclerView.a(new jjx(this, arrayList, avef));
        anxp anxp2 = avef.f;
        if (anxp2 == null) {
            anxp2 = axak.a;
        }
        anxr access$0003 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp2.a(access$0003);
        Object b2 = anxp2.h.b(access$0003.d);
        if (b2 == null) {
            b2 = access$0003.b;
        } else {
            b2 = access$0003.a(b2);
        }
        aphg aphg = (aphg) b2;
        if ((aphg.a & 128) != 0) {
            arml3 = aphg.g;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        } else {
            arml3 = null;
        }
        button.setText(ajqy.a(arml3));
        this.d.t().a(aphg.r.d());
        this.d.t().a((aphg.a & 262144) != 0 ? aphg.r.d() : null, null);
        button.setOnClickListener(new jju(this, kjj, avef, aphg));
        return inflate;
    }
}
