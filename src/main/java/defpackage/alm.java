package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.View;

/* renamed from: alm */
public final class alm extends and {
    private final /* synthetic */ alq c;
    private final /* synthetic */ AppCompatSpinner d;

    public alm(AppCompatSpinner appCompatSpinner, View view, alq alq) {
        this.d = appCompatSpinner;
        this.c = alq;
        super(view);
    }

    public final ajq a() {
        return this.c;
    }

    public final boolean b() {
        if (!this.d.b.e()) {
            this.d.a();
        }
        return true;
    }
}
