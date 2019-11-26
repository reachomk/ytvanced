package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.widget.EditText;
import com.google.android.apps.youtube.app.settings.developer.DebugOnlineAdActivity;

/* renamed from: jdh */
final class jdh implements OnClickListener {
    private final /* synthetic */ EditText a;
    private final /* synthetic */ String b = null;
    private final /* synthetic */ EditText c;
    private final /* synthetic */ voi d;
    private final /* synthetic */ voj e;
    private final /* synthetic */ jdd f;

    jdh(jdd jdd, EditText editText, EditText editText2, voi voi, voj voj) {
        this.f = jdd;
        this.a = editText;
        this.c = editText2;
        this.d = voi;
        this.e = voj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.a.getText().toString();
        if (!obj.equals(null)) {
            this.c.setText(this.a.getText());
            DebugOnlineAdActivity debugOnlineAdActivity = this.f.a;
            voi voi = this.d;
            voj voj = this.e;
            if (TextUtils.isEmpty(obj)) {
                int ordinal = voi.ordinal();
                if (ordinal == 12) {
                    debugOnlineAdActivity.l.a(voj.g);
                } else if (ordinal == 13) {
                    debugOnlineAdActivity.l.a(voj.f);
                    return;
                } else if (ordinal == 15) {
                    debugOnlineAdActivity.l.a(voj.h);
                    return;
                }
            }
            int ordinal2 = voi.ordinal();
            if (ordinal2 == 12) {
                debugOnlineAdActivity.l.a(voj.g, obj);
            } else if (ordinal2 == 13) {
                debugOnlineAdActivity.l.a(voj.f, (String) amqw.a((Object) obj));
            } else if (ordinal2 == 15) {
                debugOnlineAdActivity.l.a(voj.h, obj);
            }
        }
    }
}
