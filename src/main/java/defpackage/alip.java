package defpackage;

import com.google.protos.youtube.api.innertube.UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction;
import java.util.Map;

/* renamed from: alip */
public final class alip implements aaap {
    public final void a(apxu apxu, Map map) {
        alio alio = (alio) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", alio.class);
        if (alio != null) {
            anxr access$000 = anxl.checkIsLite(UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction.updatePhoneNumberDataAction);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            avyu avyu = ((UpdatePhoneNumberDataActionOuterClass$UpdatePhoneNumberDataAction) b).b;
            if (avyu == null) {
                avyu = avyu.c;
            }
            avyi avyi = avyu.b;
            if (avyi == null) {
                avyi = avyi.g;
            }
            alio.a(avyi);
        }
    }
}
