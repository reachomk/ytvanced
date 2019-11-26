package defpackage;

import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.os.Bundle;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: ggx */
public abstract class ggx extends nd implements OnKeyListener, gig {
    public akvp Z;
    public gjv aa;
    public acwa ab;
    public gkt ac;
    public final gha ad = new ggw(this);
    public int ae;
    public boolean af;
    private AnimatorSet ag;

    public abstract View W();

    public abstract View X();

    /* Access modifiers changed, original: protected */
    public List a(float f, int i) {
        throw null;
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        a(2, (int) R.style.f314ReelTheme.StickerCatalog);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        f(false);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void f(boolean z) {
        a(z, null);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z, AnimatorListener animatorListener) {
        Collection arrayList;
        AnimatorSet animatorSet = this.ag;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.ag.end();
        }
        float f = !z ? 0.0f : 1.0f;
        int i = !z ? this.ae : 0;
        if (this.af) {
            arrayList = new ArrayList();
            View X = X();
            Property property = View.TRANSLATION_Y;
            float[] fArr = new float[1];
            fArr[0] = (float) i;
            arrayList.add(ObjectAnimator.ofFloat(X, property, fArr).setDuration(300));
            arrayList.add(ObjectAnimator.ofFloat(W(), View.TRANSLATION_Y, new float[]{r2}).setDuration(300));
            arrayList.add(ObjectAnimator.ofFloat(W(), View.TRANSLATION_Y, new float[]{r2}).setDuration(300));
        } else {
            arrayList = a(f, i);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        if (!z) {
            animatorSet2.addListener(new ghb(this));
        } else if (animatorListener != null) {
            animatorSet2.addListener(animatorListener);
        }
        animatorSet2.start();
        this.ag = animatorSet2;
        if (z) {
            this.aa.ae();
            return;
        }
        this.ab.t().a();
        this.aa.af();
    }
}
