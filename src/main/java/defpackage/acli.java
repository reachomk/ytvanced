package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
import com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint;
import com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEndpoint;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import java.util.List;
import java.util.Map;

/* renamed from: acli */
public final class acli implements aaas {
    private final aaas a;
    private final aaan b;
    private final nn c;
    private final afqe d;

    public acli(nn nnVar, aaas aaas, afqe afqe, aaan aaan) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.c = (nn) amqw.a((Object) nnVar);
        this.d = (afqe) amqw.a((Object) afqe);
        this.b = aaan;
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
        if (!a(apxu)) {
            try {
                this.b.a(apxu).a(apxu, map);
            } catch (aabf unused) {
                this.a.a(apxu, map);
            }
        }
    }

    private final boolean a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            a(apxu, new alkc());
        } else {
            access$000 = anxl.checkIsLite(ShareEndpointOuterClass$ShareEndpoint.shareEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                a(apxu, new acqd());
            } else {
                access$000 = anxl.checkIsLite(ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint.connectionInviteUrlEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    a(apxu, new aljg());
                } else {
                    access$000 = anxl.checkIsLite(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint);
                    apxu.a(access$000);
                    Object b;
                    if (apxu.h.a(access$000.d)) {
                        access$000 = anxl.checkIsLite(CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint);
                        apxu.a(access$000);
                        b = apxu.h.b(access$000.d);
                        if (b == null) {
                            b = access$000.b;
                        } else {
                            b = access$000.a(b);
                        }
                        CopyTextEndpointOuterClass$CopyTextEndpoint copyTextEndpointOuterClass$CopyTextEndpoint = (CopyTextEndpointOuterClass$CopyTextEndpoint) b;
                        ((ClipboardManager) this.c.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text/plain", copyTextEndpointOuterClass$CopyTextEndpoint.b));
                        if (!copyTextEndpointOuterClass$CopyTextEndpoint.c.isEmpty()) {
                            aaav.a((aaas) this, copyTextEndpointOuterClass$CopyTextEndpoint.c, null);
                        }
                    } else {
                        access$000 = anxl.checkIsLite(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint);
                        apxu.a(access$000);
                        String str = "";
                        Intent intent;
                        if (apxu.h.a(access$000.d)) {
                            access$000 = anxl.checkIsLite(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint);
                            apxu.a(access$000);
                            b = apxu.h.b(access$000.d);
                            if (b == null) {
                                b = access$000.b;
                            } else {
                                b = access$000.a(b);
                            }
                            AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint) b;
                            intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            for (atwo atwo : androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.b) {
                                intent.putExtra(atwo.d, atwo.b == 2 ? (String) atwo.c : str);
                            }
                            intent.setType(androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.c);
                            this.c.startActivity(Intent.createChooser(intent, null));
                        } else {
                            access$000 = anxl.checkIsLite(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
                            apxu.a(access$000);
                            if (apxu.h.a(access$000.d)) {
                                intent = xuz.a();
                                anxr access$0002 = anxl.checkIsLite(AndroidApplicationEndpointOuterClass.androidAppEndpoint);
                                apxu.a(access$0002);
                                b = apxu.h.b(access$0002.d);
                                if (b == null) {
                                    b = access$0002.b;
                                } else {
                                    b = access$0002.a(b);
                                }
                                aoqo aoqo = (aoqo) b;
                                intent.setClassName(aoqo.b, aoqo.c);
                                for (atwo atwo2 : aoqo.d) {
                                    intent.putExtra(atwo2.d, atwo2.b == 2 ? (String) atwo2.c : str);
                                }
                                try {
                                    this.c.startActivity(intent);
                                } catch (ActivityNotFoundException unused) {
                                    xpr.a(this.c, (int) R.string.lc_error_generic, 0);
                                }
                            } else {
                                access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
                                apxu.a(access$000);
                                str = "android.intent.action.VIEW";
                                if (apxu.h.a(access$000.d)) {
                                    access$000 = anxl.checkIsLite(UrlEndpointOuterClass.urlEndpoint);
                                    apxu.a(access$000);
                                    b = apxu.h.b(access$000.d);
                                    if (b == null) {
                                        b = access$000.b;
                                    } else {
                                        b = access$000.a(b);
                                    }
                                    acli.a(this.c, ajqy.a(this.c, new Intent(str, xvt.d(((ayvl) b).b))).setFlags(268435456));
                                } else {
                                    access$000 = anxl.checkIsLite(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint);
                                    apxu.a(access$000);
                                    if (apxu.h.a(access$000.d)) {
                                        access$000 = anxl.checkIsLite(AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint);
                                        apxu.a(access$000);
                                        b = apxu.h.b(access$000.d);
                                        if (b == null) {
                                            b = access$000.b;
                                        } else {
                                            b = access$000.a(b);
                                        }
                                        acli.a(this.c, ajqy.a(this.c, new Intent(str, xvt.d(((aoyr) b).b))).setFlags(268435456));
                                    } else {
                                        access$000 = anxl.checkIsLite(SignInEndpointOuterClass.signInEndpoint);
                                        apxu.a(access$000);
                                        if (!apxu.h.a(access$000.d)) {
                                            return false;
                                        }
                                        this.d.a(this.c, apxu, null);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private final void a(apxu apxu, nf nfVar) {
        if (!this.c.isFinishing()) {
            Bundle bundle = nfVar.j;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putByteArray("navigation_endpoint", apxu.toByteArray());
            nfVar.f(bundle);
            or a = this.c.f().a();
            a.a(nfVar, "DialogFragmentFromNavigation");
            a.b();
        }
    }

    private static void a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(context, context.getString(R.string.lc_error_browser_not_found), 1).show();
        }
    }
}
