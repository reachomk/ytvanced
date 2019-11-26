package defpackage;

import android.view.animation.AnimationSet;
import android.widget.ViewSwitcher;
import com.google.android.youtube.R;
import java.util.Locale;

/* renamed from: kfg */
final /* synthetic */ class kfg implements Runnable {
    private final kfh a;

    kfg(kfh kfh) {
        this.a = kfh;
    }

    public final void run() {
        kfh kfh = this.a;
        kfh.h = true;
        ViewSwitcher viewSwitcher;
        kfe kfe;
        kfe kfe2;
        AnimationSet animationSet;
        kfi kfi;
        kfe kfe3;
        AnimationSet animationSet2;
        if (kfh.b.getDisplayedChild() == 1) {
            viewSwitcher = kfh.b;
            kfe = kfh.a;
            viewSwitcher.setInAnimation(kfe.a(0.0f, 1.0f, kfe.c, (int) R.interpolator.mtrl_fast_out_linear_in));
            kfe2 = kfh.a;
            animationSet = new AnimationSet(true);
            animationSet.setStartOffset(250);
            animationSet.addAnimation(kfe2.a(0.0f, 1.0f, kfe2.d, (int) R.interpolator.mtrl_linear_out_slow_in));
            animationSet.addAnimation(kfe2.a(kfe2.b, 0, kfe2.d, (int) R.interpolator.mtrl_linear_out_slow_in));
            kfi = kfh.g;
            if (kfi != null) {
                animationSet.setAnimationListener(new kfj(kfi, kfh.i));
            }
            kfh.c.setInAnimation(animationSet);
            viewSwitcher = kfh.b;
            kfe = kfh.a;
            viewSwitcher.setOutAnimation(kfe.a(1.0f, 0.0f, kfe.c, (int) R.interpolator.mtrl_fast_out_linear_in));
            viewSwitcher = kfh.c;
            kfe3 = kfh.a;
            animationSet2 = new AnimationSet(true);
            animationSet2.setStartOffset(50);
            kfe = kfe3;
            animationSet2.addAnimation(kfe.a(1.0f, 0.0f, kfe3.d, (int) R.interpolator.mtrl_fast_out_linear_in));
            animationSet2.addAnimation(kfe.a(0, -kfe3.a, kfe3.d, (int) R.interpolator.mtrl_fast_out_linear_in));
            viewSwitcher.setOutAnimation(animationSet2);
        } else if (kfh.b.getDisplayedChild() == 0) {
            viewSwitcher = kfh.b;
            kfe = kfh.a;
            viewSwitcher.setInAnimation(kfe.a(0.0f, 1.0f, kfe.c, (int) R.interpolator.mtrl_fast_out_linear_in));
            kfe2 = kfh.a;
            animationSet = new AnimationSet(true);
            animationSet.setStartOffset(200);
            animationSet.addAnimation(kfe2.a(0.0f, 1.0f, kfe2.d, (int) R.interpolator.mtrl_linear_out_slow_in));
            animationSet.addAnimation(kfe2.a(-kfe2.b, 0, kfe2.d, (int) R.interpolator.mtrl_linear_out_slow_in));
            kfi = kfh.g;
            if (kfi != null) {
                animationSet.setAnimationListener(new kfj(kfi, kfh.i));
            }
            kfh.c.setInAnimation(animationSet);
            viewSwitcher = kfh.b;
            kfe = kfh.a;
            viewSwitcher.setOutAnimation(kfe.a(1.0f, 0.0f, kfe.c, (int) R.interpolator.mtrl_fast_out_linear_in));
            viewSwitcher = kfh.c;
            kfe3 = kfh.a;
            animationSet2 = new AnimationSet(true);
            kfe = kfe3;
            animationSet2.addAnimation(kfe.a(1.0f, 0.0f, kfe3.d, (int) R.interpolator.mtrl_fast_out_linear_in));
            animationSet2.addAnimation(kfe.a(0, kfe3.a, kfe3.d, (int) R.interpolator.mtrl_fast_out_linear_in));
            viewSwitcher.setOutAnimation(animationSet2);
        } else {
            String.format(Locale.US, "Error displaying illegal view %d", new Object[]{Integer.valueOf(kfh.b.getDisplayedChild())});
        }
        kfh.b.showNext();
        kfh.c.showNext();
        if (kfh.i) {
            kfh.d.postDelayed(kfh.e, (long) kfh.f);
        }
    }
}
