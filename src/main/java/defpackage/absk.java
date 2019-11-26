package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: absk */
public final class absk extends absc implements abyb {
    public abrq Z;
    public abru aa;
    public ViewGroup ab;
    public View ac;
    public View ad;
    private ImageView ae;
    private TextView af;
    public abbj b;
    public akvz c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((absp) xse.a(this.a)).a(this);
        this.c.a(ajwy.class);
    }

    public final void B() {
        super.B();
        ViewGroup viewGroup = this.ab;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.ab.getChildAt(i);
                if (childAt != null) {
                    akot a = akoz.a(childAt);
                    if (a instanceof abxx) {
                        ((abxx) a).d();
                    }
                }
            }
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.live_chat_purchase_flow, viewGroup, false);
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        View view = this.K;
        if (this.Z.c) {
            view.setBackgroundColor(0);
        }
        this.ab = (ViewGroup) view.findViewById(R.id.purchase_flow_container);
        this.ac = view.findViewById(R.id.loading_container);
        this.ad = view.findViewById(R.id.error_container);
        this.ae = (ImageView) view.findViewById(R.id.error_image);
        this.af = (TextView) view.findViewById(R.id.error_message);
        view.findViewById(R.id.retry).setOnClickListener(new absn(this));
        Context M_ = M_();
        this.ae.setImageDrawable(ra.a(M_, this.aa.a(0)));
        this.af.setTextColor(ra.c(M_, this.aa.a(1)));
        aa();
    }

    public final void W() {
        f();
    }

    public final void X() {
        f();
    }

    public final void Y() {
        Activity activity = this.a;
        if (activity != null) {
            activity.setRequestedOrientation(1);
        }
    }

    public final void Z() {
        nf nfVar = this.y;
        if (nfVar != null) {
            nt s = nfVar.s();
            if (s.e() > 0) {
                s.c();
            } else {
                f();
            }
        }
    }

    public final void aa() {
        this.ac.setVisibility(0);
        this.ab.setVisibility(8);
        this.ad.setVisibility(8);
        apxu b = aaax.b(this.j.getByteArray("navigation_endpoint"));
        abbj abbj = this.b;
        abbj.j.a(abbj.d(b), new absm(this));
    }
}
