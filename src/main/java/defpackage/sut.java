package defpackage;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: sut */
public final class sut implements sxi {
    public int a;
    private final swm b;
    private final OrientationEventListener c;

    public sut(Context context, swm swm) {
        this.b = swm;
        int i = 2;
        if (context.getResources().getConfiguration().orientation != 2) {
            i = 4;
        }
        this.a = i;
        a(i);
        this.c = new suw(this, context);
    }

    public final void a() {
        this.c.enable();
    }

    public final void b() {
        this.c.disable();
    }

    public final void a(int i) {
        aztx aztx = (aztx) aztu.c.createBuilder();
        aztx.a(i);
        String str = "/device/orientation";
        this.b.a(str, ((aztu) ((anxl) aztx.build())).toByteArray(), false);
    }
}
