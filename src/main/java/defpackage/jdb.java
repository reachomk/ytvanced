package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.widget.EditText;

/* renamed from: jdb */
final class jdb implements OnClickListener {
    private final /* synthetic */ EditText a;
    private final /* synthetic */ String b;
    private final /* synthetic */ EditText c;
    private final /* synthetic */ voh d;
    private final /* synthetic */ jcx e;

    jdb(jcx jcx, EditText editText, String str, EditText editText2, voh voh) {
        this.e = jcx;
        this.a = editText;
        this.b = str;
        this.c = editText2;
        this.d = voh;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.a.getText().toString();
        if (!obj.equals(this.b)) {
            this.c.setText(this.a.getText());
            voh voh = this.d;
            if (TextUtils.isEmpty(obj)) {
                voh.c = -1;
            } else {
                int parseInt = Integer.parseInt(obj);
                if (parseInt <= 0) {
                    parseInt = -1;
                }
                voh.c = parseInt;
            }
            this.e.notifyDataSetChanged();
        }
    }
}
