package defpackage;

import android.app.Activity;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.provider.Settings.System;

/* renamed from: fjq */
final class fjq implements fjs {
    private final Activity a;
    private final boolean b;
    private int c;

    fjq(Activity activity) {
        this.a = (Activity) amqw.a((Object) activity);
        boolean z = true;
        if (VERSION.SDK_INT <= 27 && !VERSION.RELEASE.startsWith("P")) {
            z = false;
        }
        this.b = z;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return fka.a(this.a);
    }

    public final boolean c() {
        if (System.getInt(this.a.getContentResolver(), "accelerometer_rotation", 0) == 0) {
            return true;
        }
        return false;
    }

    public final void a(boolean z, int i) {
        b(z, i);
    }

    public final void b(boolean z, int i) {
        this.c = !z ? 1 : 2;
    }

    public final boolean d() {
        if (this.b && c() && Secure.getInt(this.a.getContentResolver(), "show_rotation_suggestions", 1) == 1) {
            return true;
        }
        return false;
    }

    public final void a(int i) {
        this.a.setRequestedOrientation(i);
    }

    public final int e() {
        return this.a.getRequestedOrientation();
    }
}
