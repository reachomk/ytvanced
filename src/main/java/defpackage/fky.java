package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.youtube.app.common.ui.playlist.PrivacySpinner;
import java.util.List;

/* renamed from: fky */
final /* synthetic */ class fky implements OnClickListener {
    private final fkz a;
    private final EditText b;
    private final PrivacySpinner c;
    private final List d;
    private final String e;
    private final String f;
    private final amqp g;

    fky(fkz fkz, EditText editText, PrivacySpinner privacySpinner, List list, String str, String str2, amqp amqp) {
        this.a = fkz;
        this.b = editText;
        this.c = privacySpinner;
        this.d = list;
        this.e = str;
        this.f = str2;
        this.g = amqp;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        fkz fkz = this.a;
        View view = this.b;
        PrivacySpinner privacySpinner = this.c;
        List<String> list = this.d;
        String str = this.e;
        String str2 = this.f;
        amqp amqp = this.g;
        xpr.a(view);
        if (i == -1) {
            String trim = view.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                awnx b = privacySpinner.b();
                abfm abfm = fkz.b;
                aaml abfx = new abfx(abfm.c, abfm.d.c());
                abfx.a = aali.b(trim);
                abfx.c = b;
                abfx.g();
                for (String add : list) {
                    abfx.b.add(add);
                }
                if (!TextUtils.isEmpty(str)) {
                    abfx.d = str;
                }
                if (!TextUtils.isEmpty(str2)) {
                    abfx.e = str2;
                }
                abfm abfm2 = fkz.b;
                abfm2.a.a(abfx, new flc(fkz));
                if (amqp.a()) {
                    ((flg) amqp.b()).a();
                }
            }
        }
    }
}
