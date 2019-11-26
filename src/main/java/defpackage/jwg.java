package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

/* renamed from: jwg */
public final class jwg extends akyg implements OnItemClickListener, hxe {
    private final String Z;
    private final String aa;

    public jwg() {
        String str = "";
        this.Z = str;
        this.aa = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final String X() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final OnItemClickListener Y() {
        return this;
    }

    public final void ad_() {
        super.ad_();
        dismiss();
    }

    public final void a(nn nnVar) {
        if (!F_() && !v()) {
            a(nnVar.f(), "AUTONAV_MENU_BOTTOM_SHEET_FRAGMENT");
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ((akyj) this.aq).getItem(i);
        dismiss();
    }

    private final jwl f(boolean z) {
        String str;
        nn p = p();
        if (z) {
            str = this.aa;
        } else {
            str = this.Z;
        }
        jwl jwl = new jwl(p, str);
        jwl.a(z ^ 1);
        return jwl;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ListAdapter Z() {
        akyj akyj = new akyj(p(), true);
        akyj.add(f(true));
        akyj.add(f(false));
        return akyj;
    }
}
