package defpackage;

import android.content.SharedPreferences;

/* renamed from: dnh */
final class dnh extends wxo {
    public SharedPreferences a;
    public bapu b;

    dnh() {
    }

    public final void a() {
        if (((Boolean) this.b.get()).booleanValue()) {
            this.a.edit().remove("device_id").remove("device_key").remove("innertube_override_version").commit();
            afxw.a(this.a);
        }
    }
}
