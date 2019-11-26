package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.PowerManager;

/* renamed from: aez */
final class aez extends aey {
    private final PowerManager a;
    private final /* synthetic */ aek b;

    aez(aek aek, Context context) {
        this.b = aek;
        super(aek);
        this.a = (PowerManager) context.getSystemService("power");
    }

    public final int a() {
        if (VERSION.SDK_INT < 21 || !this.a.isPowerSaveMode()) {
            return 1;
        }
        return 2;
    }

    public final void b() {
        this.b.q();
    }

    /* Access modifiers changed, original: final */
    public final IntentFilter d() {
        if (VERSION.SDK_INT < 21) {
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }
}
