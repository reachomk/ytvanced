package defpackage;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: gvk */
final class gvk implements OnClickListener {
    public final /* synthetic */ AlertDialog a;
    public final /* synthetic */ gvl b;
    private final /* synthetic */ EditText c;

    gvk(gvl gvl, EditText editText, AlertDialog alertDialog) {
        this.b = gvl;
        this.c = editText;
        this.a = alertDialog;
    }

    public final void onClick(View view) {
        aaqn aaqn = this.b.a.ai;
        aaqu aaqu = new aaqu(aaqn.c, aaqn.d);
        aaqu.a = this.c.getText().toString();
        aaqn = this.b.a.ai;
        gvn gvn = new gvn(this);
        if (aaqn.k == null) {
            aaqn.k = new aaqx(aaqn.b, aaqn.e);
        }
        aaqn.k.b(aaqu, gvn);
    }
}
