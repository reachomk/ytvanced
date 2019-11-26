package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.support.design.textfield.TextInputLayout;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: gvq */
final class gvq implements OnShowListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ apol b;
    private final /* synthetic */ gvg c;

    gvq(gvg gvg, View view, apol apol) {
        this.c = gvg;
        this.a = view;
        this.b = apol;
    }

    public final void onShow(DialogInterface dialogInterface) {
        arle arle;
        gvg gvg = this.c;
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        View view = this.a;
        apol apol = this.b;
        View view2 = (TextInputLayout) view.findViewById(R.id.given_name_edit_layout);
        apoe apoe = ((apoi) apol.instance).b;
        if (apoe == null) {
            apoe = apoe.c;
        }
        arle arle2 = (arle) ((anxo) (apoe.a == 91739437 ? (arlf) apoe.b : arlf.e).toBuilder());
        view2.a(ajqy.a(arle2.a()));
        view2.b(false);
        abe.a(view2, gvg.ap);
        EditText editText = (EditText) view.findViewById(R.id.given_name_edit);
        editText.setText(arle2.b());
        editText.setSelection(0, arle2.b().length());
        xpr.b(editText);
        View view3 = (TextInputLayout) view.findViewById(R.id.family_name_edit_layout);
        EditText editText2 = (EditText) view.findViewById(R.id.family_name_edit);
        apoi apoi = (apoi) apol.instance;
        arml arml = null;
        if ((apoi.a & 2) != 0) {
            apoe apoe2 = apoi.c;
            if (apoe2 == null) {
                apoe2 = apoe.c;
            }
            arle = (arle) ((anxo) (apoe2.a == 91739437 ? (arlf) apoe2.b : arlf.e).toBuilder());
        } else {
            arle = null;
        }
        if (arle != null) {
            view3.a(ajqy.a(arle.a()));
            view3.b(false);
            abe.a(view3, gvg.ap);
            editText2.setText(arle.b());
            view3.setVisibility(0);
        } else {
            view3.setVisibility(8);
        }
        if ((8 & ((apoi) apol.instance).a) != 0) {
            TextView textView = (TextView) view.findViewById(R.id.name_edit_limit_hint);
            if (!((apol.a().a & 1) == 0 || textView == null)) {
                apny apny = apol.a().b;
                if (apny == null) {
                    apny = apny.c;
                }
                if ((apny.a & 1) != 0) {
                    arml = apny.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                textView.setText(aabb.a(arml, gvg.al, false));
                textView.setVisibility(0);
            }
        }
        alertDialog.getButton(-1).setOnClickListener(new gvt(gvg, view2, editText, view3, arle, editText2, arle2, apol, alertDialog));
    }
}
