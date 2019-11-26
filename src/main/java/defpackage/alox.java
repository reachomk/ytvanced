package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alox */
final class alox implements OnClickListener {
    private final /* synthetic */ aloy a;

    alox(aloy aloy) {
        this.a = aloy;
    }

    public final void onClick(View view) {
        aqkg aqkg = (aqkg) view.getTag();
        if (this.a.a(aqkg)) {
            view.setSelected(this.a.b(aqkg));
        }
    }
}
