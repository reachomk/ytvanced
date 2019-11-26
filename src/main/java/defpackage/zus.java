package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import java.util.List;

/* renamed from: zus */
final class zus implements Runnable {
    public final /* synthetic */ zwj a;
    private final /* synthetic */ Context b;
    private final /* synthetic */ zuw c;
    private final /* synthetic */ LayoutInflater d;
    private final /* synthetic */ List e;
    private final /* synthetic */ zup f;

    zus(zup zup, Context context, zwj zwj, zuw zuw, LayoutInflater layoutInflater, List list) {
        this.f = zup;
        this.b = context;
        this.a = zwj;
        this.c = zuw;
        this.d = layoutInflater;
        this.e = list;
    }

    public final void run() {
        zwp zwp = new zwp();
        zwp.setDuration(1000);
        zwp.setInterpolator(this.b, 17563651);
        zwp.setAnimationListener(new zur(this));
        this.f.a(this.c, this.b, this.d, this.a, this.e, zwp);
    }
}
