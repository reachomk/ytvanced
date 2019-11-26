package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: igg */
final /* synthetic */ class igg implements OnClickListener {
    private final igd a;

    igg(igd igd) {
        this.a = igd;
    }

    public final void onClick(View view) {
        igd igd = this.a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("menu_as_bottom_sheet", true);
        igd.d.a(bundle);
    }
}
