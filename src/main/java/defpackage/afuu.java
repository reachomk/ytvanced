package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* renamed from: afuu */
public final class afuu {
    public boolean a;
    private final Context b;
    private final akvp c;
    private final akyz d;
    private PopupWindow e;

    public afuu(Context context, akvp akvp, akyz akyz) {
        this.b = context;
        this.c = akvp;
        this.d = akyz;
    }

    public final void a(axxd axxd, int i, View view, zn znVar, acvx acvx) {
        axxd axxd2 = axxd;
        View view2 = view;
        acvx acvx2 = acvx;
        int a = avkx.a(axxd2.f);
        if (a != 0 && a == 3) {
            a();
            ViewGroup viewGroup = null;
            ViewGroup viewGroup2 = (ViewGroup) View.inflate(this.b, R.layout.notification_bell_inline_menu, null);
            int i2 = -1;
            int i3 = 0;
            while (i3 < axxd2.b.size()) {
                atst atst;
                axxf axxf = (axxf) axxd2.b.get(i3);
                anxp anxp = axxf.f;
                if (anxp == null) {
                    anxp = axak.a;
                }
                anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    arml arml;
                    anxp = axxf.f;
                    if (anxp == null) {
                        anxp = axak.a;
                    }
                    access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                    anxp.a(access$000);
                    Object b = anxp.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    aphg aphg = (aphg) b;
                    View inflate = View.inflate(this.b, R.layout.notification_bell_inline_menu_item, viewGroup);
                    boolean z = axxf.b == i;
                    akyu a2 = this.d.a(inflate);
                    a2.a(aphg, acvx2);
                    a2.d = new afut(acvx2);
                    akyu akyu = a2;
                    View view3 = inflate;
                    aphg aphg2 = aphg;
                    axxf axxf2 = axxf;
                    afuw afuw = r0;
                    int i4 = i2;
                    afuw afuw2 = new afuw(this, inflate, viewGroup2, z, znVar, axxf2);
                    akyu.c = afuw;
                    View view4 = view3;
                    TextView textView = (TextView) view4.findViewById(R.id.text);
                    if ((aphg2.a & 128) != 0) {
                        arml = aphg2.g;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    textView.setText(ajqy.a(arml));
                    arwf arwf = aphg2.e;
                    if (arwf == null) {
                        arwf = arwf.c;
                    }
                    if ((arwf.a & 1) != 0) {
                        akvp akvp = this.c;
                        arwf arwf2 = aphg2.e;
                        if (arwf2 == null) {
                            arwf2 = arwf.c;
                        }
                        arwh a3 = arwh.a(arwf2.b);
                        if (a3 == null) {
                            a3 = arwh.UNKNOWN;
                        }
                        a = akvp.a(a3);
                        if (a != 0) {
                            ((ImageView) view4.findViewById(R.id.icon)).setImageResource(a);
                        }
                    }
                    if (z) {
                        i2 = viewGroup2.getChildCount();
                        a(view4, true);
                    } else {
                        i2 = i4;
                    }
                    viewGroup2.addView(view4);
                    view4.setTag(Integer.valueOf(axxf2.b));
                    atst = null;
                    acvx2.a(aphg2.r.d(), null);
                } else {
                    atst = viewGroup;
                }
                i3++;
                axxd2 = axxd;
                Object viewGroup3 = atst;
            }
            int i5 = i2;
            if (i5 != -1) {
                viewGroup2.measure(MeasureSpec.makeMeasureSpec(xss.f(this.b), aocf.UNSET_ENUM_VALUE), MeasureSpec.makeMeasureSpec(xss.g(this.b), aocf.UNSET_ENUM_VALUE));
                int i6 = 0;
                for (a = 0; a < i5; a++) {
                    i6 += viewGroup2.getChildAt(a).getMeasuredHeight();
                }
                this.e = new PopupWindow(viewGroup2, -2, -2, true);
                if (VERSION.SDK_INT >= 21) {
                    this.e.setElevation((float) xss.a(this.b.getResources().getDisplayMetrics(), 4));
                }
                this.e.setBackgroundDrawable(new ColorDrawable(xwe.a(this.b, R.attr.ytBrandBackgroundSolid)));
                this.e.setOutsideTouchable(true);
                int[] iArr = new int[2];
                view2.getLocationOnScreen(iArr);
                this.e.setAnimationStyle(16973826);
                this.e.showAtLocation(view2, 0, (((iArr[0] - viewGroup2.getMeasuredWidth()) + view.getWidth()) - view.getPaddingEnd()) + viewGroup2.getChildAt(0).getPaddingEnd(), (iArr[1] - i6) + ((view.getHeight() - viewGroup2.getChildAt(0).getMeasuredHeight()) / 2));
                return;
            }
            xtl.c("Could not find the index of the selected state in the model!");
        }
    }

    public final void a(View view, boolean z) {
        if (z) {
            view.setBackgroundColor(xwe.a(this.b, R.attr.ytGeneralBackgroundB));
            xoe.a(((ImageView) view.findViewById(R.id.icon)).getDrawable(), xwe.b(this.b, R.attr.ytCallToAction), Mode.SRC_IN);
            return;
        }
        view.setBackgroundColor(xwe.a(this.b, R.attr.ytBrandBackgroundSolid));
        xoe.a(((ImageView) view.findViewById(R.id.icon)).getDrawable(), xwe.b(this.b, R.attr.ytIconInactive), Mode.SRC_IN);
    }

    public final void a() {
        PopupWindow popupWindow = this.e;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.e = null;
        }
        this.a = false;
    }
}
