package defpackage;

import android.app.AlertDialog;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

/* renamed from: wpz */
final /* synthetic */ class wpz implements OnCheckedChangeListener {
    private final AlertDialog a;

    wpz(AlertDialog alertDialog) {
        this.a = alertDialog;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.a.getButton(-1).setEnabled(true);
    }
}
