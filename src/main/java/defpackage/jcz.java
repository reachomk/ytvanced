package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

/* renamed from: jcz */
final class jcz implements OnClickListener {
    private final /* synthetic */ EditText a;
    private final /* synthetic */ String b;
    private final /* synthetic */ voh c;
    private final /* synthetic */ EditText d;
    private final /* synthetic */ jcx e;

    jcz(jcx jcx, EditText editText, String str, voh voh, EditText editText2) {
        this.e = jcx;
        this.a = editText;
        this.b = str;
        this.c = voh;
        this.d = editText2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.a.getText().toString();
        if (!obj.equals(this.b)) {
            voh voh = this.c;
            String str = "";
            voh.g = str;
            voh.h = str;
            voh.d = 0;
            voh.e = str;
            voh.f = str;
            this.d.setText(this.a.getText());
            switch (this.c.a.ordinal()) {
                case 18:
                    this.c.g = obj;
                    break;
                case 19:
                    this.c.h = obj;
                    break;
                case 20:
                    this.c.d = Long.parseLong(obj);
                    break;
                case 21:
                    this.c.e = obj;
                    break;
                case 22:
                    this.c.f = obj;
                    break;
            }
            this.e.notifyDataSetChanged();
        }
    }
}
