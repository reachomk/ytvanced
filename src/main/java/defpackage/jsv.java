package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;
import java.util.Map;

/* renamed from: jsv */
final /* synthetic */ class jsv implements OnClickListener {
    private final jst a;
    private final aogq b;
    private final List c;

    jsv(jst jst, aogq aogq, List list) {
        this.a = jst;
        this.b = aogq;
        this.c = list;
    }

    public final void onClick(View view) {
        jst jst = this.a;
        Object obj = this.b;
        List<apxu> list = this.c;
        if (!list.isEmpty()) {
            Map a = jst.a(obj);
            for (apxu a2 : list) {
                jst.a.a(a2, a);
            }
        }
    }
}
