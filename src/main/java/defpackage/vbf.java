package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.protos.youtube.api.innertube.PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint;

/* renamed from: vbf */
final class vbf implements OnClickListener {
    private final /* synthetic */ vba a;

    vbf(vba vba) {
        this.a = vba;
    }

    public final void onClick(View view) {
        amqw.a(vba.a(this.a.a));
        vba vba = this.a;
        vbh vbh = vba.b;
        if (vbh != null) {
            avxx avxx = vba.a.d;
            if (avxx == null) {
                avxx = avxx.c;
            }
            aphg aphg = avxx.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            anxp anxp = aphg.m;
            if (anxp == null) {
                anxp = apxu.d;
            }
            anxr access$000 = anxl.checkIsLite(PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.phoneVerificationContactNumberInputEndpoint);
            anxp.a(access$000);
            Object b = anxp.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            avxk avxk = ((PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint) b).b;
            if (avxk == null) {
                avxk = avxk.c;
            }
            avxo avxo = avxk.b;
            if (avxo == null) {
                avxo = avxo.i;
            }
            vbh.a(avxo);
        }
    }
}
