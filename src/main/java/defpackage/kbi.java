package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;

/* renamed from: kbi */
public final class kbi implements akot, akyw, OnClickListener, fgz, fhn {
    private final TextView A = ((TextView) this.e.findViewById(R.id.description));
    private final TextView B = ((TextView) this.e.findViewById(R.id.action_button));
    private final ImageView C = ((ImageView) this.d.findViewById(R.id.background_image));
    private final TextureView D = ((TextureView) this.d.findViewById(R.id.texture_view));
    private final FrameLayout E = ((FrameLayout) this.d.findViewById(R.id.inline_playback_view));
    public jud a;
    public final jvz b;
    public final int c;
    public final FixedAspectRatioFrameLayout d;
    public final LinearLayout e = ((LinearLayout) this.d.findViewById(R.id.text_layout));
    public final ImageView f = ((ImageView) this.d.findViewById(R.id.foreground_image));
    private final Context g;
    private final Resources h;
    private final akkq i;
    private final aaas j;
    private final akvo k;
    private final akyy l;
    private final ajqw m;
    private final akue n;
    private final xom o;
    private final fgc p;
    private final fhb q;
    private jue r;
    private aqto s;
    private final bcaa t;
    private kdo u;
    private final int v;
    private final int w;
    private final View x = this.d.findViewById(R.id.contextual_menu_anchor);
    private OnTouchListener y;
    private final TextView z = ((TextView) this.e.findViewById(R.id.title));

    public kbi(Context context, akkq akkq, aaas aaas, akzb akzb, akvo akvo, akuh akuh, jvz jvz, bcaa bcaa, fgc fgc, fhb fhb) {
        this.g = context;
        this.i = akkq;
        this.j = aaas;
        this.k = akvo;
        this.b = jvz;
        this.h = context.getResources();
        this.t = bcaa;
        this.p = fgc;
        this.q = fhb;
        this.d = (FixedAspectRatioFrameLayout) LayoutInflater.from(context).inflate(R.layout.default_promo_panel, null);
        this.l = akzb.a(this.B);
        this.l.c = this;
        this.o = xop.a(this.d.findViewById(R.id.background_scrim));
        this.d.setOnClickListener(this);
        this.c = this.h.getDimensionPixelSize(R.dimen.promo_panel_text_layout_top_bottom_margin);
        this.v = this.h.getDimensionPixelSize(R.dimen.promo_panel_foreground_image_max_height);
        this.w = this.h.getDimensionPixelSize(R.dimen.promo_panel_text_layout_active_item_indicator_margin);
        ajqv a = ajqw.a();
        a.a = context;
        a.c = new akta(aaas);
        this.m = a.a();
        ColorStateList b = xwe.b(context, R.attr.ytOverlayTextPrimary);
        this.n = akuh.a.a(this.z).b(this.A).a(b).b(b).c(xwe.b(context, 16842907)).b();
    }

    public final fhc b() {
        return null;
    }

    public final View K_() {
        return this.d;
    }

    public final View a() {
        kdo kdo = this.u;
        return kdo != null ? kdo.a() : null;
    }

    public final void a(boolean z) {
        kdo kdo = this.u;
        if (kdo != null) {
            kdo.a(z);
        }
    }

    public final bblt a(int i) {
        int i2 = 0;
        if (i != 0) {
            int i3 = this.s.b;
            if (i3 == 18) {
                return this.q.a().b(new kbl(this));
            }
            if (i3 == 22) {
                aryi c = c();
                fhb fhb = this.q;
                foq b = fod.b(c);
                if (i == 2) {
                    i2 = 3;
                }
                return fhb.a(b, this, i2);
            }
        }
        i = this.s.b;
        if (i == 18) {
            this.b.a(false);
            return bblt.a();
        } else if (i == 22) {
            return this.q.a(fod.b(c()));
        }
        return bblt.a();
    }

    public final boolean a(fhn fhn) {
        return fhn instanceof kbi ? ((kbi) fhn).s.equals(this.s) : false;
    }

    public final float a(akor akor) {
        float fraction = this.g.getResources().getFraction(R.fraction.carousel_default_aspect_ratio, 1, 1);
        Object obj = akor.d.get("carousel_aspect_ratio");
        return obj instanceof Float ? ((Float) obj).floatValue() : fraction;
    }

    public static aygk a(Context context, aqto aqto) {
        if (aqto != null) {
            aygo aygo = aqto.g;
            if (aygo == null) {
                aygo = aygo.c;
            }
            if ((aygo.a & 1) != 0) {
                aygo = aqto.i;
                if (aygo == null) {
                    aygo = aygo.c;
                }
                if ((aygo.a & 1) != 0) {
                    aygn aygn;
                    aygk aygk;
                    aygo aygo2;
                    if (xss.b(context)) {
                        aygo2 = aqto.i;
                        if (aygo2 == null) {
                            aygo2 = aygo.c;
                        }
                        aygn = aygo2.b;
                        if (aygn == null) {
                            aygn = aygn.d;
                        }
                    } else {
                        aygo2 = aqto.g;
                        if (aygo2 == null) {
                            aygo2 = aygo.c;
                        }
                        aygn = aygo2.b;
                        if (aygn == null) {
                            aygn = aygn.d;
                        }
                    }
                    if (fka.a(context.getResources().getConfiguration().orientation)) {
                        aygk = aygn.c;
                        if (aygk == null) {
                            return aygk.f;
                        }
                    }
                    aygk = aygn.b;
                    if (aygk == null) {
                        return aygk.f;
                    }
                    return aygk;
                }
            }
        }
        return null;
    }

    public static zz a(Context context, aygk aygk, int i) {
        aygm c = aklb.c(aygk);
        if (c == null) {
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int a = xss.a(displayMetrics, c.c);
        int a2 = xss.a(displayMetrics, c.d);
        if (a2 > i && i != -1) {
            a = (int) (((float) (c.c / c.d)) * ((float) i));
            a2 = i;
        }
        return new zz(Integer.valueOf(a), Integer.valueOf(a2));
    }

    public final void b(int i) {
        int g = abe.g(this.d);
        int i2 = g == 1 ? 0 : i;
        if (g != 1) {
            i = 0;
        }
        if (this.B.getVisibility() == 0) {
            kbi.a(this.B, i, i2);
        } else if (this.A.getVisibility() == 0) {
            kbi.a(this.A, i, i2);
        } else if (this.z.getVisibility() == 0) {
            kbi.a(this.z, i, i2);
        }
    }

    private static void a(View view, int i, int i2) {
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i2;
        }
    }

    public final void a(akpb akpb) {
        jvz jvz = this.b;
        if (jvz.c.containsKey(this)) {
            jwc jwc = (jwc) jvz.c.remove(this);
            jwd a = jvz.a(jwc);
            if (jvz.e.contains(a)) {
                jvz.e.remove(a);
            } else {
                jvz.d.remove(a);
            }
            jwc.c();
            jvz.a();
            if (jvz.e.isEmpty() && jvz.d.isEmpty()) {
                jvz.g.b(jvz.a);
                jvz.h = false;
            }
        }
        if (this.u != null) {
            this.E.removeAllViews();
            this.u.a(akpb);
            this.u = null;
        }
    }

    public final void onClick(View view) {
        aqto aqto = this.s;
        if (aqto != null) {
            apxu apxu;
            aaas aaas = this.j;
            apxu apxu2 = null;
            if ((aqto.a & 64) != 0) {
                apxu = aqto.k;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = null;
            }
            aaas.a(apxu, acwi.a(this.s, false));
            aaas aaas2 = this.j;
            aqto aqto2 = this.s;
            if ((aqto2.a & 128) != 0) {
                apxu2 = aqto2.l;
                if (apxu2 == null) {
                    apxu2 = apxu.d;
                }
            }
            aaas2.a(apxu2, acwi.a(this.s));
        }
    }

    public final void a(aphf aphf) {
        if (this.u != null) {
            this.p.g();
        }
    }

    private final aryi c() {
        aqto aqto = this.s;
        anxp anxp = aqto.b == 22 ? (axak) aqto.c : axak.a;
        anxr access$000 = anxl.checkIsLite(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        anxp.a(access$000);
        if (!anxp.h.a(access$000.d)) {
            return null;
        }
        aqto = this.s;
        if (aqto.b == 22) {
            anxp = (axak) aqto.c;
        } else {
            anxp = axak.a;
        }
        access$000 = anxl.checkIsLite(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (aryi) b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03c2  */
    public final /* synthetic */ void a_(defpackage.akor r28, java.lang.Object r29) {
        /*
        r27 = this;
        r0 = r27;
        r1 = r28;
        r8 = r29;
        r8 = (defpackage.aqto) r8;
        r0.s = r8;
        r2 = r1.a;
        r3 = r8.u;
        r3 = r3.d();
        r9 = 0;
        r2.a(r3, r9);
        r2 = r8.p;
        if (r2 != 0) goto L_0x001c;
    L_0x001a:
        r2 = defpackage.auvr.c;
    L_0x001c:
        r2 = r2.a;
        r10 = 1;
        r2 = r2 & r10;
        if (r2 != 0) goto L_0x0024;
    L_0x0022:
        r5 = r9;
        goto L_0x0031;
    L_0x0024:
        r2 = r8.p;
        if (r2 != 0) goto L_0x002a;
    L_0x0028:
        r2 = defpackage.auvr.c;
    L_0x002a:
        r2 = r2.b;
        if (r2 != 0) goto L_0x0030;
    L_0x002e:
        r2 = defpackage.auvn.l;
    L_0x0030:
        r5 = r2;
    L_0x0031:
        r11 = 0;
        if (r5 == 0) goto L_0x0035;
    L_0x0034:
        goto L_0x003a;
    L_0x0035:
        r2 = r0.x;
        defpackage.xpr.a(r2, r11);
    L_0x003a:
        r2 = r0.k;
        r3 = r0.d;
        r4 = r0.x;
        r7 = r1.a;
        r6 = r8;
        r2.a(r3, r4, r5, r6, r7);
        r2 = r0.y;
        if (r2 != 0) goto L_0x0058;
    L_0x004a:
        r2 = new kbk;
        r2.<init>(r0);
        r0.y = r2;
        r2 = r0.x;
        r3 = r0.y;
        r2.setOnTouchListener(r3);
    L_0x0058:
        r2 = "carousel_auto_rotate_callback";
        r2 = r1.b(r2, r9);
        r2 = (defpackage.jud) r2;
        r0.a = r2;
        r2 = "carousel_scroll_listener";
        r2 = r1.b(r2, r9);
        r2 = (defpackage.jue) r2;
        r0.r = r2;
        r2 = r0.d;
        r3 = r27.a(r28);
        r2.a = r3;
        r2 = r0.z;
        r3 = r8.d;
        if (r3 != 0) goto L_0x007c;
    L_0x007a:
        r3 = defpackage.arml.f;
    L_0x007c:
        r4 = r0.m;
        r3 = defpackage.ajqy.a(r3, r4);
        defpackage.xpr.a(r2, r3);
        r2 = r0.A;
        r3 = r8.e;
        if (r3 != 0) goto L_0x008d;
    L_0x008b:
        r3 = defpackage.arml.f;
    L_0x008d:
        r4 = r0.m;
        r3 = defpackage.ajqy.a(r3, r4);
        defpackage.xpr.a(r2, r3);
        r2 = r27.c();
        r3 = 5;
        r4 = 2;
        if (r2 != 0) goto L_0x009f;
    L_0x009e:
        goto L_0x00d6;
    L_0x009f:
        r5 = r2.l;
        if (r5 != 0) goto L_0x00a5;
    L_0x00a3:
        r5 = defpackage.aumg.c;
    L_0x00a5:
        r5 = r5.a;
        r5 = r5 & r10;
        if (r5 == 0) goto L_0x00d6;
    L_0x00aa:
        r2 = r2.l;
        if (r2 != 0) goto L_0x00b0;
    L_0x00ae:
        r2 = defpackage.aumg.c;
    L_0x00b0:
        r2 = r2.b;
        r2 = defpackage.aumi.a(r2);
        if (r2 == 0) goto L_0x00d6;
    L_0x00b8:
        if (r2 != r3) goto L_0x00d6;
    L_0x00ba:
        r2 = r0.z;
        r5 = defpackage.ajrc.ROBOTO_MEDIUM;
        r6 = r0.g;
        r5 = r5.a(r6);
        r2.setTypeface(r5);
        r2 = r0.z;
        r5 = r0.h;
        r6 = 2131626943; // 0x7f0e0bbf float:1.8881136E38 double:1.0531636423E-314;
        r5 = r5.getDimension(r6);
        r2.setTextSize(r11, r5);
        goto L_0x00f3;
    L_0x00d6:
        r2 = r0.z;
        r5 = defpackage.ajrc.YTSANS_MEDIUM;
        r6 = r0.g;
        r5 = r5.a(r6);
        r2.setTypeface(r5);
        r2 = r0.z;
        r5 = r0.s;
        r5 = r5.r;
        if (r5 != 0) goto L_0x00ee;
    L_0x00eb:
        r5 = 1103101952; // 0x41c00000 float:24.0 double:5.450047783E-315;
        goto L_0x00f0;
    L_0x00ee:
        r5 = 1102053376; // 0x41b00000 float:22.0 double:5.44486713E-315;
    L_0x00f0:
        r2.setTextSize(r4, r5);
    L_0x00f3:
        r2 = r0.n;
        r5 = r0.s;
        r6 = r5.a;
        r6 = r6 & 256;
        if (r6 == 0) goto L_0x0112;
    L_0x00fd:
        r5 = r5.m;
        if (r5 != 0) goto L_0x0103;
    L_0x0101:
        r5 = defpackage.aqtm.c;
    L_0x0103:
        r6 = r5.a;
        r7 = 118483990; // 0x70fec16 float:1.0827504E-34 double:5.8538869E-316;
        if (r6 != r7) goto L_0x010f;
    L_0x010a:
        r5 = r5.b;
        r5 = (defpackage.apfb) r5;
        goto L_0x0113;
    L_0x010f:
        r5 = defpackage.apfb.f;
        goto L_0x0113;
    L_0x0112:
        r5 = r9;
    L_0x0113:
        r2.a(r5);
        r2 = r0.l;
        r5 = r8.a;
        r6 = 4;
        r5 = r5 & r6;
        if (r5 == 0) goto L_0x012b;
    L_0x011e:
        r5 = r8.f;
        if (r5 != 0) goto L_0x0124;
    L_0x0122:
        r5 = defpackage.aphj.d;
    L_0x0124:
        r5 = r5.b;
        if (r5 != 0) goto L_0x012c;
    L_0x0128:
        r5 = defpackage.aphg.s;
        goto L_0x012c;
    L_0x012b:
        r5 = r9;
    L_0x012c:
        r7 = r1.a;
        r2.a(r5, r7);
        r2 = r0.s;
        r2 = r2.b;
        r5 = 18;
        if (r2 == r5) goto L_0x01a4;
    L_0x0139:
        r3 = 22;
        if (r2 == r3) goto L_0x016d;
    L_0x013d:
        r2 = r0.D;
        defpackage.xpr.a(r2, r11);
        r2 = r0.E;
        defpackage.xpr.a(r2, r11);
        r2 = r0.g;
        r2 = defpackage.kbi.a(r2, r8);
        if (r2 != 0) goto L_0x0156;
    L_0x014f:
        r2 = r0.C;
        defpackage.xpr.a(r2, r11);
        goto L_0x02cf;
    L_0x0156:
        r3 = r0.i;
        r4 = r0.C;
        r3.a(r4, r2);
        r3 = r0.C;
        defpackage.xpr.a(r3, r10);
        r3 = r0.C;
        r2 = defpackage.ezh.a(r2);
        r3.setContentDescription(r2);
        goto L_0x02cf;
    L_0x016d:
        r2 = r0.E;
        defpackage.xpr.a(r2, r10);
        r2 = r0.D;
        defpackage.xpr.a(r2, r11);
        r2 = r0.C;
        defpackage.xpr.a(r2, r11);
        r2 = r0.u;
        if (r2 == 0) goto L_0x0181;
    L_0x0180:
        goto L_0x0199;
    L_0x0181:
        r2 = r0.t;
        r2 = r2.get();
        r2 = (defpackage.kdo) r2;
        r0.u = r2;
        r2 = r0.u;
        r3 = r0.E;
        r2 = r2.a;
        r3.addView(r2);
        r2 = r0.E;
        defpackage.abe.b(r2, r6);
    L_0x0199:
        r2 = r27.c();
        r3 = r0.u;
        r3.a_(r1, r2);
        goto L_0x02cf;
    L_0x01a4:
        r2 = r0.D;
        defpackage.xpr.a(r2, r10);
        r2 = r0.s;
        r7 = r2.b;
        if (r7 != r5) goto L_0x01b4;
    L_0x01af:
        r2 = r2.c;
        r2 = (defpackage.ayxo) r2;
        goto L_0x01b6;
    L_0x01b4:
        r2 = defpackage.ayxo.h;
    L_0x01b6:
        r5 = r0.b;
        r7 = r0.D;
        r12 = r0.C;
        r15 = r0.a;
        r14 = r0.r;
        defpackage.amqw.a(r27);
        r13 = r5.c;
        r13 = r13.containsKey(r0);
        r13 = r13 ^ r10;
        r16 = r27.toString();
        r11 = java.lang.String.valueOf(r16);
        r9 = "Player already initialized for the given key:";
        r16 = r11.length();
        if (r16 != 0) goto L_0x01e0;
    L_0x01da:
        r11 = new java.lang.String;
        r11.<init>(r9);
        goto L_0x01e4;
    L_0x01e0:
        r11 = r9.concat(r11);
    L_0x01e4:
        defpackage.amqw.b(r13, r11);
        if (r7 == 0) goto L_0x02cf;
    L_0x01e9:
        if (r12 == 0) goto L_0x02cf;
    L_0x01eb:
        if (r2 == 0) goto L_0x02cf;
    L_0x01ed:
        r9 = r2.e;
        r9 = r9.size();
        if (r9 == 0) goto L_0x02cf;
    L_0x01f5:
        r9 = r5.h;
        if (r9 != 0) goto L_0x0202;
    L_0x01f9:
        r9 = r5.g;
        r11 = r5.a;
        r9.a(r11);
        r5.h = r10;
    L_0x0202:
        r9 = r5.b;
        r11 = r5.f;
        r13 = new jvo;
        r3 = r9.a;
        r3 = r3.get();
        r3 = (android.content.Context) r3;
        r3 = defpackage.jvw.a(r3, r10);
        r3 = (android.content.Context) r3;
        r10 = r9.b;
        r10 = r10.get();
        r10 = (defpackage.akkq) r10;
        r4 = defpackage.jvw.a(r10, r4);
        r4 = (defpackage.akkq) r4;
        r10 = r9.c;
        r10 = r10.get();
        r10 = (defpackage.jvu) r10;
        r6 = 3;
        r6 = defpackage.jvw.a(r10, r6);
        r6 = (defpackage.jvu) r6;
        r10 = r9.d;
        r10 = r10.get();
        r10 = (defpackage.amro) r10;
        r18 = r13;
        r13 = 4;
        r10 = defpackage.jvw.a(r10, r13);
        r17 = r10;
        r17 = (defpackage.amro) r17;
        r10 = r9.e;
        r10 = r10.get();
        r10 = (defpackage.acum) r10;
        r13 = 5;
        r10 = defpackage.jvw.a(r10, r13);
        r10 = (defpackage.acum) r10;
        r13 = r9.f;
        r13 = r13.get();
        r13 = (defpackage.xhv) r13;
        r16 = r14;
        r14 = 6;
        r13 = defpackage.jvw.a(r13, r14);
        r19 = r13;
        r19 = (defpackage.xhv) r19;
        r9 = r9.g;
        r9 = r9.get();
        r9 = (defpackage.xsc) r9;
        r13 = 7;
        r9 = defpackage.jvw.a(r9, r13);
        r20 = r9;
        r20 = (defpackage.xsc) r20;
        r9 = 8;
        r9 = defpackage.jvw.a(r7, r9);
        r21 = r9;
        r21 = (android.view.TextureView) r21;
        r9 = 9;
        r9 = defpackage.jvw.a(r12, r9);
        r22 = r9;
        r22 = (android.widget.ImageView) r22;
        r9 = 10;
        r2 = defpackage.jvw.a(r2, r9);
        r23 = r2;
        r23 = (defpackage.ayxo) r23;
        r2 = 11;
        r2 = defpackage.jvw.a(r11, r2);
        r24 = r2;
        r24 = (defpackage.jwe) r24;
        r2 = r18;
        r13 = r2;
        r9 = r16;
        r14 = r3;
        r3 = r15;
        r15 = r4;
        r16 = r6;
        r18 = r10;
        r25 = r3;
        r26 = r9;
        r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
        r3 = r5.c;
        r3.put(r0, r2);
        r3 = r5.e;
        r4 = new jwd;
        r6 = r7.getSurfaceTexture();
        if (r6 == 0) goto L_0x02c5;
    L_0x02c3:
        r6 = 1;
        goto L_0x02c6;
    L_0x02c5:
        r6 = 0;
    L_0x02c6:
        r4.<init>(r2, r6);
        r3.add(r4);
        r5.a();
    L_0x02cf:
        r2 = r0.o;
        r3 = r8.o;
        r3 = defpackage.anhe.a(r3);
        r2.a(r3);
        r2 = r0.v;
        r3 = r0.s;
        if (r3 != 0) goto L_0x02e1;
    L_0x02e0:
        goto L_0x0301;
    L_0x02e1:
        r3 = r3.q;
        r4 = 0;
        r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r5 == 0) goto L_0x0301;
    L_0x02e8:
        r2 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r2 > 0) goto L_0x02ee;
    L_0x02ec:
        r2 = -1;
        goto L_0x0301;
    L_0x02ee:
        r2 = r0.g;
        r2 = r2.getResources();
        r2 = r2.getDisplayMetrics();
        r3 = r0.s;
        r3 = r3.q;
        r3 = (int) r3;
        r2 = defpackage.xss.a(r2, r3);
    L_0x0301:
        r3 = r0.g;
        r4 = r0.s;
        r4 = r4.j;
        if (r4 != 0) goto L_0x030b;
    L_0x0309:
        r4 = defpackage.aygk.f;
    L_0x030b:
        r2 = defpackage.kbi.a(r3, r4, r2);
        r3 = "overlapping_item_height";
        if (r2 != 0) goto L_0x0321;
    L_0x0313:
        r2 = r0.f;
        r4 = 0;
        r2.setImageDrawable(r4);
        r2 = r0.f;
        r4 = 0;
        defpackage.xpr.a(r2, r4);
        r2 = 0;
        goto L_0x0374;
    L_0x0321:
        r4 = r0.f;
        r4 = r4.getLayoutParams();
        r4 = (android.widget.LinearLayout.LayoutParams) r4;
        r5 = r2.a;
        r5 = (java.lang.Integer) r5;
        r5 = r5.intValue();
        r4.width = r5;
        r2 = r2.b;
        r2 = (java.lang.Integer) r2;
        r2 = r2.intValue();
        r4.height = r2;
        r2 = r0.f;
        r4 = 1;
        defpackage.xpr.a(r2, r4);
        r2 = r0.i;
        r4 = r0.f;
        r5 = r0.s;
        r5 = r5.j;
        if (r5 != 0) goto L_0x034f;
    L_0x034d:
        r5 = defpackage.aygk.f;
    L_0x034f:
        r6 = defpackage.akko.h;
        r2.a(r4, r5, r6);
        r2 = r0.f;
        r4 = r0.s;
        r4 = r4.j;
        if (r4 != 0) goto L_0x035e;
    L_0x035c:
        r4 = defpackage.aygk.f;
    L_0x035e:
        r4 = defpackage.ezh.a(r4);
        r2.setContentDescription(r4);
        r2 = 0;
        r4 = r1.a(r3, r2);
        r5 = r0.d;
        r6 = new kbn;
        r6.<init>(r0, r1, r4);
        r5.addOnAttachStateChangeListener(r6);
    L_0x0374:
        r4 = r0.e;
        r4 = r4.getLayoutParams();
        r4 = (android.widget.FrameLayout.LayoutParams) r4;
        r5 = r0.c;
        r3 = r1.a(r3, r2);
        r5 = r5 + r3;
        r4.bottomMargin = r5;
        r3 = r0.B;
        defpackage.kbi.a(r3, r2, r2);
        r3 = r0.A;
        defpackage.kbi.a(r3, r2, r2);
        r3 = r0.z;
        defpackage.kbi.a(r3, r2, r2);
        r3 = "active_item_indicator_width";
        r1 = r1.a(r3, r2);
        if (r1 <= 0) goto L_0x03b5;
    L_0x039c:
        r2 = r0.w;
        r1 = r1 + r2;
        r2 = r0.d;
        r2 = defpackage.abe.E(r2);
        if (r2 == 0) goto L_0x03ab;
    L_0x03a7:
        r0.b(r1);
        goto L_0x03b5;
    L_0x03ab:
        r2 = r0.d;
        r3 = new kbm;
        r3.<init>(r0, r1);
        r2.addOnAttachStateChangeListener(r3);
    L_0x03b5:
        r1 = r0.d;
        r1.requestLayout();
        r1 = r8.n;
        r1 = r1.size();
        if (r1 <= 0) goto L_0x03c9;
    L_0x03c2:
        r1 = r0.j;
        r2 = r8.n;
        defpackage.aabd.a(r1, r2, r8);
    L_0x03c9:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kbi.a_(akor, java.lang.Object):void");
    }
}
