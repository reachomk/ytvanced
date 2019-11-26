package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;

/* renamed from: esw */
public final class esw extends fan {
    public final akvp a;
    public final Context b;
    public boolean c = false;

    public esw(ViewStub viewStub, Context context, akvp akvp) {
        super(viewStub);
        this.a = akvp;
        this.b = context;
    }

    public final void a() {
        if (this.e) {
            View view = this.f;
            if (view != null && view.getVisibility() == 0) {
                this.f.setVisibility(8);
            }
        }
        this.c = false;
    }
}
