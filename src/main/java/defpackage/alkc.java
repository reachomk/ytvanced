package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.share.ui.ActivityIndicatorFrameLayout;
import com.google.android.libraries.youtube.share.ui.AnchorableTopPeekingScrollView;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: alkc */
public class alkc extends nd implements acwa, aleu, alfc, alha, alli, OnClickListener {
    private static final long Z = TimeUnit.SECONDS.toMillis(2);
    public akpe aA;
    public akpi aB;
    public aaas aC;
    public xsc aD;
    public zyw aE;
    public xwb aF;
    private nn aG;
    private algx aH;
    private aaas aI;
    private ActivityIndicatorFrameLayout aJ;
    private View aK;
    private Animation aL;
    private Animation aM;
    private OnGlobalLayoutListener aN;
    private int aO;
    private int aP;
    private Context aQ;
    public View aa;
    public View ab;
    public AnchorableTopPeekingScrollView ac;
    public ViewGroup ad;
    public RecyclerView ae;
    public RecyclerView af;
    public FloatingActionButton ag;
    public Snackbar ah;
    public alkt ai;
    public alge aj;
    public final Runnable ak = new alkf(this);
    public alpd al;
    public allh am;
    public bapu an;
    public bapu ao;
    public Handler ap;
    public alfi aq;
    public acvx ar;
    public xoi as;
    public xci at;
    public ScheduledExecutorService au;
    public akkq av;
    public aarh aw;
    public bqa ax;
    public zzf ay;
    public SharedPreferences az;

    public final void W_() {
        super.W_();
        Window window = this.c.getWindow();
        window.addFlags(2);
        window.setDimAmount(0.0f);
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        this.aG = p();
        ((alkq) ((xfc) this.aG).n()).a(this);
        a(2, this.aF.a);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aQ = layoutInflater.getContext();
        this.aa = layoutInflater.inflate(R.layout.unified_share_panel_fragment, viewGroup, false);
        this.ab = this.aa.findViewById(R.id.overlay);
        this.ac = (AnchorableTopPeekingScrollView) this.aa.findViewById(R.id.top_peeking_scroll_view);
        this.aJ = (ActivityIndicatorFrameLayout) this.aa.findViewById(R.id.progress_linear_bar);
        int dimensionPixelSize = this.aa.getResources().getDimensionPixelSize(R.dimen.share_panel_contents_width);
        if (dimensionPixelSize > 0) {
            LayoutParams layoutParams = this.ac.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            this.ac.setLayoutParams(layoutParams);
        }
        this.aK = this.aa.findViewById(R.id.progress_spinner);
        this.ad = (ViewGroup) this.aa.findViewById(R.id.content);
        this.ae = (RecyclerView) this.aa.findViewById(R.id.header);
        this.af = (RecyclerView) this.aa.findViewById(R.id.list);
        this.ag = (FloatingActionButton) this.aa.findViewById(R.id.send_button);
        this.ah = (Snackbar) this.aa.findViewById(R.id.snackbar);
        this.aj = new alge(this.aG, this.al, this.av, this.aa.findViewById(R.id.select_message_view), this.aa.findViewById(R.id.message_input_view));
        Resources resources = this.aG.getResources();
        this.ab.setOnClickListener(this);
        if (e()) {
            zyw zyw = this.aE;
            apxn a = zyw != null ? zyw.a() : null;
            if (a != null) {
                awuo awuo = a.u;
                if (awuo == null) {
                    awuo = awuo.c;
                }
                awuq awuq = awuo.b;
                if (awuq == null) {
                    awuq = awuq.d;
                }
                if (awuq.c) {
                    this.ac.c(resources.getDimensionPixelSize(R.dimen.share_panel_with_sharing_options_peek_amount));
                }
            }
            this.ac.c(resources.getDimensionPixelSize(R.dimen.share_panel_peek_amount));
        } else {
            this.ac.c(M_().getResources().getDisplayMetrics().heightPixels);
        }
        AnchorableTopPeekingScrollView anchorableTopPeekingScrollView = this.ac;
        anchorableTopPeekingScrollView.l = this.ab;
        anchorableTopPeekingScrollView.m = this.af;
        ColorDrawable colorDrawable = new ColorDrawable(xwe.a(this.aQ, R.attr.ytSeparator, 0));
        colorDrawable.setBounds(0, 0, 1, 1);
        this.ae.a(new ans());
        this.ae.a(new alpf(colorDrawable));
        this.af.a(new alkh(this, this.aG));
        this.af.a(new alpf(colorDrawable));
        this.ag.setOnClickListener(this);
        this.aL = AnimationUtils.loadAnimation(this.aG, R.anim.fab_in);
        this.aM = AnimationUtils.loadAnimation(this.aG, R.anim.fab_out);
        this.aa.getViewTreeObserver().addOnGlobalLayoutListener(new alkj(this));
        this.ad.setVisibility(4);
        Rect rect = new Rect();
        p().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        this.aP = rect.top;
        return this.aa;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        apxu b = aaax.b(this.j.getByteArray("navigation_endpoint"));
        this.aI = new acwi(this.aC, this);
        Resources q = q();
        algx algx = r0;
        Resources resources = q;
        aarh aarh = this.aw;
        algx algx2 = new algx(b, aarh, this.ar, this.as, this.au, this.at, this.av, this.ay.i(), this.aQ, this.aI, this.al, this, this, this, this.am, this.ax, this.aq, this.aj, this.az, this.aA, this.aB, resources.getDimensionPixelSize(R.dimen.share_panel_row_horizontal_padding), resources.getDimensionPixelSize(R.dimen.share_panel_row_first_and_last_vertical_padding));
        this.aH = algx;
        this.ai = new alkt(this.aH, this.ap);
        this.ai.a(alkv.PEEK);
        this.aH.e();
    }

    public void B() {
        super.B();
        this.am.a((alli) this);
    }

    public void ad_() {
        super.ad_();
        this.am.b((alli) this);
    }

    public final void i() {
        super.i();
        this.aH.f();
    }

    public final void dismiss() {
        this.ab.animate().alpha(0.0f).setDuration(250).start();
        this.ac.animate().translationY((float) this.aa.getHeight()).setDuration(250).setListener(new alkl(this)).start();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        algx algx = this.aH;
        for (algm a : algx.e) {
            a.a(configuration);
        }
        algx.h = false;
        alkt alkt = this.ai;
        alkt.b.removeAll(Arrays.asList(new alkv[]{alkv.PEEK}));
        alkt.c = false;
        if (e()) {
            this.ac.d(q().getDimensionPixelSize(R.dimen.share_panel_peek_amount));
        } else {
            this.aa.addOnLayoutChangeListener(new alkk(this, this.aa.getHeight()));
        }
        this.ai.a(alkv.PEEK);
        alex alex = (alex) this.an.get();
        albo albo = alex.e;
        if (albo != null) {
            albo.a(null);
            alex.e.e();
            alex.e = null;
            alex.f = null;
        }
    }

    public final void onClick(View view) {
        if (view == this.ab) {
            dismiss();
        } else if (view == this.ag) {
            this.aH.b();
        }
    }

    public final void a(akpd akpd, akpd akpd2) {
        this.ad.setAlpha(0.0f);
        this.ad.setVisibility(0);
        this.ad.setTranslationX(100.0f);
        this.ad.animate().setListener(new alkn(this)).alpha(1.0f).translationXBy(-100.0f).start();
        this.ae.a((apa) akpd);
        this.af.a((apa) akpd2);
        this.aO = -1;
        for (int i = 0; i < akpd2.a(); i++) {
            if (akpd2.getItem(i) instanceof alkw) {
                this.aO = i;
            }
        }
        if (this.aO < 0 || this.ac.n) {
            this.ai.a(alkv.REVEAL_THIRD_PARTY_NETWORK_SECTION_ANIMATION);
            return;
        }
        this.ad.getViewTreeObserver().addOnGlobalLayoutListener(new alkm(this));
    }

    public final void f(boolean z) {
        if (this.af.getChildCount() > this.aO) {
            int i;
            int height = this.ae.getHeight();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                i = this.aO;
                if (i2 >= i) {
                    break;
                }
                View childAt = this.af.getChildAt(i2);
                if (alkc.b(childAt)) {
                    apn apn = this.af.n;
                    i3 += apn.g(childAt);
                }
                i2++;
            }
            View childAt2 = this.af.getChildAt(i);
            if (alkc.b(childAt2)) {
                apn apn2 = this.af.n;
                i2 = apn.g(childAt2);
            } else {
                i2 = 0;
            }
            height = Math.max(this.aa.getHeight() - (((height + i3) + ((int) (((float) i2) * (!e() ? 0.5f : 0.7f)))) + this.aP), 0);
            if (z) {
                if (height < this.ac.k || !e()) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(new int[]{this.ac.k, height});
                    valueAnimator.setInterpolator(new DecelerateInterpolator());
                    valueAnimator.addUpdateListener(new alkp(this));
                    valueAnimator.addListener(new alko(this));
                    valueAnimator.start();
                } else {
                    this.ai.a(alkv.REVEAL_THIRD_PARTY_NETWORK_SECTION_ANIMATION);
                }
            } else if (height < this.ac.k || !e()) {
                this.ac.d(height);
            }
        } else if (z) {
            this.ai.a(alkv.REVEAL_THIRD_PARTY_NETWORK_SECTION_ANIMATION);
        }
    }

    public final void a(ajtd ajtd, aqhy aqhy) {
        acwp c = this.ar.c();
        Bundle bundle = new Bundle();
        bundle.putByteArray("renderer", aocf.toByteArray(ajtd));
        bundle.putParcelable("logging_data", c);
        if (aqhy != null) {
            bundle.putByteArray("confirm_dialog_renderer", aqhy.toByteArray());
        }
        aljp aljp = new aljp();
        aljp.f(bundle);
        aljp.a(this.aG.f(), null);
    }

    public final void a(aqhy aqhy, Rect rect) {
        if (this.aG == null) {
            xtl.e("Did not show promo tooltip because the share panel fragment was not attached to an activity.");
            return;
        }
        OnDismissListener onDismissListener = (alex) this.an.get();
        RecyclerView recyclerView = this.af;
        if (!onDismissListener.c.contains(aqhy)) {
            arml arml;
            onDismissListener.d = View.inflate(onDismissListener.a, R.layout.confirm_dialog_tooltip, null);
            TextView textView = (TextView) onDismissListener.d.findViewById(R.id.title);
            if ((aqhy.a & 1) != 0) {
                arml = aqhy.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            LinearLayout linearLayout = (LinearLayout) onDismissListener.d.findViewById(R.id.body_container);
            for (arml arml2 : aqhy.e) {
                Context context = onDismissListener.a;
                Spanned a = aabb.a(arml2, onDismissListener.b, false);
                YouTubeTextView youTubeTextView = new YouTubeTextView(context);
                youTubeTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                TypedValue typedValue = new TypedValue();
                if (context.getTheme().resolveAttribute(R.attr.textAppearanceBody2, typedValue, true)) {
                    youTubeTextView.setTextAppearance(context, typedValue.resourceId);
                } else {
                    youTubeTextView.setTextSize(0, (float) context.getResources().getDimensionPixelSize(R.dimen.medium_font_size));
                }
                youTubeTextView.setTextColor(context.getResources().getColor(R.color.white));
                youTubeTextView.setSingleLine(false);
                youTubeTextView.setText(a);
                linearLayout.addView(youTubeTextView);
            }
            aphj aphj = aqhy.g;
            if (aphj == null) {
                aphj = aphj.d;
            }
            onDismissListener.a(R.id.cancel_button, aphj);
            aphj = aqhy.f;
            if (aphj == null) {
                aphj = aphj.d;
            }
            onDismissListener.a(R.id.confirm_button, aphj);
            aphj = aqhy.f;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                aphj = aqhy.f;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                apxu apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                onDismissListener.h = apxu;
            } else {
                onDismissListener.h = null;
            }
            onDismissListener.e = new albo(onDismissListener.d, 1, recyclerView, 1);
            onDismissListener.e.a(onDismissListener);
            if (rect == null) {
                onDismissListener.e.d();
            } else {
                albo albo = onDismissListener.e;
                albo.a.f = rect;
                albo.d();
            }
            onDismissListener.f = aqhy;
        }
    }

    public final void a(aruh aruh, View view, Object obj) {
        if (this.aG == null) {
            xtl.e("Did not show hint tooltip because the share panel fragment was not attached to an activity.");
        } else {
            ((alfk) this.ao.get()).a(aruh, view, obj, this.aI);
        }
    }

    public final boolean a(CharSequence charSequence, CharSequence charSequence2) {
        new alpp(charSequence, charSequence2).a(this.aG);
        return true;
    }

    public final void a(boolean z) {
        if (z) {
            if (this.ag.getVisibility() != 0) {
                this.ag.setVisibility(0);
                this.ag.startAnimation(this.aL);
            }
            return;
        }
        if (this.ag.getVisibility() == 0) {
            this.ag.startAnimation(this.aM);
            this.ag.setVisibility(8);
        }
    }

    public final void b(boolean z) {
        apa apa = this.ae.m;
        if (apa == null || apa.a() <= 0) {
            apa = this.af.m;
            if (apa == null || apa.a() <= 0) {
                if (z) {
                    this.aK.setVisibility(0);
                    return;
                } else {
                    this.aK.setVisibility(8);
                    return;
                }
            }
        }
        if (z) {
            this.aJ.a();
        } else {
            this.aJ.b();
        }
    }

    public final void a(CharSequence charSequence) {
        this.ah.a(charSequence);
        this.ah.c();
        this.ah.post(new alkr(this));
    }

    public final void b() {
        this.ah.d();
        this.ag.animate().setDuration(250).translationY(0.0f).start();
    }

    public final void a(zye zye) {
        alpu.a(this.aD, this.ah, zye, Z, null, null);
    }

    public final void c() {
        this.ac.a();
    }

    public final void d() {
        dismiss();
    }

    public final void c(boolean z) {
        if (z) {
            this.af.n.e(0);
        }
    }

    public final void d(boolean z) {
        if (z != this.ac.n) {
            if (z) {
                this.aN = new alkg(this);
                this.af.getViewTreeObserver().addOnGlobalLayoutListener(this.aN);
                this.ac.a(true);
                return;
            }
            if (this.aN != null) {
                this.af.getViewTreeObserver().removeOnGlobalLayoutListener(this.aN);
            }
            this.aN = null;
            this.ac.a(false);
        }
    }

    public final acvx t() {
        return this.ar;
    }

    public final boolean e() {
        Context M_ = M_();
        if (M_ == null) {
            return true;
        }
        int c = xss.c(M_);
        if (c == 3 || c == 4) {
            return false;
        }
        return true;
    }

    private static boolean b(View view) {
        return (view == null || view.getLayoutParams() == null) ? false : true;
    }
}
