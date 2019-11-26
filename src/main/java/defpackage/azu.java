package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: azu */
final class azu implements OnGlobalLayoutListener {
    private final /* synthetic */ Map a;
    private final /* synthetic */ Map b;
    private final /* synthetic */ azl c;

    azu(azl azl, Map map, Map map2) {
        this.c = azl;
        this.a = map;
        this.b = map2;
    }

    public final void onGlobalLayout() {
        this.c.m.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        azl azl = this.c;
        Map map = this.a;
        Map map2 = this.b;
        Set set = azl.p;
        if (set != null && azl.q != null) {
            int size = set.size() - azl.q.size();
            azx azx = new azx(azl);
            int firstVisiblePosition = azl.m.getFirstVisiblePosition();
            int i = 0;
            boolean z = true;
            Object obj = null;
            while (i < azl.m.getChildCount()) {
                bbs bbs;
                View childAt = azl.m.getChildAt(i);
                bbs bbs2 = (bbs) azl.n.getItem(firstVisiblePosition + i);
                Rect rect = (Rect) map.get(bbs2);
                int top = childAt.getTop();
                int i2 = rect == null ? (azl.w * size) + top : rect.top;
                AnimationSet animationSet = new AnimationSet(z);
                Set set2 = azl.p;
                if (set2 == null || !set2.contains(bbs2)) {
                    bbs = bbs2;
                } else {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    bbs = bbs2;
                    alphaAnimation.setDuration((long) azl.Q);
                    animationSet.addAnimation(alphaAnimation);
                    i2 = top;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (i2 - top), 0.0f);
                translateAnimation.setDuration((long) azl.P);
                animationSet.addAnimation(translateAnimation);
                z = true;
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(azl.S);
                if (obj == null) {
                    animationSet.setAnimationListener(azx);
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                bbs2 = bbs;
                map.remove(bbs2);
                map2.remove(bbs2);
                i++;
                obj = 1;
            }
            for (Entry entry : map2.entrySet()) {
                bbs bbs3 = (bbs) entry.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
                Rect rect2 = (Rect) map.get(bbs3);
                if (azl.q.contains(bbs3)) {
                    obj = new bak(bitmapDrawable, rect2);
                    obj.h = 1.0f;
                    obj.i = 0.0f;
                    obj.e = (long) azl.R;
                    obj.d = azl.S;
                } else {
                    int i3 = azl.w;
                    obj = new bak(bitmapDrawable, rect2);
                    obj.g = i3 * size;
                    obj.e = (long) azl.P;
                    obj.d = azl.S;
                    obj.m = new azn(azl, bbs3);
                    azl.r.add(bbs3);
                }
                azl.m.a.add(obj);
            }
        }
    }
}
