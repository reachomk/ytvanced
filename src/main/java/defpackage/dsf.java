package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.ConditionVariable;
import java.util.Locale;

/* renamed from: dsf */
public final class dsf implements acxn {
    public final Context a;
    public final Object b = new Object();
    public final ConditionVariable c = new ConditionVariable();
    public int d = 0;
    private final bcaa e;
    private final ConditionVariable f = new ConditionVariable();
    private int g = 0;

    public dsf(Context context, bcaa bcaa) {
        this.a = context.getApplicationContext();
        this.e = bcaa;
    }

    public final void a() {
        a(4);
    }

    public final void a(int i) {
        synchronized (this.b) {
            if (this.g == 0) {
                this.g = i;
                String.format(Locale.US, "Startup earlyDetected:%d detected:%d type:%d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.g), Integer.valueOf(b())});
                i = this.d;
                if (!(i == 0 || i == this.g)) {
                    afpc.a(1, afpf.initialization, String.format(Locale.US, "ColdStartTypeDetector mismatch earlyDetected:%d detected:%d type:%d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.g), Integer.valueOf(b())}));
                }
            }
            this.f.open();
        }
    }

    public final int b() {
        return ((Boolean) this.e.get()).booleanValue();
    }

    public final boolean a(Intent intent, String str, Class cls) {
        String name = cls.getName();
        if (name.equals(str)) {
            return true;
        }
        ResolveInfo resolveActivity = this.a.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null || !name.equals(resolveActivity.activityInfo.targetActivity)) {
            return false;
        }
        return true;
    }
}
