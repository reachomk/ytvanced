package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: fkz */
public final class fkz {
    public final Activity a;
    public final abfm b;
    public final xoi c;
    public final xci d;
    public final aaas e;
    public final aaxk f;

    public fkz(Activity activity, abfm abfm, xoi xoi, xci xci, aaas aaas, aaxk aaxk) {
        this.a = (Activity) amqw.a((Object) activity);
        this.b = (abfm) amqw.a((Object) abfm);
        this.c = (xoi) amqw.a((Object) xoi);
        this.d = (xci) amqw.a((Object) xci);
        this.e = (aaas) amqw.a((Object) aaas);
        this.f = (aaxk) amqw.a((Object) aaxk);
    }

    public final AlertDialog a(List list, String str, String str2, amqp amqp) {
        amqw.a((Object) list);
        amqw.a((Object) str);
        amqw.a((Object) str2);
        View inflate = this.a.getLayoutInflater().inflate(R.layout.create_playlist_dialog, null, false);
        EditText editText = (EditText) inflate.findViewById(R.id.name);
        PrivacySpinner privacySpinner = (PrivacySpinner) inflate.findViewById(R.id.privacy_select);
        privacySpinner.a(flr.PLAYLIST);
        privacySpinner.a(awnx.PUBLIC);
        fky fky = new fky(this, editText, privacySpinner, list, str, str2, amqp);
        AlertDialog create = new Builder(this.a).setTitle(R.string.create_playlist_dialog_title).setView(inflate).setPositiveButton(this.a.getString(R.string.create_button_text), fky).setNegativeButton(this.a.getString(17039360), fky).create();
        privacySpinner.c = create;
        create.setOnShowListener(new flb(this, editText));
        create.getWindow().setSoftInputMode(4);
        return create;
    }

    public final void a(Button button, boolean z) {
        button.setEnabled(z);
        if (z) {
            button.setTextColor(xwe.a(this.a, R.attr.ytCallToAction, 0));
        } else {
            button.setTextColor(xwe.a(this.a, R.attr.ytIconDisabled, 0));
        }
    }

    public final AlertDialog a(String str) {
        return new Builder(this.a).setMessage(this.a.getString(R.string.delete_generic_playlist_confirmation)).setPositiveButton(17039370, new fla(this, str)).setNegativeButton(17039360, null).create();
    }
}
