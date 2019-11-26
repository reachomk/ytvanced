package defpackage;

import android.text.Layout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.youtube.R;

/* renamed from: ugd */
public final /* synthetic */ class ugd implements Runnable {
    private final LicenseActivity a;
    private final int b;
    private final ScrollView c;

    public ugd(LicenseActivity licenseActivity, int i, ScrollView scrollView) {
        this.a = licenseActivity;
        this.b = i;
        this.c = scrollView;
    }

    public final void run() {
        LicenseActivity licenseActivity = this.a;
        int i = this.b;
        ScrollView scrollView = this.c;
        Layout layout = ((TextView) licenseActivity.findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            scrollView.scrollTo(0, layout.getLineTop(layout.getLineForOffset(i)));
        }
    }
}
