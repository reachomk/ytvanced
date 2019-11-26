package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alit */
public final class alit extends nd implements aler {
    public aaas Z;
    public akkq aa;
    public acvx ab;
    public xwb ac;
    public Toolbar ad;
    public TextView ae;
    public TextView af;
    public TextView ag;
    public View ah;
    public View ai;
    public View aj;
    private View ak;
    private EditText al;
    private TextView am;
    private aloz an;
    private int ao;
    private int ap;
    private int aq;
    private int ar;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((alix) xse.a(p())).a(this);
        a(2, this.ac.a);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.add_by_email, viewGroup, false);
        this.ak = inflate.findViewById(R.id.found_email_invitee);
        this.ad = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.ad.a(new alis(this));
        this.ad.c((int) R.string.accessibility_back);
        this.ae = (TextView) inflate.findViewById(R.id.input_title);
        this.af = (TextView) inflate.findViewById(R.id.detail_message);
        this.ag = (TextView) inflate.findViewById(R.id.send_invite_button);
        this.am = (TextView) inflate.findViewById(R.id.contact_name);
        this.ah = inflate.findViewById(R.id.contents);
        this.ai = inflate.findViewById(R.id.button_frame);
        this.aj = inflate.findViewById(R.id.error);
        this.an = new aloz(this.aa, (ImageView) inflate.findViewById(R.id.contact_photo));
        this.al = (EditText) inflate.findViewById(R.id.email_text);
        this.ao = xwe.a(M_(), R.attr.ytStaticBlue, 0);
        this.ap = xwe.a(M_(), R.attr.ytTextDisabled, 0);
        this.ar = xwe.a(M_(), R.attr.ytTextError, 0);
        this.aq = xwe.a(M_(), R.attr.ytStaticBlue, 0);
        apxu apxu = apxu.d;
        bundle = this.j;
        if (bundle != null) {
            String str = "add_by_email_endpoint";
            if (bundle.containsKey(str)) {
                try {
                    apxu = (apxu) aobp.a(bundle, str, apxu.d, anxa.c());
                } catch (anyg unused) {
                    apxu = apxu.d;
                }
            }
        }
        aleo aleo = new aleo(this, apxu, this.Z, this.ab);
        this.al.addTextChangedListener(new aliu(aleo));
        this.ag.setOnClickListener(new aliv(aleo));
        return inflate;
    }

    public final void a(String str, aygk aygk) {
        if (TextUtils.isEmpty(str)) {
            this.ak.setVisibility(4);
            return;
        }
        this.ak.setVisibility(0);
        this.am.setText(str);
        this.an.a(aygk);
    }

    public final void a(CharSequence charSequence) {
        this.af.setText(charSequence);
    }

    public final void a(boolean z, CharSequence charSequence, boolean z2) {
        int i;
        TextView textView = this.ag;
        if (z) {
            i = this.ao;
        } else {
            i = this.ap;
        }
        textView.setTextColor(i);
        this.ag.setText(charSequence);
        this.ag.setClickable(z2);
    }

    public final void a() {
        Context M_ = M_();
        if (M_ != null) {
            xpr.a(M_, (int) R.string.error_toast_generic, 0);
        }
    }

    public final void a(boolean z) {
        int i;
        if (z) {
            i = this.ar;
        } else {
            i = this.aq;
        }
        ColorStateList valueOf = ColorStateList.valueOf(i);
        abe.a(this.al, valueOf);
        this.ae.setTextColor(valueOf);
    }
}
