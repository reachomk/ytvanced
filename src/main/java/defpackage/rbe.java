package defpackage;

import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: rbe */
public final class rbe implements rax {
    public final /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return Mac.getInstance(str, provider);
        }
        return Mac.getInstance(str);
    }
}
