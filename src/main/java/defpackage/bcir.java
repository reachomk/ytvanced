package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import org.chromium.base.ApplicationStatus;
import org.chromium.net.AndroidCellularSignalStrength;

/* renamed from: bcir */
public final class bcir extends PhoneStateListener implements bchj {
    private final TelephonyManager a = ((TelephonyManager) bchn.a.getSystemService("phone"));
    private final /* synthetic */ AndroidCellularSignalStrength b;

    bcir(AndroidCellularSignalStrength androidCellularSignalStrength) {
        this.b = androidCellularSignalStrength;
        if (this.a.getSimState() == 5) {
            ApplicationStatus.a(this);
            int stateForApplication = ApplicationStatus.getStateForApplication();
            if (stateForApplication == 1) {
                this.a.listen(this, 256);
            } else if (stateForApplication == 2) {
                this.b.a = aocf.UNSET_ENUM_VALUE;
                this.a.listen(this, 0);
            }
        }
    }

    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        if (ApplicationStatus.getStateForApplication() == 1) {
            try {
                this.b.a = signalStrength.getLevel();
            } catch (SecurityException unused) {
                this.b.a = aocf.UNSET_ENUM_VALUE;
            }
        }
    }
}
