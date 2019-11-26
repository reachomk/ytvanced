package defpackage;

import android.app.Activity;
import android.support.v7.widget.SwitchCompat;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;

/* renamed from: acqz */
public final class acqz implements OnClickListener {
    private final akvp a;
    private final aaas b;
    private final Activity c;
    private final View d;
    private final TextView e;
    private final SwitchCompat f;
    private final atqt g;

    public acqz(Activity activity, akvp akvp, aaas aaas, View view, TextView textView, SwitchCompat switchCompat, atqt atqt) {
        arml arml;
        this.c = (Activity) amqw.a((Object) activity);
        this.b = (aaas) amqw.a((Object) aaas);
        this.a = (akvp) amqw.a((Object) akvp);
        this.d = (View) amqw.a((Object) view);
        this.e = (TextView) amqw.a((Object) textView);
        this.f = (SwitchCompat) amqw.a((Object) switchCompat);
        this.g = (atqt) amqw.a((Object) atqt);
        view.setOnClickListener(this);
        int i = 0;
        a(atqt.f, false);
        this.f.setChecked(atqt.f);
        atqt atqt2 = this.g;
        if ((atqt2.a & 2) != 0) {
            arml = atqt2.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence a = aabb.a(arml, this.b, true);
        if (a != null && xrn.c(this.d.getContext())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
            aaaw[] aaawArr = (aaaw[]) spannableStringBuilder.getSpans(0, a.length(), aaaw.class);
            int length = aaawArr.length;
            while (i < length) {
                aaaw aaaw = aaawArr[i];
                apxu apxu = aaaw.a;
                if (apxu != null) {
                    anxr access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
                    apxu.a(access$000);
                    if (apxu.h.a(access$000.d)) {
                        int spanStart = spannableStringBuilder.getSpanStart(aaaw);
                        int spanEnd = spannableStringBuilder.getSpanEnd(aaaw);
                        spannableStringBuilder.removeSpan(aaaw);
                        apxu apxu2 = aaaw.a;
                        anxr access$0002 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
                        apxu2.a(access$0002);
                        Object b = apxu2.h.b(access$0002.d);
                        if (b == null) {
                            b = access$0002.b;
                        } else {
                            b = access$0002.a(b);
                        }
                        spannableStringBuilder.setSpan(new URLSpan(xvt.d(((ayvl) b).b).toString()), spanStart, spanEnd, 33);
                    }
                }
                i++;
            }
            spannableStringBuilder.append(" ");
            a = spannableStringBuilder;
        }
        this.e.setText(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A:{SYNTHETIC, RETURN} */
    private final void a(boolean r6, boolean r7) {
        /*
        r5 = this;
        r0 = 0;
        if (r6 != 0) goto L_0x0004;
    L_0x0003:
        goto L_0x0023;
    L_0x0004:
        r1 = r5.g;
        r2 = r1.a;
        r2 = r2 & 8;
        if (r2 == 0) goto L_0x0023;
    L_0x000c:
        r2 = r5.a;
        r1 = r1.d;
        if (r1 != 0) goto L_0x0014;
    L_0x0012:
        r1 = defpackage.arwf.c;
    L_0x0014:
        r1 = r1.b;
        r1 = defpackage.arwh.a(r1);
        if (r1 != 0) goto L_0x001e;
    L_0x001c:
        r1 = defpackage.arwh.UNKNOWN;
    L_0x001e:
        r1 = r2.a(r1);
        goto L_0x0045;
    L_0x0023:
        if (r6 != 0) goto L_0x0044;
    L_0x0025:
        r1 = r5.g;
        r2 = r1.a;
        r2 = r2 & 16;
        if (r2 == 0) goto L_0x0044;
    L_0x002d:
        r2 = r5.a;
        r1 = r1.e;
        if (r1 != 0) goto L_0x0035;
    L_0x0033:
        r1 = defpackage.arwf.c;
    L_0x0035:
        r1 = r1.b;
        r1 = defpackage.arwh.a(r1);
        if (r1 != 0) goto L_0x003f;
    L_0x003d:
        r1 = defpackage.arwh.UNKNOWN;
    L_0x003f:
        r1 = r2.a(r1);
        goto L_0x0045;
    L_0x0044:
        r1 = 0;
    L_0x0045:
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0048:
        r3 = r5.e;
        r4 = r5.c;
        r1 = defpackage.ra.a(r4, r1);
        r3.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r2, r2, r2);
    L_0x0053:
        r1 = r5.d;
        if (r6 != 0) goto L_0x005b;
    L_0x0057:
        r3 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        goto L_0x005d;
    L_0x005b:
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x005d:
        r1.setAlpha(r3);
        if (r7 != 0) goto L_0x0063;
    L_0x0062:
        goto L_0x008b;
    L_0x0063:
        r7 = r5.d;
        r7 = r7.getContext();
        r7 = defpackage.xrn.c(r7);
        if (r7 == 0) goto L_0x008b;
    L_0x006f:
        r7 = r5.d;
        r7 = r7.getContext();
        r1 = r5.d;
        r3 = r1.getContext();
        if (r6 != 0) goto L_0x0081;
    L_0x007d:
        r6 = 2131952605; // 0x7f1303dd float:1.9541657E38 double:1.0533245407E-314;
        goto L_0x0084;
    L_0x0081:
        r6 = 2131952606; // 0x7f1303de float:1.954166E38 double:1.053324541E-314;
    L_0x0084:
        r6 = r3.getString(r6);
        defpackage.xrn.a(r7, r1, r6);
    L_0x008b:
        r6 = r5.g;
        r7 = r6.a;
        r7 = r7 & 64;
        if (r7 == 0) goto L_0x009f;
    L_0x0093:
        r6 = r6.g;
        if (r6 != 0) goto L_0x0099;
    L_0x0097:
        r6 = defpackage.aodx.c;
    L_0x0099:
        r2 = r6.b;
        if (r2 != 0) goto L_0x009f;
    L_0x009d:
        r2 = defpackage.aodv.c;
    L_0x009f:
        if (r2 == 0) goto L_0x00aa;
    L_0x00a1:
        r6 = r2.a;
        r6 = r6 & 2;
        if (r6 == 0) goto L_0x00aa;
    L_0x00a7:
        r6 = r2.b;
        goto L_0x00ba;
    L_0x00aa:
        r6 = r5.g;
        r6 = r6.b;
        if (r6 != 0) goto L_0x00b2;
    L_0x00b0:
        r6 = defpackage.arml.f;
    L_0x00b2:
        r6 = defpackage.ajqy.a(r6);
        r6 = r6.toString();
    L_0x00ba:
        r7 = android.text.TextUtils.isEmpty(r6);
        if (r7 != 0) goto L_0x00df;
    L_0x00c0:
        r7 = r5.d;
        r1 = r7.getContext();
        r2 = r5.a();
        if (r2 != 0) goto L_0x00d0;
    L_0x00cc:
        r2 = 2131952642; // 0x7f130402 float:1.9541733E38 double:1.053324559E-314;
        goto L_0x00d3;
    L_0x00d0:
        r2 = 2131952643; // 0x7f130403 float:1.9541735E38 double:1.0533245595E-314;
    L_0x00d3:
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r3[r0] = r6;
        r6 = r1.getString(r2, r3);
        r7.setContentDescription(r6);
    L_0x00df:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acqz.a(boolean, boolean):void");
    }

    public final boolean a() {
        return this.f.isChecked();
    }

    public final void a(OnCheckedChangeListener onCheckedChangeListener) {
        this.f.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void b() {
        this.f.toggle();
    }

    public final void onClick(View view) {
        this.f.toggle();
        a(a(), true);
    }
}
