package net.openid.appauth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class RedirectUriReceiverActivity extends Activity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        Intent a = AuthorizationManagementActivity.a((Context) this);
        a.setData(data);
        a.addFlags(603979776);
        startActivity(a);
        finish();
    }
}
