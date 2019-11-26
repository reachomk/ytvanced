package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import java.util.Map.Entry;

/* renamed from: fdw */
final /* synthetic */ class fdw implements OnClickListener {
    private final fdn a;
    private final fec b;

    fdw(fdn fdn, fec fec) {
        this.a = fdn;
        this.b = fec;
    }

    public final void onClick(View view) {
        fdn fdn = this.a;
        fec fec = this.b;
        for (Entry entry : fdn.c.entrySet()) {
            CheckBox checkBox = (CheckBox) entry.getValue();
            if (!view.equals(checkBox) && (fec.b || ((fec) entry.getKey()).b)) {
                checkBox.setChecked(false);
            }
        }
    }
}
