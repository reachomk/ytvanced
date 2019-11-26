package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

/* renamed from: pm */
final class pm extends ps {
    private final Context b;
    private final WakeLock c;
    private final WakeLock d;
    private boolean e;
    private boolean f;

    pm(Context context, ComponentName componentName) {
        super(componentName);
        this.b = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(componentName.getClassName());
        stringBuilder.append(":launch");
        this.c = powerManager.newWakeLock(1, stringBuilder.toString());
        this.c.setReferenceCounted(false);
        stringBuilder = new StringBuilder();
        stringBuilder.append(componentName.getClassName());
        stringBuilder.append(":run");
        this.d = powerManager.newWakeLock(1, stringBuilder.toString());
        this.d.setReferenceCounted(false);
    }

    /* Access modifiers changed, original: final */
    public final void a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.a);
        if (this.b.startService(intent2) != null) {
            synchronized (this) {
                if (!this.e) {
                    this.e = true;
                    if (!this.f) {
                        this.c.acquire(60000);
                    }
                }
            }
        }
    }

    public final void a() {
        synchronized (this) {
            this.e = false;
        }
    }

    public final void b() {
        synchronized (this) {
            if (!this.f) {
                this.f = true;
                this.d.acquire(600000);
                this.c.release();
            }
        }
    }

    public final void c() {
        synchronized (this) {
            if (this.f) {
                if (this.e) {
                    this.c.acquire(60000);
                }
                this.f = false;
                this.d.release();
            }
        }
    }
}
