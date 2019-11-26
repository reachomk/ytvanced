package defpackage;

import android.app.Activity;
import android.view.ViewGroup;

/* renamed from: itr */
public final class itr implements akox {
    private final Activity a;
    private final akkq b;

    public itr(Activity activity, akkq akkq) {
        this.a = activity;
        this.b = akkq;
    }

    public final /* synthetic */ akot a(ViewGroup viewGroup) {
        return new ito(this.a, this.b, viewGroup);
    }
}
