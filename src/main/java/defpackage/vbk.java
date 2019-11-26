package defpackage;

import android.os.Build.VERSION;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: vbk */
final class vbk implements OnClickListener {
    private final /* synthetic */ vbg a;

    vbk(vbg vbg) {
        this.a = vbg;
    }

    public final void onClick(View view) {
        vbg vbg = this.a;
        vbg.ad = vbg.aa;
        if (VERSION.SDK_INT >= 21) {
            vbg.ad = PhoneNumberUtils.formatNumberToE164(PhoneNumberUtils.normalizeNumber(vbg.ad), vbg.ab);
        } else {
            vbg.ad = vbg.ad.trim();
        }
        if (TextUtils.isEmpty(vbg.ad)) {
            vbg.b(vbg.a((int) R.string.error_invalid_phone_number));
        } else if (vbg.ac != atfx.CODE_DELIVERY_METHOD_TEXT || PhoneNumberUtils.isWellFormedSmsAddress(vbg.ad)) {
            vbg.f();
            vbg = this.a;
            vbm vbm = vbg.ae;
            if (vbm != null) {
                vbm.a(vbg.ac, vbg.ab, vbg.ad);
            }
            this.a.b.b();
            vbg vbg2 = this.a;
            uzt uzt = new uzt(vbg2, vbg2.af);
            vbg2 = this.a;
            atfx atfx = vbg2.ac;
            String str = vbg2.ab;
            String str2 = vbg2.ad;
            avxm avxm = vbg2.Z.f;
            if (avxm == null) {
                avxm = avxm.c;
            }
            aphg aphg = avxm.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            apxu apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            uzt.a(atfx, str, str2, apxu);
            this.a.a.setEnabled(false);
        } else {
            vbg.b(vbg.a((int) R.string.error_sms_to_non_mobile));
        }
    }
}
