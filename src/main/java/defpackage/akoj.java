package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: akoj */
public final class akoj implements OnClickListener {
    private static final akok b = new akoi();
    private static final akon c = new akol();
    public aaas a;
    private final akou d;
    private final akok e;
    private acvx f;
    private apxu g;
    private Map h;
    private akon i;

    public akoj(aaas aaas, View view) {
        this(aaas, new akpn(view));
    }

    public akoj(aaas aaas, akou akou) {
        this(aaas, akou, null);
    }

    public akoj(aaas aaas, View view, akok akok) {
        this(aaas, new akpn(view), akok);
    }

    public akoj(aaas aaas, akou akou, akok akok) {
        this.a = (aaas) amqw.a((Object) aaas);
        if (akou == null) {
            akou = new akom();
        }
        this.d = akou;
        this.d.a((OnClickListener) this);
        this.d.a(false);
        if (akok == null) {
            akok = b;
        }
        this.e = akok;
        this.f = acvx.g;
        this.i = c;
        this.h = Collections.emptyMap();
    }

    public final void a(acvx acvx, apxu apxu, Map map) {
        a(acvx, apxu, map, null);
    }

    public final void a(acvx acvx, apxu apxu, Map map, akon akon) {
        if (acvx == null) {
            acvx = acvx.g;
        }
        this.f = acvx;
        this.g = apxu;
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.h = map;
        if (akon == null) {
            akon = c;
        }
        this.i = akon;
        this.d.a(apxu != null);
    }

    public final void onClick(View view) {
        if (!this.e.a(view)) {
            this.g = this.f.a(this.g);
            aaas aaas = this.a;
            apxu apxu = this.g;
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", this.f);
            hashMap.putAll(this.h);
            this.i.a(hashMap);
            aaas.a(apxu, hashMap);
        }
    }

    public final void a() {
        this.g = null;
        this.f = acvx.g;
        this.h = Collections.emptyMap();
        this.i = c;
    }
}
