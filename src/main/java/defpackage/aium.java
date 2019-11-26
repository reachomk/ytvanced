package defpackage;

import android.app.Activity;
import android.net.Uri;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog;

/* renamed from: aium */
public final /* synthetic */ class aium implements Runnable {
    private final AgeVerificationDialog a;
    private final String b;
    private final String c;
    private final Activity d;

    public aium(AgeVerificationDialog ageVerificationDialog, String str, String str2, Activity activity) {
        this.a = ageVerificationDialog;
        this.b = str;
        this.c = str2;
        this.d = activity;
    }

    public final void run() {
        Object a;
        AgeVerificationDialog ageVerificationDialog = this.a;
        String str = this.b;
        String str2 = this.c;
        wxc a2 = wxc.a(this.d, ageVerificationDialog.f);
        str = String.valueOf(Uri.encode(str));
        String str3 = "weblogin:continue=";
        if (str.length() == 0) {
            str = new String(str3);
        } else {
            str = str3.concat(str);
        }
        try {
            a = ageVerificationDialog.b.a(str2, str);
        } catch (Exception e) {
            a2.a(null, e);
            a = null;
        }
        if (a == null) {
            a2.a(null, new Exception());
        } else {
            a2.a(null, a);
        }
    }
}
