package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: bfl */
public final class bfl extends bgx {
    private static final String[] a = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property t;
    private static final Property u;
    private static final Property v;
    private static final Property w;
    private static final Property x = new bfr(PointF.class, "position");

    public final String[] a() {
        return a;
    }

    private static void d(bhn bhn) {
        View view = bhn.b;
        if (abe.D(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            bhn.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            bhn.a.put("android:changeBounds:parent", bhn.b.getParent());
        }
    }

    public final void a(bhn bhn) {
        bfl.d(bhn);
    }

    public final void b(bhn bhn) {
        bfl.d(bhn);
    }

    public final Animator a(ViewGroup viewGroup, bhn bhn, bhn bhn2) {
        bhn bhn3 = bhn;
        bhn bhn4 = bhn2;
        if (bhn3 == null || bhn4 == null) {
            return null;
        }
        String str = "android:changeBounds:parent";
        ViewGroup viewGroup2 = (ViewGroup) bhn4.a.get(str);
        if (((ViewGroup) bhn3.a.get(str)) == null || viewGroup2 == null) {
            return null;
        }
        int i;
        View view = bhn4.b;
        str = "android:changeBounds:bounds";
        Rect rect = (Rect) bhn3.a.get(str);
        Rect rect2 = (Rect) bhn4.a.get(str);
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        String str2 = "android:changeBounds:clip";
        Rect rect3 = (Rect) bhn3.a.get(str2);
        Rect rect4 = (Rect) bhn4.a.get(str2);
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (!(i6 == i7 && i8 == i9)) {
                i++;
            }
        }
        if (!(rect3 == null || rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i14 = i;
        if (i14 > 0) {
            bgx bgx;
            Animator a;
            bht.a(view, i2, i4, i6, i8);
            if (i14 != 2) {
                bgx = this;
                if (i2 == i3 && i4 == i5) {
                    a = bgq.a(view, v, bgx.s.a((float) i6, (float) i8, (float) i7, (float) i9));
                } else {
                    a = bgq.a(view, w, bgx.s.a((float) i2, (float) i4, (float) i3, (float) i5));
                }
            } else if (i10 == i12 && i11 == i13) {
                bgx = this;
                a = bgq.a(view, x, bgx.s.a((float) i2, (float) i4, (float) i3, (float) i5));
            } else {
                bgx = this;
                bfs bfs = new bfs(view);
                ObjectAnimator a2 = bgq.a(bfs, t, bgx.s.a((float) i2, (float) i4, (float) i3, (float) i5));
                ObjectAnimator a3 = bgq.a(bfs, u, bgx.s.a((float) i6, (float) i8, (float) i7, (float) i9));
                Animator animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{a2, a3});
                animatorSet.addListener(new bfq(bfs));
                a = animatorSet;
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup3 = (ViewGroup) view.getParent();
                bhr.a(viewGroup3, true);
                bgx.a(new bft(viewGroup3));
            }
            return a;
        }
        return null;
    }

    static {
        bfk bfk = new bfk(PointF.class, "boundsOrigin");
        String str = "topLeft";
        t = new bfn(PointF.class, str);
        String str2 = "bottomRight";
        u = new bfm(PointF.class, str2);
        v = new bfp(PointF.class, str2);
        w = new bfo(PointF.class, str);
        bgv bgv = new bgv();
    }
}
