package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* renamed from: aex */
final class aex extends abv {
    private final /* synthetic */ aeu a;

    aex(aeu aeu) {
        this.a = aeu;
    }

    public final void a(View view) {
        this.a.a.f.setVisibility(8);
        aek aek = this.a.a;
        PopupWindow popupWindow = aek.g;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (aek.f.getParent() instanceof View) {
            abe.u((View) this.a.a.f.getParent());
        }
        this.a.a.f.removeAllViews();
        this.a.a.i.a(null);
        this.a.a.i = null;
    }
}
