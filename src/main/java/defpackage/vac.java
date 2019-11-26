package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputView;
import com.google.android.youtube.R;

/* renamed from: vac */
public final class vac extends nf implements uzu, vab {
    private ImageButton Z;
    public CodeInputView a;
    private ContentLoadingProgressBar aa;
    private avxf ab;
    private long ac;
    public vag b;
    public aaas c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((vah) xse.a(this.y)).a(this);
        bundle = this.j;
        this.ac = bundle.getLong("ARG_IDV_REQUEST_ID");
        byte[] byteArray = bundle.getByteArray("ARG_RENDERER");
        if (byteArray != null) {
            try {
                this.ab = (avxf) anxl.parseFrom(avxf.d, byteArray, anxa.c());
            } catch (anyg e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context a = vad.a(p());
        layoutInflater = layoutInflater.cloneInContext(a);
        ViewGroup frameLayout = new FrameLayout(a);
        avxf avxf = this.ab;
        if (avxf != null) {
            int i = avxf.a;
            if (!((i & 1) == 0 || (i & 4) == 0)) {
                frameLayout.addView(a(frameLayout, bundle, layoutInflater));
                return frameLayout;
            }
        }
        xtl.d("PhoneVerificationCodeInputScreenRenderer invalid.");
        vag vag = this.b;
        if (vag != null) {
            vag.b();
        }
        return frameLayout;
    }

    private final View a(ViewGroup viewGroup, Bundle bundle, LayoutInflater layoutInflater) {
        arml arml;
        String str = "";
        if (bundle != null) {
            str = bundle.getString("SAVED_VERIFICATION_CODE", str);
        }
        avxf avxf = this.ab;
        if ((avxf.a & 1) != 0) {
            arml = avxf.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        View inflate = layoutInflater.inflate(R.layout.verification_code_entry_fragment, viewGroup, false);
        this.a = (CodeInputView) inflate.findViewById(R.id.code_input_view);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.aa = (ContentLoadingProgressBar) inflate.findViewById(R.id.progress_bar);
        textView.setText(a);
        this.Z = (ImageButton) inflate.findViewById(R.id.back_arrow_button);
        this.Z.setOnClickListener(new vaf(this));
        this.a.a(str);
        CodeInputView codeInputView = this.a;
        codeInputView.b = this;
        codeInputView.b(str.length() < 6 ? str.length() : 5);
        this.a.post(new vae(this));
        return inflate;
    }

    public final void a(String str) {
        this.aa.b();
        this.a.setEnabled(false);
        uzv uzv = new uzv(this, this.c);
        Long valueOf = Long.valueOf(this.ac);
        apxu apxu = this.ab.c;
        if (apxu == null) {
            apxu = apxu.d;
        }
        uzv.a(valueOf, str, apxu);
    }

    public final void e(Bundle bundle) {
        bundle.putString("SAVED_VERIFICATION_CODE", this.a.a());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nn p = p();
        View view = this.K;
        if (p != null && view != null && (view instanceof ViewGroup)) {
            LayoutInflater cloneInContext = ((LayoutInflater) p.getSystemService("layout_inflater")).cloneInContext(vad.a(p));
            Bundle bundle = new Bundle();
            e(bundle);
            ViewGroup viewGroup = (ViewGroup) view;
            View a = a(viewGroup, bundle, cloneInContext);
            viewGroup.removeAllViews();
            viewGroup.addView(a);
        }
    }

    public final void a(avxh avxh) {
        this.aa.a();
        vag vag = this.b;
        if (vag != null) {
            vag.a(avxh);
        }
    }

    public final void a(avwl avwl) {
        this.aa.a();
        vag vag = this.b;
        if (vag != null) {
            vag.a(avwl);
        }
    }

    public final void a() {
        this.aa.a();
        vag vag = this.b;
        if (vag != null) {
            vag.b();
        }
    }
}
