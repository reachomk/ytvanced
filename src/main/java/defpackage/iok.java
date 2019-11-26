package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: iok */
public final class iok implements akot {
    public final fni a;
    private final Context b;
    private final akzb c;
    private final akpk d;
    private final View e;
    private final TextView f = ((TextView) this.e.findViewById(R.id.dismiss_button));
    private akyy g;

    public iok(Context context, akpe akpe, akpb akpb, fni fni, akzb akzb) {
        this.b = context;
        this.a = fni;
        this.c = akzb;
        this.e = LayoutInflater.from(context).inflate(R.layout.full_screen_overlay_layout, null, false);
        this.e.setLayoutParams(new LayoutParams(-1, -1));
        RecyclerView recyclerView = (RecyclerView) this.e.findViewById(R.id.overlay_content);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.a(new ans());
        this.d = new akpk();
        apa a = akpe.a(akpb);
        a.a(this.d);
        recyclerView.a(a);
    }

    public final View K_() {
        return this.e;
    }

    public final void a(akpb akpb) {
        this.d.clear();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        anxp anxp;
        anxr access$000;
        arno arno = (arno) obj;
        this.d.clear();
        if ((arno.a & 1) != 0) {
            anxp = arno.d;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(apjl.a);
            anxp.a(access$0002);
            if (anxp.h.a(access$0002.d)) {
                akpk akpk = this.d;
                anxp anxp2 = arno.d;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                access$000 = anxl.checkIsLite(apjl.a);
                anxp2.a(access$000);
                Object b = anxp2.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                akpk.add(ajzv.a((anze) b, ajry.class));
            }
        }
        acvx acvx = akor.a;
        anxp = arno.b == 14 ? (axak) arno.c : axak.a;
        access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d) && !xrn.c(this.b)) {
            anxp anxp3 = arno.b == 14 ? (axak) arno.c : axak.a;
            anxr access$0003 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp3.a(access$0003);
            obj = anxp3.h.b(access$0003.d);
            if (obj == null) {
                obj = access$0003.b;
            } else {
                obj = access$0003.a(obj);
            }
            aphg aphg = (aphg) obj;
            if (this.g == null) {
                this.g = this.c.a(this.f);
                this.g.c = new ioj(this);
            }
            this.g.a(aphg, acvx);
            return;
        }
        xpr.a(this.f, false);
    }
}
