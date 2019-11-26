package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.widget.Button;
import android.widget.EditText;

/* renamed from: flb */
final /* synthetic */ class flb implements OnShowListener {
    private final fkz a;
    private final EditText b;

    flb(fkz fkz, EditText editText) {
        this.a = fkz;
        this.b = editText;
    }

    public final void onShow(DialogInterface dialogInterface) {
        fkz fkz = this.a;
        EditText editText = this.b;
        Button button = ((AlertDialog) dialogInterface).getButton(-1);
        flf flf = new flf(fkz, button);
        fkz.a(button, false);
        editText.addTextChangedListener(flf);
    }
}
