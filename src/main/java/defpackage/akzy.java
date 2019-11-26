package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.youtube.R;

/* renamed from: akzy */
public final class akzy extends nd {
    public alaa Z;

    public static akzy d(int i) {
        akzy akzy = new akzy();
        Bundle bundle = new Bundle();
        bundle.putInt("messageId", i);
        akzy.f(bundle);
        return akzy;
    }

    public final Dialog a(Bundle bundle) {
        Object obj = this.j;
        amqw.a(obj);
        int i = obj.getInt("messageId");
        amqw.b(i != 0);
        aeg aeg = new aeg(p());
        aeg.b(i);
        aeg.a(R.string.permission_open_settings_button, new alab(this));
        aeg.b(R.string.permissions_not_now, null);
        return aeg.a();
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        alaa alaa = this.Z;
        if (alaa != null) {
            alaa.a();
        }
    }
}
