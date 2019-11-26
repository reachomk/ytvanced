package defpackage;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: jdg */
final class jdg implements OnClickListener {
    private final /* synthetic */ voi a;
    private final /* synthetic */ voj b;
    private final /* synthetic */ EditText c;
    private final /* synthetic */ jdd d;

    jdg(jdd jdd, voi voi, voj voj, EditText editText) {
        this.d = jdd;
        this.a = voi;
        this.b = voj;
        this.c = editText;
    }

    public final void onClick(View view) {
        jdd jdd = this.d;
        voi voi = this.a;
        voj voj = this.b;
        EditText editText = this.c;
        EditText editText2 = new EditText(jdd.a.m);
        Builder view2 = new Builder(jdd.a.m).setView(editText2);
        jdd.a.a(voi, voj);
        editText2.setText(null);
        jdh jdh = new jdh(jdd, editText2, editText, voi, voj);
        view2.setPositiveButton("OK", jdh).setNegativeButton("Cancel", new jdf());
        view2.create().show();
    }
}
