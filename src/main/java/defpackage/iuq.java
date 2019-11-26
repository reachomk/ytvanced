package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iuq */
final class iuq implements OnClickListener {
    private final /* synthetic */ akbk a;
    private final /* synthetic */ iup b;

    iuq(iup iup, akbk akbk) {
        this.b = iup;
        this.a = akbk;
    }

    public final void onClick(View view) {
        int i = 0;
        if (this.a.hasExtension(akbj.b) && ((Boolean) this.a.getExtension(akbj.b)).booleanValue()) {
            i = 1;
        }
        this.a.setExtension(akbj.b, Boolean.valueOf(i ^ 1));
        this.b.a(true);
        this.b.b();
    }
}
