package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.youtube.R;

/* renamed from: scg */
public final class scg extends nd {
    public sbw Z;

    public final void a(Activity activity) {
        this.Z = (sbw) activity;
        super.a(activity);
        i_(false);
    }

    public final Dialog a(Bundle bundle) {
        return new Builder(p()).setTitle(R.string.ccl_error).setMessage(this.j.getString("message")).setPositiveButton(R.string.ccl_ok, new scj(this)).create();
    }
}
