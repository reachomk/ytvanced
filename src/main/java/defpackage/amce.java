package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.youtube.R;

/* renamed from: amce */
public final class amce extends ambz {
    private static final amcl b = amcl.a(1);
    private static final amcl c = amcl.a(3);
    private final BroadcastReceiver d = new amcd(this);
    private final OnSharedPreferenceChangeListener e = new amcg(this);
    private final Context f;
    private final ConnectivityManager g;
    private final SharedPreferences h;
    private final String i;

    public amce(Context context, SharedPreferences sharedPreferences) {
        super(3);
        this.f = context;
        this.g = (ConnectivityManager) context.getSystemService("connectivity");
        this.h = sharedPreferences;
        this.i = context.getString(R.string.upload_network_policy_pref_value_wifi);
    }

    public final boolean f() {
        if (this.i.equals(this.h.getString(xay.UPLOAD_NETWORK_POLICY, null))) {
            NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
            if (!(activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) ? false : true;
    }

    public final amcl e() {
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return b;
        }
        if (activeNetworkInfo.getType() == 1) {
            return amcl.a;
        }
        amcl amcl;
        if (this.i.equals(this.h.getString(xay.UPLOAD_NETWORK_POLICY, null))) {
            amcl = c;
        } else {
            amcl = amcl.a;
        }
        return amcl;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        this.f.registerReceiver(this.d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.h.registerOnSharedPreferenceChangeListener(this.e);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        this.f.unregisterReceiver(this.d);
        this.h.unregisterOnSharedPreferenceChangeListener(this.e);
    }
}
