package defpackage;

import android.view.View;
import android.view.View.OnScrollChangeListener;

/* renamed from: spn */
final /* synthetic */ class spn implements OnScrollChangeListener {
    private final swf a;
    private final bapj b;

    spn(swf swf, bapj bapj) {
        this.a = swf;
        this.b = bapj;
    }

    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        swf swf = this.a;
        bapj bapj = this.b;
        azve azve = (azve) azvf.d.createBuilder();
        azve.a((float) i);
        azve.b((float) i2);
        spl.a(view, swf, bapj.c(), (azvf) ((anxl) azve.build()));
    }
}
