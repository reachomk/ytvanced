package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint;
import java.util.Locale;

/* renamed from: vba */
public final class vba extends nf {
    public avxz a;
    public vbh b;
    public xwb c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((vbe) xse.a(this.y)).a(this);
        bundle = this.j;
        String str = "ARG_RENDERER";
        if (bundle.containsKey(str)) {
            try {
                this.a = (avxz) aobp.a(bundle, str, avxz.g, anxa.c());
            } catch (anyg e) {
                throw new RuntimeException("Failed to parse a known parcelable proto.", e);
            }
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(layoutInflater.getContext(), this.c.a);
        layoutInflater = layoutInflater.cloneInContext(contextThemeWrapper);
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        if (vba.a(this.a)) {
            frameLayout.addView(a(frameLayout, layoutInflater));
        } else {
            xtl.d("PhoneVerificationIntroRenderer invalid.");
            vbh vbh = this.b;
            if (vbh != null) {
                vbh.X();
            }
        }
        return frameLayout;
    }

    private final View a(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        arml arml;
        viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.verification_intro_fragment, viewGroup, false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.title);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.body);
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.back_arrow_button);
        Button button = (Button) viewGroup.findViewById(R.id.get_started_button);
        Button button2 = (Button) viewGroup.findViewById(R.id.learn_more_button);
        avxx avxx = this.a.d;
        if (avxx == null) {
            avxx = avxx.c;
        }
        aphg aphg = avxx.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        if ((aphg.a & 128) == 0) {
            arml = null;
        } else {
            avxx = this.a.d;
            if (avxx == null) {
                avxx = avxx.c;
            }
            aphg = avxx.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
        }
        button.setText(ajqy.a(arml).toString().toUpperCase(Locale.getDefault()));
        avxz avxz = this.a;
        if ((avxz.a & 2) != 0) {
            arml = avxz.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
        avxz avxz2 = this.a;
        if ((avxz2.a & 4) != 0) {
            arml arml2 = avxz2.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            textView2.setText(ajqy.a(arml2));
        }
        avxx avxx2 = this.a.e;
        if (avxx2 == null) {
            avxx2 = avxx.c;
        }
        aphg aphg2 = avxx2.b;
        if (aphg2 == null) {
            aphg2 = aphg.s;
        }
        if ((aphg2.a & 128) != 0) {
            avxx2 = this.a.e;
            if (avxx2 == null) {
                avxx2 = avxx.c;
            }
            aphg2 = avxx2.b;
            if (aphg2 == null) {
                aphg2 = aphg.s;
            }
            if ((aphg2.a & 4096) != 0) {
                avxx2 = this.a.e;
                if (avxx2 == null) {
                    avxx2 = avxx.c;
                }
                aphg2 = avxx2.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                arml arml3 = aphg2.g;
                if (arml3 == null) {
                    arml3 = arml.f;
                }
                button2.setText(ajqy.a(arml3).toString().toUpperCase(Locale.getDefault()));
                button2.setOnClickListener(new vbd(this, aphg2));
            }
        }
        imageButton.setOnClickListener(new vbc(this));
        button.setOnClickListener(new vbf(this));
        return viewGroup;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context M_ = M_();
        View view = this.K;
        if (M_ != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            View a = a(viewGroup, LayoutInflater.from(new ContextThemeWrapper(M_, this.c.a)));
            viewGroup.removeAllViews();
            viewGroup.addView(a);
        }
    }

    public static boolean a(avxz avxz) {
        if (avxz != null) {
            avxx avxx = avxz.d;
            if (avxx == null) {
                avxx = avxx.c;
            }
            aphg aphg = avxx.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 128) != 0) {
                avxx avxx2 = avxz.d;
                if (avxx2 == null) {
                    avxx2 = avxx.c;
                }
                aphg aphg2 = avxx2.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                anxp anxp = aphg2.m;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                anxr access$000 = anxl.checkIsLite(PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.phoneVerificationContactNumberInputEndpoint);
                anxp.a(access$000);
                Object b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                avxk avxk = ((PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint) b).b;
                if (avxk == null) {
                    avxk = avxk.c;
                }
                if ((avxk.a & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
