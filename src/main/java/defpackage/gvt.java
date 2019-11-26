package defpackage;

import android.app.AlertDialog;
import android.support.design.textfield.TextInputLayout;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/* renamed from: gvt */
final class gvt implements OnClickListener {
    public final /* synthetic */ TextInputLayout a;
    public final /* synthetic */ TextInputLayout b;
    public final /* synthetic */ arle c;
    public final /* synthetic */ arle d;
    public final /* synthetic */ apol e;
    public final /* synthetic */ AlertDialog f;
    public final /* synthetic */ gvg g;
    private final /* synthetic */ EditText h;
    private final /* synthetic */ EditText i;

    gvt(gvg gvg, TextInputLayout textInputLayout, EditText editText, TextInputLayout textInputLayout2, arle arle, EditText editText2, arle arle2, apol apol, AlertDialog alertDialog) {
        this.g = gvg;
        this.a = textInputLayout;
        this.h = editText;
        this.b = textInputLayout2;
        this.c = arle;
        this.i = editText2;
        this.d = arle2;
        this.e = apol;
        this.f = alertDialog;
    }

    public final void onClick(View view) {
        String str = null;
        this.a.c(null);
        this.a.b(false);
        String obj = this.h.getText().toString();
        this.b.c(null);
        this.b.b(false);
        if (this.c != null) {
            str = this.i.getText().toString();
        }
        gvg gvg = this.g;
        gvs gvs = new gvs(this, obj, str);
        aaqn aaqn = gvg.ai;
        aaqy aaqy = new aaqy(aaqn.c, aaqn.d);
        aaqy.a = obj;
        if (str != null) {
            aaqy.b = str;
        }
        aaqn aaqn2 = gvg.ai;
        gvv gvv = new gvv(gvs);
        if (aaqn2.j == null) {
            aaqn2.j = new aarb(aaqn2.b, aaqn2.e);
        }
        aaqn2.j.b(aaqy, gvv);
    }
}
