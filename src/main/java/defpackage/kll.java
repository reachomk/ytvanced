package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;

/* renamed from: kll */
public final class kll extends akpl {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.title));
    private final ViewGroup c = ((ViewGroup) this.a.findViewById(R.id.sort_filter_sub_menu_container));
    private final esh d;
    private ese e;

    public kll(Context context, esh esh) {
        this.d = esh;
        this.a = View.inflate(context, R.layout.sort_filter_header, null);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.c.removeAllViews();
        ese ese = this.e;
        if (ese != null) {
            ese.a(akpb);
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        axqh axqh = (axqh) obj;
        TextView textView = this.b;
        boolean z = true;
        axqn axqn = null;
        if ((axqh.a & 1) != 0) {
            arml = axqh.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        anxp anxp = axqh.d;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            anxp anxp2 = axqh.d;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer);
            anxp2.a(access$0002);
            obj = anxp2.h.b(access$0002.d);
            if (obj == null) {
                obj = access$0002.b;
            } else {
                obj = access$0002.a(obj);
            }
            axqn = (axqn) obj;
        }
        if (axqn != null) {
            if (this.e == null) {
                this.e = this.d.a(this.c);
            }
            this.c.addView(this.e.c);
            this.e.a_(akor, axqn);
        }
        View view = this.c;
        if (axqn == null) {
            z = false;
        }
        xpr.a(view, z);
    }
}
