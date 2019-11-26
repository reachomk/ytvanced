package defpackage;

import android.animation.ValueAnimator;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* renamed from: zok */
public final /* synthetic */ class zok implements Runnable {
    private final ChooseFilterView a;
    private final boolean b;
    private final boolean c;

    public zok(ChooseFilterView chooseFilterView, boolean z, boolean z2) {
        this.a = chooseFilterView;
        this.b = z;
        this.c = z2;
    }

    public final void run() {
        ChooseFilterView chooseFilterView = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        ValueAnimator valueAnimator = chooseFilterView.g;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            chooseFilterView.g.end();
        }
        if (chooseFilterView.a.a()) {
            int max = Math.max(chooseFilterView.getHeight(), 1);
            if (z) {
                chooseFilterView.setY(0.0f);
                chooseFilterView.setAlpha(1.0f);
                chooseFilterView.g = chooseFilterView.a(max, chooseFilterView.b());
            } else {
                chooseFilterView.g = chooseFilterView.a(max, 1);
            }
            if (z2) {
                chooseFilterView.g.start();
            } else {
                chooseFilterView.g.end();
            }
            chooseFilterView.d.b();
        }
    }
}
