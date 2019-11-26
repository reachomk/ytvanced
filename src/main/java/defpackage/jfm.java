package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import com.google.android.youtube.R;

/* renamed from: jfm */
public final class jfm implements xcp {
    public final Activity a;
    public boolean b = false;
    private final xoi c;

    public jfm(Activity activity, xoi xoi) {
        this.a = activity;
        this.c = xoi;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{afqb.class};
        } else if (i == 0) {
            afqb afqb = (afqb) obj;
            if (!this.b) {
                this.c.b(afqb.b);
                AlertDialog show = new Builder(this.a).setMessage(R.string.common_error_authenticating).setPositiveButton(R.string.account_switcher_sign_in, new jfl(this, afqb.a)).show();
                this.b = true;
                show.setOnDismissListener(new jfo(this));
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
