package defpackage;

import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aliv */
final /* synthetic */ class aliv implements OnClickListener {
    private final aleo a;

    aliv(aleo aleo) {
        this.a = aleo;
    }

    public final void onClick(View view) {
        aleo aleo = this.a;
        arml arml = null;
        if (Patterns.EMAIL_ADDRESS.matcher(aleo.f).matches()) {
            if (aleo.j) {
                aleo.b.a(true);
            } else if (!aleo.i) {
                aphg aphg = aleo.e;
                if (aphg != null) {
                    anxp anxp = aphg.l;
                    if (anxp == null) {
                        anxp = apxu.d;
                    }
                    anxr access$000 = anxl.checkIsLite(SendEmailInviteEndpointOuterClass$SendEmailInviteEndpoint.sendEmailInviteEndpoint);
                    anxp.a(access$000);
                    if (anxp.h.a(access$000.d) && !TextUtils.isEmpty(aleo.f)) {
                        aleo.i = true;
                        Map hashMap = new HashMap();
                        hashMap.put("send_email_invite_email", aleo.f);
                        hashMap.put("send_email_invite_listener", aleo);
                        String str = aleo.g;
                        if (str != null) {
                            hashMap.put("send_email_invite_token", str);
                        }
                        aleo.a(false);
                        aaas aaas = aleo.a;
                        apxu apxu = aleo.e.l;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                        aaas.a(apxu, hashMap);
                        aphg = aleo.e;
                        if ((aphg.a & 262144) != 0) {
                            aleo.c.a(3, new acvs(aphg.r), null);
                        }
                    }
                }
            }
            return;
        }
        aler aler = aleo.b;
        aolz aolz = aleo.d;
        if ((aolz.a & 32) != 0) {
            arml = aolz.g;
            if (arml == null) {
                arml = arml.f;
            }
        }
        aler.a(ajqy.a(arml));
        aleo.b.a(true);
    }
}
