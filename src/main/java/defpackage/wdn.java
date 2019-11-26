package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: wdn */
public final class wdn {
    public final xsc a;
    public final WeakHashMap b = new WeakHashMap();
    public long c = -1;

    public wdn(xsc xsc) {
        this.a = xsc;
    }

    public final void a(View view) {
        Animator animator = (Animator) this.b.remove(view);
        if (animator != null) {
            wdn.a(animator);
        }
    }

    public final void a() {
        for (Animator a : this.b.values()) {
            wdn.a(a);
        }
        this.b.clear();
    }

    private static void a(Animator animator) {
        animator.removeAllListeners();
        animator.cancel();
    }

    public static Animator a(View view, long j) {
        View findViewById = view.findViewById(R.id.avatar);
        View findViewById2 = view.findViewById(R.id.comment);
        View findViewById3 = view.findViewById(R.id.metadata);
        view = view.findViewById(R.id.action_bar);
        if (findViewById == null || findViewById2 == null || findViewById3 == null || view == null) {
            return null;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{wdn.a(findViewById, 0, j), wdn.a(findViewById2, 0, j), wdn.a(findViewById3, 1, j), wdn.a(view, 2, j)});
        return animatorSet;
    }

    private static Animator a(View view, int i, long j) {
        float min;
        i *= 75;
        int i2 = i + 300;
        int i3 = i2 + 750;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        long j2 = (long) i;
        if (j < j2) {
            animatorSet.setStartDelay(j2 - j);
        }
        j2 = (long) i2;
        if (j < j2) {
            min = (float) Math.min(j2 - j, 300);
            float f = ((min / 300.0f) * 0.5f) + 0.5f;
            view.setAlpha(f);
            arrayList.add(wdn.a(view, (int) min, f, 0.5f));
        }
        long j3 = (long) i3;
        if (j < j3) {
            min = (float) Math.min(j3 - j, 750);
            float f2 = 1.0f - ((min / 750.0f) * 0.5f);
            if (arrayList.isEmpty()) {
                view.setAlpha(f2);
            }
            arrayList.add(wdn.a(view, (int) min, f2, 1.0f));
        }
        if (arrayList.isEmpty()) {
            view.setAlpha(1.0f);
        }
        arrayList.add(wdn.a(view, (int) Math.min(2200 - j, 1000), 1.0f, 1.0f));
        animatorSet.playSequentially(arrayList);
        return animatorSet;
    }

    private static Animator a(View view, int i, float f, float f2) {
        return ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f, f2}).setDuration((long) i);
    }
}
