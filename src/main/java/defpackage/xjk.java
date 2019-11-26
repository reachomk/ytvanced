package defpackage;

import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: xjk */
public final class xjk implements xji {
    private final xlf b = new xlf();

    public final void a(bckw bckw) {
        String str = this.b.a;
        if (str != null) {
            bckw.b("X-Obscura-Nonce", str);
        }
    }

    public final void a(bclb bclb) {
        if (bclb != null) {
            Map e = bclb.e();
            if (e != null) {
                String str = "X-Obscura-Nonce";
                if (e.containsKey(str)) {
                    xlf xlf = this.b;
                    String str2 = (String) ((List) e.get(str)).get(0);
                    if (str2 != null) {
                        xlf.a = str2;
                    }
                }
            }
        }
    }
}
