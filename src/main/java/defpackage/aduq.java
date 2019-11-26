package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import com.google.android.youtube.R;

/* renamed from: aduq */
public final class aduq extends nd {
    public final Dialog a(Bundle bundle) {
        return new Builder(p()).setMessage(Html.fromHtml(a((int) R.string.mdx_pref_delete_tv_codes_remove_confirmation, this.j.getString("screenName"))).toString()).setPositiveButton(R.string.mdx_pref_delete_tv_codes_remove_tv, new adup(this)).setNegativeButton(17039360, null).create();
    }
}
