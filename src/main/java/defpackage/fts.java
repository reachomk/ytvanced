package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass;
import java.util.Map;

/* renamed from: fts */
public final class fts implements aaap {
    private final Context a;

    public fts(Context context) {
        this.a = context;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        String str = ((aoyr) b).b;
        if (TextUtils.isEmpty(str)) {
            a(R.string.error_link_cannot_be_opened);
            return;
        }
        try {
            this.a.startActivity(ajqy.a(this.a, new Intent("android.intent.action.VIEW", xvt.d(str))).setFlags(268435456));
        } catch (ActivityNotFoundException unused) {
            a(R.string.authorized_url_error_browser_not_found);
        }
    }

    private final void a(int i) {
        Toast.makeText(this.a, this.a.getString(i), 1).show();
    }
}
