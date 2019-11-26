package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: jsn */
public final class jsn implements jsf {
    public awnb a;
    private final akkq b;
    private final aaas c;
    private final acvx d;
    private final vod e;
    private final ajqw f;
    private final epj g;
    private eph h;
    private vqx i;
    private View j;
    private View k;
    private View l;
    private TextView m;
    private TextView n;
    private ImageView o;

    public jsn(akkq akkq, aaas aaas, acvx acvx, vod vod, Context context, epj epj) {
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = (acvx) amqw.a((Object) acvx);
        this.e = (vod) amqw.a((Object) vod);
        ajqv a = ajqw.a();
        a.a = context;
        a.c = new akta(aaas);
        this.f = a.a();
        this.g = epj;
    }

    public final void a() {
        this.e.b(this.a);
        View view = this.j;
        if (view != null) {
            view.setVisibility(8);
            this.i.b();
            this.h.a();
        }
        this.j = null;
        this.a = null;
    }

    public final void a(Object obj, List list) {
        if (!this.e.a(obj)) {
            aaas aaas = this.c;
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
            hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{this.i});
            aabd.a(aaas, list, hashMap);
        }
    }
}
