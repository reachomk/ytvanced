package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.support.design.textfield.TextInputLayout;
import android.view.View;
import android.widget.EditText;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint;

/* renamed from: gvl */
final class gvl implements OnShowListener {
    public final /* synthetic */ gvg a;
    private final /* synthetic */ apnt b;
    private final /* synthetic */ View c;

    gvl(gvg gvg, apnt apnt, View view) {
        this.a = gvg;
        this.b = apnt;
        this.c = view;
    }

    public final void onShow(DialogInterface dialogInterface) {
        anxp anxp = this.b.d;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        apog apog = ((ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint) b).b;
        if (apog == null) {
            apog = apog.c;
        }
        apoe apoe = (apog.a == 105915776 ? (apoc) apog.b : apoc.d).b;
        if (apoe == null) {
            apoe = apoe.c;
        }
        arlf arlf = apoe.a == 91739437 ? (arlf) apoe.b : arlf.e;
        View view = (TextInputLayout) this.c.findViewById(R.id.description_edit_layout);
        arml arml = arlf.b;
        if (arml == null) {
            arml = arml.f;
        }
        view.a(ajqy.a(arml));
        view.c(true);
        view.b(arlf.d);
        abe.a(view, this.a.ap);
        EditText editText = (EditText) this.c.findViewById(R.id.description_edit);
        editText.setText(arlf.c);
        editText.setSelection(0, arlf.c.length());
        xpr.b(editText);
        AlertDialog alertDialog = (AlertDialog) dialogInterface;
        alertDialog.getButton(-1).setOnClickListener(new gvk(this, editText, alertDialog));
    }
}
