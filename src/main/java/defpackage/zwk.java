package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: zwk */
public final class zwk implements zwh {
    private final Map a;

    public zwk(Map map) {
        this.a = map;
    }

    public final aqj a(Context context, ViewGroup viewGroup, zug zug, boolean z) {
        return ((zwh) this.a.get(zug)).a(context, viewGroup, zug, z);
    }

    public final void a(Context context, zud zud, aqj aqj, zwj zwj) {
        ((zwh) this.a.get(zud.b)).a(context, zud, aqj, zwj);
    }
}
