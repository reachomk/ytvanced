package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jse */
public final class jse {
    private final akkq a;
    private final aaas b;
    private final acvx c;
    private final vod d;
    private final Context e;
    private final Map f = new HashMap();
    private final epj g;
    private View h;

    public jse(akkq akkq, aaas aaas, acvx acvx, vod vod, Context context, epj epj) {
        this.a = akkq;
        this.b = aaas;
        this.c = acvx;
        this.d = vod;
        this.e = context;
        this.g = (epj) amqw.a((Object) epj);
    }

    public final void a(Object obj) {
        View view = this.h;
        if (view != null) {
            view.setVisibility(8);
        }
        jsf b = b(obj);
        if (b != null) {
            b.a();
        }
    }

    public final void a(View view, Object obj) {
        jsf b = b(obj);
        if (view != null && b != null) {
            this.h = xpr.a(view, (int) R.id.companion_extension_stub, (int) R.id.companion_extension);
            view = this.h;
            if (view != null) {
                view.setVisibility(0);
                b.a(this.h, obj);
            }
        }
    }

    private final jsf b(Object obj) {
        if (obj != null && this.f.containsKey(obj.getClass())) {
            return (jsf) this.f.get(obj.getClass());
        }
        if (obj instanceof aqeg) {
            jsb jsb = new jsb(this.a, this.b, this.c, this.d, this.e);
            this.f.put(obj.getClass(), jsb);
            return jsb;
        } else if (obj instanceof awnb) {
            jsn jsn = new jsn(this.a, this.b, this.c, this.d, this.e, this.g);
            this.f.put(obj.getClass(), jsn);
            return jsn;
        } else {
            afpf afpf = afpf.ad;
            String valueOf = String.valueOf(obj);
            String str = "Unsupported companion extension renderer: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            afpc.a(1, afpf, valueOf);
            return null;
        }
    }
}
