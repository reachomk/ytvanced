package defpackage;

import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bcnf */
final class bcnf implements bcnw {
    private final /* synthetic */ bcmw a;

    bcnf(bcmw bcmw) {
        this.a = bcmw;
    }

    public final void a() {
        if (this.a.q != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            String str = "http/1.1";
            while (true) {
                String headerFieldKey = this.a.q.getHeaderFieldKey(i);
                if (headerFieldKey == null) {
                    break;
                }
                if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                    str = this.a.q.getHeaderField(i);
                }
                if (!headerFieldKey.startsWith("X-Android")) {
                    arrayList.add(new SimpleEntry(headerFieldKey, this.a.q.getHeaderField(i)));
                }
                i++;
            }
            i = this.a.q.getResponseCode();
            bcmw bcmw = this.a;
            bcmw.o = new bcoo(new ArrayList(bcmw.f), i, this.a.q.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "", 0);
            bcmw bcmw2;
            if (i >= 300 && i < 400) {
                bcmw2 = this.a;
                bcmw2.a(1, 2, new bcnh(bcmw2, bcmw2.o.e()));
                return;
            }
            this.a.e();
            bcno bcno;
            bcoo bcoo;
            if (i >= 400) {
                InputStream errorStream = this.a.q.getErrorStream();
                this.a.n = errorStream != null ? bcmr.a(errorStream) : null;
                bcmw2 = this.a;
                bcno = bcmw2.b;
                bcoo = bcmw2.o;
                bcno.a();
                return;
            }
            bcmw2 = this.a;
            bcmw2.n = bcmr.a(bcmw2.q.getInputStream());
            bcmw2 = this.a;
            bcno = bcmw2.b;
            bcoo = bcmw2.o;
            bcno.a();
        }
    }
}
