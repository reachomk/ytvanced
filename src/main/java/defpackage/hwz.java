package defpackage;

import android.app.AlertDialog;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

/* renamed from: hwz */
final /* synthetic */ class hwz implements OnCheckedChangeListener {
    private final AlertDialog a;

    hwz(AlertDialog alertDialog) {
        this.a = alertDialog;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.a.getButton(-1).setEnabled(i != -1);
    }
}
