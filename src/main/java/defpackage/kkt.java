package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.GridLayout;
import android.widget.GridLayout.LayoutParams;
import android.widget.GridLayout.Spec;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.SmoothHeightResizeLayout;
import com.google.android.apps.youtube.app.common.ui.chipcloud.ChipCloudView;
import com.google.android.apps.youtube.app.ui.SlimMetadataButtonContainerLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelCreditRendererOuterClass;

/* renamed from: kkt */
public final class kkt implements akot, ezn, kzc {
    private static final String k;
    private View A;
    private TextView B;
    private klk C;
    private TextView D;
    private TextView E;
    private View F;
    private View G;
    private TextView H;
    private View I;
    private kkj J;
    private kky K;
    private klh L;
    private klh M;
    private akor N;
    private akxv O;
    private int[] P;
    private TextView Q;
    private int R;
    public final kza a;
    public final lud b;
    public final SmoothHeightResizeLayout c;
    public LinearLayout d;
    public kkw e;
    public SlimMetadataButtonContainerLayout f;
    public klh g;
    public ValueAnimator h;
    public akay i;
    public acvx j;
    private final Context l;
    private final aaas m;
    private final agwc n;
    private final ezg o;
    private final aizy p;
    private final kke q;
    private final kkq r;
    private final kkm s;
    private final kle t;
    private final kkc u;
    private final kla v;
    private final kln w;
    private final kli x;
    private final zyw y;
    private View z;

    public kkt(Context context, aaas aaas, agwc agwc, aizy aizy, kza kza, ezg ezg, zyw zyw, kke kke, kkq kkq, kkm kkm, kle kle, kkc kkc, kla kla, kln kln, lud lud, kli kli) {
        this.l = context;
        this.m = (aaas) amqw.a((Object) aaas);
        this.n = agwc;
        this.o = ezg;
        this.y = zyw;
        this.a = kza;
        this.p = aizy;
        this.q = kke;
        this.r = kkq;
        this.s = kkm;
        this.t = kle;
        this.u = kkc;
        this.v = kla;
        this.w = kln;
        this.b = lud;
        this.x = kli;
        this.c = (SmoothHeightResizeLayout) LayoutInflater.from(context).inflate(R.layout.slim_metadata, null);
        a(2);
    }

    public final View K_() {
        return this.c;
    }

    public final boolean b() {
        return this.i.hasExtension(akax.a) && ((Boolean) this.i.getExtension(akax.a)).booleanValue();
    }

    public final void a(acwc acwc) {
        azfa c = c(acwc);
        if (c != null) {
            this.j.c(c);
        }
    }

    public final void b(acwc acwc) {
        azfa c = c(acwc);
        if (c != null) {
            this.j.b(c);
        }
    }

    private final azfa c(acwc acwc) {
        return this.j.a((Object) this, acwc);
    }

    public final void a(ViewGroup viewGroup, bgx bgx) {
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    bgx.c(childAt);
                    if (childAt instanceof ViewGroup) {
                        a((ViewGroup) childAt, bgx);
                    }
                }
            }
        }
    }

    public final void c() {
        boolean z = false;
        this.B.setText(aabb.a(this.i.a, this.m, false));
        Object obj = (this.i.hasExtension(akax.a) && ((Boolean) this.i.getExtension(akax.a)).booleanValue()) ? 1 : null;
        TextView textView = this.B;
        int i = 4;
        int i2 = 2;
        int i3 = obj == null ? !this.i.o ? 2 : 1 : 4;
        textView.setMaxLines(i3);
        obj = (this.i.hasExtension(akax.a) && ((Boolean) this.i.getExtension(akax.a)).booleanValue()) ? 1 : null;
        this.F.setRotation(obj == null ? 360.0f : 180.0f);
        this.F.setContentDescription(this.l.getResources().getString(obj == null ? R.string.load_more_label : R.string.load_less_label));
        TextView textView2 = this.Q;
        int i4 = 8;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        if (TextUtils.isEmpty(ajqy.a(this.i.b))) {
            this.D.setVisibility(8);
            this.E.setVisibility(8);
        } else {
            obj = (!(this.i.hasExtension(akax.a) && ((Boolean) this.i.getExtension(akax.a)).booleanValue()) && this.i.n == null) ? null : 1;
            if ((this.e.j.isEmpty() ^ 1) == 0) {
                ajzw ajzw = this.i.r;
                if (ajzw != null) {
                    aplk aplk = (aplk) ajzv.a(ajzw, aplk.class);
                    if (!(aplk == null || aplk.c.size() == 0)) {
                        arml arml;
                        a(true);
                        this.D.setVisibility(8);
                        this.E.setVisibility(8);
                        this.Q = (TextView) xpr.a(this.c, (int) R.id.subtitle_credits_stub, (int) R.id.subtitle_credits);
                        this.Q.setMovementMethod(LinkMovementMethod.getInstance());
                        if (obj != null) {
                            this.Q.setText(ajqy.a(this.i.c));
                            this.Q.setMaxLines(Integer.MAX_VALUE);
                            this.Q.setSingleLine(false);
                        } else {
                            this.Q.setText(ajqy.a(this.i.b));
                            this.Q.setMaxLines(1);
                            this.Q.setSingleLine(true);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append(this.l.getString(R.string.slim_metadata_channel_credits_divider_symbol_with_spaces));
                        if ((aplk.a & 1) != 0) {
                            arml = aplk.b;
                            if (arml == null) {
                                arml = arml.f;
                            }
                        } else {
                            arml = null;
                        }
                        spannableStringBuilder.append(ajqy.a(arml));
                        String str = "  ";
                        spannableStringBuilder.append(str);
                        for (int i5 = 0; i5 < aplk.c.size(); i5++) {
                            axak axak = (axak) aplk.c.get(i5);
                            anxr access$000 = anxl.checkIsLite(ChannelCreditRendererOuterClass.channelCreditItemRenderer);
                            axak.a(access$000);
                            Object b = axak.h.b(access$000.d);
                            if (b == null) {
                                b = access$000.b;
                            } else {
                                b = access$000.a(b);
                            }
                            aplj aplj = (aplj) b;
                            if (aplj != null) {
                                arml arml2;
                                if ((aplj.a & 1) != 0) {
                                    arml2 = aplj.b;
                                    if (arml2 == null) {
                                        arml2 = arml.f;
                                    }
                                } else {
                                    arml2 = null;
                                }
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ajqy.a(arml2));
                                aaas aaas = this.m;
                                apxu apxu = aplj.c;
                                if (apxu == null) {
                                    apxu = apxu.d;
                                }
                                spannableStringBuilder2.setSpan(new aaaw(aaas, null, apxu, false), 0, spannableStringBuilder2.length(), 33);
                                if (i5 != aplk.c.size() - 1) {
                                    spannableStringBuilder2.append(", ");
                                } else {
                                    spannableStringBuilder2.append(str);
                                }
                                spannableStringBuilder.append(spannableStringBuilder2);
                            }
                        }
                        this.Q.append(spannableStringBuilder);
                        this.Q.setVisibility(0);
                    }
                }
            }
            a(false);
            this.D.setText(ajqy.a(this.i.b));
            this.E.setText(ajqy.a(this.i.c));
            this.D.setVisibility(obj == null ? 0 : 4);
            TextView textView3 = this.E;
            if (obj != null) {
                i = 0;
            }
            textView3.setVisibility(i);
        }
        kkw kkw = this.e;
        Object obj2 = (this.i.hasExtension(akax.a) && ((Boolean) this.i.getExtension(akax.a)).booleanValue()) ? 1 : null;
        int isEmpty = TextUtils.isEmpty(ajqy.a(this.i.b)) ^ 1;
        boolean m = m();
        if (kkw.i) {
            kkw.a();
            for (Object next : kkw.j) {
                View view;
                if (next instanceof apej) {
                    view = (TextView) LayoutInflater.from(kkw.k).inflate(R.layout.text_badge, kkw.l, false);
                    arml arml3 = ((apej) next).b;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                    view.setText(ajqy.a(arml3));
                } else if (next instanceof apeb) {
                    apeb apeb = (apeb) next;
                    view = LayoutInflater.from(kkw.k).inflate(R.layout.standalone_red_badge, kkw.l, false);
                    new ipk(view).a(apeb);
                } else {
                    view = null;
                }
                kkw.l.addView(view);
            }
            kkw.i = false;
        }
        int childCount = kkw.l.getChildCount();
        int min = obj2 == null ? Math.min(childCount, 2) : childCount;
        ChipCloudView chipCloudView = kkw.l;
        if (min != chipCloudView.a) {
            chipCloudView.a = min;
            chipCloudView.requestLayout();
        }
        for (min = 0; min < kkw.l.getChildCount(); min++) {
            kkw.l.getChildAt(min).setVisibility(0);
        }
        ChipCloudView chipCloudView2 = kkw.l;
        if (childCount != 0) {
            i4 = 0;
        }
        chipCloudView2.setVisibility(i4);
        if (kkw.m == 2) {
            Spec spec;
            Spec spec2;
            LayoutParams layoutParams = (LayoutParams) kkw.l.getLayoutParams();
            childCount = kkw.g;
            if (isEmpty == 0 || !(obj2 == null || m)) {
                childCount = kkw.h;
            }
            layoutParams.setMarginStart(childCount);
            if (m) {
                spec = kkw.b;
            } else {
                spec = kkw.a;
            }
            if (m) {
                spec2 = kkw.e;
            } else {
                spec2 = kkw.d;
            }
            if (obj2 == null) {
                spec = kkw.c;
            }
            layoutParams.rowSpec = spec;
            if (obj2 == null) {
                spec2 = kkw.f;
            }
            layoutParams.columnSpec = spec2;
            kkw.l.setLayoutParams(layoutParams);
        }
        this.J.a();
        i3 = (this.i.hasExtension(akax.a) && ((Boolean) this.i.getExtension(akax.a)).booleanValue()) ? 1 : 0;
        this.f.b(i3 ^ 1);
        this.f.a(m());
        Spanned a = ajqy.a(this.i.l);
        Spanned a2 = aabb.a(this.i.f, this.m, false);
        ViewGroup.LayoutParams layoutParams2;
        if (TextUtils.isEmpty(a) && TextUtils.isEmpty(a2)) {
            layoutParams2 = this.H.getLayoutParams();
            layoutParams2.height = 1;
            this.H.setLayoutParams(layoutParams2);
        } else {
            this.H.setText(ajqy.a(k, a, a2));
            View view2 = this.H;
            if (this.i.getExtension(akax.a) != null) {
                i2 = 1;
            }
            abe.b(view2, i2);
            layoutParams2 = this.H.getLayoutParams();
            layoutParams2.height = !((Boolean) this.i.getExtension(akax.a)).booleanValue() ? 1 : -2;
            this.H.setLayoutParams(layoutParams2);
        }
        akay akay = this.i;
        if (akay.g != null) {
            i3 = (akay.hasExtension(akax.a) && ((Boolean) this.i.getExtension(akax.a)).booleanValue()) ? 1 : 0;
            kky kky = this.K;
            akor akor = this.N;
            auxl auxl = this.i.g.b;
            if (auxl == null) {
                auxl = auxl.e;
            }
            kky.a(akor, auxl, i3 ^ 1);
        }
        if (this.I != null) {
            boolean z2 = (this.i.hasExtension(akax.a) && ((Boolean) this.i.getExtension(akax.a)).booleanValue() && !TextUtils.isEmpty(this.H.getText())) || (this.d.getChildCount() > 0 && this.d.getChildAt(0).getVisibility() == 0);
            xpr.a(this.I, z2);
        }
        klh klh = this.g;
        if (klh != null) {
            klh.b();
        }
        akav akav = this.i.e;
        if (akav != null) {
            akat akat = akav.a;
            if (akat != null) {
                auuq auuq = akat.e;
                if (auuq != null && auuq.a == 65153809) {
                    if (this.M == null) {
                        this.M = this.x.a(((ViewStub) this.c.findViewById(R.id.channel_container_sponsorship_stub)).inflate().findViewById(R.id.channel_with_sponsorship_container));
                    }
                    this.g = this.M;
                } else {
                    if (this.L == null) {
                        this.L = this.x.a(this.G);
                    }
                    this.g = this.L;
                }
                if (this.i.hasExtension(akax.a) && ((Boolean) this.i.getExtension(akax.a)).booleanValue()) {
                    z = true;
                }
                this.g.a(akat, z, this.j, this.O);
                this.g.a();
            }
        }
    }

    private final void a(boolean z) {
        int integer = this.l.getResources().getInteger(R.integer.slim_metadata_expand_click_target_row);
        int integer2 = this.l.getResources().getInteger(R.integer.slim_metadata_expand_click_target_rowspan);
        if (z) {
            integer2 = this.l.getResources().getInteger(R.integer.slim_metadata_subtitle_row) - integer;
        }
        ViewGroup.LayoutParams layoutParams = this.A.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            layoutParams2.rowSpec = GridLayout.spec(integer, integer2, GridLayout.FILL);
            this.A.setLayoutParams(layoutParams2);
        }
    }

    public final void a(String str, azek azek) {
        akay akay = this.i;
        if (akay.n != null && akay.k.equals(str)) {
            this.D.setVisibility(8);
            this.E.setVisibility(0);
            TextView textView = this.E;
            arml arml = azek.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
        }
    }

    private final boolean m() {
        return xss.b(this.l);
    }

    public final void a(akpb akpb) {
        bhf.a(this.c);
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.h = null;
        }
        this.K.a();
        klh klh = this.g;
        if (klh != null) {
            klh.c();
        }
        klh = this.L;
        if (klh != null) {
            klh.c();
        }
        klh = this.M;
        if (klh != null) {
            klh.c();
        }
    }

    public final aruh d() {
        kka c = this.J.c();
        return c != null ? c.h() : null;
    }

    public final aruh e() {
        axpg axpg = this.i.q;
        if (axpg == null) {
            return null;
        }
        aruh aruh;
        if (axpg.a == 102716411) {
            aruh = (aruh) axpg.b;
        } else {
            aruh = aruh.j;
        }
        return aruh;
    }

    public final aruh f() {
        axpg axpg = this.i.p;
        if (axpg == null) {
            return null;
        }
        aruh aruh;
        if (axpg.a == 102716411) {
            aruh = (aruh) axpg.b;
        } else {
            aruh = aruh.j;
        }
        return aruh;
    }

    public final boolean g() {
        avsj c = elq.c(this.p);
        return c != null && c.b;
    }

    public final boolean h() {
        return this.J.a(this.i.k) != null;
    }

    public final boolean i() {
        return this.c.isShown();
    }

    public final View j() {
        return this.J.b();
    }

    public final View k() {
        return this.J.d();
    }

    public final String l() {
        akay akay = this.i;
        return akay != null ? akay.k : null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0222  */
    /* JADX WARNING: Missing block: B:18:0x005a, code skipped:
            if (r0.c != 0) goto L_0x005c;
     */
    public final /* synthetic */ void a_(defpackage.akor r10, java.lang.Object r11) {
        /*
        r9 = this;
        r11 = (defpackage.akay) r11;
        r0 = r11.s;
        r9.a(r0);
        r9.N = r10;
        r9.i = r11;
        r0 = r10.a;
        r9.j = r0;
        r0 = "sectionListController";
        r0 = r10.a(r0);
        r0 = (defpackage.akxv) r0;
        r9.O = r0;
        r0 = r9.b();
        r1 = 2;
        r2 = 1;
        r3 = 0;
        if (r0 == 0) goto L_0x0024;
    L_0x0022:
        r0 = 1;
        goto L_0x005d;
    L_0x0024:
        r0 = r9.l;
        r0 = r0.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.orientation;
        if (r0 != r1) goto L_0x005c;
    L_0x0032:
        r0 = r9.m();
        if (r0 == 0) goto L_0x005c;
    L_0x0038:
        r0 = r9.i;
        r0 = r0.g;
        if (r0 != 0) goto L_0x003f;
    L_0x003e:
        goto L_0x0022;
    L_0x003f:
        r0 = r0.b;
        if (r0 != 0) goto L_0x0045;
    L_0x0043:
        r0 = defpackage.auxl.e;
    L_0x0045:
        r0 = r0.b;
        r0 = r0.size();
        if (r0 != 0) goto L_0x004e;
    L_0x004d:
        goto L_0x0022;
    L_0x004e:
        r0 = r9.i;
        r0 = r0.g;
        r0 = r0.b;
        if (r0 != 0) goto L_0x0058;
    L_0x0056:
        r0 = defpackage.auxl.e;
    L_0x0058:
        r0 = r0.c;
        if (r0 == 0) goto L_0x0022;
    L_0x005c:
        r0 = 0;
    L_0x005d:
        r4 = defpackage.akax.a;
        r0 = java.lang.Boolean.valueOf(r0);
        r11.setExtension(r4, r0);
        r11 = r9.j;
        r0 = r9.i;
        r0 = r0.m;
        r4 = 0;
        r11.a(r0, r4);
        r11 = r9.j;
        r0 = new acvs;
        r5 = defpackage.acwc.SLIM_VIDEO_METADATA_RENDERER_EXPAND_BUTTON;
        r0.<init>(r5);
        r11.a(r0);
        r11 = r9.j;
        r0 = new acvs;
        r5 = defpackage.acwc.SLIM_VIDEO_METADATA_RENDERER_COLLAPSE_BUTTON;
        r0.<init>(r5);
        r11.a(r0);
        r11 = r9.i;
        r11 = r11.a;
        r0 = r9.j;
        defpackage.acxk.a(r11, r0);
        r11 = r9.b();
        if (r11 == 0) goto L_0x009c;
    L_0x0097:
        r11 = defpackage.acwc.SLIM_VIDEO_METADATA_RENDERER_COLLAPSE_BUTTON;
        r0 = defpackage.acwc.SLIM_VIDEO_METADATA_RENDERER_EXPAND_BUTTON;
        goto L_0x00a0;
    L_0x009c:
        r11 = defpackage.acwc.SLIM_VIDEO_METADATA_RENDERER_EXPAND_BUTTON;
        r0 = defpackage.acwc.SLIM_VIDEO_METADATA_RENDERER_COLLAPSE_BUTTON;
    L_0x00a0:
        r9.b(r11);
        r9.a(r0);
        r11 = r9.i;
        r11 = r11.j;
        if (r11 != 0) goto L_0x00ae;
    L_0x00ac:
        r11 = r4;
        goto L_0x00b4;
    L_0x00ae:
        r11 = r11.d;
        if (r11 != 0) goto L_0x00b4;
    L_0x00b2:
        r11 = defpackage.apdz.e;
    L_0x00b4:
        r0 = r9.C;
        r5 = r9.j;
        r0.a(r11, r5);
        r11 = r9.c;
        r0 = 2131758341; // 0x7f100d05 float:1.9147643E38 double:1.0532285615E-314;
        r11 = r11.findViewById(r0);
        r0 = r11.getLayoutParams();
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r5 = r9.C;
        r5 = r5.a();
        r6 = 3;
        if (r5 != 0) goto L_0x00fd;
    L_0x00d3:
        r5 = r9.z;
        r5.setVisibility(r3);
        r5 = r9.C;
        r5.a(r3, r3, r3, r3);
        r5 = r9.P;
        if (r5 == 0) goto L_0x015c;
    L_0x00e1:
        r5 = r5[r3];
        r0.setMarginStart(r5);
        r5 = r9.P;
        r7 = r5[r2];
        r0.topMargin = r7;
        r1 = r5[r1];
        r0.setMarginEnd(r1);
        r1 = r9.P;
        r1 = r1[r6];
        r0.bottomMargin = r1;
        r11.setLayoutParams(r0);
        r9.P = r4;
        goto L_0x015c;
    L_0x00fd:
        r5 = r9.z;
        r5 = r5.getLayoutParams();
        r5 = r5.height;
        r7 = r9.z;
        r8 = 8;
        r7.setVisibility(r8);
        r7 = r9.P;
        if (r7 != 0) goto L_0x0136;
    L_0x0110:
        r7 = 4;
        r7 = new int[r7];
        r8 = r0.getMarginStart();
        r7[r3] = r8;
        r8 = r0.topMargin;
        r7[r2] = r8;
        r8 = r0.getMarginEnd();
        r7[r1] = r8;
        r8 = r0.bottomMargin;
        r7[r6] = r8;
        r9.P = r7;
        r0.setMarginStart(r3);
        r0.topMargin = r3;
        r0.setMarginEnd(r3);
        r0.bottomMargin = r3;
        r11.setLayoutParams(r0);
    L_0x0136:
        r11 = r9.C;
        r0 = r9.P;
        r0 = r0[r3];
        r0 = java.lang.Math.max(r0, r3);
        r7 = r9.P;
        r7 = r7[r2];
        r7 = java.lang.Math.max(r7, r3);
        r7 = r7 + r5;
        r5 = r9.P;
        r1 = r5[r1];
        r1 = java.lang.Math.max(r1, r3);
        r5 = r9.P;
        r5 = r5[r6];
        r5 = java.lang.Math.max(r5, r3);
        r11.a(r0, r7, r1, r5);
    L_0x015c:
        r11 = r9.i;
        r11 = r11.i;
        if (r11 != 0) goto L_0x0164;
    L_0x0162:
        r11 = r4;
        goto L_0x016a;
    L_0x0164:
        r11 = r11.c;
        if (r11 != 0) goto L_0x016a;
    L_0x0168:
        r11 = defpackage.apeb.e;
    L_0x016a:
        r0 = r9.i;
        r0 = r0.h;
        if (r0 == 0) goto L_0x0190;
    L_0x0170:
        r1 = r0.length;
        r6 = r4;
        r5 = 0;
    L_0x0173:
        if (r5 >= r1) goto L_0x0191;
    L_0x0175:
        r7 = r0[r5];
        r8 = r7.a;
        r8 = r8 & r2;
        if (r8 != 0) goto L_0x017d;
    L_0x017c:
        goto L_0x018d;
    L_0x017d:
        if (r6 != 0) goto L_0x0184;
    L_0x017f:
        r6 = new java.util.ArrayList;
        r6.<init>();
    L_0x0184:
        r7 = r7.b;
        if (r7 != 0) goto L_0x018a;
    L_0x0188:
        r7 = defpackage.apej.c;
    L_0x018a:
        r6.add(r7);
    L_0x018d:
        r5 = r5 + 1;
        goto L_0x0173;
    L_0x0190:
        r6 = r4;
    L_0x0191:
        r0 = r9.e;
        r1 = r0.j;
        r1.clear();
        r0.a();
        if (r11 == 0) goto L_0x01a2;
    L_0x019d:
        r0 = r9.e;
        r0.a(r11);
    L_0x01a2:
        if (r6 != 0) goto L_0x01a5;
    L_0x01a4:
        goto L_0x01ba;
    L_0x01a5:
        r11 = r6.size();
        r0 = 0;
    L_0x01aa:
        if (r0 >= r11) goto L_0x01ba;
    L_0x01ac:
        r1 = r6.get(r0);
        r1 = (defpackage.apej) r1;
        r2 = r9.e;
        r2.a(r1);
        r0 = r0 + 1;
        goto L_0x01aa;
    L_0x01ba:
        r11 = r9.J;
        r11.e();
        r11 = r9.f;
        r0 = r9.m();
        if (r0 != 0) goto L_0x01c9;
    L_0x01c7:
        r0 = 5;
        goto L_0x01ca;
    L_0x01c9:
        r0 = 6;
    L_0x01ca:
        r11.a(r0);
        r11 = r9.i;
        r11 = r11.d;
        r0 = r11.length;
    L_0x01d2:
        if (r3 >= r0) goto L_0x0213;
    L_0x01d4:
        r1 = r11[r3];
        r2 = r1.a;
        r5 = 124608017; // 0x76d5e11 float:1.7857542E-34 double:6.15645404E-316;
        if (r2 != r5) goto L_0x01eb;
    L_0x01dd:
        r2 = r9.J;
        r1 = r1.b;
        r1 = (defpackage.axpc) r1;
        r5 = r9.i;
        r5 = r5.k;
        r2.a(r1, r5, r10);
        goto L_0x0210;
    L_0x01eb:
        r5 = 124608045; // 0x76d5e2d float:1.7857574E-34 double:6.1564554E-316;
        if (r2 == r5) goto L_0x0203;
    L_0x01f0:
        r5 = 186676672; // 0xb2075c0 float:3.0903464E-32 double:9.22305305E-316;
        if (r2 != r5) goto L_0x0210;
    L_0x01f5:
        r2 = r9.J;
        r1 = r1.b;
        r1 = (defpackage.axpa) r1;
        r5 = r9.i;
        r5 = r5.k;
        r2.a(r1, r5, r10);
        goto L_0x0210;
    L_0x0203:
        r2 = r9.J;
        r1 = r1.b;
        r1 = (defpackage.axpi) r1;
        r5 = r9.i;
        r5 = r5.k;
        r2.a(r1, r5, r10);
    L_0x0210:
        r3 = r3 + 1;
        goto L_0x01d2;
    L_0x0213:
        r10 = r9.o;
        r11 = r9.i;
        r11 = r11.k;
        r10.a(r11, r9);
        r10 = r9.i;
        r10 = r10.n;
        if (r10 == 0) goto L_0x0227;
    L_0x0222:
        r11 = r9.m;
        r11.a(r10, r4);
    L_0x0227:
        r9.c();
        r10 = r9.c;
        r11 = new kkx;
        r11.<init>(r9);
        r10.addOnLayoutChangeListener(r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkt.a_(akor, java.lang.Object):void");
    }

    static {
        String str = "line.separator";
        String valueOf = String.valueOf(System.getProperty(str));
        str = String.valueOf(System.getProperty(str));
        k = str.length() == 0 ? new String(valueOf) : valueOf.concat(str);
    }

    private final void a(int i) {
        int i2 = i;
        int i3 = i2 == 3 ? R.layout.slim_metadata_beyond_the_player : R.layout.slim_metadata_classic;
        if (i3 != this.R) {
            this.c.removeAllViews();
            LayoutInflater.from(this.l).inflate(i3, this.c, true);
            this.R = i3;
            this.z = this.c.findViewById(R.id.top_spacer);
            this.A = this.c.findViewById(R.id.expand_click_target);
            this.B = (TextView) this.c.findViewById(R.id.title);
            this.C = this.w.a((ViewStub) this.c.findViewById(R.id.top_standalone_collection_badge));
            this.D = (TextView) this.c.findViewById(R.id.subtitle);
            this.E = (TextView) this.c.findViewById(R.id.subtitleLong);
            this.F = this.c.findViewById(R.id.expand_button);
            this.G = this.c.findViewById(R.id.channel_container);
            this.H = (TextView) this.c.findViewById(R.id.description);
            this.d = (LinearLayout) this.c.findViewById(R.id.metadata_rows);
            this.I = this.c.findViewById(R.id.bottom_separator);
            this.e = new kkw(this.l, (ChipCloudView) this.c.findViewById(R.id.under_badges), i2);
            this.f = (SlimMetadataButtonContainerLayout) this.c.findViewById(R.id.buttons_container);
            this.G.setVisibility(8);
            this.A.setOnClickListener(new kks(this));
            this.J = new kkj(this.f, foh.f(this.y), new kkv(this), this.p, this.n, this.q, this.r, this.s, this.t, this.u);
            kla kla = this.v;
            this.K = new kky((Context) kla.a((Context) kla.a.get(), 1), (akpb) kla.a((akpb) kla.b.get(), 2), (LinearLayout) kla.a(this.d, 3));
            this.F.setAccessibilityDelegate(new kku());
            this.P = null;
            this.L = null;
            this.M = null;
        }
    }
}
