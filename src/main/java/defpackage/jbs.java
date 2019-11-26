package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
import com.google.protos.youtube.api.innertube.OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UserFeedbackEndpointOuterClass;
import java.util.List;
import java.util.Map;

/* renamed from: jbs */
public final class jbs implements aaas {
    public final Activity a;
    public final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final iyy e;
    private final fpt f;
    private final dyv g;

    public jbs(Activity activity, bcaa bcaa, bcaa bcaa2, iyy iyy, bcaa bcaa3, fpt fpt, dyv dyv) {
        this.a = activity;
        this.b = bcaa;
        this.d = bcaa2;
        this.c = bcaa3;
        this.e = iyy;
        this.f = fpt;
        this.g = dyv;
    }

    public final void a(List list, Object obj) {
        aaav.a((aaas) this, list, obj);
    }

    public final void a(List list, Map map) {
        aaav.a((aaas) this, list, map);
    }

    public final void a(apxu[] apxuArr, Object obj) {
        aaav.a((aaas) this, apxuArr, obj);
    }

    public final void a(apxu[] apxuArr, Map map) {
        aaav.a((aaas) this, apxuArr, map);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Intent a = this.f.a();
            a.putExtra("navigation_endpoint", apxu.toByteArray());
            this.a.startActivity(a);
            return;
        }
        access$000 = anxl.checkIsLite(OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.openSourceLicensesEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Activity activity = this.a;
            activity.startActivity(new Intent(activity, LicenseMenuActivity.class));
            return;
        }
        access$000 = anxl.checkIsLite(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            iyz iyz = this.e.a;
            if (iyz != null) {
                iyz.b();
            }
        } else {
            access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Activity activity2 = this.a;
                access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                fom.a(activity2, xvt.d(((ayvl) b).b));
                return;
            }
            access$000 = anxl.checkIsLite(UserFeedbackEndpointOuterClass.userFeedbackEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                ((ehn) this.d.get()).a(new jbr(this));
                return;
            }
            access$000 = anxl.checkIsLite(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                this.g.a(apxu, map);
            } else {
                try {
                    ((aaan) this.c.get()).a(apxu).a(apxu, map);
                } catch (aabf unused) {
                }
            }
        }
    }
}
