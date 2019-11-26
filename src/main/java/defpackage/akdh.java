package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: akdh */
public final class akdh implements sko {
    private final Context a;
    private final bapu b;
    private final bbmz c = new bbmz();
    private PopupWindow d;

    public akdh(Context context, bapu bapu) {
        this.a = context;
        this.b = bapu;
    }

    public final void a(azuj azuj, View view) {
        a();
        View cpq = new cpq(this.a);
        cpq.a(((akei) this.b.get()).a(cpq.v, swk.i().a(cpq).a(), azuj.toByteArray(), this.c));
        this.d = new PopupWindow(cpq, -2, -2, true);
        if (VERSION.SDK_INT < 21) {
            this.d.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            this.d.setBackgroundDrawable(new ColorDrawable(-1));
            this.d.setElevation(TypedValue.applyDimension(1, 3.0f, this.a.getResources().getDisplayMetrics()));
        }
        PopupWindow popupWindow = this.d;
        int width = view.getWidth() - cpq.getMeasuredWidth();
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = rect.bottom;
        int i2 = iArr[1];
        int measuredHeight = cpq.getMeasuredHeight();
        int i3 = -view.getHeight();
        if (i - i2 >= measuredHeight) {
            measuredHeight = 0;
        }
        popupWindow.showAsDropDown(view, width, i3 - measuredHeight);
    }

    public final void a() {
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.d = null;
            this.c.a();
        }
    }
}
