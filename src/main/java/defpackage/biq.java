package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: biq */
public final class biq implements aba {
    private final Rect a = new Rect();
    private final /* synthetic */ ViewPager b;

    public biq(ViewPager viewPager) {
        this.b = viewPager;
    }

    public final abx a(View view, abx abx) {
        abx a = abe.a(view, abx);
        if (a.e()) {
            return a;
        }
        Rect rect = this.a;
        rect.left = a.a();
        rect.top = a.b();
        rect.right = a.c();
        rect.bottom = a.d();
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            abx b = abe.b(this.b.getChildAt(i), a);
            rect.left = Math.min(b.a(), rect.left);
            rect.top = Math.min(b.b(), rect.top);
            rect.right = Math.min(b.c(), rect.right);
            rect.bottom = Math.min(b.d(), rect.bottom);
        }
        return a.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
