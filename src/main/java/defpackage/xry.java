package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

/* renamed from: xry */
public final class xry {
    private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private final Context b;

    public xry(Context context) {
        this.b = (Context) amqw.a((Object) context);
    }

    public final float a() {
        Bundle c = c();
        float f = (float) c.getInt("level", -1);
        float f2 = (float) c.getInt("scale", -1);
        return (f < 0.0f || f2 <= 0.0f) ? -1.0f : f / f2;
    }

    public final boolean b() {
        if (c().getInt("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    private final Bundle c() {
        Intent registerReceiver = this.b.registerReceiver(null, a);
        if (registerReceiver == null) {
            return new Bundle();
        }
        return registerReceiver.getExtras();
    }
}
