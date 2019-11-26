package defpackage;

import android.content.SharedPreferences.Editor;

/* renamed from: acit */
final class acit implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ aciq b;

    acit(aciq aciq, long j) {
        this.b = aciq;
        this.a = j;
    }

    public final void run() {
        Editor edit = this.b.b.edit();
        edit.putLong(aciq.a, this.a);
        edit.apply();
    }
}
