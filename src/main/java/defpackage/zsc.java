package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.youtube.R;

/* renamed from: zsc */
public final class zsc {
    public final xhv a;
    public final SharedPreferences b;
    public final String c;
    public final aeh d;
    private final Context e;
    private final String f;

    public zsc(Context context, SharedPreferences sharedPreferences, xhv xhv, zsg zsg) {
        this.e = (Context) amqw.a((Object) context);
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.a = (xhv) amqw.a((Object) xhv);
        this.c = context.getString(R.string.upload_network_policy_pref_value_any);
        this.f = context.getString(R.string.upload_network_policy_pref_value_wifi);
        if (!sharedPreferences.contains(xay.UPLOAD_NETWORK_POLICY)) {
            a(this.c);
        }
        View inflate = LayoutInflater.from(this.e).inflate(R.layout.cellular_upload_dialog_contents, null);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.do_not_ask_again_checkbox);
        zsf zsf = new zsf(this, checkBox, zsg);
        OnCancelListener zse = new zse(zsg);
        aeg aeg = new aeg(this.e);
        aeg.a((int) R.string.cellular_upload_dialog_title);
        aeg.a(inflate);
        aeg.b(R.string.cellular_upload_dialog_action_negative, zsf);
        aeg.a(R.string.cellular_upload_dialog_action_positive, zsf);
        aeg.a(zse);
        aeh a = aeg.a();
        checkBox.setOnCheckedChangeListener(new zsh(a));
        this.d = a;
    }

    public final void a(String str) {
        this.b.edit().putString(xay.UPLOAD_NETWORK_POLICY, str).apply();
    }

    public final boolean a() {
        return amqq.a(this.b.getString(xay.UPLOAD_NETWORK_POLICY, null), this.f);
    }
}
