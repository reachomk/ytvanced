package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kek */
public final class kek implements akot {
    private final esh a;
    private final akou b;
    private final ViewGroup c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.title));
    private final Space e = ((Space) this.c.findViewById(R.id.spacing));
    private final ViewGroup f = ((ViewGroup) this.c.findViewById(R.id.sub_menu_container));
    private ese g;

    public kek(Activity activity, esh esh, flu flu) {
        this.a = esh;
        this.b = flu;
        this.c = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.item_section_title_menu_header, null);
        this.b.a(this.c);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        xpr.a(this.e, false);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        atwd atwd = (atwd) obj;
        axqn axqn = null;
        if ((atwd.a & 1) != 0) {
            arml = atwd.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence a = ajqy.a(arml);
        xpr.a(this.d, a);
        adl.a(this.d, (int) R.style.f485TextAppearance.YouTube.Subhead);
        xpr.a(this.e, TextUtils.isEmpty(a) ^ 1);
        this.f.removeAllViews();
        if ((atwd.a & 2) != 0) {
            atvx atvx = atwd.c;
            if (atvx == null) {
                atvx = atvx.c;
            }
            axqn = atvx.b;
            if (axqn == null) {
                axqn = axqn.f;
            }
        }
        if (axqn != null) {
            if (this.g == null) {
                this.g = this.a.c(this.c);
            }
            this.g.a_(akor, axqn);
            this.f.addView(this.g.c);
        }
        this.b.a(akor);
    }
}
