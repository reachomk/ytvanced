package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsContainer;
import com.google.android.apps.youtube.app.common.ui.bottomui.HatsSurvey;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ExpandableSurveyRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kdw */
public final class kdw extends akpl implements akok, fgz, fhn, xcp {
    private final HatsContainer A;
    private final LinearLayout B;
    private final int C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private Object H;
    private akoj I;
    private akot J;
    private akot K;
    private Button L;
    private Button M;
    private LinearLayout N;
    private LinearLayout O;
    private TextView P;
    private ChipCloudView Q;
    private apxu R;
    private AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private Spanned X;
    private kej[] Y;
    private final akot Z;
    public final aaas a;
    private fob aa;
    private final View ab;
    private int ac = 1;
    public final xci b;
    public final int c;
    public apxu d;
    public final Map e;
    public ajwm f;
    public TextView g;
    public CharSequence h = "";
    public int i = -1;
    public List j = null;
    private acvx k;
    private final View l;
    private final flu m;
    private final ImageView n;
    private final TextView o;
    private final TextView p;
    private final TextView q;
    private final ImageView r;
    private final LinearLayout s;
    private final akvp t;
    private final LinearLayout u;
    private final LinearLayout v;
    private final akkq w;
    private final epv x;
    private final Context y;
    private final akpb z;

    public kdw(Context context, aaas aaas, flu flu, xci xci, akvp akvp, epv epv, ffy ffy, akkq akkq, akpb akpb) {
        this.y = context;
        this.a = aaas;
        this.m = flu;
        this.b = xci;
        this.t = akvp;
        this.x = epv;
        this.w = akkq;
        this.e = new HashMap();
        this.z = akpb;
        this.Z = ffy.a(false);
        this.C = context.getResources().getDimensionPixelSize(R.dimen.inline_survey_between_button_margin);
        this.D = context.getResources().getDimensionPixelSize(R.dimen.inline_survey_first_primary_button_start_margin);
        this.E = context.getResources().getDimensionPixelSize(R.dimen.inline_survey_button_min_width);
        this.c = xwe.a(context, R.attr.ytCallToAction, 0);
        this.F = xwe.a(context, R.attr.ytBorderedButtonChipBackground, 0);
        this.G = xwe.a(context, R.attr.ytBrandBackgroundSolid, 0);
        LayoutInflater from = LayoutInflater.from(context);
        this.l = from.inflate(R.layout.inline_survey_layout, null);
        this.u = (LinearLayout) this.l.findViewById(R.id.video_layout);
        this.v = (LinearLayout) this.l.findViewById(R.id.full_size_video_layout);
        this.ab = from.inflate(R.layout.in_card_video_layout, this.u, false);
        this.n = (ImageView) this.l.findViewById(R.id.icon);
        this.o = (TextView) this.l.findViewById(R.id.title);
        this.p = (TextView) this.l.findViewById(R.id.subtitle);
        this.q = (TextView) this.l.findViewById(R.id.tap_suppressed_message);
        this.r = (ImageView) this.l.findViewById(R.id.close_button);
        this.s = (LinearLayout) this.l.findViewById(R.id.survey_responses);
        this.A = (HatsContainer) LayoutInflater.from(context).inflate(R.layout.hats_survey_container, this.s, false);
        this.B = (LinearLayout) from.inflate(R.layout.inline_survey_buttons, this.s, false);
        this.m.a(this.l);
        this.l.setBackground(new eza(xwe.a(context, R.attr.yt10PercentLayer, 0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    public final fhc b() {
        return null;
    }

    public final View K_() {
        return this.m.b;
    }

    public final void c() {
        apxu apxu = this.d;
        if (apxu != null) {
            this.a.a(apxu, this.e);
        }
        this.b.d(new akwd(this.f));
    }

    private final void a(boolean z, int i, CharSequence charSequence, apxu apxu, AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand) {
        int i2 = i;
        CharSequence charSequence2 = charSequence;
        apxu apxu2 = apxu;
        AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand2 = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
        if (this.i != i2 || z) {
            this.q.setVisibility(8);
            this.i = i2;
            if (!z) {
                this.j.clear();
                this.j.add(apxu2);
            }
            CharSequence charSequence3 = null;
            List list;
            if (addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand2 == null) {
                list = null;
            } else {
                list = ajzv.a(addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand2.b);
            }
            this.Q.removeAllViews();
            if (list == null || list.isEmpty()) {
                this.Q.setVisibility(8);
            } else {
                this.Q.setVisibility(0);
                for (ajzw a : list) {
                    axzu axzu = (axzu) ajzv.a(a, axzu.class);
                    if (axzu != null) {
                        arml arml;
                        apxu apxu3;
                        if ((axzu.a & 1) != 0) {
                            arml = axzu.b;
                            if (arml == null) {
                                arml = arml.f;
                            }
                        } else {
                            arml = null;
                        }
                        Spanned a2 = ajqy.a(arml);
                        if ((axzu.a & 2) != 0) {
                            apxu3 = axzu.c;
                            if (apxu3 == null) {
                                apxu3 = apxu.d;
                            }
                        } else {
                            apxu3 = null;
                        }
                        byte[] d = axzu.d.d();
                        fej fej = new fej(this.y);
                        fej.a(xss.a(this.y.getResources().getDisplayMetrics(), 48));
                        aptk aptk = (aptk) aptl.i.createBuilder();
                        aptk.a(ajqy.a(a2.toString()));
                        aptk.a(false);
                        aptm aptm = (aptm) aptn.c.createBuilder();
                        aptm.a(1);
                        aptk.a(aptm);
                        aptl aptl = (aptl) ((anxl) aptk.build());
                        fej.j = new fem(fej, aptl, true, this.c);
                        fej.b(aptl);
                        fej.setMinimumHeight(this.y.getResources().getDimensionPixelSize(R.dimen.inline_survey_chip_height));
                        fej.setAccessibilityDelegate(new keg(fej));
                        fej.setOnClickListener(new keh(this, d, fej, apxu3));
                        c(axzu.d.d());
                        this.Q.addView(fej);
                        if (z) {
                            for (apxu apxu32 : this.j) {
                                if ((axzu.a & 2) != 0) {
                                    anxl anxl = axzu.c;
                                    if (anxl == null) {
                                        anxl = apxu.d;
                                    }
                                    if (anxl.equals(apxu32)) {
                                        fej.b(1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            b(this.i);
            if (this.i == 0) {
                this.N.setVisibility(8);
                this.g.setPadding(0, this.y.getResources().getDimensionPixelOffset(R.dimen.inline_survey_rating_desc_padding), 0, 0);
            }
            this.h = charSequence2;
            this.R = apxu2;
            this.S = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand2;
            if (addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand2 != null) {
                arml arml2;
                if ((addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand2.a & 1) != 0) {
                    arml2 = addFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand2.c;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                }
                charSequence3 = ajqy.a(arml2);
            }
            xpr.a(this.g, charSequence2);
            xpr.a(this.P, charSequence3);
            this.L.setText(this.y.getResources().getString(R.string.inline_surveys_undo_selection));
            this.O.setVisibility(0);
        }
    }

    public final void b(int i) {
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        while (i2 < i) {
            kej kej = this.Y[i2];
            kej.a.setImageResource(kej.b);
            kej.a.setTag("on");
            kej.b();
            i2++;
        }
        while (true) {
            kej[] kejArr = this.Y;
            if (i < kejArr.length) {
                kejArr[i].a();
                i++;
            } else {
                return;
            }
        }
    }

    public final void a(byte[] bArr) {
        acvx acvx = this.k;
        if (acvx != null && bArr != null) {
            acvx.a(3, new acvs(bArr), null);
        }
    }

    private final void b(byte[] bArr) {
        acvx acvx = this.k;
        if (acvx != null) {
            acvx.a(bArr);
        }
    }

    private final void c(byte[] bArr) {
        acvx acvx = this.k;
        if (acvx != null) {
            acvx.a(bArr, null);
        }
    }

    private final void b(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackground(new RippleDrawable(xwe.b(this.y, R.attr.colorControlHighlight), view.getBackground(), null));
        }
    }

    public final void a(akpb akpb) {
        akoj akoj = this.I;
        if (akoj != null) {
            akoj.a();
        }
        akot akot = this.J;
        if (akot != null) {
            akot.a(akpb);
            this.J = null;
        }
        akot = this.Z;
        if (akot != null) {
            akot.a(akpb);
        }
        this.b.b(this);
        this.aa = null;
        this.H = null;
    }

    public final boolean a(View view) {
        int i = this.ac;
        if (i == 0) {
            return false;
        }
        i--;
        if (i == 1) {
            this.q.setVisibility(0);
            TextView textView = this.q;
            textView.announceForAccessibility(textView.getText());
            return true;
        } else if (i != 2) {
            return false;
        } else {
            c();
            return false;
        }
    }

    public final View a() {
        return ((fgz) this.Z).a();
    }

    public final void a(boolean z) {
        ((fgz) this.Z).a(z);
    }

    public final bblt a(int i) {
        akot akot = this.Z;
        if (!(akot instanceof fhn) || this.aa == null) {
            return bblt.a();
        }
        return ((fhn) akot).a(i);
    }

    public final boolean a(fhn fhn) {
        if ((fhn instanceof kdw) && ((kdw) fhn).H == this.H) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        ImageView imageView;
        akvp akvp;
        arwh a;
        LinearLayout linearLayout;
        int i;
        Object obj2;
        acwb acwb = akor;
        ajwm ajwm = (ajwm) obj;
        this.H = ajwm;
        this.k = acwb.a;
        c(ajwm.h);
        xpr.a(this.o, ajqy.a(ajwm.d));
        xpr.a(this.p, ajqy.a(ajwm.e));
        arwf arwf = ajwm.a;
        if (arwf != null) {
            imageView = this.n;
            akvp = this.t;
            a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            imageView.setImageResource(akvp.a(a));
            this.n.setVisibility(0);
        } else {
            this.n.setVisibility(8);
        }
        arwf = ajwm.b;
        if (arwf != null) {
            imageView = this.r;
            akvp = this.t;
            a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            imageView.setImageResource(akvp.a(a));
        }
        this.d = ajwm.c;
        arml arml = null;
        if (this.d != null) {
            this.r.setVisibility(0);
            this.r.setOnClickListener(new kdz(this));
        } else {
            this.r.setVisibility(8);
            this.r.setOnClickListener(null);
        }
        this.f = ajwm;
        this.e.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ajwm);
        this.u.removeAllViews();
        if (this.v.getChildCount() > 1) {
            linearLayout = this.v;
            linearLayout.removeViews(1, linearLayout.getChildCount() - 1);
        }
        this.U = false;
        this.V = false;
        this.W = false;
        xpr.a(this.u, false);
        xpr.a(this.v, false);
        aryr aryr = ajwm.f;
        this.ac = ajwm.j;
        if (aryr != null) {
            i = aryr.a;
            if (i == 125014205) {
                apxu apxu;
                arml arml2;
                arml arml3;
                aryp aryp = (aryp) aryr.b;
                c(aryp.f.d());
                this.U = true;
                ImageView imageView2 = (ImageView) this.ab.findViewById(R.id.thumbnail);
                TextView textView = (TextView) this.ab.findViewById(R.id.video_title);
                TextView textView2 = (TextView) this.ab.findViewById(R.id.video_details);
                this.I = new akoj(this.a, this.ab, (akok) this);
                akoj akoj = this.I;
                acvx acvx = acwb.a;
                if ((aryp.a & 8) != 0) {
                    apxu = aryp.e;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                } else {
                    apxu = null;
                }
                akoj.a(acvx, apxu, akor.b());
                this.u.addView(this.ab);
                xpr.a(this.u, true);
                akkq akkq = this.w;
                aygk aygk = aryp.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                akkq.a(imageView2, aygk);
                if ((aryp.a & 2) != 0) {
                    arml2 = aryp.c;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                xpr.a(textView, ajqy.a(arml2));
                if ((aryp.a & 4) != 0) {
                    arml3 = aryp.d;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                } else {
                    arml3 = null;
                }
                xpr.a(textView2, ajqy.a(arml3));
            } else if (i == 50630979) {
                obj2 = (aqgs) aryr.b;
                c(obj2.E.d());
                this.U = true;
                this.J = akoz.a(this.z, obj2, this.u);
                amqw.a((Object) akor);
                acwb.a("yt_click_intercept_tag", this);
                akoz.a(this.u, this.J, this.z.a(obj2));
                this.J.a_(acwb, obj2);
                this.u.addView(this.J.K_());
                xpr.a(this.u, true);
            } else if (i == 60373625) {
                obj2 = (arss) aryr.b;
                b(obj2.B.d());
                c(obj2.B.d());
                this.V = true;
                this.K = akoz.a(this.z, obj2, this.u);
                akoz.a(this.u, this.K, this.z.a(obj2));
                this.K.a_(acwb, obj2);
                this.v.addView(this.K.K_());
                xpr.a(this.v, true);
                this.b.a(this);
            } else if (i == 89018663) {
                obj2 = (azem) aryr.b;
                b(obj2.q.d());
                c(obj2.q.d());
                this.V = true;
                akot a2 = akoz.a(this.z, obj2, this.u);
                akoz.a(this.u, a2, this.z.a(obj2));
                a2.a_(acwb, obj2);
                this.v.addView(a2.K_());
                xpr.a(this.v, true);
                this.b.a(this);
            } else if (i == 83537025) {
                this.W = true;
                xpr.a(this.v, true);
                this.aa = fod.b(ajwm);
                this.v.addView(this.Z.K_());
                this.Z.a_(acwb, this.aa);
                this.b.a(this);
            }
        }
        if (ajwm.i == 3) {
            RelativeLayout relativeLayout = (RelativeLayout) this.l.findViewById(R.id.survey_layout);
            this.l.findViewById(R.id.bottom_divider).setVisibility(0);
            relativeLayout.setBackgroundColor(this.F);
            this.o.setTextColor(this.c);
            this.p.setTextColor(this.c);
            if (this.n.getDrawable() != null) {
                this.n.getDrawable().mutate().setColorFilter(this.c, Mode.SRC_IN);
            }
            if (this.r.getDrawable() != null) {
                this.r.getDrawable().mutate().setColorFilter(this.c, Mode.SRC_IN);
            }
            if (this.U) {
                linearLayout = (LinearLayout) this.l.findViewById(R.id.video_info_view);
                if (linearLayout != null) {
                    linearLayout.setPadding(0, 0, 0, 0);
                    linearLayout.setBackgroundColor(xwe.a(this.y, R.attr.ytBrandBackgroundSolid, 0));
                    LayoutParams layoutParams = (LayoutParams) linearLayout.findViewById(R.id.thumbnail_layout).getLayoutParams();
                    layoutParams.topMargin = 0;
                    layoutParams.bottomMargin = 0;
                    this.l.findViewById(R.id.thumbnail_layout).setLayoutParams(layoutParams);
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.u.getLayoutParams();
                layoutParams2.setMarginStart(this.y.getResources().getDimensionPixelOffset(R.dimen.start_end_padding));
                this.u.setLayoutParams(layoutParams2);
            } else if (this.V) {
                this.l.findViewById(R.id.bottom_divider).setVisibility(8);
                this.v.setBackgroundColor(this.G);
            } else if (this.W) {
                this.l.findViewById(R.id.bottom_divider).setVisibility(8);
            }
        } else {
            this.l.findViewById(R.id.bottom_divider).setVisibility(8);
        }
        aryv aryv = ajwm.g;
        this.s.removeAllViews();
        xpr.a(this.s, true);
        int i2;
        View a3;
        if (aryv != null && aryv.a == 116011845) {
            anyd anyd = ((aryn) aryv.b).a;
            this.B.removeAllViews();
            for (i2 = 0; i2 < anyd.size(); i2++) {
                Object obj3;
                eps a4 = this.x.a(null, this.e);
                if ((((aphj) anyd.get(i2)).a & 1) == 0) {
                    obj3 = null;
                } else {
                    obj3 = ((aphj) anyd.get(i2)).b;
                    if (obj3 == null) {
                        obj3 = aphg.s;
                    }
                }
                a4.a_(acwb, obj3);
                TextView textView3 = a4.b;
                textView3.setMinimumWidth(this.E);
                this.B.addView(textView3);
                textView3.setTextAlignment(4);
                if (i2 == 0) {
                    aphg aphg = ((aphj) anyd.get(0)).b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    if (aphg.b == 1) {
                        i = aphh.a(((Integer) aphg.c).intValue());
                        if (i != 0 && i == 3) {
                            i = this.D;
                            if (textView3.getLayoutParams() instanceof MarginLayoutParams) {
                                ((MarginLayoutParams) textView3.getLayoutParams()).setMarginStart(i);
                                textView3.requestLayout();
                            }
                        }
                    }
                }
                i = this.C;
                if (textView3.getLayoutParams() instanceof MarginLayoutParams) {
                    ((MarginLayoutParams) textView3.getLayoutParams()).setMarginEnd(i);
                    textView3.requestLayout();
                }
            }
            this.s.addView(this.B);
            this.s.setVisibility(0);
        } else if (aryv != null && aryv.a == 171694596) {
            anyd<ayas> anyd2 = ((aryl) aryv.b).a;
            HatsSurvey a5 = this.A.a().a();
            a5.a(null, null);
            a5.c(null);
            List arrayList = new ArrayList(anyd2.size());
            for (ayas ayas : anyd2) {
                ayam ayam = ayas.a == 84469192 ? (ayam) ayas.b : null;
                if (ayam != null) {
                    a3 = fed.a(this.y, null, false);
                    fed.a(a3, ayam, this.t, new keb(this, ayam));
                    arrayList.add(a3);
                }
            }
            a5.a(arrayList);
            a5.a(fed.a(anyd2));
            a5.b(fed.b(anyd2));
            this.A.a(a5);
            HatsContainer hatsContainer = this.A;
            hatsContainer.b = false;
            hatsContainer.b();
            this.A.setPadding(0, 0, 0, 0);
            xpr.a(this.A, true);
            this.s.addView(this.A);
            this.s.setVisibility(0);
        } else if (aryv != null && aryv.a == 195864971) {
            arhr arhr = (arhr) aryv.b;
            c(arhr.e.d());
            if (this.j == null) {
                this.j = new ArrayList();
            }
            this.r.setOnClickListener(new kea(this));
            View inflate = LayoutInflater.from(this.y).inflate(R.layout.expandable_survey_layout, null);
            this.g = (TextView) inflate.findViewById(R.id.rating_description);
            this.P = (TextView) inflate.findViewById(R.id.follow_up_text);
            this.N = (LinearLayout) inflate.findViewById(R.id.star_container);
            this.O = (LinearLayout) inflate.findViewById(R.id.follow_up_container);
            this.L = (Button) inflate.findViewById(R.id.btn_not_sure_undo);
            b(this.L);
            this.M = (Button) inflate.findViewById(R.id.btn_submit);
            b(this.M);
            this.Q = (ChipCloudView) inflate.findViewById(R.id.follow_up_cloud);
            this.Q.a(this.y.getResources().getInteger(R.integer.inline_survey_max_follow_up_question_rows));
            anxp anxp = arhr.b;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ExpandableSurveyRenderer.ratingSurveyRenderer);
            anxp.a(access$000);
            obj2 = anxp.h.b(access$000.d);
            if (obj2 == null) {
                obj2 = access$000.b;
            } else {
                obj2 = access$000.a(obj2);
            }
            arhv arhv = (arhv) obj2;
            c(arhv.g.d());
            this.Y = new kej[arhv.b.size()];
            this.T = this.y.getResources().getDimensionPixelOffset(R.dimen.inline_survey_star_padding);
            for (int i3 = 0; i3 < arhv.b.size(); i3++) {
                axak axak = (axak) arhv.b.get(i3);
                anxr access$0002 = anxl.checkIsLite(ExpandableSurveyRenderer.ratingSurveyOptionRenderer);
                axak.a(access$0002);
                if (axak.h.a(access$0002.d)) {
                    axak = (axak) arhv.b.get(i3);
                    access$0002 = anxl.checkIsLite(ExpandableSurveyRenderer.ratingSurveyOptionRenderer);
                    axak.a(access$0002);
                    Object b = axak.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    arht arht = (arht) b;
                    c(arht.g.d());
                    arml arml4 = arht.b;
                    if (arml4 == null) {
                        arml4 = arml.f;
                    }
                    Spanned a6 = ajqy.a(arml4);
                    a3 = new ImageView(this.y);
                    i = this.T;
                    a3.setPadding(i, i, i, i);
                    a3.setContentDescription(a6);
                    b(a3);
                    i = i3 + 1;
                    a3.setOnTouchListener(new ked(this, i, a6, a3));
                    a3.setOnClickListener(new kec(this, arht, i, a6));
                    this.N.addView(a3);
                    kej[] kejArr = this.Y;
                    akvp akvp2 = this.t;
                    arwf arwf2 = arht.c;
                    if (arwf2 == null) {
                        arwf2 = arwf.c;
                    }
                    arwh a7 = arwh.a(arwf2.b);
                    if (a7 == null) {
                        a7 = arwh.UNKNOWN;
                    }
                    int a8 = akvp2.a(a7);
                    akvp akvp3 = this.t;
                    arwf arwf3 = arht.d;
                    if (arwf3 == null) {
                        arwf3 = arwf.c;
                    }
                    arwh a9 = arwh.a(arwf3.b);
                    if (a9 == null) {
                        a9 = arwh.UNKNOWN;
                    }
                    kejArr[i3] = new kej(this, a3, a8, akvp3.a(a9));
                    this.Y[i3].a();
                }
            }
            anxp = arhr.c;
            if (anxp == null) {
                anxp = axak.a;
            }
            access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            obj2 = anxp.h.b(access$000.d);
            if (obj2 == null) {
                obj2 = access$000.b;
            } else {
                obj2 = access$000.a(obj2);
            }
            aphg aphg2 = (aphg) obj2;
            if ((aphg2.a & 128) != 0) {
                arml = aphg2.g;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            this.X = ajqy.a(arml);
            this.L.setText(this.X);
            this.L.setOnClickListener(new kef(this, aphg2));
            anxp anxp2 = arhr.d;
            if (anxp2 == null) {
                anxp2 = axak.a;
            }
            anxr access$0003 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp2.a(access$0003);
            Object b2 = anxp2.h.b(access$0003.d);
            if (b2 == null) {
                b2 = access$0003.b;
            } else {
                b2 = access$0003.a(b2);
            }
            this.M.setOnClickListener(new kee(this, (aphf) ((anxo) ((aphg) b2).toBuilder())));
            this.s.addView(inflate);
            this.s.setVisibility(0);
            i2 = this.i;
            if (i2 != -1) {
                a(true, i2, this.h, this.R, this.S);
            }
        } else {
            xpr.a(this.s, false);
            View view = this.l;
            view.getClass();
            view.post(new kdy(view));
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{gzx.class};
        } else if (i == 0) {
            xpr.a(this.v, false);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
