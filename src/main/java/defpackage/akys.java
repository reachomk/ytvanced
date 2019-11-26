package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

/* renamed from: akys */
public final class akys extends akyg implements OnItemClickListener {
    public akyv Z;
    private auvn aa;
    private akpk ab;

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

    public final void b(Bundle bundle) {
        super.b(bundle);
        bundle = this.j;
        if (bundle != null) {
            String str = "MENU_BOTTOM_SHEET_FRAGMENT_KEY";
            if (bundle.containsKey(str)) {
                try {
                    this.aa = (auvn) aobp.a(bundle, str, auvn.l, anxa.c());
                } catch (anyg e) {
                    xtl.a("Error decoding menu", e);
                    this.aa = auvn.l;
                }
            }
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ufk ufk = (ufk) ((ufg) ((akyn) this.aq).getItem(i));
        if (ufk instanceof akyr) {
            this.Z.a(((akyr) ufk).a);
        }
        dismiss();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ListAdapter Z() {
        this.ab = new akpk();
        auvn auvn = this.aa;
        if (auvn != null) {
            for (auvj auvj : auvn.b) {
                this.ab.add(new akyr(abmk.a(auvj).toString(), auvj));
            }
        }
        return new akyn(p(), this.ab);
    }
}
