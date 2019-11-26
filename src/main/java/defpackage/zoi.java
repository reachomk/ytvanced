package defpackage;

import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* renamed from: zoi */
public final /* synthetic */ class zoi implements zmq {
    private final ChooseFilterView a;
    private final zng b;

    public zoi(ChooseFilterView chooseFilterView, zng zng) {
        this.a = chooseFilterView;
        this.b = zng;
    }

    public final void a(Object obj) {
        ChooseFilterView chooseFilterView = this.a;
        zng zng = this.b;
        chooseFilterView.e = zng.a(new zoj(chooseFilterView, (zmj) obj, zng));
    }
}
