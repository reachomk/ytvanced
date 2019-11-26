package defpackage;

import android.database.DataSetObserver;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;

/* renamed from: zrn */
final class zrn extends DataSetObserver {
    public final /* synthetic */ zrg a;
    private final /* synthetic */ ChooseFilterView b;

    zrn(zrg zrg, ChooseFilterView chooseFilterView) {
        this.a = zrg;
        this.b = chooseFilterView;
    }

    public final void onChanged() {
        zrv zrv = this.a.at;
        if (zrv != null) {
            ujf ujf = zrv.f;
            if (ujf == null) {
                xtl.d("Video in video view manager not set.");
                return;
            }
            ujf.a(this.b.c().f);
            if (!this.b.c().c()) {
                this.a.a(new zrq(this, this.b));
            }
            return;
        }
        xtl.d("Video view manager not ready.");
    }
}
