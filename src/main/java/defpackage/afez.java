package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: afez */
public final class afez {
    public final Context a;
    public final afjc b;
    public final Intent c;
    public int d = -1;
    private final Intent e;

    public afez(Context context, afjc afjc) {
        this.a = context;
        this.b = afjc;
        this.c = new Intent("android.media.action.OPEN_AUDIO_EFFECT_CONTROL_SESSION");
        String str = "android.media.extra.PACKAGE_NAME";
        this.c.putExtra(str, context.getPackageName());
        this.e = new Intent("android.media.action.CLOSE_AUDIO_EFFECT_CONTROL_SESSION");
        this.e.putExtra(str, context.getPackageName());
    }

    public final void a(int i) {
        if (!this.b.i()) {
            arvt b = this.b.d.b();
            if (b != null) {
                auuo auuo = b.k;
                if (auuo == null) {
                    auuo = auuo.k;
                }
                aorz aorz = auuo.i;
                if (aorz == null) {
                    aorz = aorz.j;
                }
                int a = argp.a(aorz.c);
                if (a == 0 || a != 3) {
                    return;
                }
            }
            return;
        }
        if (this.d == i && i != -1) {
            this.e.putExtra("android.media.extra.AUDIO_SESSION", i);
            this.a.sendBroadcast(this.e);
            this.d = -1;
        }
    }
}
