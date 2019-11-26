package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: acoy */
public final class acoy extends nf implements OnClickListener {
    public aaas Z;
    public akkl a;
    private String aa;
    private arml ab;
    private avaw ac;
    private apxu ad;
    private View ae;
    private View af;
    private View ag;
    private Button ah;
    private TextView ai;
    private TextView aj;
    private TextView ak;
    private RecyclerView al;
    private akle am;
    public acvx b;
    public acpa c;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((acox) xse.a(p())).a(this);
        bundle = this.j;
        this.aa = bundle.getString("ARG_ERROR_MESSAGE", "");
        String str = "ARG_ERROR_MESSAGE_FORMATTED_STRING";
        if (bundle.containsKey(str)) {
            this.ab = (arml) aobp.b(bundle, str, arml.f, anxa.c());
        }
        str = "ARG_ENDSCREEN_RENDERER";
        if (bundle.containsKey(str)) {
            this.ac = (avaw) aobp.b(bundle, str, avaw.i, anxa.c());
        }
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.a(acwl.P, null, null);
        FrameLayout frameLayout = new FrameLayout(p());
        frameLayout.addView(a(viewGroup));
        return frameLayout;
    }

    private final View a(ViewGroup viewGroup) {
        View inflate = p().getLayoutInflater().inflate(R.layout.lc_post_stream_fragment, viewGroup, false);
        this.ae = inflate.findViewById(R.id.post_stream_spinner);
        this.af = inflate.findViewById(R.id.content);
        this.ag = inflate.findViewById(R.id.stream_layout);
        this.ai = (TextView) inflate.findViewById(R.id.stream_header_text);
        this.aj = (TextView) inflate.findViewById(R.id.stream_title);
        this.ak = (TextView) inflate.findViewById(R.id.stream_account_name);
        this.al = (RecyclerView) inflate.findViewById(R.id.stream_stats_recycler_view);
        this.am = new akle(this.a, (ImageView) inflate.findViewById(R.id.stream_thumbnail));
        this.ah = (Button) inflate.findViewById(R.id.next_button);
        this.ah.setOnClickListener(this);
        nn p = p();
        if (p != null) {
            CharSequence a;
            this.ae.setVisibility(8);
            this.af.setVisibility(0);
            arml arml = this.ab;
            arml arml2 = null;
            int i = 1;
            if (arml != null) {
                a = aabb.a(arml, this.Z, false);
            } else if (TextUtils.isEmpty(this.aa)) {
                avaw avaw = this.ac;
                if (avaw == null || (avaw.a & 1) == 0) {
                    a = null;
                } else {
                    arml = avaw.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    a = ajqy.a(arml);
                }
            } else {
                a = this.aa;
            }
            if (a != null) {
                this.ai.setText(a);
                if (this.ab != null) {
                    this.ai.setMovementMethod(LinkMovementMethod.getInstance());
                }
            }
            if (this.ac != null) {
                arml arml3;
                arml arml4;
                this.ag.setVisibility(0);
                TextView textView = this.aj;
                avaw avaw2 = this.ac;
                if ((avaw2.a & 2) != 0) {
                    arml3 = avaw2.c;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                } else {
                    arml3 = null;
                }
                textView.setText(ajqy.a(arml3));
                textView = this.ak;
                avaw2 = this.ac;
                if ((avaw2.a & 4) != 0) {
                    arml3 = avaw2.d;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                } else {
                    arml3 = null;
                }
                textView.setText(ajqy.a(arml3));
                textView = this.aj;
                Object[] objArr = new Object[1];
                avaw avaw3 = this.ac;
                if ((avaw3.a & 2) != 0) {
                    arml4 = avaw3.c;
                    if (arml4 == null) {
                        arml4 = arml.f;
                    }
                } else {
                    arml4 = null;
                }
                objArr[0] = ajqy.a(arml4);
                textView.setContentDescription(a((int) R.string.lc_title_cd, objArr));
                akle akle = this.am;
                aygk aygk = this.ac.f;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                akle.a(aygk);
                this.am.a(ScaleType.CENTER_CROP);
                this.al.a(new anm(p, q().getInteger(R.integer.lc_post_stream_stat_column_count)));
                this.al.a(new acpc(p, this.ac.h));
                if (this.ac.g.size() > 0 && (((aphj) this.ac.g.get(0)).a & 1) != 0) {
                    aphg aphg = ((aphj) this.ac.g.get(0)).b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    apxu apxu = aphg.m;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                    this.ad = apxu;
                    Button button = this.ah;
                    if ((aphg.a & 128) != 0) {
                        arml2 = aphg.g;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    }
                    button.setText(ajqy.a(arml2));
                    Context M_ = M_();
                    Button button2 = this.ah;
                    if (aphg.b == 1) {
                        int a2 = aphh.a(((Integer) aphg.c).intValue());
                        if (a2 != 0) {
                            i = a2;
                        }
                    }
                    acra.a(M_, button2, i);
                }
            }
        }
        return inflate;
    }

    public final void W_() {
        super.W_();
        int dimensionPixelSize = q().getDimensionPixelSize(R.dimen.lc_post_stream_next_button_translation);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.ah, "translationY", new float[]{(float) dimensionPixelSize, 0.0f});
        ofFloat.setDuration(400);
        ofFloat.start();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = this.K;
        if (view instanceof ViewGroup) {
            Bundle bundle = new Bundle();
            ViewGroup viewGroup = (ViewGroup) view;
            View a = a(viewGroup);
            viewGroup.removeAllViews();
            viewGroup.addView(a);
        }
    }

    public final void onClick(View view) {
        if (this.K != null && view == this.ah) {
            acpa acpa = this.c;
            if (acpa != null) {
                acpa.a(this.ad);
            }
        }
    }
}
