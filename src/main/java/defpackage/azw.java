package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;

/* renamed from: azw */
final class azw implements OnClickListener {
    private final /* synthetic */ azl a;

    azw(azl azl) {
        this.a = azl;
    }

    public final void onClick(View view) {
        int id = view.getId();
        if (id == 16908313 || id == 16908314) {
            if (this.a.d.a()) {
                bbb bbb = this.a.c;
                bbb.a(id == 16908313 ? 2 : 1);
            }
            this.a.dismiss();
        } else if (id == R.id.mr_control_playback_ctrl) {
            azl azl = this.a;
            if (azl.A != null) {
                xs xsVar = azl.C;
                if (xsVar != null) {
                    int i = xsVar.a;
                    int i2 = 0;
                    if (i == 3) {
                        if (azl.i()) {
                            this.a.A.a().b();
                            i2 = R.string.mr_controller_pause;
                        } else if (this.a.j()) {
                            this.a.A.a().c();
                            i2 = R.string.mr_controller_stop;
                        }
                    } else if (i != 3 && this.a.h()) {
                        this.a.A.a().a();
                        i2 = R.string.mr_controller_play;
                    }
                    AccessibilityManager accessibilityManager = this.a.T;
                    if (!(accessibilityManager == null || !accessibilityManager.isEnabled() || i2 == 0)) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                        obtain.setPackageName(this.a.e.getPackageName());
                        obtain.setClassName(getClass().getName());
                        obtain.getText().add(this.a.e.getString(i2));
                        this.a.T.sendAccessibilityEvent(obtain);
                    }
                }
            }
        } else if (id == R.id.mr_close) {
            this.a.dismiss();
        }
    }
}
