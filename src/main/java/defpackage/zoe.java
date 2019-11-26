package defpackage;

import android.os.Looper;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* renamed from: zoe */
public final class zoe {
    public final ChooseFilterView a;
    public boolean b;
    public zoq c;
    public zop d;

    public zoe(ChooseFilterView chooseFilterView) {
        this.a = chooseFilterView;
    }

    public final void a() {
        a(new zof(this));
    }

    public final void b() {
        a(new zoh(this));
    }

    private final void a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.a.post(runnable);
        }
    }
}
