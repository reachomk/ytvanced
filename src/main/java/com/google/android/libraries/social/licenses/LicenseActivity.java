package com.google.android.libraries.social.licenses;

import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.aej;
import defpackage.ufz;
import defpackage.ugd;
import defpackage.ugi;

public final class LicenseActivity extends aej {
    public final void onCreate(Bundle bundle) {
        CharSequence a;
        super.onCreate(bundle);
        setContentView((int) R.layout.libraries_social_licenses_license_activity);
        ufz ufz = (ufz) getIntent().getParcelableExtra("license");
        g().a(ufz.a);
        g().a(true);
        g().b(true);
        g().a();
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        long j = ufz.b;
        int i = ufz.c;
        String str = ufz.d;
        if (str.isEmpty()) {
            a = ugi.a((Context) this, "third_party_licenses", j, i);
        } else {
            String a2 = ugi.a("res/raw/third_party_licenses", str, j, i);
            if (a2 != null) {
                a = a2;
            } else {
                StringBuilder stringBuilder = new StringBuilder(str.length() + 46);
                stringBuilder.append(str);
                stringBuilder.append(" does not contain res/raw/third_party_licenses");
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        if (a != null) {
            textView.setText(a);
        } else {
            finish();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new ugd(this, i, scrollView));
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
