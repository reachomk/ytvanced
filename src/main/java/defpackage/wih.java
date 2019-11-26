package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: wih */
public final class wih implements akot, wej, wmc {
    public OnScrollChangedListener A;
    public boolean B;
    public boolean C;
    public ajsn D;
    private final akkq E;
    private final akvo F;
    private final akvp G;
    private final wek H;
    private final wlx I;
    private final wdz J;
    private final wly K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private final int Q;
    private final int R;
    private final int S;
    private final int T;
    private final int U;
    private final int V;
    private final int W;
    private final int X;
    private final int Y;
    private final int Z;
    public final Context a;
    private View aA;
    private ImageView aB;
    private TextView aC;
    private FrameLayout aD;
    private TextView aE;
    private View aF;
    private TextView aG;
    private TextView aH;
    private TextView aI;
    private View aJ;
    private ImageView aK;
    private TextView aL;
    private ViewGroup aM;
    private ViewGroup aN;
    private View aO;
    private View aP;
    private FrameLayout aQ;
    private FrameLayout aR;
    private FrameLayout aS;
    private TextView aT;
    private View aU;
    private final wle aV;
    private final wld aW;
    private final aktj aX;
    private final aktr aY = new aktr();
    private final SpannableStringBuilder aZ = new SpannableStringBuilder();
    private final int aa;
    private final int ab;
    private final int ac;
    private final FrameLayout ad;
    private boolean ae = false;
    private boolean af = false;
    private Animator ag;
    private final wiw ah;
    private final wiw ai;
    private final wiw aj;
    private View ak;
    private ImageView al;
    private ImageView am;
    private ImageView an;
    private ImageView ao;
    private ImageView ap;
    private TextView aq;
    private TextView ar;
    private ViewGroup as;
    private ImageView at;
    private TextView au;
    private TextView av;
    private ImageView aw;
    private TextView ax;
    private TextView ay;
    private ImageView az;
    public final wfe b;
    private final StringBuilder ba = new StringBuilder();
    private akor bb;
    public final wev c;
    public final aaas d;
    public final wlm e;
    public final zyw f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public int l = 5;
    public OnPreDrawListener m;
    public View n;
    public View o;
    public ViewGroup p;
    public ImageView q;
    public TextView r;
    public TextView s;
    public ViewGroup t;
    public ImageView u;
    public ImageView v;
    public ImageView w;
    public ImageView x;
    public FrameLayout y;
    public OnScrollChangedListener z;

    public wih(Context context, akkq akkq, aaas aaas, akvo akvo, akvz akvz, wfe wfe, wev wev, akvp akvp, wek wek, wlx wlx, wlm wlm, zyw zyw, wdz wdz, wld wld, wly wly, aktl aktl) {
        Context context2 = context;
        this.a = (Context) amqw.a((Object) context);
        this.E = (akkq) amqw.a((Object) akkq);
        this.F = (akvo) amqw.a((Object) akvo);
        this.d = (aaas) amqw.a((Object) aaas);
        this.b = (wfe) amqw.a((Object) wfe);
        this.c = (wev) amqw.a((Object) wev);
        this.H = (wek) amqw.a((Object) wek);
        this.I = (wlx) amqw.a((Object) wlx);
        this.f = zyw;
        this.J = wdz;
        this.G = akvp;
        this.aW = (wld) amqw.a((Object) wld);
        this.K = (wly) amqw.a((Object) wly);
        this.e = (wlm) amqw.a((Object) wlm);
        wlm.a = aaas;
        this.ad = new FrameLayout(context);
        LayoutInflater from = LayoutInflater.from(this.a);
        this.ah = wih.b(from.inflate(R.layout.comment_infoline_above, this.ad, false));
        this.ai = wih.b(from.inflate(R.layout.comment_infoline_below, this.ad, false));
        this.aj = wih.b(from.inflate(R.layout.backstage_post, this.ad, false));
        this.aV = new wle(context, (akpb) akvz.get());
        this.aX = new aktj(context, aktl, true, this.aY);
        Resources resources = context.getResources();
        TypedValue typedValue = new TypedValue();
        int dimension = (context.getTheme() != null && context.getTheme().resolveAttribute(16842829, typedValue, true) && typedValue.type == 5) ? (int) typedValue.getDimension(context.getResources().getDisplayMetrics()) : 0;
        this.L = dimension;
        this.M = resources.getDimensionPixelSize(R.dimen.comment_layout_margin_left);
        this.N = resources.getDimensionPixelSize(R.dimen.reply_layout_margin_left);
        this.O = resources.getDimensionPixelSize(R.dimen.reply_layout_indented_margin_left);
        this.P = resources.getDimensionPixelSize(R.dimen.comment_action_button_tap_target_padding_x);
        this.g = resources.getDimensionPixelSize(R.dimen.comment_action_button_tap_target_padding_y);
        this.h = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_left);
        this.j = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_left_postv21);
        this.i = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_right);
        this.k = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_right_postv21);
        this.Q = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_left_indented);
        this.R = resources.getDimensionPixelSize(R.dimen.comment_dislike_button_tap_target_padding_right_indented);
        this.S = resources.getDimensionPixelSize(R.dimen.comment_avatar_size);
        this.T = resources.getDimensionPixelSize(R.dimen.reply_avatar_size);
        this.U = resources.getDimensionPixelSize(R.dimen.comment_author_badge_size);
        this.V = resources.getDimensionPixelSize(R.dimen.comment_layout_padding_top);
        this.W = resources.getDimensionPixelSize(R.dimen.comment_layout_padding_top_highlighted_reply);
        this.X = resources.getDimensionPixelSize(R.dimen.comment_heart_creator_avatar_width);
        this.Y = xwe.a(context, R.attr.cmtAvatarHeartOverlayDefault, 0);
        this.Z = xwe.a(context, R.attr.cmtBgStyleDefault, 0);
        this.aa = xwe.a(context, R.attr.cmtBgStyleGrey, 0);
        this.ab = xwe.a(context, R.attr.ytBorderedButtonChipBackground, 0);
        this.ac = xwe.a(context, R.attr.ytTextSecondary, 0);
        a(this.ah, false);
        a(this.ai, false);
        a(this.aj, true);
    }

    private final void c(ajsn ajsn) {
        int i = 0;
        this.ae = false;
        this.af = false;
        this.ad.removeAllViews();
        wiw wiw = this.ai;
        apzu[] apzuArr = ajsn.B;
        if (apzuArr != null) {
            int length = apzuArr.length;
            if (length > 0) {
                while (i < length) {
                    int a = apzw.a(apzuArr[i].b);
                    if (a == 0) {
                        a = 1;
                    }
                    a--;
                    if (a == 1) {
                        this.ae = true;
                        wiw = this.aj;
                    } else if (a == 5) {
                        this.af = true;
                        wiw = this.ah;
                    }
                    i++;
                }
            }
        }
        this.n = wiw.a;
        this.al = wiw.d;
        this.aq = wiw.k;
        this.ak = wiw.c;
        this.an = wiw.f;
        this.am = wiw.e;
        this.ao = wiw.g;
        this.p = wiw.h;
        this.q = wiw.i;
        this.ap = wiw.j;
        this.r = wiw.l;
        this.s = wiw.m;
        this.ar = wiw.n;
        this.at = wiw.p;
        this.aT = wiw.r;
        this.au = wiw.q;
        this.as = wiw.o;
        this.t = wiw.s;
        this.u = wiw.t;
        this.v = wiw.u;
        this.w = wiw.v;
        this.x = wiw.w;
        this.av = wiw.x;
        this.aw = wiw.y;
        this.ax = wiw.z;
        this.ay = wiw.A;
        this.az = wiw.B;
        this.aA = wiw.C;
        this.aC = wiw.E;
        this.aB = wiw.D;
        this.y = wiw.S;
        this.aQ = wiw.T;
        this.aR = wiw.U;
        this.aS = wiw.V;
        this.aD = wiw.F;
        this.aE = wiw.G;
        this.aF = wiw.H;
        this.aM = wiw.O;
        this.aN = wiw.P;
        this.aI = wiw.K;
        this.aG = wiw.I;
        this.aH = wiw.J;
        this.aJ = wiw.L;
        this.aK = wiw.M;
        this.aL = wiw.N;
        this.aP = wiw.R;
        this.aO = wiw.Q;
        this.aU = wiw.W;
        this.o = wiw.b;
        this.ad.addView(this.n);
    }

    private static wiw b(View view) {
        wiw wiw = new wiw();
        wiw.a = view;
        wiw.k = (TextView) view.findViewById(R.id.comment_author);
        wiw.c = view.findViewById(R.id.left_margin);
        wiw.d = (ImageView) view.findViewById(R.id.comment_avatar);
        wiw.f = (ImageView) view.findViewById(R.id.comment_dislike_button);
        wiw.e = (ImageView) view.findViewById(R.id.comment_like_button);
        wiw.g = (ImageView) view.findViewById(R.id.comment_heart_button);
        wiw.h = (ViewGroup) view.findViewById(R.id.comment_creator_heart);
        wiw.i = (ImageView) view.findViewById(R.id.comment_creator_hearted_badge_avatar);
        wiw.j = (ImageView) view.findViewById(R.id.comment_avatar_heart_overlay);
        wiw.l = (TextView) view.findViewById(R.id.comment_content);
        wiw.m = (TextView) view.findViewById(R.id.comment_expand_button);
        wiw.n = (TextView) view.findViewById(R.id.comment_like_count);
        wiw.p = (ImageView) view.findViewById(R.id.comment_reply_button);
        wiw.q = (TextView) view.findViewById(R.id.comment_reply_count);
        wiw.o = (ViewGroup) view.findViewById(R.id.action_toolbar);
        wiw.s = (ViewGroup) view.findViewById(R.id.moderation_toolbar);
        wiw.t = (ImageView) view.findViewById(R.id.comment_approve_button);
        wiw.u = (ImageView) view.findViewById(R.id.comment_remove_button);
        wiw.v = (ImageView) view.findViewById(R.id.comment_report_button);
        wiw.w = (ImageView) view.findViewById(R.id.comment_ban_button);
        wiw.x = (TextView) view.findViewById(R.id.comment_timestamp);
        wiw.y = (ImageView) view.findViewById(R.id.pinned_comment_icon);
        wiw.z = (TextView) view.findViewById(R.id.pinned_comment_label);
        wiw.A = (TextView) view.findViewById(R.id.linked_comment_badge);
        wiw.B = (ImageView) view.findViewById(R.id.comment_sponsor_badge);
        wiw.C = view.findViewById(R.id.sponsors_only_badge);
        wiw.E = (TextView) view.findViewById(R.id.sponsors_only_badge_text);
        wiw.D = (ImageView) view.findViewById(R.id.sponsors_only_badge_icon);
        wiw.S = (FrameLayout) view.findViewById(R.id.backstage_image);
        wiw.T = (FrameLayout) view.findViewById(R.id.backstage_playlist);
        wiw.U = (FrameLayout) view.findViewById(R.id.backstage_video);
        wiw.V = (FrameLayout) view.findViewById(R.id.creator_reply);
        wiw.r = (TextView) view.findViewById(R.id.creator_stories_reply);
        wiw.F = (FrameLayout) view.findViewById(R.id.comment_poll);
        wiw.O = (ViewGroup) view.findViewById(R.id.comment_info_line);
        wiw.P = (ViewGroup) view.findViewById(R.id.comment_poll_info_line);
        wiw.G = (TextView) view.findViewById(R.id.comment_poll_author);
        wiw.H = view.findViewById(R.id.poll_info_line_separator);
        wiw.K = (TextView) view.findViewById(R.id.comment_poll_timestamp);
        wiw.I = (TextView) view.findViewById(R.id.comment_poll_votes_total);
        wiw.J = (TextView) view.findViewById(R.id.comment_poll_voting_status);
        wiw.L = view.findViewById(R.id.sponsors_only_badge_poll);
        wiw.N = (TextView) view.findViewById(R.id.sponsors_only_badge_text_poll);
        wiw.M = (ImageView) view.findViewById(R.id.sponsors_only_badge_icon_poll);
        wiw.R = view.findViewById(R.id.comment_poll_separator2);
        wiw.Q = view.findViewById(R.id.comment_info_line_separator);
        wiw.W = view.findViewById(R.id.comment_divider);
        wiw.b = view.findViewById(R.id.action_menu_anchor);
        return wiw;
    }

    private final void a(wiw wiw, boolean z) {
        View view = wiw.a;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new wit(this, wiw, z, view));
    }

    private static boolean a(akor akor) {
        if (akor.a("ignoreIndentedComment", false) || !akor.a("indentedComment", false)) {
            return false;
        }
        return true;
    }

    public final void b(ajsn ajsn) {
        a(ajsn, false);
        this.s.setVisibility(8);
    }

    private final void a(ajsn ajsn, boolean z) {
        Spanned a = aabb.a(ajsn.d, this.d, false);
        if (!TextUtils.isEmpty(a) || ajsn.k == null) {
            this.r.setVisibility(0);
            this.aZ.clear();
            this.ba.setLength(0);
            if (TextUtils.isEmpty(a)) {
                this.r.setText(null);
            } else {
                this.aZ.append(a);
                this.ba.append(a);
                this.aX.a(ajsn.d, a, this.aZ, this.ba, ajsn, this.r.getId());
                this.r.setText(this.aZ);
            }
            this.r.setMaxLines(z ? this.l : Integer.MAX_VALUE);
            return;
        }
        this.r.setVisibility(8);
    }

    private final void a(apym apym, View view, TextView textView, ImageView imageView) {
        if (view != null) {
            if (apym != null) {
                arml arml;
                arwf arwf;
                apye apye;
                view.setVisibility(0);
                arml arml2 = null;
                if ((apym.a & 2) != 0) {
                    arml = apym.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                textView.setText(ajqy.a(arml));
                if ((apym.a & 1) != 0) {
                    arwf = apym.b;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                } else {
                    arwf = null;
                }
                if ((apym.a & 4) != 0) {
                    apye = apym.d;
                    if (apye == null) {
                        apye = apye.c;
                    }
                } else {
                    apye = null;
                }
                a(imageView, arwf, apye, (int) R.attr.cmtSponsorsOnlyBadge);
                view.setOnClickListener(null);
                if ((apym.a & 2) != 0) {
                    arml2 = apym.c;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                }
                view.setContentDescription(ajqy.b(arml2));
                if ((apym.a & 8) != 0) {
                    arml arml3 = apym.e;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                    String obj = ajqy.a(arml3).toString();
                    if (!((AccessibilityManager) this.a.getSystemService("accessibility")).isEnabled()) {
                        view.setOnClickListener(new win(this, obj, view));
                    }
                }
                return;
            }
            view.setVisibility(8);
        }
    }

    private final void a(ImageView imageView, arwf arwf, apye apye, int i) {
        arwh a;
        int i2;
        if (arwf != null) {
            a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
        } else {
            a = arwh.SPONSORSHIPS;
        }
        imageView.setImageResource(this.G.a(a));
        if (apye != null && apye.a == 118483990) {
            i2 = ((apfb) apye.b).d;
        } else {
            i2 = xwe.a(this.a, i, 0);
        }
        imageView.setColorFilter(i2);
    }

    private final awly b(ajsn ajsn, boolean z) {
        this.aD.removeAllViews();
        wlx wlx = this.I;
        ajrn ajrn = ajsn.k;
        Object obj = ajrn != null ? ajrn.d : null;
        Object obj2 = obj != null ? (awly) wlx.a(wlx.a(ajsn.g), obj, obj.i, z) : null;
        int i = 1;
        int i2 = 8;
        if (obj2 != null) {
            arml arml;
            View view;
            this.aD.addView(this.aV.a(this.aV.a(this.bb), obj2));
            TextView textView = this.aH;
            if ((obj2.a & 16) != 0) {
                arml = obj2.g;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            textView = this.aG;
            if ((obj2.a & 8) != 0) {
                arml = obj2.f;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            this.aI.setText(ajqy.a(ajsn.e));
            Spanned a = ajqy.a(ajsn.a);
            if (TextUtils.isEmpty(a)) {
                this.aE.setText("");
                this.aE.setVisibility(8);
                view = this.aF;
                if (view != null) {
                    view.setVisibility(8);
                }
            } else {
                apyc apyc;
                this.aE.setText(a);
                this.aE.setVisibility(0);
                apyg apyg = ajsn.s;
                if (apyg == null || (apyg.a & 2) == 0) {
                    apyc = null;
                } else {
                    apyc = apyg.c;
                    if (apyc == null) {
                        apyc = apyc.f;
                    }
                }
                if (!(apyc == null || (apyc.a & 1) == 0)) {
                    arwf arwf = apyc.b;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    arwh a2 = arwh.a(arwf.b);
                    if (a2 == null) {
                        a2 = arwh.UNKNOWN;
                    }
                    if (a2 != arwh.CHECK) {
                        Resources resources = this.a.getResources();
                        akvp akvp = this.G;
                        arwf arwf2 = apyc.b;
                        if (arwf2 == null) {
                            arwf2 = arwf.c;
                        }
                        arwh a3 = arwh.a(arwf2.b);
                        if (a3 == null) {
                            a3 = arwh.UNKNOWN;
                        }
                        Drawable drawable = resources.getDrawable(akvp.a(a3));
                        drawable.setBounds(0, 0, 50, 50);
                        this.aE.setCompoundDrawablesRelative(null, null, drawable, null);
                        this.aE.setCompoundDrawablePadding(this.a.getResources().getDimensionPixelSize(R.dimen.comment_author_text_icon_gap));
                    }
                }
                view = this.aF;
                if (view != null) {
                    view.setVisibility(0);
                }
            }
            view = this.aP;
            if (view != null) {
                view.setVisibility(this.aH.getText().length() > 0 ? 0 : 8);
            }
        } else {
            i = 0;
        }
        FrameLayout frameLayout = this.aD;
        int i3 = i == 0 ? 8 : 0;
        frameLayout.setVisibility(i3);
        this.aN.setVisibility(i3);
        ViewGroup viewGroup = this.aM;
        if (i == 0) {
            i2 = 0;
        }
        viewGroup.setVisibility(i2);
        return obj2;
    }

    private final void d(ajsn ajsn) {
        ajsu ajsu = ajsn.q;
        Object obj = ajsu != null ? ajsu.a : null;
        if (obj == null) {
            this.aS.setVisibility(8);
            if (wih.j(ajsn) != null) {
                a(true);
            }
            return;
        }
        akor a = this.aV.a(this.bb);
        a.a("creatorReplyParentComment", this.D);
        a.a("indentedComment", Boolean.valueOf(true));
        this.aS.addView((ViewGroup) this.aV.a(a, obj), 0);
        this.aS.setVisibility(0);
        a(false);
    }

    private final void a(boolean z) {
        int i = !z ? 4 : 0;
        this.at.setVisibility(i);
        this.at.setClickable(z);
        TextView textView = this.au;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    private static apzm e(ajsn ajsn) {
        apzo apzo = ajsn.x;
        if (apzo == null || (apzo.a & 1) == 0) {
            return null;
        }
        apzm apzm = apzo.b;
        if (apzm == null) {
            apzm = apzm.f;
        }
        return apzm;
    }

    public final void a(View view) {
        if (view.getVisibility() == 0) {
            int i = this.P;
            int i2 = this.g;
            wlj.a(view, i, i2, i, i2);
        }
    }

    private final boolean a(aphj aphj, ImageView imageView, acvx acvx, Map map) {
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        if ((aphg.a & 16) == 0) {
            imageView.setVisibility(4);
            imageView.setOnClickListener(null);
            return false;
        }
        akvp akvp = this.G;
        arwf arwf = aphg.e;
        if (arwf == null) {
            arwf = arwf.c;
        }
        arwh a = arwh.a(arwf.b);
        if (a == null) {
            a = arwh.UNKNOWN;
        }
        imageView.setImageResource(akvp.a(a));
        imageView.setVisibility(0);
        aodx aodx = aphg.q;
        if (aodx == null) {
            aodx = aodx.c;
        }
        wih.a((View) imageView, aodx);
        imageView.setOnClickListener(new wip(this, aphg, acvx, map));
        return true;
    }

    public final void a(aqrn aqrn) {
        this.q.getLayoutParams().width = this.X;
        this.q.getLayoutParams().height = this.X;
        this.q.setImageBitmap(null);
        aygk aygk = ((aqro) aqrn.instance).b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        Uri b = aklb.b(aygk, this.X);
        if (b != null) {
            int i;
            this.q.setTag(b);
            this.E.a(this.q, b);
            if (aqrn.a().a != 118483990) {
                i = this.Y;
            } else {
                apfb apfb;
                aqrk a = aqrn.a();
                if (a.a == 118483990) {
                    apfb = (apfb) a.b;
                } else {
                    apfb = apfb.f;
                }
                i = apfb.c;
            }
            Drawable drawable = this.a.getResources().getDrawable(R.drawable.ic_favorite_outlined_13);
            drawable.mutate();
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            i = Color.alpha(i);
            drawable.setColorFilter(new ColorMatrixColorFilter(new float[]{((float) red) / 255.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, ((float) green) / 255.0f, -1.0f, 0.0f, 255.0f, -1.0f, 0.0f, ((float) blue) / 255.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, ((float) i) / 255.0f, 0.0f}));
            this.ap.setImageDrawable(drawable);
        }
    }

    private final void b() {
        TextView textView = this.au;
        if (!(textView == null || textView.getVisibility() == 0)) {
            this.au.setVisibility(4);
        }
        ImageView imageView = this.an;
        int i = this.h;
        int i2 = this.g;
        wlj.a(imageView, i, i2, this.i, i2);
    }

    public final void b(aqrn aqrn) {
        View view = this.p;
        aodx aodx = ((aqro) aqrn.instance).j;
        if (aodx == null) {
            aodx = aodx.c;
        }
        wih.a(view, aodx);
        this.p.setVisibility(0);
        this.q.setVisibility(0);
        this.ap.setVisibility(0);
        this.ao.setVisibility(8);
    }

    public final void c(aqrn aqrn) {
        View view = this.p;
        aodx aodx = ((aqro) aqrn.instance).k;
        if (aodx == null) {
            aodx = aodx.c;
        }
        wih.a(view, aodx);
        this.p.setVisibility(0);
        this.ao.setVisibility(0);
        this.q.setVisibility(8);
        this.ap.setVisibility(8);
    }

    private static void a(View view, aodx aodx) {
        if (aodx == null || (aodx.a & 1) == 0) {
            view.setContentDescription("");
            return;
        }
        aodv aodv = aodx.b;
        if (aodv == null) {
            aodv = aodv.c;
        }
        view.setContentDescription(aodv.b);
    }

    private final void a(StringBuilder stringBuilder, ajsn ajsn) {
        ajrn ajrn = ajsn.k;
        awly awly = ajrn != null ? ajrn.d : null;
        if (awly != null) {
            stringBuilder.append(this.aG.getText().toString());
            String str = ". ";
            stringBuilder.append(str);
            for (awlw awlw : awly.c) {
                arml arml;
                arml arml2;
                if ((awlw.a & 1) != 0) {
                    arml = awlw.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                stringBuilder.append(ajqy.a(arml));
                stringBuilder.append(str);
                if ((awlw.a & 32) != 0) {
                    arml2 = awlw.g;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                Spanned a = ajqy.a(arml2);
                if (!TextUtils.isEmpty(a)) {
                    stringBuilder.append(a);
                    stringBuilder.append(str);
                }
            }
        }
    }

    private final String f(ajsn ajsn) {
        apyg apyg = ajsn.s;
        if (apyg != null) {
            apyc apyc = apyg.c;
            if (apyc == null) {
                apyc = apyc.f;
            }
            arml arml = apyc.d;
            if (arml == null) {
                arml = arml.f;
            }
            armn armn = arml.e;
            if (armn == null) {
                armn = armn.c;
            }
            if ((armn.a & 1) != 0) {
                apyc apyc2 = ajsn.s.c;
                if (apyc2 == null) {
                    apyc2 = apyc.f;
                }
                arml arml2 = apyc2.d;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                armn armn2 = arml2.e;
                if (armn2 == null) {
                    armn2 = armn.c;
                }
                aodv aodv = armn2.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                return aodv.b;
            }
        }
        return this.aq.getText().toString();
    }

    private static CharSequence g(ajsn ajsn) {
        apyg apyg = ajsn.C;
        if (apyg == null || (apyg.a & 8) == 0) {
            return "";
        }
        arml arml;
        apym apym = apyg.e;
        if (apym == null) {
            apym = apym.f;
        }
        if ((apym.a & 2) != 0) {
            arml = apym.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        return ajqy.a(arml);
    }

    private static String h(ajsn ajsn) {
        arml arml = ajsn.m;
        if (!(arml == null || (arml.a & 4) == 0)) {
            armn armn = arml.e;
            if (armn == null) {
                armn = armn.c;
            }
            if ((armn.a & 1) != 0) {
                armn armn2 = ajsn.m.e;
                if (armn2 == null) {
                    armn2 = armn.c;
                }
                aodv aodv = armn2.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                return aodv.b;
            }
        }
        return "";
    }

    private static String i(ajsn ajsn) {
        aphg j = wih.j(ajsn);
        if (j != null) {
            arml arml = j.g;
            if (arml == null) {
                arml = arml.f;
            }
            armn armn = arml.e;
            if (armn == null) {
                armn = armn.c;
            }
            aodv aodv = armn.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            if ((aodv.a & 2) != 0) {
                arml arml2 = j.g;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
                armn armn2 = arml2.e;
                if (armn2 == null) {
                    armn2 = armn.c;
                }
                aodv aodv2 = armn2.b;
                if (aodv2 == null) {
                    aodv2 = aodv.c;
                }
                return aodv2.b;
            }
        }
        return "";
    }

    private static aphg j(ajsn ajsn) {
        ajsk ajsk = ajsn.h;
        ajsh ajsh = ajsk != null ? ajsk.a : null;
        if (ajsh != null) {
            aphj aphj = ajsh.b;
            if (!(aphj == null || (aphj.a & 1) == 0)) {
                aphg aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                return aphg;
            }
        }
        return null;
    }

    private static String k(ajsn ajsn) {
        ajsk ajsk = ajsn.h;
        aqro aqro = null;
        ajsh ajsh = ajsk != null ? ajsk.a : null;
        if (ajsh != null) {
            aqrq aqrq = ajsh.d;
            if (aqrq != null) {
                aqro = aqrq.b;
                if (aqro == null) {
                    aqro = aqro.l;
                }
            }
        }
        if (!(aqro == null || !aqro.f || aqro.g || (aqro.a & 2048) == 0)) {
            aodx aodx = aqro.j;
            if (aodx == null) {
                aodx = aodx.c;
            }
            if ((aodx.a & 1) != 0) {
                aodx = aqro.j;
                if (aodx == null) {
                    aodx = aodx.c;
                }
                aodv aodv = aodx.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                return aodv.b;
            }
        }
        return "";
    }

    public final View K_() {
        return this.ad;
    }

    public final void a(akpb akpb) {
        this.aX.a();
        this.n.setClickable(false);
        wek wek = this.H;
        Object obj = this.D;
        xsb.b(wek.b, obj, this);
        xsb.a(wek.b, obj);
        this.I.a((wmc) this);
        TextView textView = this.r;
        if (!(textView == null || this.m == null)) {
            textView.getViewTreeObserver().removeOnPreDrawListener(this.m);
            this.m = null;
        }
        ViewGroup viewGroup = this.as;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        viewGroup = this.t;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        textView = this.aT;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this.aV.a(this.y);
        this.aV.a(this.aQ);
        this.aV.a(this.aR);
        this.aV.a(this.aD);
        this.aV.a(this.aS);
        this.aU.setVisibility(8);
        Animator animator = this.ag;
        if (animator != null && animator.isRunning()) {
            this.ag.end();
        }
        this.ag = null;
    }

    public final void a(ajsn ajsn) {
        this.aV.a(this.aS);
        d(ajsn);
    }

    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0779  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0777  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x097c  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x095d  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x09fe  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a3a  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a61  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0a44  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ab4  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0ad9  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0b1c  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0b2d  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0b3b  */
    /* JADX WARNING: Removed duplicated region for block: B:484:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x095d  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x097c  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x09fe  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a3a  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0a44  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a61  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ab4  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0ad9  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0b1c  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0b2d  */
    /* JADX WARNING: Removed duplicated region for block: B:484:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0b3b  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x097c  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x095d  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x09fe  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a3a  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a61  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0a44  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ab4  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0ad9  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0b1c  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0b2d  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0b3b  */
    /* JADX WARNING: Removed duplicated region for block: B:484:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x095d  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x097c  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x09fe  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a3a  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0a44  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a61  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ab4  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0ad9  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0b1c  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0b2d  */
    /* JADX WARNING: Removed duplicated region for block: B:484:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0b3b  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x097c  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x095d  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x09fe  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a3a  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a61  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0a44  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ab4  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0ad9  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0b1c  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0b2d  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0b3b  */
    /* JADX WARNING: Removed duplicated region for block: B:484:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x095d  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x097c  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x09fe  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a3a  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0a44  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a61  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ab4  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0ad9  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0b1c  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0b2d  */
    /* JADX WARNING: Removed duplicated region for block: B:484:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0b3b  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x097c  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x095d  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x09fe  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a3a  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a61  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0a44  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ab4  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0ad9  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0b1c  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0b2d  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0b3b  */
    /* JADX WARNING: Removed duplicated region for block: B:484:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03f7  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x043d  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04d3  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0564  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0567  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0581  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x059c  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x05f1  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x05f4  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05f7  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0883  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08fe  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0947  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0953  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x095d  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x097c  */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x09fe  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0a37  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0a3a  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0a44  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0a61  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:460:0x0ab4  */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0ad9  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x0b1c  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0b2d  */
    /* JADX WARNING: Removed duplicated region for block: B:484:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0b3b  */
    /* JADX WARNING: Missing block: B:98:0x01fb, code skipped:
            if (r0.equals(r7.g) != false) goto L_0x0245;
     */
    public final /* synthetic */ void a_(defpackage.akor r26, java.lang.Object r27) {
        /*
        r25 = this;
        r6 = r25;
        r0 = r26;
        r7 = r27;
        r7 = (defpackage.ajsn) r7;
        r6.D = r7;
        r6.bb = r0;
        r6.c(r7);
        r1 = r6.aX;
        r1.a();
        r1 = r6.aY;
        r2 = r6.r;
        r1.a = r2;
        r15 = r0.a;
        r1 = r7.j;
        r14 = 0;
        r15.a(r1, r14);
        r1 = "sectionController";
        r1 = r0.a(r1);
        r9 = r1;
        r9 = (defpackage.akvy) r9;
        r1 = "commentThreadMutator";
        r2 = r0.a(r1);
        r2 = (defpackage.wei) r2;
        r3 = "creatorReplyParentComment";
        r3 = r0.b(r3, r14);
        r3 = (defpackage.ajsn) r3;
        r8 = r6.J;
        if (r3 == 0) goto L_0x0041;
    L_0x003f:
        r11 = r3;
        goto L_0x0042;
    L_0x0041:
        r11 = r7;
    L_0x0042:
        r5 = 1;
        r4 = 0;
        if (r3 == 0) goto L_0x0048;
    L_0x0046:
        r13 = 1;
        goto L_0x0049;
    L_0x0048:
        r13 = 0;
    L_0x0049:
        r10 = r2;
        r12 = r15;
        r12 = r8.a(r9, r10, r11, r12, r13);
        r3 = new java.util.HashMap;
        r3.<init>();
        r8 = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        r3.put(r8, r12);
        r0 = r26.b();
        r3.putAll(r0);
        r0 = r7.v;
        if (r0 == 0) goto L_0x0072;
    L_0x0064:
        r0 = r0.length;
        if (r0 <= 0) goto L_0x0072;
    L_0x0067:
        r0 = r6.d;
        r8 = r6.D;
        r8 = r8.v;
        r0.a(r8, r12);
        r7.v = r14;
    L_0x0072:
        r0 = r6.n;
        r8 = r6.L;
        r0.setMinimumHeight(r8);
        r0 = r6.n;
        r8 = r0.getPaddingLeft();
        r9 = r6.V;
        r10 = r6.n;
        r10 = r10.getPaddingRight();
        r0.setPadding(r8, r9, r10, r4);
        r0 = r6.D;
        r0 = r0.H;
        r13 = 3;
        if (r0 != r13) goto L_0x0094;
    L_0x0091:
        r0 = r6.aa;
        goto L_0x0096;
    L_0x0094:
        r0 = r6.Z;
    L_0x0096:
        r8 = r6.n;
        r8.setBackgroundColor(r0);
        r8 = r6.D;
        r8 = r8.E;
        if (r8 == 0) goto L_0x00b4;
    L_0x00a1:
        r8 = r6.n;
        r9 = r6.ab;
        r0 = defpackage.wly.a(r8, r0, r9);
        r6.ag = r0;
        r0 = r6.ag;
        r0.start();
        r0 = r6.D;
        r0.E = r4;
    L_0x00b4:
        r0 = r7.n;
        if (r0 == 0) goto L_0x00c1;
    L_0x00b8:
        r0 = r6.n;
        r8 = r0.getBackground();
        defpackage.xpr.a(r0, r8);
    L_0x00c1:
        r0 = r6.n;
        r8 = new wig;
        r8.<init>(r6, r7, r3, r15);
        r0.setOnClickListener(r8);
        r0 = r7.i;
        r0 = defpackage.ajqy.a(r0);
        r8 = android.text.TextUtils.isEmpty(r0);
        r11 = "";
        r10 = 8;
        if (r8 == 0) goto L_0x00e6;
    L_0x00db:
        r0 = r6.ay;
        r0.setText(r11);
        r0 = r6.ay;
        r0.setVisibility(r10);
        goto L_0x0127;
    L_0x00e6:
        r8 = r6.ay;
        r8.setText(r0);
        r0 = r6.ay;
        r0.setVisibility(r4);
        r0 = r6.bb;
        r0 = defpackage.wih.a(r0);
        if (r0 == 0) goto L_0x0110;
    L_0x00f8:
        r0 = r6.n;
        r8 = r0.getPaddingLeft();
        r9 = r6.W;
        r13 = r6.n;
        r13 = r13.getPaddingRight();
        r14 = r6.n;
        r14 = r14.getPaddingBottom();
        r0.setPadding(r8, r9, r13, r14);
        goto L_0x0127;
    L_0x0110:
        r0 = r6.n;
        r8 = r0.getPaddingLeft();
        r9 = r6.V;
        r13 = r6.n;
        r13 = r13.getPaddingRight();
        r14 = r6.n;
        r14 = r14.getPaddingBottom();
        r0.setPadding(r8, r9, r13, r14);
    L_0x0127:
        r0 = r7.o;
        r14 = 2;
        if (r0 != 0) goto L_0x012d;
    L_0x012c:
        goto L_0x0159;
    L_0x012d:
        r8 = r0.a;
        r8 = r8 & r5;
        if (r8 == 0) goto L_0x0159;
    L_0x0132:
        r0 = r0.b;
        if (r0 != 0) goto L_0x0138;
    L_0x0136:
        r0 = defpackage.apyi.c;
    L_0x0138:
        r8 = r6.aw;
        r8.setVisibility(r4);
        r8 = r6.ax;
        r9 = r0.a;
        r9 = r9 & r14;
        if (r9 == 0) goto L_0x014b;
    L_0x0144:
        r0 = r0.b;
        if (r0 != 0) goto L_0x014c;
    L_0x0148:
        r0 = defpackage.arml.f;
        goto L_0x014c;
    L_0x014b:
        r0 = 0;
    L_0x014c:
        r0 = defpackage.ajqy.a(r0);
        r8.setText(r0);
        r0 = r6.ax;
        r0.setVisibility(r4);
        goto L_0x0169;
    L_0x0159:
        r0 = r6.aw;
        r0.setVisibility(r10);
        r0 = r6.ax;
        r0.setVisibility(r10);
        r0 = r6.ax;
        r8 = 0;
        r0.setText(r8);
    L_0x0169:
        r0 = 5;
        r6.l = r0;
        r0 = r7.z;
        r13 = 4;
        if (r0 != 0) goto L_0x0172;
    L_0x0171:
        goto L_0x019f;
    L_0x0172:
        r0 = r0.b;
        r0 = defpackage.aqac.a(r0);
        if (r0 == 0) goto L_0x019f;
    L_0x017a:
        r8 = 3;
        if (r0 != r8) goto L_0x019f;
    L_0x017d:
        r0 = r7.k;
        if (r0 != 0) goto L_0x0185;
    L_0x0181:
        r0 = 6;
        r6.l = r0;
        goto L_0x019f;
    L_0x0185:
        r8 = r0.e;
        if (r8 != 0) goto L_0x019d;
    L_0x0189:
        r8 = r0.a;
        if (r8 != 0) goto L_0x019d;
    L_0x018d:
        r8 = r0.b;
        if (r8 != 0) goto L_0x019d;
    L_0x0191:
        r8 = r0.c;
        if (r8 == 0) goto L_0x0196;
    L_0x0195:
        goto L_0x019d;
    L_0x0196:
        r0 = r0.d;
        if (r0 == 0) goto L_0x019f;
    L_0x019a:
        r6.l = r13;
        goto L_0x019f;
    L_0x019d:
        r6.l = r14;
    L_0x019f:
        r2 = r2.a();
        r0 = r7.k;
        if (r0 == 0) goto L_0x01af;
    L_0x01a7:
        r0 = r0.d;
        if (r0 != 0) goto L_0x01ac;
    L_0x01ab:
        goto L_0x01af;
    L_0x01ac:
        r19 = 1;
        goto L_0x01b1;
    L_0x01af:
        r19 = 0;
    L_0x01b1:
        r0 = r7.z;
        if (r0 == 0) goto L_0x01c5;
    L_0x01b5:
        r0 = r0.b;
        r0 = defpackage.aqac.a(r0);
        if (r0 != 0) goto L_0x01be;
    L_0x01bd:
        goto L_0x01c5;
    L_0x01be:
        r8 = 3;
        if (r0 == r8) goto L_0x01c2;
    L_0x01c1:
        goto L_0x01c5;
    L_0x01c2:
        r20 = 1;
        goto L_0x01c7;
    L_0x01c5:
        r20 = 0;
    L_0x01c7:
        r0 = r7.p;
        if (r0 != 0) goto L_0x01cd;
    L_0x01cb:
        goto L_0x0245;
    L_0x01cd:
        r0 = r0.a;
        r0 = r0 & r5;
        if (r0 == 0) goto L_0x0245;
    L_0x01d2:
        if (r2 != 0) goto L_0x01d5;
    L_0x01d4:
        goto L_0x01fd;
    L_0x01d5:
        r0 = r6.bb;
        r0 = r0.a(r1);
        r0 = (defpackage.wei) r0;
        if (r0 == 0) goto L_0x01e4;
    L_0x01df:
        r0 = r0.b();
        goto L_0x01e5;
    L_0x01e4:
        r0 = 0;
    L_0x01e5:
        if (r0 == 0) goto L_0x01ee;
    L_0x01e7:
        r0 = r0.a;
        if (r0 == 0) goto L_0x01ee;
    L_0x01eb:
        r0 = r0.a;
        goto L_0x01ef;
    L_0x01ee:
        r0 = 0;
    L_0x01ef:
        if (r0 == 0) goto L_0x01fd;
    L_0x01f1:
        r0 = r0.g;
        if (r0 == 0) goto L_0x01fd;
    L_0x01f5:
        r1 = r7.g;
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0245;
    L_0x01fd:
        if (r19 == 0) goto L_0x0201;
    L_0x01ff:
        if (r20 == 0) goto L_0x0245;
    L_0x0201:
        r6.a(r7, r5);
        r0 = new wis;
        r0.<init>(r6, r7);
        r6.m = r0;
        r0 = r6.r;
        r0 = r0.getViewTreeObserver();
        r1 = r6.m;
        r0.addOnPreDrawListener(r1);
        r0 = r7.p;
        r0 = r0.b;
        if (r0 != 0) goto L_0x021e;
    L_0x021c:
        r0 = defpackage.aphg.s;
    L_0x021e:
        r1 = r6.s;
        r8 = r0.a;
        r8 = r8 & 128;
        if (r8 == 0) goto L_0x022d;
    L_0x0226:
        r8 = r0.g;
        if (r8 != 0) goto L_0x022e;
    L_0x022a:
        r8 = defpackage.arml.f;
        goto L_0x022e;
    L_0x022d:
        r8 = 0;
    L_0x022e:
        r8 = defpackage.ajqy.a(r8);
        r1.setText(r8);
        r1 = r6.s;
        r1.setVisibility(r10);
        r1 = r6.s;
        r8 = new wil;
        r8.<init>(r6, r0, r15, r7);
        r1.setOnClickListener(r8);
        goto L_0x0248;
    L_0x0245:
        r6.b(r7);
    L_0x0248:
        r0 = r6.av;
        r1 = r7.e;
        r1 = defpackage.ajqy.a(r1);
        r0.setText(r1);
        r0 = r7.a;
        if (r0 == 0) goto L_0x0392;
    L_0x0257:
        r0 = r6.aq;
        r1 = r6.D;
        r1 = r1.a;
        r1 = defpackage.ajqy.a(r1);
        r0.setText(r1);
        r0 = r6.aq;
        r1 = r6.ac;
        r0.setTextColor(r1);
        r0 = r6.aq;
        r1 = r6.Z;
        r0.setBackgroundColor(r1);
        r0 = r6.aq;
        r1 = 0;
        r0.setBackgroundDrawable(r1);
        r0 = r6.aq;
        r0.setPadding(r4, r4, r4, r4);
        r0 = r6.aq;
        r0.setCompoundDrawablePadding(r4);
        r0 = r6.aq;
        defpackage.adl.a(r0, r1, r1, r1);
        r0 = r7.s;
        if (r0 != 0) goto L_0x028d;
    L_0x028b:
        goto L_0x0385;
    L_0x028d:
        r1 = r0.a;
        r1 = r1 & r14;
        if (r1 == 0) goto L_0x0385;
    L_0x0292:
        r0 = r0.c;
        if (r0 != 0) goto L_0x0298;
    L_0x0296:
        r0 = defpackage.apyc.f;
    L_0x0298:
        r1 = r0.a;
        r1 = r1 & r10;
        if (r1 == 0) goto L_0x02a4;
    L_0x029d:
        r1 = r0.d;
        if (r1 != 0) goto L_0x02a5;
    L_0x02a1:
        r1 = defpackage.arml.f;
        goto L_0x02a5;
    L_0x02a4:
        r1 = 0;
    L_0x02a5:
        r1 = defpackage.ajqy.a(r1);
        r8 = android.text.TextUtils.isEmpty(r1);
        if (r8 != 0) goto L_0x02b4;
    L_0x02af:
        r8 = r6.aq;
        r8.setText(r1);
    L_0x02b4:
        r1 = r0.a;
        r1 = r1 & r13;
        if (r1 == 0) goto L_0x02ed;
    L_0x02b9:
        r1 = r0.c;
        if (r1 != 0) goto L_0x02bf;
    L_0x02bd:
        r1 = defpackage.apye.c;
    L_0x02bf:
        r8 = r1.a;
        r9 = 118483990; // 0x70fec16 float:1.0827504E-34 double:5.8538869E-316;
        if (r8 != r9) goto L_0x02cb;
    L_0x02c6:
        r1 = r1.b;
        r1 = (defpackage.apfb) r1;
        goto L_0x02cd;
    L_0x02cb:
        r1 = defpackage.apfb.f;
    L_0x02cd:
        r8 = r6.a;
        r8 = r8.getResources();
        r9 = 2130837853; // 0x7f02015d float:1.7280672E38 double:1.05277378E-314;
        r8 = r8.getDrawable(r9);
        r9 = r1.b;
        r14 = android.graphics.PorterDuff.Mode.SRC_IN;
        r8.setColorFilter(r9, r14);
        r9 = r6.aq;
        r9.setBackgroundDrawable(r8);
        r8 = r6.aq;
        r1 = r1.c;
        r8.setTextColor(r1);
    L_0x02ed:
        r1 = r6.aq;
        r1 = r1.getCurrentTextColor();
        r8 = r0.a;
        r8 = r8 & r5;
        if (r8 == 0) goto L_0x0385;
    L_0x02f8:
        r8 = r0.b;
        if (r8 != 0) goto L_0x02fe;
    L_0x02fc:
        r8 = defpackage.arwf.c;
    L_0x02fe:
        r8 = r8.b;
        r8 = defpackage.arwh.a(r8);
        if (r8 != 0) goto L_0x0308;
    L_0x0306:
        r8 = defpackage.arwh.UNKNOWN;
    L_0x0308:
        r9 = defpackage.arwh.CHECK;
        r14 = 2131624489; // 0x7f0e0229 float:1.887616E38 double:1.05316243E-314;
        if (r8 != r9) goto L_0x031d;
    L_0x030f:
        r0 = r6.a;
        r0 = r0.getResources();
        r8 = 2130838050; // 0x7f020222 float:1.7281071E38 double:1.0527738774E-314;
        r0 = r0.getDrawable(r8);
        goto L_0x0362;
    L_0x031d:
        r8 = r0.b;
        if (r8 != 0) goto L_0x0323;
    L_0x0321:
        r8 = defpackage.arwf.c;
    L_0x0323:
        r8 = r8.b;
        r8 = defpackage.arwh.a(r8);
        if (r8 != 0) goto L_0x032d;
    L_0x032b:
        r8 = defpackage.arwh.UNKNOWN;
    L_0x032d:
        r9 = defpackage.arwh.CHECK_CIRCLE_THICK;
        if (r8 != r9) goto L_0x033f;
    L_0x0331:
        r0 = r6.a;
        r0 = r0.getResources();
        r8 = 2130838982; // 0x7f0205c6 float:1.7282962E38 double:1.052774338E-314;
        r0 = r0.getDrawable(r8);
        goto L_0x0362;
    L_0x033f:
        r8 = r6.a;
        r8 = r8.getResources();
        r9 = r6.G;
        r0 = r0.b;
        if (r0 != 0) goto L_0x034d;
    L_0x034b:
        r0 = defpackage.arwf.c;
    L_0x034d:
        r0 = r0.b;
        r0 = defpackage.arwh.a(r0);
        if (r0 != 0) goto L_0x0357;
    L_0x0355:
        r0 = defpackage.arwh.UNKNOWN;
    L_0x0357:
        r0 = r9.a(r0);
        r0 = r8.getDrawable(r0);
        r14 = 2131624488; // 0x7f0e0228 float:1.8876157E38 double:1.0531624294E-314;
    L_0x0362:
        r8 = r6.U;
        r0.setBounds(r4, r4, r8, r8);
        r8 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        if (r1 == r8) goto L_0x0370;
    L_0x036b:
        r8 = android.graphics.PorterDuff.Mode.SRC_IN;
        r0.setColorFilter(r1, r8);
    L_0x0370:
        r1 = r6.aq;
        r8 = 0;
        r1.setCompoundDrawablesRelative(r8, r8, r0, r8);
        r0 = r6.aq;
        r1 = r6.a;
        r1 = r1.getResources();
        r1 = r1.getDimensionPixelSize(r14);
        r0.setCompoundDrawablePadding(r1);
    L_0x0385:
        r0 = r6.aq;
        r0.setVisibility(r4);
        r0 = r6.aO;
        if (r0 == 0) goto L_0x039e;
    L_0x038e:
        r0.setVisibility(r4);
        goto L_0x039e;
    L_0x0392:
        r0 = r6.aq;
        r0.setVisibility(r10);
        r0 = r6.aO;
        if (r0 == 0) goto L_0x039e;
    L_0x039b:
        r0.setVisibility(r10);
    L_0x039e:
        r0 = r6.az;
        r0.setVisibility(r10);
        r0 = r7.A;
        if (r0 != 0) goto L_0x03a9;
    L_0x03a7:
        r14 = 0;
        goto L_0x03f1;
    L_0x03a9:
        r1 = r0.a;
        r1 = r1 & r13;
        if (r1 == 0) goto L_0x03a7;
    L_0x03ae:
        r0 = r0.d;
        if (r0 != 0) goto L_0x03b4;
    L_0x03b2:
        r0 = defpackage.apyk.f;
    L_0x03b4:
        r1 = r0.b;
        if (r1 == r13) goto L_0x03d8;
    L_0x03b8:
        r8 = r6.az;
        if (r1 != r5) goto L_0x03c2;
    L_0x03bc:
        r1 = r0.c;
        r14 = r1;
        r14 = (defpackage.arwf) r14;
        goto L_0x03c3;
    L_0x03c2:
        r14 = 0;
    L_0x03c3:
        r1 = r0.a;
        r1 = r1 & r10;
        if (r1 == 0) goto L_0x03cf;
    L_0x03c8:
        r0 = r0.e;
        if (r0 != 0) goto L_0x03d0;
    L_0x03cc:
        r0 = defpackage.apye.c;
        goto L_0x03d0;
    L_0x03cf:
        r0 = 0;
    L_0x03d0:
        r1 = 2130772009; // 0x7f010029 float:1.7147124E38 double:1.052741249E-314;
        r6.a(r8, r14, r0, r1);
        r14 = 0;
        goto L_0x03ec;
    L_0x03d8:
        r1 = r6.az;
        r0 = r0.c;
        r0 = (defpackage.aygk) r0;
        r14 = 0;
        r1.setColorFilter(r14);
        r8 = r6.E;
        r8.a(r1);
        r8 = r6.E;
        r8.a(r1, r0);
    L_0x03ec:
        r0 = r6.az;
        r0.setVisibility(r4);
    L_0x03f1:
        r0 = r7.C;
        if (r0 != 0) goto L_0x03f7;
    L_0x03f5:
        r0 = r14;
        goto L_0x0402;
    L_0x03f7:
        r1 = r0.a;
        r1 = r1 & r10;
        if (r1 == 0) goto L_0x03f5;
    L_0x03fc:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0402;
    L_0x0400:
        r0 = defpackage.apym.f;
    L_0x0402:
        r1 = r6.aA;
        r8 = r6.aC;
        r9 = r6.aB;
        r6.a(r0, r1, r8, r9);
        r1 = r6.aJ;
        r8 = r6.aL;
        r9 = r6.aK;
        r6.a(r0, r1, r8, r9);
        r0 = r7.f;
        if (r0 != 0) goto L_0x041a;
    L_0x0418:
        r0 = r14;
        goto L_0x0425;
    L_0x041a:
        r1 = r0.a;
        r1 = r1 & r5;
        if (r1 == 0) goto L_0x0418;
    L_0x041f:
        r0 = r0.b;
        if (r0 != 0) goto L_0x0425;
    L_0x0423:
        r0 = defpackage.auvn.l;
    L_0x0425:
        r1 = r6.o;
        r1 = r1.getLayoutParams();
        r1 = (android.widget.RelativeLayout.LayoutParams) r1;
        r8 = 2131755661; // 0x7f10028d float:1.9142208E38 double:1.0532272374E-314;
        r9 = 3;
        r1.addRule(r9, r8);
        r8 = r6.o;
        r8.setLayoutParams(r1);
        r1 = r6.o;
        if (r0 != 0) goto L_0x0440;
    L_0x043d:
        r8 = 8;
        goto L_0x0441;
    L_0x0440:
        r8 = 0;
    L_0x0441:
        r1.setVisibility(r8);
        r1 = r6.o;
        if (r0 != 0) goto L_0x044a;
    L_0x0448:
        r8 = r14;
        goto L_0x0450;
    L_0x044a:
        r8 = r0.h;
        if (r8 != 0) goto L_0x0450;
    L_0x044e:
        r8 = defpackage.aodx.c;
    L_0x0450:
        defpackage.wih.a(r1, r8);
        r8 = r6.F;
        r1 = r6.n;
        r10 = r6.o;
        r17 = 3;
        r9 = r1;
        r1 = 8;
        r21 = r11;
        r11 = r0;
        r5 = 3;
        r13 = r15;
        r8.a(r9, r10, r11, r12, r13);
        r8 = r6.B;
        r13 = 102716411; // 0x61f53fb float:2.9966275E-35 double:5.074865E-316;
        if (r8 == 0) goto L_0x0479;
    L_0x046d:
        r0 = r6.n;
        r0 = r0.getViewTreeObserver();
        r8 = r6.z;
        r0.removeOnScrollChangedListener(r8);
        goto L_0x04ac;
    L_0x0479:
        if (r0 == 0) goto L_0x0493;
    L_0x047b:
        r8 = r0.a;
        r8 = r8 & 128;
        if (r8 == 0) goto L_0x0493;
    L_0x0481:
        r8 = r0.g;
        if (r8 != 0) goto L_0x0487;
    L_0x0485:
        r8 = defpackage.auvh.c;
    L_0x0487:
        r9 = r8.a;
        if (r9 != r13) goto L_0x0490;
    L_0x048b:
        r8 = r8.b;
        r8 = (defpackage.aruh) r8;
        goto L_0x0494;
    L_0x0490:
        r8 = defpackage.aruh.j;
        goto L_0x0494;
    L_0x0493:
        r8 = r14;
    L_0x0494:
        if (r8 == 0) goto L_0x04ac;
    L_0x0496:
        r9 = new wik;
        r9.<init>(r6, r8, r0, r15);
        r6.z = r9;
        r0 = r6.B;
        if (r0 != 0) goto L_0x04ac;
    L_0x04a1:
        r0 = r6.n;
        r0 = r0.getViewTreeObserver();
        r8 = r6.z;
        r0.addOnScrollChangedListener(r8);
    L_0x04ac:
        r0 = r6.y;
        r0.setClickable(r4);
        r0 = r6.y;
        r0.removeAllViews();
        r0 = r6.y;
        r0.setVisibility(r1);
        r0 = r6.y;
        r8 = r0.getLayoutParams();
        r8 = (android.widget.RelativeLayout.LayoutParams) r8;
        r9 = 2131755659; // 0x7f10028b float:1.9142204E38 double:1.0532272364E-314;
        r8.addRule(r5, r9);
        r0.setLayoutParams(r8);
        r0 = r7.k;
        if (r0 == 0) goto L_0x04d3;
    L_0x04d0:
        r0 = r0.e;
        goto L_0x04d4;
    L_0x04d3:
        r0 = r14;
    L_0x04d4:
        r8 = "postsV2FullThumbnailStyle";
        if (r0 == 0) goto L_0x054a;
    L_0x04d8:
        r9 = r6.aV;
        r10 = r6.bb;
        r9 = r9.a(r10);
        r10 = r6.ae;
        if (r10 == 0) goto L_0x0506;
    L_0x04e4:
        r10 = r6.r;
        r10 = r10.getVisibility();
        if (r10 == 0) goto L_0x04fd;
    L_0x04ec:
        r10 = r6.y;
        r11 = r10.getLayoutParams();
        r11 = (android.widget.RelativeLayout.LayoutParams) r11;
        r12 = 2131755656; // 0x7f100288 float:1.9142197E38 double:1.053227235E-314;
        r11.addRule(r5, r12);
        r10.setLayoutParams(r11);
    L_0x04fd:
        r10 = 1;
        r11 = java.lang.Boolean.valueOf(r10);
        r9.a(r8, r11);
        goto L_0x0507;
    L_0x0506:
        r10 = 1;
    L_0x0507:
        r11 = r6.aV;
        r0 = r11.a(r9, r0);
        r9 = r6.y;
        r9.addView(r0);
        r0 = r6.y;
        r0.setVisibility(r4);
        r0 = r7.y;
        if (r0 == 0) goto L_0x054a;
    L_0x051b:
        r0 = r6.y;
        r9 = r6.a;
        r9 = r9.getResources();
        r11 = 2131952497; // 0x7f130371 float:1.9541438E38 double:1.0533244873E-314;
        r9 = r9.getString(r11);
        r0.setContentDescription(r9);
        r9 = r6.y;
        r11 = new wim;
        r0 = r11;
        r12 = 8;
        r1 = r25;
        r26 = r2;
        r2 = r7;
        r27 = r3;
        r3 = r15;
        r4 = r27;
        r10 = 3;
        r23 = 1;
        r5 = r26;
        r0.<init>(r1, r2, r3, r4, r5);
        r9.setOnClickListener(r11);
        goto L_0x0553;
    L_0x054a:
        r26 = r2;
        r27 = r3;
        r10 = 3;
        r12 = 8;
        r23 = 1;
    L_0x0553:
        r0 = r6.aQ;
        r0.removeAllViews();
        r0 = r6.aQ;
        r0.setVisibility(r12);
        r0 = r7.k;
        if (r0 == 0) goto L_0x0564;
    L_0x0561:
        r0 = r0.c;
        goto L_0x0565;
    L_0x0564:
        r0 = r14;
    L_0x0565:
        if (r0 == 0) goto L_0x0581;
    L_0x0567:
        r1 = r6.aV;
        r2 = r6.bb;
        r1 = r1.a(r2);
        r2 = r6.aV;
        r0 = r2.a(r1, r0);
        r1 = r6.aQ;
        r1.addView(r0);
        r0 = r6.aQ;
        r1 = 0;
        r0.setVisibility(r1);
        goto L_0x0582;
    L_0x0581:
        r1 = 0;
    L_0x0582:
        r0 = r6.aR;
        r0.removeAllViews();
        r0 = r6.aR;
        r0.setVisibility(r12);
        r0 = r7.k;
        if (r0 == 0) goto L_0x0593;
    L_0x0590:
        r2 = r0.a;
        goto L_0x0594;
    L_0x0593:
        r2 = r14;
    L_0x0594:
        if (r0 == 0) goto L_0x0599;
    L_0x0596:
        r0 = r0.b;
        goto L_0x059a;
    L_0x0599:
        r0 = r14;
    L_0x059a:
        if (r2 == 0) goto L_0x05bc;
    L_0x059c:
        r0 = r6.aV;
        r3 = r6.bb;
        r0 = r0.a(r3);
        r3 = java.lang.Boolean.valueOf(r23);
        r0.a(r8, r3);
        r3 = r6.aV;
        r0 = r3.a(r0, r2);
        r2 = r6.aR;
        r2.addView(r0);
        r0 = r6.aR;
        r0.setVisibility(r1);
        goto L_0x05e8;
    L_0x05bc:
        if (r0 == 0) goto L_0x05e8;
    L_0x05be:
        r2 = r6.aV;
        r3 = r6.bb;
        r2 = r2.a(r3);
        r3 = java.lang.Boolean.valueOf(r23);
        r4 = "postsV2FullToolbarStyle";
        r2.a(r4, r3);
        r3 = java.lang.Boolean.valueOf(r1);
        r4 = "showLineSeparator";
        r2.a(r4, r3);
        r3 = r6.aV;
        r0 = r3.a(r2, r0);
        r2 = r6.aR;
        r2.addView(r0);
        r0 = r6.aR;
        r0.setVisibility(r1);
    L_0x05e8:
        r0 = r26;
        r6.b(r7, r0);
        r2 = r7.h;
        if (r2 == 0) goto L_0x05f4;
    L_0x05f1:
        r2 = r2.a;
        goto L_0x05f5;
    L_0x05f4:
        r2 = r14;
    L_0x05f5:
        if (r2 == 0) goto L_0x07d1;
    L_0x05f7:
        r3 = defpackage.wih.e(r7);
        if (r3 == 0) goto L_0x05ff;
    L_0x05fd:
        goto L_0x07d1;
    L_0x05ff:
        r3 = r2.b;
        if (r3 != 0) goto L_0x0606;
    L_0x0603:
        r3 = r14;
        r5 = 1;
        goto L_0x0614;
    L_0x0606:
        r4 = r3.a;
        r5 = 1;
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x0613;
    L_0x060c:
        r3 = r3.b;
        if (r3 != 0) goto L_0x0614;
    L_0x0610:
        r3 = defpackage.aphg.s;
        goto L_0x0614;
    L_0x0613:
        r3 = r14;
    L_0x0614:
        if (r3 == 0) goto L_0x0657;
    L_0x0616:
        r4 = r6.au;
        if (r4 != 0) goto L_0x061b;
    L_0x061a:
        goto L_0x0631;
    L_0x061b:
        r8 = r3.a;
        r8 = r8 & 128;
        if (r8 != 0) goto L_0x0624;
    L_0x0621:
        r11 = r21;
        goto L_0x062e;
    L_0x0624:
        r8 = r3.g;
        if (r8 != 0) goto L_0x062a;
    L_0x0628:
        r8 = defpackage.arml.f;
    L_0x062a:
        r11 = defpackage.ajqy.a(r8);
    L_0x062e:
        r4.setText(r11);
    L_0x0631:
        r4 = r6.at;
        r8 = r3.a;
        r8 = r8 & 16384;
        if (r8 == 0) goto L_0x0642;
    L_0x0639:
        r8 = r3.p;
        if (r8 != 0) goto L_0x063f;
    L_0x063d:
        r8 = defpackage.aodv.c;
    L_0x063f:
        r11 = r8.b;
        goto L_0x0644;
    L_0x0642:
        r11 = r21;
    L_0x0644:
        r4.setContentDescription(r11);
        r4 = r6.at;
        r8 = new wio;
        r11 = r27;
        r8.<init>(r6, r3, r11);
        r4.setOnClickListener(r8);
        r6.a(r5);
        goto L_0x065c;
    L_0x0657:
        r11 = r27;
        r6.a(r1);
    L_0x065c:
        r8 = r6.e;
        r3 = r6.D;
        r4 = r6.am;
        r9 = r6.an;
        r5 = r6.ar;
        r10 = r6.ae;
        if (r10 != 0) goto L_0x066d;
    L_0x066a:
        r10 = r8.e;
        goto L_0x066f;
    L_0x066d:
        r10 = r8.g;
    L_0x066f:
        r17 = r10;
        r18 = 0;
        r22 = r9;
        r9 = r2;
        r10 = r11;
        r24 = r11;
        r11 = r0;
        r0 = 8;
        r12 = r3;
        r3 = 102716411; // 0x61f53fb float:2.9966275E-35 double:5.074865E-316;
        r13 = r4;
        r4 = 2;
        r14 = r22;
        r26 = r15;
        r15 = r5;
        r16 = r26;
        r8.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
        r5 = r7.w;
        if (r5 != 0) goto L_0x07a9;
    L_0x0690:
        r5 = r2.d;
        if (r5 != 0) goto L_0x0696;
    L_0x0694:
        r14 = 0;
        goto L_0x06a5;
    L_0x0696:
        r5 = r5.b;
        if (r5 != 0) goto L_0x069c;
    L_0x069a:
        r5 = defpackage.aqro.l;
    L_0x069c:
        r5 = r5.toBuilder();
        r5 = (defpackage.anxo) r5;
        r14 = r5;
        r14 = (defpackage.aqrn) r14;
    L_0x06a5:
        if (r14 != 0) goto L_0x06b9;
    L_0x06a7:
        r2 = r6.p;
        r5 = 4;
        r2.setVisibility(r5);
        r2 = r6.p;
        r2.setClickable(r1);
        r9 = r26;
        r8 = r24;
        r0 = 3;
        goto L_0x07af;
    L_0x06b9:
        r5 = 4;
        r8 = r14.c();
        if (r8 == 0) goto L_0x06c9;
    L_0x06c0:
        r6.a(r14);
        r6.b(r14);
    L_0x06c6:
        r9 = r26;
        goto L_0x070b;
    L_0x06c9:
        r6.c(r14);
        r8 = r6.C;
        if (r8 == 0) goto L_0x06dc;
    L_0x06d0:
        r3 = r6.n;
        r3 = r3.getViewTreeObserver();
        r8 = r6.A;
        r3.removeOnScrollChangedListener(r8);
        goto L_0x06c6;
    L_0x06dc:
        r8 = r14.b();
        r8 = r8.a;
        if (r8 != r3) goto L_0x06c6;
    L_0x06e4:
        r8 = r14.b();
        r9 = r8.a;
        if (r9 != r3) goto L_0x06f1;
    L_0x06ec:
        r3 = r8.b;
        r3 = (defpackage.aruh) r3;
        goto L_0x06f3;
    L_0x06f1:
        r3 = defpackage.aruh.j;
    L_0x06f3:
        r8 = new wii;
        r9 = r26;
        r8.<init>(r6, r3, r14, r9);
        r6.A = r8;
        r3 = r6.C;
        if (r3 != 0) goto L_0x070b;
    L_0x0700:
        r3 = r6.n;
        r3 = r3.getViewTreeObserver();
        r8 = r6.A;
        r3.addOnScrollChangedListener(r8);
    L_0x070b:
        r3 = new wiq;
        r8 = r24;
        r3.<init>(r6, r14, r8);
        r10 = r6.ao;
        r10 = r10.getContext();
        r11 = 2130772007; // 0x7f010027 float:1.714712E38 double:1.052741248E-314;
        r11 = defpackage.xwe.a(r10, r11, r1);
        r12 = 2130772283; // 0x7f01013b float:1.714768E38 double:1.052741384E-314;
        r10 = defpackage.xwe.a(r10, r12, r1);
        r12 = new int[r5][];
        r13 = 1;
        r15 = new int[r13];
        r16 = 16842919; // 0x10100a7 float:2.3694026E-38 double:8.3215077E-317;
        r15[r1] = r16;
        r12[r1] = r15;
        r15 = new int[r13];
        r16 = 16842908; // 0x101009c float:2.3693995E-38 double:8.321502E-317;
        r15[r1] = r16;
        r12[r13] = r15;
        r15 = new int[r13];
        r16 = 16842913; // 0x10100a1 float:2.369401E-38 double:8.3215047E-317;
        r15[r1] = r16;
        r12[r4] = r15;
        r15 = new int[r1];
        r0 = 3;
        r12[r0] = r15;
        r15 = new int[r5];
        r15[r1] = r11;
        r15[r13] = r11;
        r15[r4] = r11;
        r15[r0] = r10;
        r10 = r6.ao;
        r10 = r10.getDrawable();
        r10 = defpackage.st.d(r10);
        r11 = new android.content.res.ColorStateList;
        r11.<init>(r12, r15);
        defpackage.st.a(r10, r11);
        r11 = r6.ao;
        r11.setImageDrawable(r10);
        r10 = r6.p;
        r10.setOnClickListener(r3);
        r3 = r6.p;
        r10 = r14.d();
        if (r10 != 0) goto L_0x0779;
    L_0x0777:
        r10 = 2;
        goto L_0x077a;
    L_0x0779:
        r10 = 1;
    L_0x077a:
        r3.setImportantForAccessibility(r10);
        r3 = r2.d;
        r3 = r3.toBuilder();
        r3 = (defpackage.anxo) r3;
        r3 = (defpackage.aqrp) r3;
        r3.copyOnWrite();
        r10 = r3.instance;
        r10 = (defpackage.aqrq) r10;
        r11 = r14.build();
        r11 = (defpackage.anxl) r11;
        r11 = (defpackage.aqro) r11;
        r10.b = r11;
        r11 = r10.a;
        r12 = 1;
        r11 = r11 | r12;
        r10.a = r11;
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.aqrq) r3;
        r2.d = r3;
        goto L_0x07af;
    L_0x07a9:
        r9 = r26;
        r8 = r24;
        r0 = 3;
        r5 = 4;
    L_0x07af:
        r2 = 0;
    L_0x07b0:
        r3 = r6.as;
        r3 = r3.getChildCount();
        if (r2 >= r3) goto L_0x07c9;
    L_0x07b8:
        r3 = r6.as;
        r3 = r3.getChildAt(r2);
        r3 = r3.getVisibility();
        if (r3 == 0) goto L_0x07c7;
    L_0x07c4:
        r2 = r2 + 1;
        goto L_0x07b0;
    L_0x07c7:
        r2 = 0;
        goto L_0x07cb;
    L_0x07c9:
        r2 = 8;
    L_0x07cb:
        r3 = r6.as;
        r3.setVisibility(r2);
        goto L_0x07de;
    L_0x07d1:
        r8 = r27;
        r9 = r15;
        r0 = 3;
        r4 = 2;
        r5 = 4;
        r2 = r6.as;
        r3 = 8;
        r2.setVisibility(r3);
    L_0x07de:
        r2 = r7.D;
        if (r2 == 0) goto L_0x087e;
    L_0x07e2:
        r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r10 = r3.d;
        r2 = r2.b(r10);
        if (r2 != 0) goto L_0x07f8;
    L_0x07f5:
        r2 = r3.b;
        goto L_0x07fc;
    L_0x07f8:
        r2 = r3.a(r2);
    L_0x07fc:
        r2 = (defpackage.aphg) r2;
        r2 = r2.a;
        r2 = r2 & 128;
        if (r2 != 0) goto L_0x0806;
    L_0x0804:
        goto L_0x087e;
    L_0x0806:
        r2 = r7.D;
        r3 = com.google.protos.youtube.api.innertube.ButtonRendererOuterClass.buttonRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r10 = r3.d;
        r2 = r2.b(r10);
        if (r2 != 0) goto L_0x081e;
    L_0x081b:
        r2 = r3.b;
        goto L_0x0822;
    L_0x081e:
        r2 = r3.a(r2);
    L_0x0822:
        r2 = (defpackage.aphg) r2;
        r3 = r6.a;
        r10 = 2130772337; // 0x7f010171 float:1.714779E38 double:1.052741411E-314;
        r3 = defpackage.xwe.a(r3, r10, r1);
        r10 = r6.a;
        r11 = 2130838041; // 0x7f020219 float:1.7281053E38 double:1.052773873E-314;
        r10 = defpackage.ra.a(r10, r11);
        defpackage.st.a(r10, r3);
        r3 = r6.aT;
        r11 = 0;
        r3.setCompoundDrawablesWithIntrinsicBounds(r10, r11, r11, r11);
        r3 = r6.aT;
        r10 = r2.g;
        if (r10 != 0) goto L_0x0847;
    L_0x0845:
        r10 = defpackage.arml.f;
    L_0x0847:
        r10 = defpackage.ajqy.a(r10);
        r3.setText(r10);
        r3 = r6.aT;
        r10 = r2.a;
        r10 = r10 & 16384;
        if (r10 == 0) goto L_0x085f;
    L_0x0856:
        r10 = r2.p;
        if (r10 != 0) goto L_0x085c;
    L_0x085a:
        r10 = defpackage.aodv.c;
    L_0x085c:
        r10 = r10.b;
        goto L_0x0861;
    L_0x085f:
        r10 = r21;
    L_0x0861:
        r3.setContentDescription(r10);
        r3 = r6.aT;
        r10 = new wir;
        r10.<init>(r6, r2, r9);
        r3.setOnClickListener(r10);
        r3 = r6.aT;
        r3.setVisibility(r1);
        r3 = new acvs;
        r2 = r2.r;
        r3.<init>(r2);
        r9.b(r3);
        goto L_0x087f;
    L_0x087e:
        r11 = 0;
    L_0x087f:
        r2 = r6.t;
        if (r2 == 0) goto L_0x08e1;
    L_0x0883:
        r2 = defpackage.wih.e(r7);
        if (r2 != 0) goto L_0x0891;
    L_0x0889:
        r2 = r6.t;
        r3 = 8;
        r2.setVisibility(r3);
        goto L_0x08e1;
    L_0x0891:
        r3 = r2.b;
        if (r3 != 0) goto L_0x0897;
    L_0x0895:
        r3 = defpackage.aphj.d;
    L_0x0897:
        r10 = r6.u;
        r3 = r6.a(r3, r10, r9, r8);
        r10 = r2.c;
        if (r10 != 0) goto L_0x08a3;
    L_0x08a1:
        r10 = defpackage.aphj.d;
    L_0x08a3:
        r12 = r6.v;
        r10 = r6.a(r10, r12, r9, r8);
        r3 = r3 | r10;
        r10 = r2.d;
        if (r10 != 0) goto L_0x08b0;
    L_0x08ae:
        r10 = defpackage.aphj.d;
    L_0x08b0:
        r12 = r6.w;
        r10 = r6.a(r10, r12, r9, r8);
        r3 = r3 | r10;
        r2 = r2.e;
        if (r2 != 0) goto L_0x08bd;
    L_0x08bb:
        r2 = defpackage.aphj.d;
    L_0x08bd:
        r10 = r6.x;
        r2 = r6.a(r2, r10, r9, r8);
        r2 = r2 | r3;
        if (r2 == 0) goto L_0x08da;
    L_0x08c6:
        r2 = r6.t;
        r2 = r2.getViewTreeObserver();
        r3 = new wiu;
        r3.<init>(r6);
        r2.addOnGlobalLayoutListener(r3);
        r2 = r6.t;
        r2.setVisibility(r1);
        goto L_0x08e1;
    L_0x08da:
        r2 = r6.t;
        r3 = 8;
        r2.setVisibility(r3);
    L_0x08e1:
        r2 = r6.ay;
        r2 = r2.getText();
        r2 = r2.toString();
        r3 = r6.ax;
        r3 = r3.getText();
        r3 = r3.toString();
        r8 = r6.f(r7);
        r9 = r7.A;
        if (r9 != 0) goto L_0x08fe;
    L_0x08fd:
        goto L_0x0914;
    L_0x08fe:
        r9 = r9.d;
        if (r9 != 0) goto L_0x0904;
    L_0x0902:
        r9 = defpackage.apyk.f;
    L_0x0904:
        r9 = r9.a;
        r9 = r9 & r5;
        if (r9 == 0) goto L_0x0914;
    L_0x0909:
        r9 = r7.A;
        r9 = r9.d;
        if (r9 != 0) goto L_0x0911;
    L_0x090f:
        r9 = defpackage.apyk.f;
    L_0x0911:
        r9 = r9.d;
        goto L_0x0916;
    L_0x0914:
        r9 = r21;
    L_0x0916:
        r10 = r6.r;
        r10 = r10.getText();
        r10 = r10.toString();
        r12 = r6.av;
        r12 = r12.getText();
        r12 = r12.toString();
        r13 = defpackage.wih.g(r7);
        r14 = defpackage.wih.h(r7);
        r15 = defpackage.wih.i(r7);
        r11 = defpackage.wih.k(r7);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = ". ";
        r16 = android.text.TextUtils.isEmpty(r2);
        if (r16 != 0) goto L_0x094d;
    L_0x0947:
        r0.append(r2);
        r0.append(r5);
    L_0x094d:
        r2 = android.text.TextUtils.isEmpty(r3);
        if (r2 != 0) goto L_0x0959;
    L_0x0953:
        r0.append(r3);
        r0.append(r5);
    L_0x0959:
        r2 = r6.af;
        if (r2 == 0) goto L_0x097c;
    L_0x095d:
        r0.append(r8);
        r0.append(r5);
        r0.append(r9);
        r0.append(r5);
        r0.append(r12);
        r0.append(r5);
        r0.append(r13);
        r0.append(r5);
        r0.append(r10);
        r0.append(r5);
        goto L_0x099a;
    L_0x097c:
        r0.append(r10);
        r0.append(r5);
        r0.append(r8);
        r0.append(r5);
        r0.append(r9);
        r0.append(r5);
        r0.append(r12);
        r0.append(r5);
        r0.append(r13);
        r0.append(r5);
    L_0x099a:
        r6.a(r0, r7);
        r0.append(r15);
        r0.append(r5);
        r0.append(r14);
        r0.append(r5);
        r0.append(r11);
        r2 = r7.k;
        if (r2 == 0) goto L_0x09e5;
    L_0x09b0:
        r2 = r2.d;
        if (r2 == 0) goto L_0x09e5;
    L_0x09b4:
        r2 = r6.n;
        r2.setImportantForAccessibility(r4);
        r2 = r6.n;
        r2.setFocusable(r1);
        r2 = r6.r;
        r3 = 1;
        r2.setImportantForAccessibility(r3);
        r2 = r6.ar;
        r2.setImportantForAccessibility(r4);
        r2 = r6.au;
        if (r2 == 0) goto L_0x09d0;
    L_0x09cd:
        r2.setImportantForAccessibility(r4);
    L_0x09d0:
        r2 = r6.al;
        r2.setImportantForAccessibility(r3);
        r2 = r6.aN;
        r4 = 4;
        defpackage.abe.b(r2, r4);
        r2 = r6.r;
        r0 = r0.toString();
        r2.setContentDescription(r0);
        goto L_0x0a14;
    L_0x09e5:
        r3 = 1;
        r2 = r6.n;
        r2.setImportantForAccessibility(r3);
        r2 = r6.n;
        r2.setFocusable(r3);
        r2 = r6.r;
        r2.setImportantForAccessibility(r4);
        r2 = r6.ar;
        r2.setImportantForAccessibility(r1);
        r2 = r6.au;
        if (r2 == 0) goto L_0x0a01;
    L_0x09fe:
        r2.setImportantForAccessibility(r1);
    L_0x0a01:
        r2 = r6.al;
        r2.setImportantForAccessibility(r1);
        r2 = r6.aN;
        r2.setImportantForAccessibility(r1);
        r2 = r6.n;
        r0 = r0.toString();
        r2.setContentDescription(r0);
    L_0x0a14:
        r6.d(r7);
        r0 = r6.al;
        r0 = r0.getLayoutParams();
        r0 = (android.widget.RelativeLayout.LayoutParams) r0;
        r2 = 15;
        r0.addRule(r2, r1);
        r2 = 2131755655; // 0x7f100287 float:1.9142195E38 double:1.0532272345E-314;
        r3 = 3;
        r0.addRule(r3, r2);
        r2 = 1;
        r0.alignWithParent = r2;
        r2 = r6.al;
        r2.setLayoutParams(r0);
        r0 = r7.G;
        if (r0 != r3) goto L_0x0a3a;
    L_0x0a37:
        r0 = r6.T;
        goto L_0x0a3c;
    L_0x0a3a:
        r0 = r6.S;
    L_0x0a3c:
        r2 = r6.bb;
        r2 = defpackage.wih.a(r2);
        if (r2 == 0) goto L_0x0a61;
    L_0x0a44:
        r2 = r6.O;
        r3 = r6.au;
        r4 = 8;
        if (r3 == 0) goto L_0x0a4f;
    L_0x0a4c:
        r3.setVisibility(r4);
    L_0x0a4f:
        r3 = r6.at;
        r5 = 4;
        r3.setVisibility(r5);
        r3 = r6.an;
        r5 = r6.Q;
        r8 = r6.g;
        r9 = r6.R;
        defpackage.wlj.a(r3, r5, r8, r9, r8);
        goto L_0x0a73;
    L_0x0a61:
        r4 = 8;
        r2 = r7.G;
        r3 = 3;
        if (r2 != r3) goto L_0x0a6e;
    L_0x0a68:
        r2 = r6.N;
        r25.b();
        goto L_0x0a73;
    L_0x0a6e:
        r2 = r6.M;
        r25.b();
    L_0x0a73:
        r3 = r6.ak;
        r5 = new android.widget.RelativeLayout$LayoutParams;
        r8 = -1;
        r5.<init>(r2, r8);
        r3.setLayoutParams(r5);
        r2 = r6.al;
        r2 = r2.getLayoutParams();
        r2.width = r0;
        r2 = r6.al;
        r2 = r2.getLayoutParams();
        r2.height = r0;
        r2 = r6.al;
        r2.requestLayout();
        r2 = r6.al;
        r3 = 1;
        r2.setImportantForAccessibility(r3);
        r2 = r6.al;
        r3 = r7.b;
        r3 = r3.d;
        if (r3 != 0) goto L_0x0aa3;
    L_0x0aa1:
        r3 = defpackage.aodx.c;
    L_0x0aa3:
        defpackage.wih.a(r2, r3);
        r2 = r6.al;
        r3 = 0;
        r2.setImageBitmap(r3);
        r2 = r7.b;
        r0 = defpackage.aklb.b(r2, r0);
        if (r0 == 0) goto L_0x0ad5;
    L_0x0ab4:
        r2 = r6.al;
        r2.setTag(r0);
        r2 = r6.E;
        r3 = r6.al;
        r2.a(r3, r0);
        r0 = r7.c;
        if (r0 != 0) goto L_0x0acb;
    L_0x0ac4:
        r0 = r6.al;
        r2 = 0;
        r0.setOnClickListener(r2);
        goto L_0x0ad5;
    L_0x0acb:
        r0 = r6.al;
        r2 = new wij;
        r2.<init>(r6, r7);
        r0.setOnClickListener(r2);
    L_0x0ad5:
        r0 = r7.F;
        if (r0 == 0) goto L_0x0b16;
    L_0x0ad9:
        r2 = com.google.protos.youtube.api.innertube.HintRendererOuterClass.hintRenderer;
        r2 = defpackage.anxl.checkIsLite(r2);
        r0.a(r2);
        r0 = r0.h;
        r2 = r2.d;
        r0 = r0.a(r2);
        if (r0 != 0) goto L_0x0aed;
    L_0x0aec:
        goto L_0x0b16;
    L_0x0aed:
        r0 = r6.c;
        r2 = r7.F;
        r3 = com.google.protos.youtube.api.innertube.HintRendererOuterClass.hintRenderer;
        r3 = defpackage.anxl.checkIsLite(r3);
        r2.a(r3);
        r2 = r2.h;
        r5 = r3.d;
        r2 = r2.b(r5);
        if (r2 != 0) goto L_0x0b07;
    L_0x0b04:
        r2 = r3.b;
        goto L_0x0b0b;
    L_0x0b07:
        r2 = r3.a(r2);
    L_0x0b0b:
        r2 = (defpackage.aruh) r2;
        r3 = r6.al;
        r5 = r6.bb;
        r5 = r5.a;
        r0.a(r2, r3, r7, r5);
    L_0x0b16:
        r0 = r6.aU;
        r2 = r7.t;
        if (r2 != 0) goto L_0x0b1e;
    L_0x0b1c:
        r1 = 8;
    L_0x0b1e:
        r0.setVisibility(r1);
        r0 = r6.H;
        r1 = r6.D;
        r0 = r0.b;
        defpackage.xsb.a(r0, r1, r6);
        if (r19 != 0) goto L_0x0b2d;
    L_0x0b2c:
        goto L_0x0b38;
    L_0x0b2d:
        r0 = r6.I;
        r1 = r7.g;
        r1 = defpackage.wlx.a(r1);
        r0.a(r1, r6);
    L_0x0b38:
        if (r20 != 0) goto L_0x0b3b;
    L_0x0b3a:
        goto L_0x0b40;
    L_0x0b3b:
        r0 = r6.aW;
        r1 = 1;
        r0.a = r1;
    L_0x0b40:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wih.a_(akor, java.lang.Object):void");
    }
}
