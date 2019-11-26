package defpackage;

import android.app.Activity;
import android.content.Context;
import android.preference.SwitchPreference;

/* renamed from: uwk */
public final class uwk extends SwitchPreference implements uum, uwl {
    public final uwm a;
    public final aldg b;
    public final axgk c;
    public final boolean d;

    public uwk(Context context, boolean z, uwm uwm, aldg aldg, axgk axgk) {
        super(context);
        this.d = z;
        this.a = uwm;
        this.c = axgk;
        this.b = aldg;
    }

    public final void a() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void a(boolean z) {
        if (z && !isChecked()) {
            this.b.a(this.c, true);
            setChecked(true);
        }
    }

    public final void b() {
        ((Activity) getContext()).runOnUiThread(new uwj(this));
    }
}
