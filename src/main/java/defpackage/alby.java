package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alby */
final /* synthetic */ class alby implements OnClickListener {
    private final alcp a;
    private final alcg b;

    alby(alcp alcp, alcg alcg) {
        this.a = alcp;
        this.b = alcg;
    }

    public final void onClick(View view) {
        alcp alcp = this.a;
        alcg alcg = this.b;
        if (alcp.s() != null) {
            alcp.s().onClick(view);
        }
        alcg.a(0);
    }
}
