package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: xqs */
public final class xqs implements OnTouchListener {
    public final List a = new ArrayList();
    private View b;
    private xqv c;

    public final void a(View view) {
        View view2 = this.b;
        if (view2 != null) {
            view2.setOnTouchListener(null);
        }
        for (xqv a : this.a) {
            a.a();
        }
        this.b = view;
        view = this.b;
        if (view != null) {
            view.setOnTouchListener(this);
        }
    }

    public final void a(xqv xqv) {
        this.a.add(0, xqv);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Object obj;
        xqv xqv = this.c;
        xqv xqv2 = null;
        boolean z = true;
        if (xqv == null) {
            obj = null;
        } else {
            obj = (xqv.d() && this.c.a(view, motionEvent)) ? 1 : null;
            if (obj == null) {
                xqv xqv3 = this.c;
                this.c = null;
                xqv2 = xqv3;
            }
        }
        Iterator it = this.a.iterator();
        while (obj == null) {
            if (it.hasNext()) {
                xqv xqv4 = (xqv) it.next();
                if (xqv4 != xqv2) {
                    obj = (xqv4.d() && xqv4.a(view, motionEvent)) ? 1 : null;
                    if (obj != null) {
                        this.c = xqv4;
                        for (xqv xqv5 : this.a) {
                            if (xqv5 != xqv4) {
                                xqv5.a();
                            }
                        }
                    }
                }
            } else if (this.a.size() <= 0) {
                z = false;
            } else if (motionEvent.getActionMasked() == 0) {
                return z;
            } else {
                return false;
            }
            return z;
        }
        return z;
    }
}
