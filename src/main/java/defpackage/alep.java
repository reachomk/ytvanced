package defpackage;

import android.app.Activity;

/* renamed from: alep */
public final class alep {
    public final Activity a;
    public final String b;
    public alla c;
    private final avwe d;

    public alep(Activity activity, avwe avwe, String str) {
        this.a = (Activity) amqw.a((Object) activity);
        this.d = avwe;
        this.b = (String) amqw.a((Object) str);
    }

    public final void a(boolean z, alla alla) {
        if (alla != null) {
            alla.a(z);
            this.c = alla;
        }
        this.a.requestPermissions(new String[]{this.b}, this.d.g);
    }
}
