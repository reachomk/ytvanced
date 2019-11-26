package defpackage;

import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* renamed from: zrq */
final /* synthetic */ class zrq implements Runnable {
    private final zrn a;
    private final ChooseFilterView b;

    zrq(zrn zrn, ChooseFilterView chooseFilterView) {
        this.a = zrn;
        this.b = chooseFilterView;
    }

    public final void run() {
        zrn zrn = this.a;
        ChooseFilterView chooseFilterView = this.b;
        if (zrn.a.ab() != null) {
            zrn.a.ab().setVisibility(8);
        }
        chooseFilterView.c().g();
    }
}
