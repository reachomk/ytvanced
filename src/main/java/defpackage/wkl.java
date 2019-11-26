package defpackage;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MenuItem;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: wkl */
final class wkl implements ase {
    private final /* synthetic */ wjv a;

    wkl(wjv wjv) {
        this.a = wjv;
    }

    public final boolean a(MenuItem menuItem) {
        int i = 0;
        if (((aja) menuItem).a != R.id.post_button) {
            return false;
        }
        String trim;
        wjv wjv = this.a;
        grf grf = wjv.aA;
        if (grf == null) {
            trim = wjv.aq.getText().toString().trim();
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(grf.b.getText());
            wlu.a(spannableStringBuilder);
            trim = spannableStringBuilder.toString().trim();
        }
        String str = trim;
        if (TextUtils.isEmpty(str) && !this.a.ae()) {
            return false;
        }
        this.a.af.a(3, new acvs(acwc.BACKSTAGE_POST_DIALOG_SUBMIT_BUTTON), null);
        this.a.f(false);
        wjv = this.a;
        if (wjv.am != null) {
            List a = wjv.ar.getVisibility() == 0 ? this.a.ar.a() : null;
            wjv = this.a;
            wks wks = wjv.am;
            String str2 = wjv.an;
            String str3 = wjv.av;
            String str4 = wjv.aw;
            wjp wjp = wjv.ah;
            aqyl aqyl = wjp.b;
            String str5 = "";
            if (aqyl != null) {
                aqyl aqyl2;
                if ((aqyl.b == 5 ? (String) aqyl.c : str5).isEmpty()) {
                    aqyl = wjp.b;
                    if (aqyl.b == 4 && ((Integer) aqyl.c).intValue() > 0) {
                        aqyl2 = wjp.b;
                        if (aqyl2.b == 4) {
                            i = ((Integer) aqyl2.c).intValue();
                        }
                        StringBuilder stringBuilder = new StringBuilder(20);
                        stringBuilder.append("fallback_");
                        stringBuilder.append(i);
                        trim = stringBuilder.toString();
                    }
                } else {
                    aqyl2 = wjp.b;
                    trim = aqyl2.b == 5 ? (String) aqyl2.c : str5;
                }
                wks.a(str, a, str2, str3, str4, trim, this.a.ao);
            }
            trim = null;
            wks.a(str, a, str2, str3, str4, trim, this.a.ao);
        }
        return true;
    }
}
