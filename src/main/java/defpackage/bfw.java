package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: bfw */
final class bfw extends AnimatorListenerAdapter {
    private boolean a;
    private final Matrix b = new Matrix();
    private final /* synthetic */ boolean c;
    private final /* synthetic */ Matrix d;
    private final /* synthetic */ View e;
    private final /* synthetic */ bgb f;
    private final /* synthetic */ bfy g;
    private final /* synthetic */ bfv h;

    bfw(bfv bfv, boolean z, Matrix matrix, View view, bgb bgb, bfy bfy) {
        this.h = bfv;
        this.c = z;
        this.d = matrix;
        this.e = view;
        this.f = bgb;
        this.g = bfy;
    }

    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.a) {
            if (this.c && this.h.a) {
                a(this.d);
            } else {
                this.e.setTag(R.id.transition_transform, null);
                this.e.setTag(R.id.parent_matrix, null);
            }
        }
        bht.c(this.e, null);
        this.f.a(this.e);
    }

    public final void onAnimationPause(Animator animator) {
        a(this.g.a);
    }

    public final void onAnimationResume(Animator animator) {
        bfv.a(this.e);
    }

    private final void a(Matrix matrix) {
        this.b.set(matrix);
        this.e.setTag(R.id.transition_transform, this.b);
        this.f.a(this.e);
    }
}
