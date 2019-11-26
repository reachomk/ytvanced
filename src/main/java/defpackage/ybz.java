package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.conversation.ui.FacePileView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: ybz */
public final class ybz extends nd implements alfl, xyt {
    public xyw Z;
    public alpa aa;
    public akvp ab;
    public akkq ac;
    public alfi ad;
    public xyu ae;
    private ImageView af;
    private FacePileView ag;
    private TextView ah;
    private ImageView ai;
    private TextView aj;
    private TextView ak;
    private TextView al;

    public final void a(Activity activity) {
        super.a(activity);
        ((yce) ((xfc) activity).n()).a(this);
        this.ad.a(this);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.getWindow().requestFeature(1);
        apxu b = aaax.b(this.j.getByteArray("navigation_endpoint"));
        xyw xyw = this.Z;
        this.ae = new xyu((acvx) xyw.a((acvx) xyw.a.get(), 1), (aaas) xyw.a((aaas) xyw.b.get(), 2), (xyt) xyw.a(this, 3), (apxu) xyw.a(b, 4));
        View inflate = layoutInflater.inflate(R.layout.join_group_dialog, viewGroup, false);
        this.af = (ImageView) inflate.findViewById(R.id.close_button);
        this.ag = (FacePileView) inflate.findViewById(R.id.facepile);
        this.ah = (TextView) inflate.findViewById(R.id.user_count_view);
        this.ai = (ImageView) inflate.findViewById(R.id.error_icon);
        this.aj = (TextView) inflate.findViewById(R.id.title);
        this.ak = (TextView) inflate.findViewById(R.id.body);
        this.al = (TextView) inflate.findViewById(R.id.confirm_button);
        this.ag.a = this.ac;
        this.ai.setImageResource(this.ab.a(arwh.OFFLINE_NO_CONTENT_UPSIDE_DOWN));
        this.af.setOnClickListener(new ycc(this));
        this.al.setOnClickListener(new ycb(this));
        this.ae.a();
        return inflate;
    }

    public final void J_() {
        super.J_();
        this.ad.b(this);
    }

    public final void a(arwf arwf) {
        int a;
        if (arwf != null) {
            alpa alpa = this.aa;
            arwh a2 = arwh.a(arwf.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            a = alpa.a(a2);
        } else {
            a = 0;
        }
        if (a != 0) {
            this.af.setImageResource(a);
        } else {
            this.af.setImageDrawable(null);
        }
    }

    public final void a(List list) {
        if (list == null || list.isEmpty()) {
            this.ag.setVisibility(8);
            return;
        }
        this.ag.setVisibility(0);
        this.ag.a(list, xwe.a(M_(), R.attr.ytBrandBackgroundSolid, 0));
    }

    public final void a(String str) {
        xpr.a(this.ah, (CharSequence) str);
        LayoutParams layoutParams = (LayoutParams) this.ag.getLayoutParams();
        if (TextUtils.isEmpty(str)) {
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        } else {
            Resources q = q();
            int layoutDirection = q.getConfiguration().getLayoutDirection();
            int dimensionPixelSize = q.getDimensionPixelSize(R.dimen.join_group_user_count_overlap);
            layoutParams.leftMargin = layoutDirection != 1 ? 0 : dimensionPixelSize;
            if (layoutDirection == 1) {
                dimensionPixelSize = 0;
            }
            layoutParams.rightMargin = dimensionPixelSize;
        }
        this.ag.setLayoutParams(layoutParams);
    }

    public final void a(boolean z) {
        xpr.a(this.ai, z);
    }

    public final void a(CharSequence charSequence) {
        this.aj.setText(charSequence);
    }

    public final void b(CharSequence charSequence) {
        this.ak.setText(charSequence);
    }

    public final void c(CharSequence charSequence) {
        this.al.setText(charSequence);
    }

    public final void aa() {
        f();
    }
}
