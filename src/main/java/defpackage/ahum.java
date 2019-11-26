package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: ahum */
public final class ahum implements OnTouchListener {
    public ahuh a;
    private final xsc b;
    private final int c;
    private boolean d;
    private int e;
    private int f;

    public ahum(Context context, xsc xsc) {
        amqw.a((Object) context);
        this.b = (xsc) amqw.a((Object) xsc);
        ViewConfiguration.getLongPressTimeout();
        this.c = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        ahuh ahuh;
        if (action == 0) {
            ahuh = this.a;
            if (ahuh != null) {
                view.getWidth();
                view.getHeight();
                ahuh.a(x, y);
            }
            this.d = false;
            this.e = x;
            this.f = y;
            this.b.b();
            return false;
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    this.d = false;
                }
                return false;
            }
            action = x - this.e;
            int i = y - this.f;
            if (!this.d && (Math.abs(action) >= this.c || Math.abs(i) >= this.c)) {
                this.d = true;
                ahum.a(view, true);
            }
            if (this.d) {
                this.e = x;
                this.f = y;
                ahuh = this.a;
                if (ahuh != null) {
                    ahuh.a(x, y, view.getWidth(), view.getHeight());
                }
            }
            return this.d;
        } else if (!this.d) {
            return false;
        } else {
            this.d = false;
            ahuh = this.a;
            if (ahuh != null) {
                ahuh.b(x, y, view.getWidth(), view.getHeight());
            }
            ahum.a(view, false);
            return true;
        }
    }

    private static void a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }
}
