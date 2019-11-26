package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint;
import java.util.Map;

/* renamed from: haw */
public final class haw implements aaap {
    private final Activity a;
    private final aaas b;

    public haw(Activity activity, aaas aaas) {
        this.a = activity;
        this.b = aaas;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.liveChatDialogEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.liveChatDialogEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint = (LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint) b;
            aucp aucp = liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.b;
            if (aucp == null) {
                aucp = aucp.c;
            }
            if ((aucp.a & 1) != 0) {
                arml arml;
                aucp aucp2 = liveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.b;
                if (aucp2 == null) {
                    aucp2 = aucp.c;
                }
                auct auct = aucp2.b;
                if (auct == null) {
                    auct = auct.e;
                }
                Builder builder = new Builder(this.a);
                if ((auct.a & 1) != 0) {
                    arml = auct.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                builder = builder.setTitle(ajqy.a(arml)).setMessage(ajqy.a((CharSequence) "\n\n", aabb.a((arml[]) auct.c.toArray(new arml[0]), this.b, true)));
                aucr aucr = auct.d;
                if (aucr == null) {
                    aucr = aucr.c;
                }
                if (aucr.a == 65153809) {
                    aphg aphg;
                    arml arml2;
                    aucr aucr2 = auct.d;
                    if (aucr2 == null) {
                        aucr2 = aucr.c;
                    }
                    if (aucr2.a == 65153809) {
                        aphg = (aphg) aucr2.b;
                    } else {
                        aphg = aphg.s;
                    }
                    if ((aphg.a & 128) != 0) {
                        arml2 = aphg.g;
                        if (arml2 == null) {
                            arml2 = arml.f;
                        }
                    } else {
                        arml2 = null;
                    }
                    builder.setPositiveButton(ajqy.a(arml2), null);
                } else {
                    builder.setPositiveButton(R.string.ok, null);
                }
                builder.create().show();
            }
        }
    }
}
