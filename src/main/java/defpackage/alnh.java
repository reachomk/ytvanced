package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;

/* renamed from: alnh */
final class alnh implements Runnable {
    public final /* synthetic */ alnf a;

    alnh(alnf alnf) {
        this.a = alnf;
    }

    public final void run() {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{((ColorDrawable) this.a.a.getBackground()).getColor(), this.a.b});
        ofInt.setEvaluator(new ArgbEvaluator());
        ofInt.addUpdateListener(new alng(this));
        ofInt.setDuration(200);
        ofInt.start();
    }
}
