package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: iwg */
public final class iwg implements akot {
    public final aaas a;
    public boolean b = false;
    public akbv c;
    private final Context d;
    private final akkq e;
    private final akou f;
    private final Resources g;
    private final LayoutInflater h;
    private final LinearLayout i;
    private final LinearLayout j;
    private FrameLayout k;
    private ImageView l;
    private TextView m;
    private LinearLayout n;
    private boolean o = false;
    private boolean p = false;
    private int q;

    public iwg(Context context, akkq akkq, flu flu, aaas aaas) {
        this.d = (Context) amqw.a((Object) context);
        this.e = (akkq) amqw.a((Object) akkq);
        this.f = (akou) amqw.a((Object) flu);
        this.a = (aaas) amqw.a((Object) aaas);
        this.g = context.getResources();
        this.h = LayoutInflater.from(context);
        View inflate = this.h.inflate(R.layout.watch_card, null);
        this.i = (LinearLayout) inflate.findViewById(R.id.card_layout);
        this.j = (LinearLayout) inflate.findViewById(R.id.card_content);
        flu.a(inflate);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.f.a();
    }

    private final void c() {
        azik azik = this.c.e;
        List list = azik != null ? azik.c : null;
        if (list != null && !list.isEmpty()) {
            LinearLayout linearLayout;
            int a;
            if (!this.p) {
                CharSequence charSequence;
                this.h.inflate(R.layout.watch_card_section_title, this.j, true);
                linearLayout = this.j;
                TextView textView = (TextView) linearLayout.getChildAt(linearLayout.getChildCount() - 1);
                azik azik2 = this.c.e;
                if (azik2 == null) {
                    charSequence = null;
                } else {
                    arml arml;
                    if ((azik2.a & 1) != 0) {
                        arml = azik2.b;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    charSequence = ajqy.a(arml);
                }
                textView.setText(charSequence);
                this.h.inflate(R.layout.watch_card_list_item_separator, this.j, true);
            }
            linearLayout = this.n;
            if (linearLayout == null) {
                this.n = new LinearLayout(this.d);
                this.n.setLayoutParams(new LayoutParams(-1, -2));
                this.n.setOrientation(0);
                a = xss.a(this.g.getDisplayMetrics(), 7);
                this.n.setPadding(a, a, a, a);
                this.j.addView(this.n);
            } else {
                linearLayout.removeAllViews();
            }
            a = this.g.getInteger(R.integer.watch_card_related_entities_count);
            int min = Math.min(a, list.size());
            this.n.setWeightSum((float) a);
            for (a = 0; a < min; a++) {
                arml arml2;
                apxu apxu;
                azim azim = (azim) list.get(a);
                View inflate = this.h.inflate(R.layout.watch_card_related_entity, null);
                TextView textView2 = (TextView) inflate.findViewById(R.id.title);
                if ((azim.a & 1) != 0) {
                    arml2 = azim.b;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                textView2.setText(ajqy.a(arml2));
                aygk aygk = azim.c;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                a(inflate, R.id.thumbnail, aygk);
                if ((azim.a & 4) != 0) {
                    apxu = azim.d;
                    if (apxu == null) {
                        apxu = apxu.d;
                    }
                } else {
                    apxu = null;
                }
                inflate.setOnClickListener(new iwm(this, apxu));
                this.n.addView(inflate);
                inflate.setLayoutParams(new LayoutParams(0, -1, 1.0f));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f1  */
    public final void b() {
        /*
        r15 = this;
        r0 = r15.b;
        r1 = 2131758681; // 0x7f100e59 float:1.9148333E38 double:1.0532287295E-314;
        r2 = 8;
        r3 = 1;
        if (r0 == 0) goto L_0x019b;
    L_0x000a:
        r0 = r15.p;
        r4 = 0;
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        goto L_0x0176;
    L_0x0011:
        r0 = r15.c;
        r0 = r0.f;
        r5 = 0;
        if (r0 == 0) goto L_0x001f;
    L_0x0018:
        r0 = r0.b;
        if (r0 == 0) goto L_0x001f;
    L_0x001c:
        r0 = r0.c;
        goto L_0x0020;
    L_0x001f:
        r0 = r5;
    L_0x0020:
        r6 = 2131755472; // 0x7f1001d0 float:1.9141824E38 double:1.053227144E-314;
        r7 = 2131035574; // 0x7f0505b6 float:1.7681698E38 double:1.052871467E-314;
        r8 = 2131755189; // 0x7f1000b5 float:1.914125E38 double:1.053227004E-314;
        if (r0 != 0) goto L_0x002d;
    L_0x002b:
        goto L_0x00d6;
    L_0x002d:
        r9 = r15.j;
        r9.removeAllViews();
        r9 = 0;
    L_0x0033:
        r10 = r0.size();
        if (r9 >= r10) goto L_0x00d6;
    L_0x0039:
        if (r9 == 0) goto L_0x0042;
    L_0x003b:
        r10 = r15.h;
        r11 = r15.j;
        r10.inflate(r7, r11, r3);
    L_0x0042:
        r10 = r15.j;
        r11 = r0.get(r9);
        r11 = (defpackage.aziu) r11;
        r12 = r15.h;
        r13 = 2131035585; // 0x7f0505c1 float:1.768172E38 double:1.0528714726E-314;
        r12 = r12.inflate(r13, r5);
        r13 = r12.findViewById(r8);
        r13 = (android.widget.TextView) r13;
        r14 = r11.a;
        r14 = r14 & 4;
        if (r14 == 0) goto L_0x0066;
    L_0x005f:
        r14 = r11.d;
        if (r14 != 0) goto L_0x0067;
    L_0x0063:
        r14 = defpackage.arml.f;
        goto L_0x0067;
    L_0x0066:
        r14 = r5;
    L_0x0067:
        r14 = defpackage.ajqy.a(r14);
        r13.setText(r14);
        r13 = 2131755599; // 0x7f10024f float:1.9142082E38 double:1.053227207E-314;
        r13 = r12.findViewById(r13);
        r13 = (android.widget.TextView) r13;
        r14 = r11.a;
        r14 = r14 & r2;
        if (r14 == 0) goto L_0x0083;
    L_0x007c:
        r14 = r11.e;
        if (r14 != 0) goto L_0x0084;
    L_0x0080:
        r14 = defpackage.arml.f;
        goto L_0x0084;
    L_0x0083:
        r14 = r5;
    L_0x0084:
        r14 = defpackage.ajqy.a(r14);
        defpackage.xpr.a(r13, r14);
        r13 = r11.a;
        r13 = r13 & 2;
        if (r13 == 0) goto L_0x0098;
    L_0x0091:
        r13 = r11.c;
        if (r13 != 0) goto L_0x0099;
    L_0x0095:
        r13 = defpackage.arml.f;
        goto L_0x0099;
    L_0x0098:
        r13 = r5;
    L_0x0099:
        r13 = defpackage.ajqy.a(r13);
        r14 = android.text.TextUtils.isEmpty(r13);
        if (r14 != 0) goto L_0x00b2;
    L_0x00a3:
        r14 = 2131757860; // 0x7f100b24 float:1.9146668E38 double:1.053228324E-314;
        r14 = r12.findViewById(r14);
        r14 = (android.widget.TextView) r14;
        r14.setVisibility(r4);
        r14.setText(r13);
    L_0x00b2:
        r13 = r11.a;
        r13 = r13 & r3;
        if (r13 == 0) goto L_0x00c0;
    L_0x00b7:
        r13 = r11.b;
        if (r13 != 0) goto L_0x00bd;
    L_0x00bb:
        r13 = defpackage.aygk.f;
    L_0x00bd:
        r15.a(r12, r6, r13);
    L_0x00c0:
        r13 = 2131756587; // 0x7f10062b float:1.9144086E38 double:1.053227695E-314;
        r13 = r12.findViewById(r13);
        r14 = new iwk;
        r14.<init>(r15, r11);
        r13.setOnClickListener(r14);
        r10.addView(r12);
        r9 = r9 + 1;
        goto L_0x0033;
    L_0x00d6:
        r0 = r15.c;
        r0 = r0.f;
        if (r0 == 0) goto L_0x0171;
    L_0x00dc:
        r0 = r0.a;
        if (r0 != 0) goto L_0x00e2;
    L_0x00e0:
        goto L_0x0171;
    L_0x00e2:
        r0 = 0;
    L_0x00e3:
        r2 = r15.c;
        r2 = r2.f;
        r2 = r2.a;
        r2 = r2.c;
        r2 = r2.size();
        if (r0 >= r2) goto L_0x0171;
    L_0x00f1:
        if (r0 != 0) goto L_0x00f4;
    L_0x00f3:
        goto L_0x00fb;
    L_0x00f4:
        r2 = r15.h;
        r9 = r15.j;
        r2.inflate(r7, r9, r3);
    L_0x00fb:
        r2 = r15.j;
        r9 = r15.c;
        r9 = r9.f;
        r9 = r9.a;
        r9 = r9.c;
        r9 = r9.get(r0);
        r9 = (defpackage.azhk) r9;
        r10 = r15.h;
        r11 = 2131035559; // 0x7f0505a7 float:1.7681667E38 double:1.05287146E-314;
        r10 = r10.inflate(r11, r5);
        r11 = r10.findViewById(r8);
        r11 = (android.widget.TextView) r11;
        r12 = r9.a;
        r12 = r12 & 2;
        if (r12 == 0) goto L_0x0127;
    L_0x0120:
        r12 = r9.c;
        if (r12 != 0) goto L_0x0128;
    L_0x0124:
        r12 = defpackage.arml.f;
        goto L_0x0128;
    L_0x0127:
        r12 = r5;
    L_0x0128:
        r12 = defpackage.ajqy.a(r12);
        r11.setText(r12);
        r11 = 2131755835; // 0x7f10033b float:1.914256E38 double:1.0532273234E-314;
        r11 = r10.findViewById(r11);
        r11 = (android.widget.TextView) r11;
        r12 = r9.a;
        r12 = r12 & 4;
        if (r12 == 0) goto L_0x0145;
    L_0x013e:
        r12 = r9.d;
        if (r12 != 0) goto L_0x0146;
    L_0x0142:
        r12 = defpackage.arml.f;
        goto L_0x0146;
    L_0x0145:
        r12 = r5;
    L_0x0146:
        r12 = defpackage.ajqy.a(r12);
        defpackage.xpr.a(r11, r12);
        r11 = r9.a;
        r11 = r11 & r3;
        if (r11 == 0) goto L_0x015b;
    L_0x0152:
        r11 = r9.b;
        if (r11 != 0) goto L_0x0158;
    L_0x0156:
        r11 = defpackage.aygk.f;
    L_0x0158:
        r15.a(r10, r6, r11);
    L_0x015b:
        r11 = 2131758660; // 0x7f100e44 float:1.914829E38 double:1.053228719E-314;
        r11 = r10.findViewById(r11);
        r12 = new iwn;
        r12.<init>(r15, r9);
        r11.setOnClickListener(r12);
        r2.addView(r10);
        r0 = r0 + 1;
        goto L_0x00e3;
    L_0x0171:
        r15.c();
        r15.p = r3;
    L_0x0176:
        r0 = r15.g;
        r0 = r0.getConfiguration();
        r0 = r0.orientation;
        if (r0 != r3) goto L_0x018d;
    L_0x0180:
        r0 = r15.k;
        r0 = r0.findViewById(r1);
        r1 = r0.getPaddingTop();
        r0.setPadding(r1, r1, r1, r4);
    L_0x018d:
        r0 = r15.l;
        r1 = 2130837668; // 0x7f0200a4 float:1.7280297E38 double:1.0527736886E-314;
        r0.setImageResource(r1);
        r0 = r15.j;
        r0.setVisibility(r4);
        return;
    L_0x019b:
        r0 = r15.g;
        r0 = r0.getConfiguration();
        r0 = r0.orientation;
        if (r0 != r3) goto L_0x01b2;
    L_0x01a5:
        r0 = r15.k;
        r0 = r0.findViewById(r1);
        r1 = r0.getPaddingTop();
        r0.setPadding(r1, r1, r1, r1);
    L_0x01b2:
        r0 = r15.l;
        r1 = 2130837669; // 0x7f0200a5 float:1.7280299E38 double:1.052773689E-314;
        r0.setImageResource(r1);
        r0 = r15.j;
        r0.setVisibility(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwg.b():void");
    }

    private final void a(View view, int i, aygk aygk) {
        ImageView imageView = (ImageView) view.findViewById(i);
        this.e.a(imageView, aygk);
        imageView.setVisibility(!aklb.a(aygk) ? 8 : 0);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        akbv akbv = (akbv) obj;
        this.p = false;
        arml arml = null;
        akor.a.a(akbv.i, null);
        if (!akbv.equals(this.c)) {
            this.o = false;
        }
        if (this.o && this.g.getConfiguration().orientation == this.q) {
            this.f.a(akor);
            return;
        }
        apxu apxu;
        if (!this.o) {
            this.c = akbv;
            this.b = this.c.g ^ 1;
        }
        if (this.i.findViewById(R.id.card_header) != null) {
            this.i.removeViewAt(0);
        }
        LinearLayout linearLayout = (LinearLayout) this.h.inflate(R.layout.watch_card_header, null);
        this.i.addView(linearLayout, 0);
        ((TextView) this.i.findViewById(R.id.card_title)).setText(ajqy.a(this.c.a));
        this.m = (TextView) this.i.findViewById(R.id.card_label);
        this.m.setPadding(0, 0, 0, xss.a(this.g.getDisplayMetrics(), 4));
        this.m.setVisibility(0);
        this.m.setText(ajqy.b(this.c.c)[0]);
        if (this.c.b != null) {
            this.i.findViewById(R.id.card_description).setOnClickListener(new iwj(this));
        }
        ((TextView) linearLayout.findViewById(R.id.card_switch_label)).setText(ajqy.a(this.c.h));
        this.l = (ImageView) this.i.findViewById(R.id.card_switch_icon);
        this.k = (FrameLayout) this.i.findViewById(R.id.card_switch);
        this.k.setOnClickListener(new iwi(this));
        FrameLayout frameLayout = (FrameLayout) this.i.findViewById(R.id.call_to_action_layout);
        FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = (FixedAspectRatioRelativeLayout) this.i.findViewById(R.id.call_to_action_container);
        TextView textView = (TextView) frameLayout.findViewById(R.id.call_to_action_button);
        azhs azhs = this.c.d;
        int i = azhs.a;
        azhu azhu = i == 49968063 ? (azhu) azhs.b : null;
        if (azhu == null) {
            azis azis = i == 49970284 ? (azis) azhs.b : azis.e;
            apxu = azis.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aygk aygk = azis.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a(frameLayout, R.id.watch_card_single_image, aygk);
            if ((4 & azis.a) != 0) {
                arml = azis.d;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            textView.setText(ajqy.a(arml));
        } else {
            fixedAspectRatioRelativeLayout.a = this.g.getFraction(R.fraction.aspect_ratio_2_1, 1, 1);
            if (frameLayout.findViewById(R.id.watch_card_collage) == null) {
                ((ViewStub) frameLayout.findViewById(R.id.watch_card_collage_stub)).inflate();
            }
            apxu apxu2 = azhu.e;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            apxu = apxu2;
            aygk aygk2 = azhu.b;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            a(frameLayout, R.id.left_thumbnail, aygk2);
            aygk2 = azhu.c;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            a(frameLayout, R.id.top_right_thumbnail, aygk2);
            aygk2 = azhu.d;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
            a(frameLayout, R.id.bottom_right_thumbnail, aygk2);
            if ((azhu.a & 16) != 0) {
                arml = azhu.f;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            textView.setText(ajqy.a(arml));
        }
        frameLayout.setOnClickListener(new iwl(this, apxu));
        if (this.o && this.p) {
            c();
        }
        b();
        this.o = true;
        int i2 = this.g.getConfiguration().orientation;
        this.q = i2;
        if (i2 == 2) {
            LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
            if (azhu == null) {
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.weight = 4.0f;
            }
            frameLayout.setLayoutParams(layoutParams);
            linearLayout = (LinearLayout) linearLayout.findViewById(R.id.card_description_and_switch);
            LayoutParams layoutParams2 = (LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.weight = 2.0f;
            linearLayout.setLayoutParams(layoutParams2);
        }
        this.f.a(akor);
    }
}
