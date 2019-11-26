package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.libraries.youtube.share.ui.ActivityIndicatorFrameLayout;
import com.google.android.youtube.R;

/* renamed from: fqg */
public final class fqg extends fja {
    public xyq ae;
    public fqk af;
    public boolean ag;
    public ActivityIndicatorFrameLayout ah;
    public RecyclerView ai;
    public TextView aj;
    public Snackbar ak;
    public alpr al;
    public xyr am;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((fql) xse.a(p())).a(this);
        apxu a = aaax.a(this.j.getByteArray("navigation_endpoint"));
        xyr xyr = this.am;
        nn p = p();
        fqp fqp = new fqp(this);
        acvx t = t();
        xyq xyq = r6;
        xyq xyq2 = new xyq((aarh) xyr.a((aarh) xyr.a.get(), 1), (xoi) xyr.a((xoi) xyr.b.get(), 2), (akkq) xyr.a((akkq) xyr.c.get(), 3), (aaas) xyr.a((aaas) xyr.d.get(), 4), (xci) xyr.a((xci) xyr.e.get(), 5), (akpe) xyr.a((akpe) xyr.f.get(), 6), xyr.g, (apxu) xyr.a(a, 8), (Context) xyr.a(p, 9), (xys) xyr.a(fqp, 10), (acvx) xyr.a(t, 11));
        this.ae = xyq;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.invite_more_panel, viewGroup, false);
        this.ah = (ActivityIndicatorFrameLayout) inflate.findViewById(R.id.activity_indicator);
        this.ai = (RecyclerView) inflate.findViewById(R.id.invite_more_list);
        this.aj = (TextView) inflate.findViewById(R.id.centered_message);
        this.ak = (Snackbar) inflate.findViewById(R.id.snackbar);
        this.al = new alpr(rz.a(q(), R.drawable.abc_list_divider_material, M_().getTheme()), false);
        this.ai.a(new ans());
        this.ai.a(this.al);
        this.af = new fqk(inflate.getContext(), new fqi(this));
        this.ae.a();
        return inflate;
    }

    public final void i() {
        super.i();
        this.ae.c = true;
    }

    public final ezz W() {
        amuw a;
        faf i = this.ab.i();
        i.a = q().getString(R.string.accessibility_invite_more_participants);
        if (this.ag) {
            a = amuw.a(this.af);
        } else {
            a = amwp.a;
        }
        i.a(a);
        return i.a();
    }
}
