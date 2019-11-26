package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.verification.ui.CodeInputView;
import com.google.android.youtube.R;

/* renamed from: vbp */
public final class vbp extends nf implements uzs, uzu, vab {
    public CodeInputView Z;
    public avwl a;
    public atfx aa = atfx.CODE_DELIVERY_METHOD_UNKNOWN;
    public String ab;
    public String ac;
    public vbt ad;
    public aaas ae;
    private ImageButton af;
    private long ag;
    public ContentLoadingProgressBar b;
    public Button c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((vbq) xse.a(this.y)).a(this);
        try {
            bundle = this.j;
            this.a = (avwl) aobp.a(bundle, "ARG_RENDERER", avwl.g, anxa.c());
            this.aa = atfx.a(bundle.getInt("ARG_CODE_DELIVERY_METHOD"));
            if (this.aa == null) {
                this.aa = atfx.CODE_DELIVERY_METHOD_UNKNOWN;
            }
            this.ab = bundle.getString("ARG_COUNTRY_CODE");
            this.ac = bundle.getString("ARG_PHONE_NUMBER");
            this.ag = bundle.getLong("ARG_IDV_REQUEST_ID");
        } catch (anyg e) {
            String name = avwl.class.getName();
            String str = "Failed to parse a known parcelable proto ";
            throw new RuntimeException(name.length() == 0 ? new String(str) : str.concat(name), e);
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        amqw.a(this.a);
        amqw.a(this.aa != atfx.CODE_DELIVERY_METHOD_UNKNOWN);
        amqw.a(this.ab);
        amqw.a(this.ac);
        Context a = vad.a(p());
        layoutInflater = layoutInflater.cloneInContext(a);
        ViewGroup frameLayout = new FrameLayout(a);
        if (vbp.b(this.a)) {
            frameLayout.addView(a(frameLayout, bundle, layoutInflater));
        } else {
            xtl.d("PhoneVerificationCodeInputErrorScreenRenderer invalid.");
            vbt vbt = this.ad;
            if (vbt != null) {
                vbt.Z();
            }
        }
        return frameLayout;
    }

    private final View a(ViewGroup viewGroup, Bundle bundle, LayoutInflater layoutInflater) {
        String str;
        arml arml;
        if (bundle == null) {
            avwn avwn = this.a.d;
            if (avwn == null) {
                avwn = avwn.c;
            }
            avwr avwr = avwn.b;
            if (avwr == null) {
                avwr = avwr.c;
            }
            str = avwr.b;
        } else {
            str = bundle.getString("SAVED_VERIFICATION_CODE", "");
        }
        View inflate = layoutInflater.inflate(R.layout.verification_result_error_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.body);
        this.Z = (CodeInputView) inflate.findViewById(R.id.code_input_view);
        this.c = (Button) inflate.findViewById(R.id.resend_code_button);
        this.af = (ImageButton) inflate.findViewById(R.id.close_button);
        this.b = (ContentLoadingProgressBar) inflate.findViewById(R.id.progress_bar);
        avwl avwl = this.a;
        arml arml2 = null;
        if ((avwl.a & 1) != 0) {
            arml = avwl.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        avwl avwl2 = this.a;
        if ((avwl2.a & 2) != 0) {
            arml2 = avwl2.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        textView2.setText(ajqy.a(arml2));
        this.Z.a(str);
        this.Z.b(str.length() < 6 ? str.length() : 5);
        this.Z.b = this;
        Button button = this.c;
        avwp avwp = this.a.e;
        if (avwp == null) {
            avwp = avwp.c;
        }
        aphg aphg = avwp.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        arml arml3 = aphg.g;
        if (arml3 == null) {
            arml3 = arml.f;
        }
        button.setText(ajqy.a(arml3));
        this.c.setOnClickListener(new vbo(this));
        ImageButton imageButton = this.af;
        if (imageButton != null) {
            imageButton.setOnClickListener(new vbr(this));
        }
        return inflate;
    }

    public final void a(String str) {
        amqw.a(vbp.b(this.a));
        amqw.a(this.ae);
        amqw.a(this.ad);
        this.b.b();
        uzv uzv = new uzv(this, this.ae);
        Long valueOf = Long.valueOf(this.ag);
        apxu apxu = this.a.f;
        if (apxu == null) {
            apxu = apxu.d;
        }
        uzv.a(valueOf, str, apxu);
        this.c.setEnabled(false);
        this.Z.setEnabled(false);
    }

    public final void e(Bundle bundle) {
        bundle.putString("SAVED_VERIFICATION_CODE", this.Z.a());
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nn p = p();
        View view = this.K;
        if (p != null && view != null && (view instanceof ViewGroup)) {
            Bundle bundle = new Bundle();
            LayoutInflater cloneInContext = ((LayoutInflater) p.getSystemService("layout_inflater")).cloneInContext(vad.a(p));
            e(bundle);
            ViewGroup viewGroup = (ViewGroup) view;
            View a = a(viewGroup, bundle, cloneInContext);
            viewGroup.removeAllViews();
            viewGroup.addView(a);
        }
    }

    public static boolean b(avwl avwl) {
        if (avwl != null) {
            int i = avwl.a;
            if (!((i & 1) == 0 || (i & 2) == 0)) {
                avwn avwn = avwl.d;
                if (avwn == null) {
                    avwn = avwn.c;
                }
                avwr avwr = avwn.b;
                if (avwr == null) {
                    avwr = avwr.c;
                }
                if ((avwr.a & 2) != 0) {
                    avwp avwp = avwl.e;
                    if (avwp == null) {
                        avwp = avwp.c;
                    }
                    aphg aphg = avwp.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    if ((aphg.a & 128) != 0) {
                        avwp avwp2 = avwl.e;
                        if (avwp2 == null) {
                            avwp2 = avwp.c;
                        }
                        aphg aphg2 = avwp2.b;
                        if (aphg2 == null) {
                            aphg2 = aphg.s;
                        }
                        if ((aphg2.a & 2048) != 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void a(avxf avxf, long j) {
        this.b.a();
        vbt vbt = this.ad;
        if (vbt != null) {
            vbt.b(avxf, j);
        }
    }

    public final void a(avxo avxo) {
        this.b.a();
        vbt vbt = this.ad;
        if (vbt != null) {
            vbt.c(avxo);
        }
    }

    public final void b() {
        this.b.a();
        vbt vbt = this.ad;
        if (vbt != null) {
            vbt.Z();
        }
    }

    public final void a(avxh avxh) {
        this.b.a();
        vbt vbt = this.ad;
        if (vbt != null) {
            vbt.b(avxh);
        }
    }

    public final void a(avwl avwl) {
        this.b.a();
        vbt vbt = this.ad;
        if (vbt != null) {
            vbt.b(avwl);
        }
    }

    public final void a() {
        this.b.a();
        vbt vbt = this.ad;
        if (vbt != null) {
            vbt.Z();
        }
    }
}
