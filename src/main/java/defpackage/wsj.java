package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: wsj */
public final class wsj extends akpl implements xcp {
    public final View a;
    public final TextView b;
    public acvx c;
    private final TextView d = ((TextView) this.a.findViewById(R.id.metadata));
    private final TextView e = ((TextView) this.a.findViewById(R.id.name));
    private final TextView f = ((TextView) this.a.findViewById(R.id.promotion_text));
    private final akyy g;
    private final aaas h;
    private final LinearLayout i;
    private final LinearLayout j;
    private final Context k;
    private final xci l;
    private aznm m;
    private final int n;
    private final int o;
    private Drawable p;

    public wsj(Context context, akzb akzb, aaas aaas, xci xci) {
        this.k = context;
        this.a = View.inflate(context, R.layout.single_ypc_offer_item, null);
        this.h = aaas;
        this.l = xci;
        this.n = context.getResources().getDimensionPixelSize(R.dimen.offer_container_margin);
        this.i = (LinearLayout) this.a.findViewById(R.id.offer_container);
        this.j = (LinearLayout) this.i.findViewById(R.id.offer_info);
        this.b = (TextView) this.i.findViewById(R.id.price);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.price_icon_size);
        this.o = dimensionPixelSize;
        this.b.addOnLayoutChangeListener(akza.a(this.b, dimensionPixelSize));
        this.g = akzb.a(this.b);
        this.g.a((int) R.dimen.price_icon_compound_padding);
        this.g.c = new wsi(this);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(int i) {
        if (this.i.getOrientation() != i) {
            this.i.setOrientation(i);
            LayoutParams layoutParams = (LayoutParams) this.j.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.b.getLayoutParams();
            if (i == 0) {
                layoutParams.width = 0;
                layoutParams.height = -2;
                layoutParams2.setMargins(0, 0, 0, 0);
                return;
            }
            layoutParams2.setMargins(0, this.n, 0, 0);
            layoutParams.width = -2;
            layoutParams.height = 0;
        }
    }

    public final void a(akpb akpb) {
        this.l.b(this);
        this.m = null;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bb  */
    public final /* synthetic */ void a(defpackage.akor r10, java.lang.Object r11) {
        /*
        r9 = this;
        r11 = (defpackage.aznm) r11;
        r9.m = r11;
        r0 = r9.l;
        r1 = defpackage.wsj.class;
        r0.a(r9, r1);
        r0 = r9.e;
        r1 = r11.a;
        r2 = 1;
        r1 = r1 & r2;
        r3 = 0;
        if (r1 == 0) goto L_0x001b;
    L_0x0014:
        r1 = r11.b;
        if (r1 != 0) goto L_0x001c;
    L_0x0018:
        r1 = defpackage.arml.f;
        goto L_0x001c;
    L_0x001b:
        r1 = r3;
    L_0x001c:
        r1 = defpackage.ajqy.a(r1);
        defpackage.xpr.a(r0, r1);
        r0 = r9.d;
        r1 = r9.m;
        r1 = r1.c;
        r1 = r1.size();
        r4 = 0;
        if (r1 != 0) goto L_0x0032;
    L_0x0030:
        r1 = r3;
        goto L_0x0079;
    L_0x0032:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r5 = new android.text.SpannableStringBuilder;
        r6 = "line.separator";
        r6 = java.lang.System.getProperty(r6);
        r5.<init>(r6);
        r6 = r9.m;
        r6 = r6.c;
        r6 = r6.iterator();
        r7 = 1;
    L_0x004b:
        r8 = r6.hasNext();
        if (r8 == 0) goto L_0x0067;
    L_0x0051:
        r8 = r6.next();
        r8 = (defpackage.arml) r8;
        if (r7 != 0) goto L_0x005c;
    L_0x0059:
        r1.add(r5);
    L_0x005c:
        r7 = r9.h;
        r7 = defpackage.aabb.a(r8, r7, r4);
        r1.add(r7);
        r7 = 0;
        goto L_0x004b;
    L_0x0067:
        r5 = r1.size();
        if (r5 <= 0) goto L_0x0030;
    L_0x006d:
        r5 = new java.lang.CharSequence[r4];
        r1 = r1.toArray(r5);
        r1 = (java.lang.CharSequence[]) r1;
        r1 = android.text.TextUtils.concat(r1);
    L_0x0079:
        defpackage.xpr.a(r0, r1);
        r0 = r11.d;
        if (r0 != 0) goto L_0x0082;
    L_0x0080:
        r0 = defpackage.azny.c;
    L_0x0082:
        r0 = r0.a;
        r0 = r0 & r2;
        if (r0 != 0) goto L_0x008f;
    L_0x0087:
        r0 = r9.f;
        r1 = 8;
        r0.setVisibility(r1);
        goto L_0x00aa;
    L_0x008f:
        r0 = r9.f;
        r1 = r11.d;
        if (r1 != 0) goto L_0x0097;
    L_0x0095:
        r1 = defpackage.azny.c;
    L_0x0097:
        r1 = r1.b;
        if (r1 != 0) goto L_0x009d;
    L_0x009b:
        r1 = defpackage.aznw.c;
    L_0x009d:
        r1 = r1.b;
        if (r1 != 0) goto L_0x00a3;
    L_0x00a1:
        r1 = defpackage.arml.f;
    L_0x00a3:
        r1 = defpackage.ajqy.a(r1);
        defpackage.xpr.a(r0, r1);
    L_0x00aa:
        r10 = r10.a;
        r9.c = r10;
        r10 = r9.g;
        r0 = r11.g;
        if (r0 != 0) goto L_0x00b6;
    L_0x00b4:
        r0 = defpackage.aphj.d;
    L_0x00b6:
        r0 = r0.a;
        r0 = r0 & r2;
        if (r0 == 0) goto L_0x00c7;
    L_0x00bb:
        r11 = r11.g;
        if (r11 != 0) goto L_0x00c1;
    L_0x00bf:
        r11 = defpackage.aphj.d;
    L_0x00c1:
        r3 = r11.b;
        if (r3 != 0) goto L_0x00c7;
    L_0x00c5:
        r3 = defpackage.aphg.s;
    L_0x00c7:
        r11 = r9.c;
        r10.a(r3, r11);
        r10 = r9.b;
        r10 = r10.getCompoundDrawablesRelative();
        r10 = r10.length;
        if (r10 <= 0) goto L_0x00e9;
    L_0x00d5:
        r10 = r9.b;
        r10 = r10.getCompoundDrawablesRelative();
        r10 = r10[r4];
        if (r10 == 0) goto L_0x00e9;
    L_0x00df:
        r10 = r9.b;
        r10 = r10.getCompoundDrawablesRelative();
        r10 = r10[r4];
        r9.p = r10;
    L_0x00e9:
        r10 = r9.a;
        r10 = r10.getViewTreeObserver();
        r11 = new wsl;
        r11.<init>(r9);
        r10.addOnGlobalLayoutListener(r11);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wsj.a(akor, java.lang.Object):void");
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        apxu apxu;
        aphj aphj;
        aphg aphg;
        if (i == -1) {
            clsArr = new Class[]{aawx.class, aaww.class};
        } else if (i == 0) {
            apxu = ((aawx) obj).a;
            aphj = this.m.g;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 2048) == 0) {
                obj = null;
            } else {
                aphj = this.m.g;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                obj = aphg.l;
                if (obj == null) {
                    obj = apxu.d;
                }
            }
            if (amqq.a(apxu, obj) && this.p != null) {
                arml arml;
                this.b.setPadding(this.k.getResources().getDimensionPixelSize(R.dimen.price_text_padding_start_default), this.b.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
                TextView textView = this.b;
                aphj = this.m.g;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                if ((aphg.a & 128) == 0) {
                    arml = null;
                } else {
                    aphj = this.m.g;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    arml = aphg.g;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                textView.setText(ajqy.a(arml));
                this.b.setCompoundDrawablesRelative(this.p, null, null, null);
            }
        } else if (i == 1) {
            apxu = ((aaww) obj).a;
            aphj = this.m.g;
            if (aphj == null) {
                aphj = aphj.d;
            }
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 2048) == 0) {
                obj = null;
            } else {
                aphj = this.m.g;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                obj = aphg.l;
                if (obj == null) {
                    obj = apxu.d;
                }
            }
            if (amqq.a(apxu, obj)) {
                LayerDrawable layerDrawable = (LayerDrawable) this.k.getResources().getDrawable(R.drawable.indeterminate_loading_indicator);
                int measuredWidth = this.b.getMeasuredWidth();
                this.b.setCompoundDrawablesRelative(layerDrawable, null, null, null);
                TextView textView2 = this.b;
                textView2.setPadding((measuredWidth / 2) - (this.o / 2), textView2.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
                String str = "level";
                ObjectAnimator.ofInt(layerDrawable.getDrawable(0), str, new int[]{0, 20000}).setDuration(3000).start();
                ObjectAnimator.ofInt(layerDrawable.getDrawable(1), str, new int[]{0, 20000}).setDuration(3000).start();
                this.b.setText("");
                this.b.setWidth(measuredWidth);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
