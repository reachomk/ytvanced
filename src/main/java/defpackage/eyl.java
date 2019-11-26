package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.HeightTransitionLayout;

/* renamed from: eyl */
public final class eyl extends bgx {
    public final void a(bhn bhn) {
        View view = bhn.b;
        if (view instanceof HeightTransitionLayout) {
            HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout) view;
            bhn.a.put("heightTransition:height", Integer.valueOf(heightTransitionLayout.getHeight()));
            heightTransitionLayout.a(heightTransitionLayout.getHeight());
        }
    }

    public final void b(bhn bhn) {
        View view = bhn.b;
        if (view instanceof HeightTransitionLayout) {
            HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout) view;
            bhn.a.put("heightTransition:height", Integer.valueOf(heightTransitionLayout.a));
            heightTransitionLayout.a(-1);
        }
    }

    public final Animator a(ViewGroup viewGroup, bhn bhn, bhn bhn2) {
        if (!(bhn == null || bhn2 == null)) {
            String str = "heightTransition:height";
            if (((Integer) bhn.a.get(str)).intValue() != ((Integer) bhn2.a.get(str)).intValue()) {
                HeightTransitionLayout heightTransitionLayout = (HeightTransitionLayout) bhn2.b;
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((Integer) bhn.a.get(str)).intValue(), ((Integer) bhn2.a.get(str)).intValue()});
                ofInt.addUpdateListener(new eyk(heightTransitionLayout));
                ofInt.addListener(new eyn(heightTransitionLayout));
                return ofInt;
            }
        }
        return null;
    }
}
