package com.google.android.libraries.social.licenses;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.youtube.R;
import defpackage.aej;
import defpackage.nf;
import defpackage.nt;
import defpackage.ufz;
import defpackage.uge;
import defpackage.ugf;

public final class LicenseMenuActivity extends aej implements ugf {
    /* Access modifiers changed, original: protected|final */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.libraries_social_licenses_license_menu_activity);
        if (g() != null) {
            g().b(true);
        }
        nt f = f();
        if (!(f.a((int) R.id.license_menu_fragment_container) instanceof uge)) {
            nf uge = new uge();
            String str = "pluginLicensePaths";
            if (getIntent().hasExtra(str)) {
                uge.f(getIntent().getBundleExtra(str));
            }
            f.a().a((int) R.id.license_menu_fragment_container, uge).c();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void a(ufz ufz) {
        Intent intent = new Intent(this, LicenseActivity.class);
        intent.putExtra("license", ufz);
        startActivity(intent);
    }
}
