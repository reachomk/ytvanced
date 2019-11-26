package defpackage;

import android.app.Activity;
import android.text.TextUtils;

/* renamed from: tuq */
final class tuq implements tuv {
    public final /* synthetic */ tur a;

    tuq(tur tur) {
        this.a = tur;
    }

    public final void a(Activity activity) {
        twr twr;
        tur tur = this.a;
        Class cls = activity.getClass();
        if (TextUtils.isEmpty(null)) {
            twr = new twr(cls.getSimpleName());
        } else {
            String str = "null";
            String simpleName = cls.getSimpleName();
            if (simpleName.length() == 0) {
                simpleName = new String(str);
            } else {
                simpleName = str.concat(simpleName);
            }
            twr = new twr(simpleName);
        }
        tur.a(twr);
    }

    public final void b(Activity activity) {
        this.a.a(null);
        if (this.a.i.get()) {
            this.a.c().submit(new tut(this));
        }
    }
}
