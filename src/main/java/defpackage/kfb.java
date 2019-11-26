package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: kfb */
public final class kfb implements akot {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.title));
    private final TextView c = ((TextView) this.a.findViewById(R.id.button));
    private final akyy d;

    public kfb(Context context, akzb akzb, akyw akyw) {
        this.a = View.inflate(context, R.layout.menu_title, null);
        this.d = akzb.a(this.c);
        this.d.c = akyw;
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        auvv auvv = (auvv) obj;
        TextView textView = this.b;
        if ((auvv.a & 1) != 0) {
            arml = auvv.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        anxp anxp = auvv.d;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            this.c.setVisibility(0);
            akyy akyy = this.d;
            anxp anxp2 = auvv.d;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp2.a(access$000);
            obj = anxp2.h.b(access$000.d);
            if (obj == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(obj);
            }
            akyy.a((aphg) obj, akor.a);
            return;
        }
        this.c.setVisibility(8);
    }
}
