package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: akse */
public final class akse {
    public final aaas a;
    public boolean b = false;
    private final Context c;
    private final xwb d;

    public akse(Context context, xwb xwb, aaas aaas) {
        this.c = context;
        this.d = xwb;
        this.a = aaas;
    }

    public final void a(atze atze, amqp amqp, Object obj) {
        amqp a = amqp.a(aksh.a);
        new akrz(this.c, this.d, atze, a, new aksg(this, atze, a, obj)).show();
    }

    /* Access modifiers changed, original: final */
    public final boolean a(atze atze, akrz akrz, String str, aqyf aqyf, aqyf aqyf2, boolean z) {
        boolean z2 = true;
        int a = amqu.a(str) ^ 1;
        int i = atze.a;
        int i2 = ((i & 256) != 0 && aqyf == null) ? 0 : 1;
        i = ((i & 512) != 0 && aqyf2 == null) ? 0 : 1;
        if (this.b) {
            akrz.d.setActivated(a ^ 1);
            akrz.f.setActivated(i2 ^ 1);
            akrz.g.setActivated(i ^ 1);
        }
        if (a == 0 || i2 == 0 || i == 0) {
            z2 = false;
        }
        if (z2) {
            akrz.c.setImageResource(R.drawable.quantum_ic_send_googblue_24);
        } else {
            akrz.c.setImageResource(R.drawable.quantum_ic_send_grey600_24);
            if (z) {
                akrz.c.announceForAccessibility(akrz.a.e);
                return false;
            }
        }
        return z2;
    }
}
