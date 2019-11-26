package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gfu */
public final class gfu {
    public static void a(ggb ggb) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ggb);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ggb ggb2 = (ggb) arrayList.get(i);
            View a = ggb2.a();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a, View.TRANSLATION_Y, new float[]{ggb2.b(), ggb2.c()});
            ofFloat.setDuration(250);
            ofFloat.addListener(new gfx(a, ggb2));
            arrayList2.add(ofFloat);
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.start();
    }

    public static AnimatorSet a(gfz gfz, boolean z, AnimatorSet animatorSet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(gfz);
        return gfu.a(arrayList, z, animatorSet, 250);
    }

    public static AnimatorSet a(List list, boolean z, AnimatorSet animatorSet, long j) {
        amqw.a(true, (Object) "Animation duration must be at least 0.");
        if (animatorSet != null && (animatorSet.isStarted() || animatorSet.isRunning())) {
            animatorSet.cancel();
        }
        animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (gfz gfz : list) {
            View a = gfz.a();
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = !z ? 0.0f : 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(a, property, fArr);
            ofFloat.setDuration(j);
            ofFloat.addListener(new gfw(a, gfz, z));
            arrayList.add(ofFloat);
        }
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        return animatorSet;
    }
}
