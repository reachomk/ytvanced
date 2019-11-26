package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: kgj */
public final class kgj implements akox {
    private final Activity a;
    private final akkq b;
    private final aaas c;

    public kgj(Activity activity, akkq akkq, aaas aaas) {
        this.a = (Activity) amqw.a((Object) activity);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (aaas) amqw.a((Object) aaas);
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new kgh(this.a, this.b, this.c, viewGroup);
    }
}
