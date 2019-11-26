package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* renamed from: xqi */
public class xqi extends ViewPager {
    private final xqp j;
    private final xqp k;

    public xqi(Context context) {
        super(context);
        this.j = new xql(this);
        this.k = new xqk(this);
    }

    public xqi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = new xqn(this);
        this.k = new xqm(this);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return xqi.a(motionEvent, this.k);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return xqi.a(motionEvent, this.j);
    }

    private static boolean a(MotionEvent motionEvent, xqp xqp) {
        try {
            return xqp.a(motionEvent);
        } catch (IndexOutOfBoundsException unused) {
            return false;
        }
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ boolean a(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ boolean b(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}
