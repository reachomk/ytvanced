package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.ViewGroup;

/* renamed from: fby */
public final class fby extends bgx {
    private fby() {
    }

    public final void a(bhn bhn) {
        fby.d(bhn);
    }

    public final void b(bhn bhn) {
        fby.d(bhn);
    }

    private static void d(bhn bhn) {
        bhn.a.put("hatsSurveyView:HEIGHT", Integer.valueOf(bhn.b.getHeight()));
    }

    public final Animator a(ViewGroup viewGroup, bhn bhn, bhn bhn2) {
        if (bhn == null || bhn2 == null) {
            return null;
        }
        int intValue = ((Integer) bhn.a.get("hatsSurveyView:HEIGHT")).intValue();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", new float[]{(float) (((Integer) bhn2.a.get("hatsSurveyView:HEIGHT")).intValue() - intValue), 0.0f});
        ofFloat.setInterpolator(new ayr());
        return ofFloat;
    }

    public /* synthetic */ fby(byte b) {
    }
}
