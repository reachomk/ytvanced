package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity;
import com.google.android.youtube.R;

/* renamed from: hgb */
final /* synthetic */ class hgb implements OnClickListener {
    private final hfy a;

    hgb(hfy hfy) {
        this.a = hfy;
    }

    public final void onClick(View view) {
        hfy hfy = this.a;
        hfy.d.a(3, new acvs(acwc.MDX_SMART_REMOTE_BUTTON_MINIBAR_MIC), null);
        Context context = hfy.c;
        if (context instanceof Activity) {
            if (alai.a((Activity) context, hfy.e, new String[]{"android.permission.RECORD_AUDIO"})) {
                hfy.d.b(new acvs(acwc.MDX_SMART_REMOTE_PERMISSIONS_OPEN_APP_SETTINGS_DIALOG));
                new Builder(hfy.c).setMessage(R.string.mdx_smart_remote_permission_open_settings_description).setPositiveButton(R.string.permission_open_settings_button, new hgd(hfy)).setNegativeButton(R.string.permissions_not_now, null).create().show();
                return;
            }
            Intent intent = new Intent(hfy.c, MdxSmartRemoteActivity.class);
            intent.putExtra("com.google.android.libraries.youtube.mdx.smartremote.isOpenedFromMealbar", false);
            hfy.c.startActivity(intent);
        }
    }
}
