package defpackage;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ven */
public final class ven {
    private final aaox a;
    private final List b;
    private final xci c;

    public ven(aaox aaox, List list, xci xci) {
        this.a = (aaox) amqw.a((Object) aaox);
        this.b = (List) amqw.a((Object) list);
        this.c = (xci) amqw.a((Object) xci);
    }

    public final aafy a(String str, byte[] bArr, String str2, String str3, long j, long j2, int i, boolean z, xvk xvk) {
        try {
            this.c.d(new vpi());
            amqw.a((Object) str2);
            amqw.a((Object) str);
            amqw.a((Object) str2);
            aaox aaox = this.a;
            aapb aapb = new aapb(aaox.c, aaox.d.c());
            aapb.b = aali.b(str);
            aapb.a(bArr);
            aapb.a = aali.b(str2);
            aapb.c = aali.b(str3);
            aapb.d = j2;
            aapb.e = j;
            aapb.p = i;
            aapb.w = z;
            for (aaoy a : this.b) {
                a.a(aapb);
            }
            afsx afsx = new afsx();
            this.a.a.b(aapb, afsx);
            long b = xvk.b - xvk.a.b();
            if (b < 0) {
                b = 0;
            }
            aafy aafy = (aafy) afsx.get(b, TimeUnit.MILLISECONDS);
            this.c.d(new vpj(aafy));
            return aafy;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            str = String.valueOf(e.getMessage());
            String str4 = "Exception when trying to request AdBreakResponseModel: ";
            xtl.c(str.length() == 0 ? new String(str4) : str4.concat(str));
            return null;
        }
    }
}
