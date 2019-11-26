package com.google.android.apps.youtube.app.application;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.youtube.api.StandalonePlayerActivity;
import defpackage.airl;
import defpackage.ammm;
import defpackage.dsv;
import defpackage.edm;
import defpackage.ehz;
import defpackage.eis;
import defpackage.fpt;
import defpackage.wxk;
import defpackage.xci;
import defpackage.xul;

public class Shell$UrlActivity extends dsv {
    public ehz h;
    public eis i;
    public xci j;
    public fpt k;

    /* Access modifiers changed, original: protected|final */
    public final int e() {
        return 67108864;
    }

    /* Access modifiers changed, original: protected|final */
    public final int g() {
        return 3;
    }

    /* Access modifiers changed, original: protected|final */
    public final Class d() {
        return this.k.b();
    }

    public final Intent getIntent() {
        Intent intent = super.getIntent();
        try {
            intent.getExtras().isEmpty();
        } catch (Exception unused) {
            intent.replaceExtras(null);
        }
        return intent;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(boolean z) {
        if (!i()) {
            Uri data = getIntent().getData();
            if (data != null) {
                if (!z) {
                    this.j.c(new edm());
                }
                String a = wxk.a((Activity) this, getIntent());
                ehz ehz = this.h;
                ehz.a(ehz.a(data, a));
                this.i.a(0);
            }
        }
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final Intent c() {
        if (!i()) {
            return super.c();
        }
        Intent intent = getIntent();
        String str = "app_package";
        String stringExtra = intent.getStringExtra(str);
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = wxk.a((Activity) this, getIntent());
        }
        airl a = airl.a(intent);
        Intent intent2 = new Intent(this, StandalonePlayerActivity.class);
        intent2.putExtra("watch", a);
        boolean z = true;
        intent2.putExtra("launched_from_shell", true);
        String str2 = "app_version";
        str2 = "client_library_version";
        String str3 = "lightbox_mode";
        intent = intent2.putExtra("developer_key", "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w").putExtra(str, getPackageName()).putExtra(str2, xul.b(this)).putExtra(str2, ammm.a(1902)).putExtra(str3, intent.getBooleanExtra("force_fullscreen", false) ^ 1);
        if ((getWindow().getAttributes().flags & 1024) != 0) {
            z = false;
        }
        intent.putExtra("window_has_status_bar", z);
        if (stringExtra != null) {
            intent2.putExtra("referring_app_package", stringExtra);
        }
        return intent2;
    }

    private final boolean i() {
        Intent intent = getIntent();
        boolean z = false;
        if (intent.getData() != null) {
            if (intent.getBooleanExtra("force_fullscreen", false)) {
                z = true;
            } else if (intent.getBooleanExtra("finish_on_ended", false)) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }
}
