package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acrv */
public final class acrv implements OnClickListener {
    public final avbs a;
    public final List b;
    public final acrw c;
    public final ViewGroup d;
    public final acvx e;
    public final byte[] f;
    public PopupWindow g;
    private final akvp h;
    private final Context i;
    private final aaas j;
    private final aphg k;
    private final LayoutInflater l;
    private final List m = new ArrayList();
    private int n = -1;

    public acrv(Context context, acrw acrw, avbs avbs, akvp akvp, aaas aaas, acvx acvx, int i, int i2) {
        this.i = (Context) amqw.a((Object) context);
        this.c = (acrw) amqw.a((Object) acrw);
        this.a = (avbs) amqw.a((Object) avbs);
        this.h = (akvp) amqw.a((Object) akvp);
        this.j = (aaas) amqw.a((Object) aaas);
        this.e = (acvx) amqw.a((Object) acvx);
        avbm avbm = this.a.b;
        if (avbm == null) {
            avbm = avbm.c;
        }
        amqw.b((avbm.a & 1) != 0);
        avbm = this.a.b;
        if (avbm == null) {
            avbm = avbm.c;
        }
        aphg aphg = avbm.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        this.b = this.a.d;
        this.l = LayoutInflater.from(context);
        View imageButton = new ImageButton(context);
        if ((aphg.a & 16) != 0) {
            arwf arwf = aphg.e;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            imageButton.setImageResource(akvp.a(a));
        }
        if ((aphg.a & 16384) != 0) {
            aodv aodv = aphg.p;
            if (aodv == null) {
                aodv = aodv.c;
            }
            imageButton.setContentDescription(aodv.b);
        }
        this.f = aphg.r.d();
        this.k = aphg;
        imageButton.setOnClickListener(this);
        imageButton.setBackgroundColor(0);
        xpr.a(imageButton, imageButton.getBackground(), 1);
        acvx.a(this.f);
        this.d = new FrameLayout(context);
        this.d.setVisibility(8);
        this.d.addView(imageButton);
        LayoutParams layoutParams = imageButton.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
    }

    /* JADX WARNING: Missing block: B:14:0x0033, code skipped:
            r1 = false;
     */
    /* JADX WARNING: Missing block: B:16:0x003b, code skipped:
            if (r2 == r5.c.ac()) goto L_0x0073;
     */
    /* JADX WARNING: Missing block: B:18:0x0044, code skipped:
            if (r2 == r5.c.ab()) goto L_0x0073;
     */
    /* JADX WARNING: Missing block: B:20:0x004d, code skipped:
            if (r2 == r5.c.aa()) goto L_0x0073;
     */
    /* JADX WARNING: Missing block: B:22:0x0056, code skipped:
            if (r2 == r5.c.Z()) goto L_0x0073;
     */
    /* JADX WARNING: Missing block: B:24:0x005f, code skipped:
            if (r2 == r5.c.Y()) goto L_0x0073;
     */
    /* JADX WARNING: Missing block: B:26:0x0068, code skipped:
            if (r2 == r5.c.X()) goto L_0x0073;
     */
    /* JADX WARNING: Missing block: B:28:0x0071, code skipped:
            if (r2 == r5.c.W()) goto L_0x0073;
     */
    /* JADX WARNING: Missing block: B:29:0x0073, code skipped:
            r1 = true;
     */
    /* JADX WARNING: Missing block: B:30:0x0074, code skipped:
            if (r1 != false) goto L_0x0008;
     */
    /* JADX WARNING: Missing block: B:35:0x0074, code skipped:
            continue;
     */
    /* JADX WARNING: Missing block: B:36:0x0074, code skipped:
            continue;
     */
    public final boolean a(java.util.List r6) {
        /*
        r5 = this;
        r0 = 1;
        if (r6 == 0) goto L_0x0077;
    L_0x0003:
        r6 = r6.iterator();
        r1 = 1;
    L_0x0008:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x0076;
    L_0x000e:
        r1 = r6.next();
        r1 = (defpackage.avca) r1;
        r2 = r1.b;
        r3 = 2;
        r4 = 0;
        if (r2 != r3) goto L_0x0023;
    L_0x001a:
        r2 = r1.c;
        r2 = (java.lang.Boolean) r2;
        r2 = r2.booleanValue();
        goto L_0x0024;
    L_0x0023:
        r2 = 0;
    L_0x0024:
        r1 = r1.d;
        r1 = defpackage.avcc.a(r1);
        if (r1 == 0) goto L_0x002d;
    L_0x002c:
        goto L_0x002e;
    L_0x002d:
        r1 = 1;
    L_0x002e:
        r1 = r1 + -1;
        switch(r1) {
            case 1: goto L_0x006b;
            case 2: goto L_0x0062;
            case 3: goto L_0x0059;
            case 4: goto L_0x0050;
            case 5: goto L_0x0047;
            case 6: goto L_0x003e;
            case 7: goto L_0x0035;
            default: goto L_0x0033;
        };
    L_0x0033:
        r1 = 0;
        goto L_0x0074;
    L_0x0035:
        r1 = r5.c;
        r1 = r1.ac();
        if (r2 != r1) goto L_0x0033;
    L_0x003d:
        goto L_0x0073;
    L_0x003e:
        r1 = r5.c;
        r1 = r1.ab();
        if (r2 != r1) goto L_0x0033;
    L_0x0046:
        goto L_0x0073;
    L_0x0047:
        r1 = r5.c;
        r1 = r1.aa();
        if (r2 != r1) goto L_0x0033;
    L_0x004f:
        goto L_0x0073;
    L_0x0050:
        r1 = r5.c;
        r1 = r1.Z();
        if (r2 != r1) goto L_0x0033;
    L_0x0058:
        goto L_0x0073;
    L_0x0059:
        r1 = r5.c;
        r1 = r1.Y();
        if (r2 != r1) goto L_0x0033;
    L_0x0061:
        goto L_0x0073;
    L_0x0062:
        r1 = r5.c;
        r1 = r1.X();
        if (r2 != r1) goto L_0x0033;
    L_0x006a:
        goto L_0x0073;
    L_0x006b:
        r1 = r5.c;
        r1 = r1.W();
        if (r2 != r1) goto L_0x0033;
    L_0x0073:
        r1 = 1;
    L_0x0074:
        if (r1 != 0) goto L_0x0008;
    L_0x0076:
        return r1;
    L_0x0077:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acrv.a(java.util.List):boolean");
    }

    public final void onClick(View view) {
        aphg aphg = this.k;
        int i = aphg.a;
        aaas aaas;
        apxu apxu;
        if ((i & 2048) != 0) {
            aaas = this.j;
            apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        } else if ((i & 4096) != 0) {
            aaas = this.j;
            apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        } else if ((this.a.a & 2) == 0) {
            xtl.c("Unknown click handling for StreamTray button");
        } else {
            Object tag = view.getTag();
            int i2;
            if (tag == null) {
                PopupWindow popupWindow = this.g;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    this.g = null;
                }
                amqw.b((this.a.a & 2) != 0);
                avbo avbo = this.a.c;
                if (avbo == null) {
                    avbo = avbo.c;
                }
                int i3 = avbo.a;
                if (i3 == 142366317) {
                    Object obj;
                    avbg avbg = (avbg) avbo.b;
                    i3 = avay.a(avbg.d);
                    if (i3 == 0) {
                        i3 = 1;
                    }
                    i3--;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            StringBuilder stringBuilder = new StringBuilder(36);
                            stringBuilder.append("Unknown menu style type: ");
                            stringBuilder.append(i3);
                            xtl.c(stringBuilder.toString());
                        }
                        obj = null;
                    } else {
                        obj = 1;
                    }
                    if (avbg.b.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(this.i);
                        linearLayout.setBackground(ra.a(this.i, (int) R.drawable.lc_editbox_dropdown_background_dark));
                        linearLayout.setOrientation(1);
                        if (this.m.isEmpty()) {
                            for (avbe avbe : avbg.b) {
                                if ((avbe.a & 1) != 0) {
                                    Object obj2 = avbe.b;
                                    if (obj2 == null) {
                                        obj2 = avba.j;
                                    }
                                    this.m.add(obj2);
                                }
                            }
                        }
                        for (i2 = 0; i2 < this.m.size(); i2++) {
                            avba avba = (avba) this.m.get(i2);
                            if (a(avba.i)) {
                                TextView textView;
                                arml arml;
                                View inflate = this.l.inflate(R.layout.lc_input_select_spinner_dropdown_item, null);
                                inflate.setTag(Integer.valueOf(i2));
                                acrx acrx = new acrx(inflate);
                                if ((avba.a & 4) != 0) {
                                    akvp akvp = this.h;
                                    arwf arwf = avba.d;
                                    if (arwf == null) {
                                        arwf = arwf.c;
                                    }
                                    arwh a = arwh.a(arwf.b);
                                    if (a == null) {
                                        a = arwh.UNKNOWN;
                                    }
                                    int a2 = akvp.a(a);
                                    if (a2 != 0) {
                                        acrx.a.setImageResource(a2);
                                        acrx.a.setVisibility(0);
                                    }
                                }
                                if ((avba.a & 1) != 0) {
                                    textView = acrx.b;
                                    arml = avba.b;
                                    if (arml == null) {
                                        arml = arml.f;
                                    }
                                    textView.setText(ajqy.a(arml));
                                }
                                if ((avba.a & 2) != 0) {
                                    textView = acrx.c;
                                    arml = avba.c;
                                    if (arml == null) {
                                        arml = arml.f;
                                    }
                                    textView.setText(ajqy.a(arml));
                                    acrx.c.setVisibility(0);
                                }
                                if (obj != null) {
                                    int i4 = this.n;
                                    if (i4 == i2 || (i4 == -1 && avba.e)) {
                                        inflate.setBackgroundColor(ra.c(this.i, R.color.quantum_grey700));
                                        this.n = i2;
                                    }
                                }
                                xpr.a(inflate, inflate.getBackground(), 0);
                                inflate.setOnClickListener(this);
                                linearLayout.addView(inflate);
                            }
                        }
                        linearLayout.measure(0, 0);
                        this.g = new PopupWindow(linearLayout, -2, -2, true);
                        this.g.setBackgroundDrawable(new ColorDrawable(0));
                        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new acry(this, view, linearLayout));
                        this.g.showAsDropDown(view, 0, acrv.a(linearLayout, view));
                    }
                } else if (i3 == 142774990) {
                    this.c.ae();
                }
            } else if (tag instanceof Integer) {
                Integer num = (Integer) tag;
                avba avba2 = (avba) this.m.get(num.intValue());
                this.n = num.intValue();
                if (avba2 != null) {
                    i2 = avba2.a;
                    aaas aaas2;
                    apxu apxu2;
                    if ((i2 & 32) != 0) {
                        aaas2 = this.j;
                        apxu2 = avba2.g;
                        if (apxu2 == null) {
                            apxu2 = apxu.d;
                        }
                        aaas2.a(apxu2, null);
                    } else if ((i2 & 16) == 0) {
                        String valueOf = String.valueOf(avba2);
                        StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 36);
                        stringBuilder2.append("Unknown click handling for menuItem:");
                        stringBuilder2.append(valueOf);
                        xtl.c(stringBuilder2.toString());
                    } else {
                        aaas2 = this.j;
                        apxu2 = avba2.f;
                        if (apxu2 == null) {
                            apxu2 = apxu.d;
                        }
                        aaas2.a(apxu2, null);
                    }
                    if ((avba2.a & 1) != 0) {
                        Context context = this.i;
                        Resources resources = context.getResources();
                        Object[] objArr = new Object[1];
                        arml arml2 = avba2.b;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                        objArr[0] = ajqy.a(arml2);
                        xrn.a(context, view, resources.getString(R.string.lc_stream_tray_item_selected_accessibility_string, objArr));
                    }
                }
                PopupWindow popupWindow2 = this.g;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                    this.g = null;
                }
            } else {
                xtl.c("Unknown menu item view clicked.");
            }
        }
    }

    public static int a(LinearLayout linearLayout, View view) {
        return ((-linearLayout.getMeasuredHeight()) - view.getHeight()) - view.getPaddingTop();
    }
}
