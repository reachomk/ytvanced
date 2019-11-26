package defpackage;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAdActivity;

/* renamed from: agjk */
public final class agjk implements OnCheckedChangeListener {
    private final /* synthetic */ CheckBox a;
    private final /* synthetic */ DebugOfflineAdActivity b;

    public agjk(DebugOfflineAdActivity debugOfflineAdActivity, CheckBox checkBox) {
        this.b = debugOfflineAdActivity;
        this.a = checkBox;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.b.j.edit().putBoolean("debug_offline_force_ads", z).apply();
        this.a.setChecked(z);
        if (z) {
            this.b.k.a(true);
            this.b.k.b(true);
            Object voh = new voh();
            voh.a = vol.ADSENSE_SKIPPABLE;
            voh.b = vsm.PRE_ROLL;
            this.b.k.a(amul.a(voh));
            Toast.makeText(this.b.getBaseContext(), "Forcing Ads Enabled, restart to take effect. ", 0).show();
            return;
        }
        this.b.k.a(false);
        this.b.k.b(false);
        Toast.makeText(this.b.getBaseContext(), "Forcing Ads Disabled.", 0).show();
    }
}
