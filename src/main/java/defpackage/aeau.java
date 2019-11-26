package defpackage;

import android.text.TextUtils;
import com.google.android.youtube.R;

/* renamed from: aeau */
final /* synthetic */ class aeau implements Runnable {
    private final aeas a;
    private final aeat b;

    aeau(aeas aeas, aeat aeat) {
        this.a = aeas;
        this.b = aeat;
    }

    public final void run() {
        aeas aeas = this.a;
        aeat aeat = this.b;
        if (!TextUtils.isEmpty(aeat.c())) {
            aeat.b();
        } else if (aeas.g.incrementAndGet() >= 9) {
            xtl.b(aeas.a, "Passive sign in timed out waiting for auth code.");
            String string = aeas.c.getString(R.string.passive_auth_code_time_out);
            aeas.d.a(3, new acvs(acwc.MDX_TV_SIGN_IN_PASSIVE_WAITING_TIMEOUT_CANCEL_BUTTON), null);
            aeas.b.a(string);
        } else {
            String.format("Waiting %d MS until next check", new Object[]{Long.valueOf(500)});
            aeas.f.postDelayed(aeas.e, 500);
        }
    }
}
