package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;

/* renamed from: ioo */
public final class ioo implements bhd {
    private final /* synthetic */ long a;
    private final /* synthetic */ NavigationDropdownView b;

    public ioo(NavigationDropdownView navigationDropdownView, long j) {
        this.b = navigationDropdownView;
        this.a = j;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
        NavigationDropdownView navigationDropdownView = this.b;
        long j = this.a;
        if (navigationDropdownView.f == null) {
            navigationDropdownView.f = ValueAnimator.ofObject(new FloatEvaluator(), new Object[]{Float.valueOf(0.0f), Float.valueOf(1.0f)});
            if (j > 0) {
                navigationDropdownView.f.setDuration(j);
            }
            if (navigationDropdownView.g == null) {
                navigationDropdownView.g = new ios(navigationDropdownView);
            }
            navigationDropdownView.f.addUpdateListener(navigationDropdownView.g);
            navigationDropdownView.f.addListener(navigationDropdownView.g);
        }
        navigationDropdownView.f.start();
    }

    public final void a(bgx bgx) {
        if (this.b.c.getRotation() == 360.0f) {
            this.b.c.setRotation(0.0f);
        }
    }
}
