package defpackage;

import android.app.AlertDialog;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

/* renamed from: jnq */
public final class jnq implements OnCheckedChangeListener {
    private final /* synthetic */ AlertDialog a;

    public jnq(AlertDialog alertDialog) {
        this.a = alertDialog;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.a.getButton(-1).setEnabled(true);
    }
}
