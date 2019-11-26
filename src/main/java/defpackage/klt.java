package defpackage;

import android.view.View;
import com.google.android.youtube.R;

/* renamed from: klt */
public final class klt implements akot {
    private final eps a;

    public klt(epv epv) {
        this.a = epv.a(R.layout.swipe_button);
    }

    public final View K_() {
        return this.a.b;
    }

    public final void a(akpb akpb) {
        this.a.a(akpb);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        kls kls = (kls) obj;
        aphf aphf = (aphf) ((anxo) kls.a.toBuilder());
        if (!aphf.a(apgy.d)) {
            aphf.a(apgy.d, apgy.c);
        }
        aphb aphb = (aphb) ((anxo) ((apgy) aphf.b(apgy.d)).toBuilder());
        aphb.copyOnWrite();
        apgy apgy = (apgy) aphb.instance;
        apgy.a |= 1;
        apgy.b = 1;
        aphf.a(apgy.d, (apgy) ((anxl) aphb.build()));
        kls.a = (aphg) ((anxl) aphf.build());
        this.a.a_(akor, kls.a);
    }
}
