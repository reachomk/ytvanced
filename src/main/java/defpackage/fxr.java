package defpackage;

import com.google.protos.youtube.api.innertube.ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint;
import java.util.Map;

/* renamed from: fxr */
public final class fxr implements aaap {
    private final bcaa a;

    public fxr(bcaa bcaa) {
        this.a = (bcaa) amqw.a((Object) bcaa);
    }

    public final void a(apxu apxu, Map map) {
        zwj zwj = (zwj) this.a.get();
        if (zwj != null) {
            anxr access$000 = anxl.checkIsLite(ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.shoppingDrawerEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint = (ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint) b;
            int a = axku.a(shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.b);
            if (a != 0 && a == 3) {
                zwj.e();
                return;
            }
            a = axku.a(shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.b);
            if (a != 0 && a == 2) {
                if (((Boolean) xsb.c(map, "shopping_drawer_ad_playing", Boolean.valueOf(false))).booleanValue()) {
                    zwj.b(shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.c, true);
                    return;
                }
                zwj.b(shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.c);
            }
        }
    }
}
