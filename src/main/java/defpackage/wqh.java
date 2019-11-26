package defpackage;

import com.google.protos.youtube.api.innertube.YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
import java.util.Map;

/* renamed from: wqh */
public final class wqh implements aaap {
    private final ablj a;
    private final wqi b;

    public wqh(wqi wqi, ablj ablj) {
        this.a = ablj;
        this.b = wqi;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        wqg wqg;
        anxp anxp = apxu;
        Map map2 = map;
        long j = -1;
        Object obj6 = null;
        if (map2 != null) {
            wqg wqg2 = (wqg) map2.get("HANDLE_TRANSACTION_CALLBACK");
            obj = (String) map2.get("FUNDS_GUARANTEE_CALLBACK_CLIENT_DATA");
            obj2 = (byte[]) map2.get("SERIALIZED_WALLET_EVENT_LOGS");
            String str = (String) map2.get("PAYMENTS_PAYLOAD");
            obj3 = (byte[]) map2.get("SERIALIZED_BACKEND_ANALYTICS_EVENT");
            j = ((Long) xsb.c(map2, "PURCHASE_PRICE_MICROS", Long.valueOf(-1))).longValue();
            obj4 = (CharSequence) xsb.a(map2, (Object) "CLIENT_CHAT_MESSAGE_TEXT", String.class);
            obj5 = (augl) xsb.a(map2, (Object) "LIVE_CHAT_RICH_MESSAGE_INPUT", augl.class);
            wqg = wqg2;
            obj6 = str;
        } else {
            obj4 = "";
            obj5 = null;
            obj = obj5;
            obj2 = obj;
            obj3 = obj2;
            wqg = obj3;
        }
        anxr access$000 = anxl.checkIsLite(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.ypcHandleTransactionEndpoint);
        anxp.a(access$000);
        Object b = anxp.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint = (YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint) b;
        ablj ablj = this.a;
        aaml abmh = new abmh(ablj.c, ablj.d.c());
        abmh.a(zzp.b);
        if ((ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.a & 1) != 0) {
            abmh.a = (String) amqw.a(ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.b);
        }
        if ((ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.a & 2) != 0) {
            abmh.b = (String) amqw.a(ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.c);
        }
        if (obj6 != null) {
            abmh.c = (String) amqw.a(obj6);
        }
        if (obj != null) {
            abmh.d = (String) amqw.a(obj);
        }
        if (obj2 != null) {
            abmh.e = (byte[]) amqw.a(obj2);
        }
        if (obj3 != null) {
            abmh.p = (byte[]) amqw.a(obj3);
        }
        if (obj5 != null) {
            abmh.r = (augl) amqw.a(obj5);
        }
        if (obj4 != null) {
            abmh.s = (CharSequence) amqw.a(obj4);
        }
        if ((ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.a & 8) != 0) {
            obj5 = ayip.a(ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.e);
            if (obj5 == null) {
                obj5 = ayip.TRANSACTION_PRODUCT_DATA_TYPE_UNKNOWN;
            }
            abmh.t = (ayip) amqw.a(obj5);
        }
        ablj ablj2 = this.a;
        abmh.q = j;
        wqi wqi = this.b;
        xoi xoi = (xoi) wqi.a((xoi) wqi.a.get(), 1);
        xoi xoi2 = xoi;
        ablj2.k.a(abmh, new wqj(xoi2, (acum) wqi.a((acum) wqi.b.get(), 2), (aaas) wqi.a((aaas) wqi.c.get(), 3), wqg, (YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint) wqi.a(ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint, 5)));
    }
}
