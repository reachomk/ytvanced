package defpackage;

import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import java.util.List;

/* renamed from: zoj */
final /* synthetic */ class zoj implements zmp {
    private final ChooseFilterView a;
    private final zmj b;
    private final zng c;

    zoj(ChooseFilterView chooseFilterView, zmj zmj, zng zng) {
        this.a = chooseFilterView;
        this.b = zmj;
        this.c = zng;
    }

    public final void a(Object obj) {
        ChooseFilterView chooseFilterView = this.a;
        zmj zmj = this.b;
        zng zng = this.c;
        List list = (List) obj;
        if (!chooseFilterView.a.a()) {
            chooseFilterView.d.b = zmj.a(ayzc.EFFECTS_FEATURE_DOT_ON_FILTER_ICON);
            chooseFilterView.a(list, null, zmj.a(ayzc.EFFECTS_FEATURE_DOT_ON_EFFECT_THUMBNAIL), false, null, zng);
        }
    }
}
