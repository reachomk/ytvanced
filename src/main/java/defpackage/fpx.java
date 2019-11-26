package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.loading.SpecificNetworkErrorViewLoadingFrameLayout;
import com.google.android.youtube.R;

/* renamed from: fpx */
public final class fpx extends fja implements OnLayoutChangeListener, xxb {
    public xxe ae;
    public akkq af;
    public ezq ag;
    private xwz ah;
    private View ai;
    private View aj;
    private EditText ak;
    private ImageView al;
    private TextView am;
    private TextView an;
    private View ao;
    private TextView ap;
    private CharSequence aq;
    private fpw ar;
    private boolean as;
    private int at;

    public static boolean a(fiw fiw) {
        return fiw.a == fpx.class;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((fpy) xse.a(p())).a(this);
        apxu a = aaax.a(this.j.getByteArray("navigation_endpoint"));
        xxe xxe = this.ae;
        this.ah = new xwz((acvx) xxe.a((acvx) xxe.a.get(), 1), (aaas) xxe.a((aaas) xxe.b.get(), 2), (xhv) xxe.a((xhv) xxe.c.get(), 3), (xzc) xxe.a((xzc) xxe.d.get(), 4), (xxb) xxe.a(this, 5), (apxu) xxe.a(a, 6));
        View inflate = layoutInflater.inflate(R.layout.new_group_panel, viewGroup, false);
        this.ai = inflate.findViewById(R.id.network_connected);
        this.aj = inflate.findViewById(R.id.container);
        this.aj.addOnLayoutChangeListener(this);
        this.ak = (EditText) inflate.findViewById(R.id.group_name);
        this.al = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.am = (TextView) inflate.findViewById(R.id.metadata);
        this.an = (TextView) inflate.findViewById(R.id.instructions);
        this.ao = inflate.findViewById(R.id.network_disconnected);
        this.ap = (TextView) inflate.findViewById(R.id.error_retry);
        this.ap.setText(a((int) R.string.offline_retry));
        ((SpecificNetworkErrorViewLoadingFrameLayout) inflate.findViewById(R.id.error_layout)).d();
        this.ah.a();
        return inflate;
    }

    public final void B() {
        super.B();
        al();
    }

    public final void i() {
        super.i();
        this.ah.a.a(null);
        xpr.a(this.ak);
    }

    public final ezz W() {
        faf i = this.ab.i();
        if (!TextUtils.isEmpty(this.aq)) {
            i.a = this.aq;
        }
        Object obj = this.ar;
        if (obj != null) {
            i.a(amuw.a(obj));
        }
        return i.a();
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ak();
    }

    public final void a(CharSequence charSequence) {
        this.aq = charSequence;
        this.ag.b();
    }

    public final void b(CharSequence charSequence) {
        this.ak.setHint(charSequence);
    }

    public final void a(aygk aygk) {
        this.af.a(this.al, aygk);
    }

    public final void c(CharSequence charSequence) {
        this.am.setText(charSequence);
    }

    public final void d(CharSequence charSequence) {
        this.an.setText(charSequence);
    }

    public final void e(CharSequence charSequence) {
        this.ar = new fpw(M_(), charSequence, this.ah);
    }

    public final CharSequence f() {
        return this.ak.getText();
    }

    public final void a(boolean z) {
        this.as = z;
        xpr.a(this.ai, z ^ 1);
        xpr.a(this.ao, z);
        al();
    }

    public final void a(OnClickListener onClickListener) {
        this.ap.setOnClickListener(onClickListener);
    }

    public final void d(int i) {
        this.at = i;
        ak();
    }

    private final void ak() {
        if (this.aj.getHeight() != 0) {
            int height = this.aj.getHeight();
            this.aj.setTranslationY((float) (-Math.max(this.at - (((View) this.aj.getParent()).getHeight() - height), 0)));
        }
    }

    private final void al() {
        if (!this.as) {
            this.ak.requestFocus();
            xpr.b(this.ak);
        }
    }
}
